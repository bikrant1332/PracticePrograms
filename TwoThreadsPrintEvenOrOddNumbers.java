package hungers.practice.bj.interviewquestions;

public class TwoThreadsPrintEvenOrOddNumbers {
	//Question asked me in the VCIT 1st round 
	int counter =1;
	int max=10;
	public static void main(String[] args) {
		//Create two threads that will print even or odd numbers
		TwoThreadsPrintEvenOrOddNumbers ob = new TwoThreadsPrintEvenOrOddNumbers();
		
		Runnable evenTask = ()->{
			ob.printEvenNumber();
		};
		
		Runnable oddTask = ()->{
			ob.printOddNumber();
		};
		Thread t1 = new Thread( evenTask, "T1");
		Thread t2 = new Thread(oddTask, "T2");
		
		t2.start();
		t1.start();
	}
	
	public void printOddNumber()
    {
		System.out.println("Odd method");
        synchronized (this)
        {
            while (counter < max) {
                // If count is even then print
                if (counter % 2 == 0) {
                    // Exception handle
                    try {
                    	System.out.println("odd wait");
                        wait();
                    	System.out.println("odd wait ended");
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.println(Thread.currentThread().getName() + " "+counter);
                // Increment counter
                counter++;
                // Notify to second thread
                notify();
            }
        }
    }
 
    // Function to print even numbers
    public void printEvenNumber()
    {
		System.out.println("Even method");
        synchronized (this)
        {
            // Print number till the N
            while (counter < max) {
                // If count is odd then print
                if (counter % 2 == 1) {
                    // Exception handle
                    try {
                    	System.out.println("even wait");
                        wait();
                    	System.out.println("even wait ended");
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.println(Thread.currentThread().getName() + " "+counter);
                // Increment counter
                counter++;
                // Notify to 2nd thread
                notify();
            }
        }
    }

}

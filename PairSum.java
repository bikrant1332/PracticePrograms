package hungers.practice.bj.interviewquestions;

public class PairSum {
//travesring through ones
	public static void main(String[] args) {
		// sum 16?  -  { 1, 4, 45, 6, 10, 8 }
		int sum=16;
		int[] arr = { 1, 4, 45, 6, 10, 8 };
		int low=0;
		int high=arr.length-1;
		int tempSum =0;
		while(low<high) {
			tempSum=arr[low]+arr[high];
			if(tempSum==sum) {
				 System.out.println("The pair is : ("+ arr[low] + ", " + arr[high] + ")");
			}
			if(tempSum>sum) {
				high--;
			}
			low++;
		}
	}

}

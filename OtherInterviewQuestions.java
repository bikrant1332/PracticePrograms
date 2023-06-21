
public class InterviewManhattan {
  public static void main(String[] args) {
    //asked in manahatatan
    //Generate 10 numbers using stream
		new Random().ints(10,100,400).forEach(System.out::println);
    //given string add comma using streams
    String str="Joe John John Bikrant";
		String[] array= str.split(" ");
		List<String> list= Arrays.asList(array);

		
		String results = list.stream().map(e->"("+e+")").collect(Collectors.joining(","));
		System.out.println(results);
    
    //print the name lenght is more then 5
		list.stream().filter(e->e.length()>5).collect(Collectors.toList()).forEach(System.out::println);
    
    //get the distincts
		Set<String> set= new HashSet<>(list);
		System.out.println(set);

		//printing distinct result using java 8 features
		list.stream().distinct().forEach(System.out::println);
    
    //interview in coforge:
    //Given a list of integers, find out all the numbers starting with 1 using Stream/traditional functions?
		//		Input :   10,15,8,49,25,98,98,32,15
		//		out Put : 10, 15
		List<Integer> input = Arrays.asList(10,15,8,49,49,25,98,98,32);
		input.stream()
			.filter(e-> String.valueOf(e).startsWith("1"))
			.forEach(System.out::println);
    
    //another question to find the duplicate print which are duplicates
		System.out.println("Finding duplicates");
		Set<Integer> set= new HashSet<>(input);
		for(Integer  a: set) {
			if(Collections.frequency(input, a) >1) {
				System.out.println(a);
			}
		}
    
    //Finding first non repitive character
    //interview at Netradyne
    Integer[] arr = {2,4,1,-6,8,0,12,3,2,-6,8}; //need to find thrid largest no
    
    
    //reverse and check pallindrome
		String str = "";
		String result ="";
		for(int i=(str.length()-1);i>=0;i--) {
			result+=str.charAt(i);
		}
		//System.out.println(result);
		
		if(str.equals(result)) {
			System.out.println("Its palindrome");
		}else {
			System.out.println("not palindrome");
		}
    
    //write a program to show the fatory design pattern
  }
}

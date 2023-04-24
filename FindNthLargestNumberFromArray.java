
import java.util.Arrays;
import java.util.Comparator;

public class FindNthLargestElementInArray {

	public static void main(String[] args) {
		//assuming array contains duplicates
		Integer[] arr = {2,4,1,-6,8,0,12,3,2,-6,8,11};
		int N =2; // 2 means second largest 3 means third largest

		Arrays.stream(arr)
			.distinct() // it will remove the duplicates
			.sorted(Comparator.reverseOrder()) //sort the array in descending order
			.limit(N) //it will limit the input with top N elements
			.skip(N-1) //it will skip from the N-a elements
			.forEach(a->System.out.println(a));
	}

}

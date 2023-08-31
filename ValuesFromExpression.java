package hungers.practice.bj.miscelenious;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValuesFromExpression {

	public static void main(String[] args) {
		//Get valued like a001,002 in a list
		//output can be like this [a001, a002, a003, a004, a002, a005, a006, a001, a007]
		String str = "((a001*a002)*a003+a004*(a002-a005)/(a006+a001))+a007";
		List<String> list = new ArrayList<>();
		StringBuilder builder = new StringBuilder();
		for(Character ch:str.toCharArray()) {
			if(Character.isLetter(ch) | Character.isDigit(ch)) {
				builder.append(ch);
			}
			else if(builder.length()>0) {
				list.add(builder.toString());
				builder.setLength(0); //for restarting the builder
			}
			else {
				builder.setLength(0);
			}
		}
		
		//Checking for the final 
		if(builder.length()>0) {
			list.add(builder.toString());
		}
		
		System.out.println("The values in the expression : "+list);
		
		//to get distinct values
		List<String> distList = list.parallelStream()
				.distinct()
				.toList();

		System.out.println("The distinct values in the expression : "+distList);
	}

}

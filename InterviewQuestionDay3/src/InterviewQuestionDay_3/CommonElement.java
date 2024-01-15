package InterviewQuestionDay_3;

import java.util.HashSet;
import java.util.Set;

public class CommonElement {
 // Given Two arrays of integers, write a java 8 program to find the common elements between them.
	//Using Hashmap.
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4,5,4};
		int [] arr2 = {4,5,6,7,8};
		
	Set<Integer> hs = new HashSet<>();
	
	
	for(int i=0; i<arr1.length;i++) {
		for(int j=0; j<arr2.length; j++) {
		 	if(arr1[i] == arr2[j]) 
			{
		    hs.add(arr1[i]);
		    break; //here break statement is used to make program more effective.
			
			
			}

	} 
		
		
	}System.out.println(hs);

}
	}


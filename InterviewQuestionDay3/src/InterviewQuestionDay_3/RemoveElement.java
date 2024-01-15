 package InterviewQuestionDay_3;

public class RemoveElement {
  // Delete an element from an array.....
	public static void main(String[] args) {
		int originalArray [] = {10,20,30,40,50};
		
		int elementToRemove=30;
		
		for(int i=0; i<originalArray.length; i++)
		{
			if(elementToRemove == originalArray[i])
			{
				for(int j=i; j<originalArray.length-1; j++)
				{
					originalArray[j] = originalArray[j+1];
				}
			 break;
			}
		}
	for(int i=0; i<originalArray.length-1; i++) {
		System.out.println(originalArray[i]+"");
	}
		
	}
}
		
	
		

	



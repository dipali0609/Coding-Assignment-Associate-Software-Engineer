// (Q.1.A.) Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 
package interviewPractice;

 public class ArrayShuffle {
	    public static void main(String[] args) 
	    {
	        int[] array = {1, 2, 3, 4, 5, 6, 7};

	        shuffleArray(array);

	        System.out.print("Shuffled array: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void shuffleArray(int[] array) 
	    {
	      
	        for (int i = array.length - 1; i > 0; i--) 
	        {
	            
	           int j = (int) (Math.random()* (i + 1));
             
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	            
	            
	        }
	    }

}

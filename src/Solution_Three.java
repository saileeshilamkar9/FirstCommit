import java.util.Arrays;

public class Solution_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= new int[]{9,3,9,3,9,7,9};
		int found = 0;
	    int i = 0;
	    int j = 1;

	    Arrays.sort(A);
	    //To sort the array so if you have {9 , 3 , 9 , 3 , 9 , 7 , 9} 
	    //it will be { 3 , 3 , 7 , 9 , 9 , 9 , 9}
	    if (A.length == 1) {
	        found = A[0];
	    }

	    while (A.length % 2 == 1 && i < A.length && j < A.length) {
	        if (A[i] == A[i+1]) {
	            i = i + 2;
	            j = j + 2;  
	        } else {
	            found = A[i];
	            break;
	        }
	    }
	    if (found == 0 && i == A.length-1) {
	        found = A[i];
	    }

	    System.out.println(found);
	}

}

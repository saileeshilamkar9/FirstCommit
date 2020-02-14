import java.util.Arrays;

public class Solution_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= new int[]{3, 8, 9, 7, 6};
		int K=3;
		
		 
		for(int i=0; i<=K; i++){
			int last = A[A.length-1];
			if(A.length >1){ //make sure array has minimum two elements
		        // shift right
		        for( int index =A.length-2; index >= 0 ; index-- ){
		            A[index+1] = A [index];
		        }
		     }
		    A[0] = last;
		    int temp = A[1];
		    A[1]=A[A.length-1];
		    A[A.length-1]=temp;
		   
		    System.out.println(Arrays.toString(A));
		}
	    
	    

	}

}

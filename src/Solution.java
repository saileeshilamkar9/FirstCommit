
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 15;
		int temp = 0;
		String nir=  Integer.toBinaryString(N);
		System.out.println(nir);
		
		for (int i = 1; i < nir.length(); i++){
		    char c = nir.charAt(i); 
		    //System.out.println(c);
		    if(c=='1'){
		    	temp = i-1;
		    	//System.out.println(i);
		    	break;
		    	
		    	
		    }
		    
		}
		
 System.out.println(temp);
	}

}

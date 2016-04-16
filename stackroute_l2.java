import java.util.StringTokenizer;


public class stackroute_l2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 3;
		String s1="11#3#44,12#26#13,21#33#21";
		String s2="33#44#11,3#13#12,21#26#21";
		int n1[][] = genMatrix(size,s1);
		int n2[][] = genMatrix(size,s2);
		printMatrix(n1,size);
		printMatrix(n2,size);
	}
	public static int[][] genMatrix(int size, String s){
		int[][] mat = new int[size][size];
		int col=0,row=0;
		String strTmp="",strTmp2="";
		StringTokenizer st = new StringTokenizer(s,",");
	     while (st.hasMoreTokens()) {
	    	 strTmp = st.nextToken();
	    	 StringTokenizer st2 = new StringTokenizer(strTmp,"#");
	    	 while(st2.hasMoreTokens()){
	    		 //System.out.print(st2.nextToken()+" ");
	    		 strTmp2 = st2.nextToken();
	    		 mat[row][col] = Integer.parseInt(strTmp2);
	    		 //System.out.println("Row="+row+":"+"Col="+col+"Token="+strTmp2);
	    		 col++;
	    	 }
	         //System.out.println();
	         row++;
	         col=0;
	     }
		return mat;
	}
	public static void printMatrix(int[][] inp, int len){
		for (int row=0; row<len; row++){
			for (int col =0; col<len; col++){
				System.out.print(inp[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("=================");
	}
	public static String operations_seq(int size,String[] s1,String[] s2)
    {
        //Write code here
		return "";
    }
}

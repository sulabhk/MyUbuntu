import java.util.Stack;
public class sippy {

	/**
	 * @param args
	 */
	public static void printStack (Stack str){
		System.out.println("\nStack contents.....");
		while(!str.empty()){
			System.out.println(str.pop());	
		}
		
	}
	
	public static String reduce (String x[]){
		String tmp1="";
		Stack<String> st = new Stack <String>();

		for (int n=0; n<x.length; n++){
			System.out.print(x[n]+" : ");
			if (n==0){
				st.push(x[n]);
			}
			else {
				if (st.peek()==x[n]){
					st.pop();
					//n++;
				}
				else {
					st.push(x[n]);
				}
			}
		}
		printStack(st);
		return tmp1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] arr = new String[] {"M","I","S","S","I","P"};
		String[] arr = new String[] {"M","I","S","S","I","S","S","I","P","P","I"};
		System.out.print(reduce(arr));
	}

}

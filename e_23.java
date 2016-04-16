import java.util.ArrayList;
import java.util.List;
	
public class e_23 {
	/**        A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example,
    the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
   
    A number n is called deficient if the sum of its proper divisors is less than n
    and it is called abundant if this sum exceeds n.
   
    As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16,
    the smallest number that can be written as the sum of two abundant numbers is 24.
   
    By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two
    abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that
    the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
   
    Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.*/
   
    public static int getDivSum(int y){//return sum of all divisors of 'y' excluding the num itself
            int loop=1;
            int sum=0;
            while(loop>=1){
                    if(loop==((int)y/2+1)){
                            break;
                    }
                    if(y%loop==0){
                            sum+=loop;
                            //System.out.println("Div of y :"+loop);
                    }
                    loop++;
            }
            return sum;
    }
    public static boolean isAbundant(int y){//return sum of all divisors of 'y' excluding the num itself
            int loop=1;
            int sum=0;
            while(loop>=1){
                    if(loop==((int)y/2+1)){
                            break;
                    }
                    if(y%loop==0){
                            sum+=loop;
                            //System.out.println("D4179871iv of y :"+loop);
                    }
                    loop++;
            }
            return sum>y;
    }
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            int MAX_LIMIT=28123;
            long begin= System.currentTimeMillis();
            long nonAbundantSum=0,abundantSum=0;
            long totalSum=0;
            List<Integer> lst = new ArrayList<Integer>();
            //ArrayList<Integer> lst2 = new ArrayList<Integer>();
            totalSum=(MAX_LIMIT*(MAX_LIMIT+1))/2;
            for(int i=1; i<=MAX_LIMIT; i++){
                    for(int z=1; z<=i/2; z++){
                            if (isAbundant(i) && isAbundant(i-z)){
                                    if(!lst.contains(i)){
                                            lst.add(i);
                                            //lst.set(i,i);
                                            abundantSum+=i;
                                            //System.out.println("!"+i+" =sumOfAbun["+z+","+(i-z)+"]!");
                                            break;
                                    }
                                    //break;        
                            }
                            /*else {
                                    if(!lst2.contains(i) && !lst.contains(i)){
                                            lst2.add(i);
                                            nonAbundantSum+=i;
                                            System.out.println(i+" =sumOfNonAbun["+z+","+(i-z)+"]");
                                            //break;
                                    }
                            }
                            */
                            //System.out.println(i+"="+z+"+"+(i-z));
                    }
            }
            //4179871
            System.out.println("Non-abundant Sum="+nonAbundantSum);
            System.out.println("Abundant Sum="+abundantSum);
            System.out.println("Total Sum="+totalSum);
            System.out.println("Non-abundant Sum="+(totalSum-abundantSum));
            System.out.println("Total time taken:"+ (System.currentTimeMillis()-begin)/1000+" ms");
           
    }

}

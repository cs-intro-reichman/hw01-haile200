/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int lowBound= 10;//Integer.parseInt(args[0]);
		int upBound=  15;//Integer.parseInt(args[1]);
		double range= (lowBound-upBound)+lowBound;
		int rand1= (int) (Math.random ()*range)+lowBound;
		int rand2= (int) (Math.random ()*range)+lowBound;
		int rand3= (int) (Math.random ()*range)+lowBound;
		int minimal= Math.min(rand3, rand2);
		minimal= Math.min(minimal, rand1);
		System.out.println(rand1+"\n"+rand2+"\n"+rand3+"\n"+
		"the minimal generated number was "+ minimal);

		 
	}
}

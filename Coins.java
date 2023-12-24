/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int total =Integer.parseInt(args[0]);
		int quarter = total/25;
		int remainder= total%25;
		System.out.println("Use "+ quarter + " quarters "+" and "+ remainder +" cents" );  
	}
}
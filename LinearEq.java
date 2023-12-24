/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
    public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);  
    double ans=(c-b)/a;     // x ≠ 0  𝑎 ⋅ 𝑥 + b=c  Both are equal   x=c-b/a
    String  linear = ""+a+" * "+" x "+b+ " = "+c+""; 
     System.out.println(linear + "\n" +"x = " +ans );
	
}
}
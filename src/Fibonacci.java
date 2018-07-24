
public class Fibonacci {
	public static void main(String[] args) {
		long a = 0;
		long b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 144; i++) {
			long temp = b;
			b = a + b;
			a = temp;
			System.out.println(b);
		}
	}
}

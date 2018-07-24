import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Please type a reasonable number.");
		boolean isPrime = true;
		int a = Integer.parseInt(answer);
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime = false;
				JOptionPane.showMessageDialog(null, "The number you typed is composite.");
				break;
			}
		}
		if (isPrime == true) {
			JOptionPane.showMessageDialog(null, "The number is prime.");
		}

	}
}

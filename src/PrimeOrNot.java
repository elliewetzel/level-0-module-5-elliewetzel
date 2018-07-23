import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Please type a reasonable number.");
	int a = Integer.parseInt(answer);
	for(int i = 0; i < 999999999; i++) {
		if(a%i == 0) {
			JOptionPane.showMessageDialog(null, "It's not prime.");
			break;
		}
	}
	
}
}

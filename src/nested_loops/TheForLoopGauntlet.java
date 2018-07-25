package nested_loops;

import javax.swing.JOptionPane;

public class TheForLoopGauntlet {
public static void main(String[] args) {
	for(int i = 0; i < 101; i++) {
		System.out.println(i);
		break;
	}
	for(int a = 100 ; a >= 0; a--) {
		System.out.println(a);
		break;
	}
	for(int b = 2; b < 101; b+=2) {
		System.out.println(b);
		break;
	}
	for(int c = 1; c < 100; c+=2) {
		System.out.println(c);
		break;
	}
	for(int d = 1; d < 501; d++) {
		if(d%2 == 0) {
			System.out.println(d + " is even");
		}
		else {
			System.out.println(d + " is odd");
		}
		break;
	}
	for(int e = 0; e < 778; e+=7) {
		System.out.println(e);
		break;
	}
	int y = 2005;
	for(int f = 1; f < 13; f++) {
		y+=1;
		System.out.println("In " + y + ", I was " + f + " years old.");
		break;
	}
	int g = 0;
	for(int u = 0; u <3; u++) {
			for(int h = 0; h < 3; h++) {
				System.out.println(g + " " + u++);
				break;
			}
			u = 0;
			for(int j = 0; j < 3; j++) {
				System.out.println(g+1 + " " + u++);
				break;
			}
			u = 0;
			for(int k = 0;k < 3; k++) {
				System.out.println(g+2 + " " + u++);
				break;
			}
			break;
	}
	int z = 1;
	for(int l = 1; l <= 3; l++) {
		for(int m = z; m <= z+2; m++) {
			System.out.print(z + " ");
		}
		System.out.println();
		z+=3;
	}
}
}

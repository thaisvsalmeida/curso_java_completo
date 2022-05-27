import java.util.Locale;
import java.util.Scanner;

public class cond07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite x: ");
		double x = sc.nextDouble();
		System.out.print("Digite y: ");
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0) {
			System.out.println("Eixo y");
		}
		else if (x != 0) {
			System.out.println("Eixo x");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		}
		else {
			System.out.println("Quadrante 4");
		}

		sc.close();
	}

}

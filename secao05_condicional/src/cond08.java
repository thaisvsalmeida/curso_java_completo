import java.util.Locale;
import java.util.Scanner;

public class cond08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu salario: ");
		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000) {
			imposto = 0;
		}
		else if (salario <= 3000) {
			imposto = ((salario - 2000) * 0.08);
		}
		else if (salario <= 4500) {
			imposto = (1000 * 0.08 + (salario - 3000) * 0.18);
		}
		else {
			imposto = (1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28);
		}
		
		if (imposto == 0) {
			System.out.println("Isento");
		}
		else {
		System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}

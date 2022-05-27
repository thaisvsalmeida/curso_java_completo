import java.util.Locale;
import java.util.Scanner;

public class cond05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual item deseja pedir? ");
		int item = sc.nextInt();
		System.out.print("Qual é a quantidade? ");
		int quant = sc.nextInt();
		
		double total;
		if (item == 1) {
			total = quant * 4.0;
		}
		else if (item == 2) {
			total = quant * 4.5;
		}
		else if (item == 3) {
			total = quant * 5.0;
		}
		else if (item == 4) {
			total = quant * 2.0;
		}
		else {
			total = quant * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}

}

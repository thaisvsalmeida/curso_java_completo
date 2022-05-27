import java.util.Scanner;

public class cond04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inicio do jogo: ");
		int inicio = sc.nextInt();
		System.out.print("Fim do jogo: ");
		int fim = sc.nextInt();
		
		int total;
		if (fim > inicio) {
			total = fim - inicio;
		}
		else {
			total = (24 - inicio) + fim;
		}
		
		System.out.println("O JOGO DUROU " + total + " HORA(S)");
		
		sc.close();
	}

}

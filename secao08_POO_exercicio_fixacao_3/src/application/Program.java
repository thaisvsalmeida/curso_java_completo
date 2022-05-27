package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();

		stud.name = sc.nextLine();
		stud.grade1 = sc.nextDouble();
		stud.grade2 = sc.nextDouble();
		stud.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", stud.finalGrade());
		
		if (stud.finalGrade() >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", stud.missingPoints());
		}
		
		sc.close();
	}

}

import java.util.Iterator;
import java.util.Scanner;

import entities.Produto;


public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite uma qntidade");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println(i);
			System.out.println(n);

			System.out.printf("Nome do Produto:");

			String name = sc.nextLine();
			System.out.printf("Preço:");

			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
			
			System.out.println(vect);
					}
		double sum = 0.0;

		for (int i = 0; i < n; i++) {

			sum += vect[i].getPrice();
					}
		double avg = sum / n;
		
		System.out.printf("Média de Preço", avg);
		sc.close();
		
		
	}

}

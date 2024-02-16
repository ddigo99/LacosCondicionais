package listaUm;

import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		System.out.printf("O numero é ", numero);

		if (numero % 2 == 0) {
			System.out.println("par e ");
		} else {
			System.out.println("impar e ");
		}

		if (numero >= 0) {
			System.out.println("positivo!");
		} else {
			System.out.println("negativo!");
		}

	}

}

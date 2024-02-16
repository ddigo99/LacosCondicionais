package listaUm;

import java.util.Scanner;

public class CalculoABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
		int a, b, c, somaAB;
		
		
		System.out.println("Digite um numero referente letra A:");
		a = leia.nextInt();
		System.out.println("Digite um numero referente letra B:");
		b = leia.nextInt();
		System.out.println("Digite um numero referente letra C:");
		c = leia.nextInt();
		
		somaAB = a + b;
		
		
		if (somaAB < c) {
			
			System.out.println("A soma de A + B é Menor do que C");
		}
		if (somaAB == c) {
			
			System.out.println("A soma de A + B é Igual a C");
		}
		if (somaAB > c) {
			System.out.println("A soma de A + B é Maior do que C");
		}

	}

}

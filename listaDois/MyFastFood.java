package listaDois;

import java.util.Scanner;

public class MyFastFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigoLancheRefri, quantidade;
		Scanner leia = new Scanner(System.in);

		System.out.println(":::::::::::: Lanches e Refrigerantes  :::::::::::::: ");
		System.out.println("CÓD 1:  Cachorro Quente: 	R$10,00");
		System.out.println("CÓD 2:  X-Salada: 		R$15,00");
		System.out.println("CÓD 3:  X-Bacon: 		R$18,00");
		System.out.println("CÓD 4:  Bauru: 			R$8,00");
		System.out.println("CÓD 5:  Refrigerante: 		R$12,00");
		System.out.println("CÓD 6:  Suco de Laranja: 	R$13,00");

		System.out.println("\nDigite o Código do Produto: ");
		codigoLancheRefri = leia.nextInt();

		System.out.println("Quantidade desejada: ");
		quantidade = leia.nextInt();

		int valorFinal = 0;
		String nomeProduto = "";

		switch (codigoLancheRefri) {
		case 1:
			nomeProduto = "DOGÃO DE ESQUINA";
			valorFinal = quantidade * 10;
			break;
			
		case 2:
			nomeProduto = "SALADÃO CAPRICHADO";
			valorFinal = quantidade * 15;
			break;
			
		case 3:
			nomeProduto = "X- BACOOOON";
			valorFinal = quantidade * 18;
			break;
			
		case 4:
			nomeProduto = "BAURUZÃO DE RESPEITO";
			valorFinal = quantidade * 8;
			break;
			
		case 5:
			nomeProduto = "Refrigerante";
			valorFinal = quantidade * 12;
			break;
			
		case 6:
			nomeProduto = "LARANJINHA DOCE";
			valorFinal = quantidade * 13;
			break;

		default:
			System.out.println("Opção inválida, por gentileza refaça o pedido");
		}
		
		System.out.println("Você comprou " + quantidade + " " + nomeProduto);
		System.out.println("Valor total do seu pedido: R$" + valorFinal);

	}

}

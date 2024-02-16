package listaDois;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int codCargo;
		String nomeColaborador;
		float salario;
		
		
		System.out.println("Código :: Cargo :: Percentual do seu Reajuste");
		System.out.println("   1:  Gerente 			10%");
		System.out.println("   2:  Vendedor 		7%");
		System.out.println("   3:  Supervisor 		9%");
		System.out.println("   4:  Motorista 		6%");
		System.out.println("   5:  Estoquista 		5%");
		System.out.println("   6:  Técnico de TI 	         8%");

		System.out.println(" Digite nome e sobrenome do colaborador: ");
		nomeColaborador = leia.nextLine();

		System.out.println("Digite o Código referente ao cargo: ");
		codCargo = leia.nextInt();

		System.out.println("Digite o  salário atual: ");
		salario = leia.nextFloat();
		
		String nomeCargo = "";
		float novoSalario = 0f;
		
		switch (codCargo) {
		case 1:
			nomeCargo = "Gerente";
			novoSalario = salario + (salario * 0.10f);
			break;
		case 2:
			nomeCargo = "Vendedor";
			novoSalario = salario + (salario * 0.07f);
			break;
		case 3:
			nomeCargo = "Supervisor";
			novoSalario = salario + (salario * 0.09f);
		case 4:
			nomeCargo = "Motorista";
			novoSalario = salario + (salario * 0.06f);
			break;
		case 5:
			nomeCargo = "Estoquista";
			novoSalario = salario + (salario * 0.05f);
			break;
		case 6:
			nomeCargo = "Técnico de TI";
			novoSalario = salario + (salario * 0.08f);
			break;

		default:
			System.out.println("Opção inválida!");
		}

		System.out.println(" Nome do colaborador: " + nomeColaborador );
		System.out.println("Seu cargo: " + nomeCargo ); 
		System.out.println("Seu salário reajustado será de:  " + novoSalario);


	}

}

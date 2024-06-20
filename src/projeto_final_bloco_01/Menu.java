package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		String marca;
		float valor;
		int ano;

		int opcao;

		while (true) {

			System.out.println("""
					             ============================
					                      ZEN CARROS 
					             ============================
					             
					             1 - PROCURAR CARRO
					             2 - LISTA DE CARROS
					             3 - EXCLUIR CARRO
					             4 - ATAULIAZAR ESTOQUE
					             5 - SAIR
					             
					             ============================
					""");

			opcao = sc.nextInt();

			if (opcao == 5) {
				System.out.println("\nA Zen Carros Agradece a Prefencia!");
				sobre();
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Escreva o nome a marca e ano do carro que deseja:");
				break;
				
			case 2:
				System.out.println("Carros Em Nosso Estoque");
				break;
				
			case 3:
				System.out.println("Excluir Carro ");
				break;
				
			case 4:
				System.out.println("Aualizar");
				break;
				
			case 5:
				System.out.println("SAIR");
			} 
		}
	}

	private static void sobre() {

		
	}
}

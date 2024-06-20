package projeto_final_bloco_01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Carro> carros = new ArrayList<>();

        Carro carro1 = new Carro("Polo", "Volkswagen", 30000.0f, 2001);
        carros.add(carro1);

        Carro carro2 = new Carro("911", "Porsche", 1000000.0f, 2024);
        carros.add(carro2);

        Carro carro3 = new Carro("Uno", "Fiat", 10000.0f, 2015);
        carros.add(carro3);


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
    public void visualizar() {
    	
    }
	
	private static void sobre() {
		
	}
}
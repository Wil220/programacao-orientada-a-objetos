package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Controller controller = new Controller();

        int opcao;

        while (true) {

            System.out.println("""
                                 ============================
                                          ZEN CARROS 
                                 ============================
                                 
                                 1 - CADASTRAR CARRO
                                 2 - LISTA DE CARROS
                                 3 - EXCLUIR CARRO
                                 4 - ATUALIZAR ESTOQUE
                                 5 - SAIR
                                 
                                 ============================
                    """);

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 5) {
                System.out.println("\nA Zen Carros Agradece a Preferência!");
                sobre();
                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de Novo Carro");
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Digite o valor: ");
                    float valor = sc.nextFloat();
                    System.out.print("Digite o ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    Carro novoCarro = new Carro(nome, marca, valor, ano);
                    controller.cadastrar(novoCarro);
                    break;

                case 2:
                    System.out.println("Carros em Nosso Estoque:");
                    controller.listarProdutos();
                    break;

                case 3:
                    System.out.println("Excluir Carro");
                    System.out.print("Digite o índice do carro a ser excluído: ");
                    int indice = sc.nextInt();
                    controller.deletarProduto(indice);
                    break;

                case 4:
                    System.out.println("Atualizar Estoque");
                    System.out.print("Digite o nome do carro a ser atualizado: ");
                    String nomeAtualizacao = sc.nextLine();

                    System.out.print("Digite a nova marca: ");
                    String novaMarca = sc.nextLine();
                    System.out.print("Digite o novo valor: ");
                    float novoValor = sc.nextFloat();
                    System.out.print("Digite o novo ano: ");
                    int novoAno = sc.nextInt();
                    sc.nextLine(); 

                    Carro carroAtualizado = new Carro(nomeAtualizacao, novaMarca, novoValor, novoAno);
                    controller.atualizarProduto(carroAtualizado);
                    break;

                default:
                    System.out.println("Opção Inválida! Tente novamente.");
                    break;
            }
        }
    }

    private static void sobre() {
        System.out.println("\n===================");
        System.out.println("ZEN CARROS");
        System.out.println("===================");
    }
}
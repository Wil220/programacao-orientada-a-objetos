package projeto_final_bloco_01;

import java.util.ArrayList;

public class Controller implements repository {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    @Override
    public void cadastrar(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("O produto " + produto.getNome() + " foi criado com sucesso!");
    }

    @Override
    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : listaProdutos) {
                produto.visualizar();
                System.out.println("--------------------");
            }
        }
    }

    @Override
    public void atualizarProduto(Produto produto) {
        for (Produto p : listaProdutos) {
            if (p.getNome().equalsIgnoreCase(produto.getNome())) {
                p.setMarca(produto.getMarca());
                p.setValor(produto.getValor());
                p.setAno(produto.getAno());
                System.out.println("O produto " + produto.getNome() + " foi atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    @Override
    public void deletarProduto(int numero) {
        if (numero < 0 || numero >= listaProdutos.size()) {
            System.out.println("Índice inválido.");
        } else {
            Produto produto = listaProdutos.remove(numero);
            System.out.println("O produto " + produto.getNome() + " foi excluído com sucesso!");
        }
    }
}
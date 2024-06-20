package projeto_final_bloco_01;

public interface repository {

    void cadastrar(Produto produto);

    void listarProdutos();

    void atualizarProduto(Produto produto);

    void deletarProduto(int numero);
}
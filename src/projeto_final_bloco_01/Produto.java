package projeto_final_bloco_01;

public class Produto {
    private String nome;
    private String marca;
    private float valor;
	private int ano;

    public Produto(String nome, String marca, float valor, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.setAno(ano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

    }
	
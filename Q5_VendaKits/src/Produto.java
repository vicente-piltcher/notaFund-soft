public class Produto implements ComponenteProduto {
    private String codigo;
    private String nome;
    private double precoUnitario;

    public Produto(String codigo, String nome, double precoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

}

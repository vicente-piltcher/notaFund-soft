import java.util.List;
import java.util.ArrayList;

public class Kit implements ComponenteProduto{
    private String codigo;
    private String nome;
    private List<Produto> produtos;
    private double desconto;

    public Kit(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.produtos = new ArrayList<>();
        this.desconto = 0.9;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void remProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPrecoUnitario() {
        double sumPrices = 0;
        for (ComponenteProduto p : this.produtos) {
            sumPrices += p.getPrecoUnitario();
        }
        
        return sumPrices * this.desconto;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }
}

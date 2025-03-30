public class ItemDeVenda {
    private ComponenteProduto produto;
    private int quantidade;

    public ItemDeVenda(ComponenteProduto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ComponenteProduto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubTotal() {
        return produto.getPrecoUnitario() * quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - %s - %d x %.2f = %.2f%n", 
                produto.getCodigo(), produto.getNome(), 
                quantidade, produto.getPrecoUnitario(), getSubTotal()));
        
        // Se for um kit, mostrar seus componentes
        if (produto instanceof Kit) {
            Kit kit = (Kit) produto;
            for (ComponenteProduto p : kit.getProdutos()) {
                sb.append(String.format("   |- %s - %s - %.2f%n", 
                        p.getCodigo(), p.getNome(), p.getPrecoUnitario()));
            }
        }
        return sb.toString();
    }
            
}

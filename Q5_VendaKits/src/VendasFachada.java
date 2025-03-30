import java.util.List;

public interface VendasFachada {

    /**
     * Cria uma nova venda e inicia o processo de venda
     *
     * @return a venda recém criada
     */
    Venda iniciarVenda();
    
    /**
     * Registra um novo item de venda de produto em uma venda
     *
     * @param umaVenda a venda atual (aina não fechada) sendo processada
     * @param codigoProduto o código do produto vendido
     * @param quantidade a quantidade vendida do produto
     */
    void registrarVenda(Venda umaVenda, String codigoProduto, int quantidade);
    
    /**
     * Emite o comprovante de venda a ser impresso
     * @param umaVenda a venda para emissão do comprovante
     * @return uma String representando o comprovante de venda ser impresso
     */
    String emitirComprovante(Venda umaVenda);

    /**
     * Consulta a lista de produtos disponíveis para venda
     * @return a lista de produtos disponíveis para venda
     */
    List<ComponenteProduto> buscarProdutos();
}

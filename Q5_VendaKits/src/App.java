import java.util.List;

public class App {
    public static void main(String[] args){
        VendasFachada proc = new VendasEmMemoria();
        List<ComponenteProduto> produtos = proc.buscarProdutos();
        Venda venda = proc.iniciarVenda();
        proc.registrarVenda(venda, produtos.get(0).getCodigo(), 1);
        proc.registrarVenda(venda, produtos.get(1).getCodigo(), 2);
        proc.registrarVenda(venda, produtos.get(3).getCodigo(), 1);
        System.out.println(proc.emitirComprovante(venda));
    }
}

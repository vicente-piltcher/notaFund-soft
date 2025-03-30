import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada{
	private List<ComponenteProduto> produtos;
	
	public VendasEmMemoria() {
		produtos = new ArrayList<>();
		produtos.add(new Produto("1", "Caneta", 1.55));
		produtos.add(new Produto("2", "Borracha", 1.15));
		produtos.add(new Produto("3", "Caderno", 32.99));

		Kit kit1 = new Kit("10", "Kit Faculdade");
		kit1.addProduto(new Produto("4", "Lapis", 4.5));
		kit1.addProduto(new Produto("5", "Lapiseira", 14.5));
		kit1.addProduto(new Produto("6", "Estojo", 24.5));
		kit1.addProduto(new Produto("7", "Pod", 140.0));

		produtos.add(kit1);

	}
	
	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public void registrarVenda(Venda umaVenda, String codigoProduto, int quantidade) {
		ComponenteProduto prod = produtos.stream().filter(p -> p.getCodigo() == codigoProduto).findFirst().get();
		umaVenda.registrarVenda(prod, quantidade);
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

	@Override
	public List<ComponenteProduto> buscarProdutos() {
		return Collections.unmodifiableList(produtos);
	}

}

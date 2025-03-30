import java.util.ArrayList;
import java.util.List;

public class DadoManipulado extends DadoDecorator {

    private List<Integer> historico;

    public DadoManipulado(Dado dado) {
        super(dado);
        this.historico = new ArrayList<>();
    }

    public void rolar(){
        super.rolar();
        historico.add(super.getValor());

        if (historico.size() >= 3) {
            int ultimasTresJogadas = historico.get(historico.size()-1) + 
                                    historico.get(historico.size()-2) + 
                                    historico.get(historico.size()-3);
            if (ultimasTresJogadas > 15) {
                // Manipular resultado (implementação específica aqui)
                System.out.println("Jogador com muita sorte! Aumentando dificuldade...");
            }
        }
    }

    public List<Integer> getHistorico() {
        return historico;
    }
    
}

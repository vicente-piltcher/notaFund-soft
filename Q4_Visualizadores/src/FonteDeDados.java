import java.util.ArrayList;
import java.util.List;

public class FonteDeDados implements Observado{
    private List<Observador> observadores = new ArrayList<>();
    private List<Integer> valores = new ArrayList<Integer>();

    public void acrescentaValor(int valor){
        this.valores.add(valor);
        notificarObservadores();
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    //////////////////////////////OBSERVADORES//////////////////////////////////q

    public void adicionarObservador(Observador observador) {
        this.observadores.add(observador);
    }
    public void removerObservador(Observador observador){
        this.observadores.remove(observador);
    }

    public List<Integer> getValores(){
        return this.valores;
    }

    public void notificarObservadores(){
        for (Observador observador : observadores) {
            observador.atualizar(valores);
        }
    }
}
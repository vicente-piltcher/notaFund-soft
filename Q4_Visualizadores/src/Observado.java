import java.util.List;

public interface Observado {
    void adicionarObservador(Observador observador);
    void removerObservador(Observador observador);
    List<Integer> getValores();
    void notificarObservadores();
}
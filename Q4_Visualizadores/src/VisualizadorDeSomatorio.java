import java.util.List;

public class VisualizadorDeSomatorio implements Observador{

    public VisualizadorDeSomatorio(){}

    public void atualizar(List<Integer> valores){
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+valores.size());
    }
}

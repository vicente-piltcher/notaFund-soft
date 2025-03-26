import java.util.List;

public class VisualizadorDeMedia implements Observador{

    public VisualizadorDeMedia(){}

    public void atualizar(List<Integer> valores){
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+valores.size());
    }
    
}

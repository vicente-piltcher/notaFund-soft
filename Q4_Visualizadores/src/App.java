import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> ls = new ArrayList<Integer>();

        var dados = new FonteDeDados();
        var vdm = new VisualizadorDeMedia();
        var vds = new VisualizadorDeSomatorio();

        Scanner s = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de visualizadores!");
        System.out.println("Opções:");
        System.out.println("-1: Ligar Visualizador de Média");
        System.out.println("-2: Ligar Visualizador de Somatório");
        System.out.println("0: Sair");
        System.out.println("Digite números para adicionar à fonte de dados.");

        int valor = 0;
        boolean control = true;
        while(control){
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());

            switch (valor) {
                case -1:
                    dados.adicionarObservador(vdm);
                    System.out.println("Visualizador de Média ligado.");
                    break;
                case -2:
                    dados.adicionarObservador(vds);
                    System.out.println("Visualizador de Somatório ligado.");
                    break;
                case 0:
                    s.close();
                    control = false;
                    break;
                default:
                dados.acrescentaValor(valor);
                    break;
            }
        }
        System.out.println("Fim");
    }
}

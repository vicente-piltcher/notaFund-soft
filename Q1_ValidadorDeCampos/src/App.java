import java.util.Scanner;


public class App {
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ValidadorFactory validadorFactory = new ValidadorFactory();


        System.out.println("Escolha seu verificador:\n 1 - Validador Email \n 2 - Validador Inteiro \n 3 - Validador Matricula ");
        int escolha = ler.nextInt();

        ValidadorFactory.Tipo tipo = null;
        switch (escolha) {
            case 1:
                tipo = ValidadorFactory.Tipo.EMAIL;
                break;
            case 2:
                tipo = ValidadorFactory.Tipo.INTEIRO;
                break;
            case 3:
                tipo = ValidadorFactory.Tipo.MATRICULA;
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        ValidadorInterface validador = validadorFactory.criaValidador(tipo);

        System.out.println("Digite o valor a ser verificado:");
        String valor = ler.next();
        ler.close();

        if (validador.valida(valor)) {
            System.out.println("Valor válido!");
        } else {
            System.out.println("Valor inválido!");
        }

        ler.close();
    }
}

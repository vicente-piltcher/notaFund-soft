public class App {
    public static void main(String[] args) {
        Dado dadoNormal = new Dado(6);
        System.out.println("=== Dado Normal ===");
        for (int i = 0; i < 5; i++) {
            dadoNormal.rolar();
            System.out.println("Lançamento " + (i+1) + ": " + dadoNormal.getValor());
        }

        DadoInterface dadoManipulado = new DadoManipulado(new Dado(6));
        System.out.println("\n=== Dado Com Histórico ===");
        for (int i = 0; i < 5; i++) {
            dadoManipulado.rolar();
            System.out.println("Lançamento " + (i+1) + ": " + dadoManipulado.getValor());
            
            // Acessando funcionalidades específicas do decorator
            if (dadoManipulado instanceof DadoManipulado) {
                DadoManipulado decorator = (DadoManipulado) dadoManipulado;
                System.out.println("Histórico: " + decorator.getHistorico());
            }
        }
        
    }
}

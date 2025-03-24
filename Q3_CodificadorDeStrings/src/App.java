public class App {
    public static void main(String[] args) throws Exception {
        ProcessaCodificador codProcess = new ProcessaCodificador();

        String aux = "Desafio Padrões de Projeto";

        System.out.println(aux);
        codProcess.setCodificador(new CodificadorSimples());
        aux = codProcess.processar(aux);
        System.out.println(aux);
        codProcess.setCodificador(new CodificadorDesloca());
        aux = codProcess.processar(aux);
        System.out.println(aux);
        codProcess.setCodificador(new CodificadorSimples());
        aux = codProcess.processar(aux);
        System.out.println(aux);
        codProcess.setCodificador(new CodificadorDesloca());
        aux = codProcess.processar(aux);
        System.out.println(aux);
    }
}

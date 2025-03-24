public class ProcessaCodificador {
    private CodificadorInterface codificador;

    // Permite alterar o comportamento em tempo de execução
    public void setCodificador(CodificadorInterface codificador) {
        this.codificador = codificador;
    }

    public String processar(String texto) {
        if (codificador == null) {
            throw new IllegalStateException("Nenhum codificador definido!");
        }
        return codificador.codifica(texto);
    }
}
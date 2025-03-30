public abstract class DadoDecorator implements DadoInterface{
    protected Dado dado;

    public DadoDecorator(Dado dado) {
        this.dado = dado;
    }

    public void rolar(){
        dado.rolar();
    }

    public int getValor(){
        return dado.getValor();
    }
}

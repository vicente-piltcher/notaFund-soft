

public class ValidadorFactory {

    public enum Tipo { EMAIL, INTEIRO, MATRICULA }

    public ValidadorFactory() {
    }

    public ValidadorInterface criaValidador(Tipo type) {
        
        switch (type) {
            case EMAIL:
                return new ValidadorEmail();
            case INTEIRO:
                return new ValidadorInteiro();
            case MATRICULA:
                return new ValidadorMatricula();
            default:
                return null;
        }
    }
}

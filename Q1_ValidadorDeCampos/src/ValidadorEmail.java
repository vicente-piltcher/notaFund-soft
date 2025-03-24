

public class ValidadorEmail implements ValidadorInterface {

    public ValidadorEmail(){}
    @Override
    public boolean valida(String valor) {
        int posA = valor.indexOf('@');
        int posPt = valor.indexOf('.');
        if (posA <= 0 || posPt <= 0) return false;
        return true;
    }

}
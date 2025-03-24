public class ValidadorMatricula implements ValidadorInterface {

    public ValidadorMatricula() {}
    @Override
    public boolean valida(String valor) {
        int sum = 0;
        for(int i=0;i<valor.length()-1;i++){
            sum += Character.getNumericValue(valor.charAt(i));
        }
        int verificador = sum%10;
        if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
            return true;
        }
    
        return false;
    }

}
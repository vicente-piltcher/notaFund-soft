import java.util.HashMap;
import java.util.Map;

public class CodificadorDesloca implements CodificadorInterface{

    private Map<Character,Character> tabCod;
    private Map<Character,Character> tabDeCod;

    public CodificadorDesloca(){
        tabCod = new HashMap<>();
        tabCod.put('a','@');
        tabCod.put('e','#');
        tabCod.put('i','!');
        tabCod.put('o','$');
        tabCod.put('u','%');
        tabDeCod = new HashMap<>();
        tabDeCod.put('@','a');
        tabDeCod.put('#','e');
        tabDeCod.put('!','i');
        tabDeCod.put('$','o');
        tabDeCod.put('%','u');
        
    }

    public String getNome() {
        return "Codificador Simples";
    }

    public String codifica(String str){
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])+1);
        }
        return(new String(resp));
    }

    public String decodifica(String str){
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])-1);
        }
        return(new String(resp));
    }
    
}

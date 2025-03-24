import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Log implements Iterable<String>{
    
    private static Log instancia;
    private List<String> mensagens;

    public Log(){
        mensagens = new LinkedList<>();
    }

    public static Log getInstancia(){
        if (instancia == null) {
            instancia = new Log();
        }
        return instancia;
    } 


    public void log(String m){
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }

}

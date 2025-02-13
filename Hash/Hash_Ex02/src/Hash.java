import java.util.ArrayList;
import java.util.Iterator;

public class Hash {
    private static int tamanho = 17;
    private ArrayList<Times>[] tabela;
    public Hash(){
         tabela = (ArrayList<Times>[]) new ArrayList[tamanho];
    }
    public int hash(String chave){
       int  h = 0;
        for (int i = 0; i < chave.length(); i++) {
            h = (31 * h + chave.charAt(i)) % tamanho;
        }
        return h;
    }
     
    public Times get(String chave){
        int hash = hash(chave);
        ArrayList<Times> times = tabela[hash];
        if(times == null){
            return null;
        }else{
            for (Times time : times) {
                if(time.getCodigo().equals(chave)){
                    return time;
                }
            }
            return null;
        }
        
    }

    public void put(Times t){
        int hash = hash(t.getCodigo());
        ArrayList<Times> times = tabela[hash];
        if(times == null){
            times = new ArrayList<Times>();
            times.add(t);
            tabela[hash] = times;
        }else{
            boolean achar = false;
            for (Times time : times) 
                if(time.getCodigo().equals(t.getCodigo()))
                    achar = true;
            if(!achar)
                times.add(t);    
        }
    }

    public Times remove(String chave){
        int hash = hash(chave);
        ArrayList<Times> times = tabela[hash];
        if(times == null){
            return null;
        }else{
            Iterator<Times> it = times.iterator();
            Times atual = null;

            while (it.hasNext()) {
                atual = it.next();
                if(atual.getCodigo().equals(chave)){
                    it.remove();
                    return atual;
                }
            }
            return null;
            // for (Times time : times) {
            //     if(time.getCodigo().equals(chave)){
            //        return null;
            //     }
            // }
        }
    }

    public void status(){
        for (int i = 0; i < tamanho; i++) {
            if(tabela[i]!=null){
                ArrayList<Times> t = tabela[i];
                System.out.println("A linha: " + i + " possui "+ t.size() + " times.");
            }else{
                System.out.println("A linha ta vazia");

            }  
        }
    }
}

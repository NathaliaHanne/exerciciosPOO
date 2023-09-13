package exercicio2.amigo.secreto;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaAmigo {
    public static void main (String []args){
        List<Amigo> lista  = new LinkedList<>();
        lista.add(new Amigo("Nathália", "nathalia@gmail.com"));
        lista.add(new Amigo("José", "jose@gmail.com"));
        lista.add(new Amigo("Camila","camila@gmail.com"));
        lista.add(new Amigo("Ayla","Ayla@gmail.com"));
        System.out.println("Lista Bagunçada:");
        for (Amigo a : lista){
            System.out.println("Amigo: "+ a.getNome());
        }
        System.out.println("\nLista Ordenada:");
        Collections.sort(lista);
        for (Amigo a : lista){
            System.out.println("Amigo: "+ a.getNome());
        }
    }
}

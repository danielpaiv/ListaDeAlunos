package danielPaiva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exemploListaSimplis1 {

    public static void main(String args[]){
        System.out.println("Olá mundo");
        exemploListaSimples();
        exemploListaDecrecente();

    }
    private static void exemploListaSimples(){
        System.out.println("\n***** Exemplo lista simples *****\n");
        List<String> lista = new ArrayList<String>(); //coixa de pacotes de lista
        lista.add("Carlos Paiva");
        lista.add("Kauê Paiva");
        lista.add("Jayene Paiva");
        lista.add("Daniel Paiva");
        lista.add("Ednilda Paiva");
        System.out.println(lista);
        System.out.println(" ");

    }
    //Lista decrecente
    private static void exemploListaDecrecente(){
        System.out.println("***** Exemplo lista simples Decrecente*****\n");
        List<String> lista = new ArrayList<String>();
        lista.add("Carlos Paiva");
        lista.add("Kauê Paiva");
        lista.add("Jayene Paiva");
        lista.add("Daniel Paiva");
        lista.add("Ednilda Paiva");
        Collections.sort(lista);// Codigo pra ordem decrecente de A a Z
        System.out.println(lista);
        System.out.println(" ");
    }
}

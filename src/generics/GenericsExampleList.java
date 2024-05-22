package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {

    public static void main(String[] args) {
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // for para Sem Generics
        for( Object elemento : listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }

        // for para Com Generics
        for( String elemento : listaGenerics ){
            System.out.println(elemento);
        }


    }

}

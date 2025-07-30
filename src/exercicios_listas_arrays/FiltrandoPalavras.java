package exercicios_listas_arrays;


import java.util.ArrayList;
import java.util.List;

public class FiltrandoPalavras {
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();

        lista.add("maça");
        lista.add("banana");
        lista.add("pente");
        lista.add("capa");
        lista.add("Amendoim");
        lista.add("Ama");
        String palavra;
        char primeiraLetra;

        //char usa aspas simples
        // string usa aspas duplas
        // String é um objeto e para compara não é possível usar o == pois o == é usado apenas para tipos primitivos
        // Sendo assim para comparar string é necessário usar o .equals("Palavra a ser comparada")

        for(int i = 0; i <= lista.size() -1; i++){
            palavra = lista.get(i);
            if(palavra.length() >= 5) {
                primeiraLetra = palavra.charAt(0);
                System.out.println("Usando o substring:" + primeiraLetra);
                if (primeiraLetra == 'A') {
                    System.out.println(palavra);
                }
            }
        }


    }
}

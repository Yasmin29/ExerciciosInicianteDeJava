package exercicios_listas_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteioAleatorio {
    public static void main(String[] args){
        List<String> listaNomes = new ArrayList<>();
        List<String> nomesSorteados = new ArrayList<>();
        Random random = new Random();
        Integer numeroSorteado = 0;

        listaNomes.add("Camila");
        listaNomes.add("Maria");
        listaNomes.add("João");
        listaNomes.add("Jéssica");
        listaNomes.add("Amanda");
        listaNomes.add("Yasmin");
        listaNomes.add("Solange");
        listaNomes.add("Wladimir");
        listaNomes.add("Gui");
        listaNomes.add("Camila");

        do {
            numeroSorteado = random.nextInt(listaNomes.size());
            nomesSorteados.add(listaNomes.get(numeroSorteado));
            listaNomes.remove(listaNomes.get(numeroSorteado));

        } while (nomesSorteados.size() < 3);

        System.out.println("Sorteados: " + nomesSorteados);
        System.out.println("Não sorteados: " + listaNomes);
    }
}

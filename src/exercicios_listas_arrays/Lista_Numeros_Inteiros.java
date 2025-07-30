package exercicios_listas_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista_Numeros_Inteiros {


    public static void main (String[] Args) {
        List<Integer> listaNumeros = new ArrayList<>();
        char palavraMagica = 'S';
        Scanner entrada = new Scanner(System.in);
        int somaTotalDePares = 0;

        do{
            System.out.println("Digite o numero desejado: ");
            Integer numeroDigitado = entrada.nextInt();

            listaNumeros.add(numeroDigitado);

            System.out.println("Deseja continuar? s/n");
            palavraMagica = entrada.next().charAt(0);

        } while(palavraMagica == 's' || palavraMagica == 'S');

        for(int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) % 2 == 0){
                somaTotalDePares = listaNumeros.get(i) + somaTotalDePares;
            }
            else if(listaNumeros.get(i) % 2 != 0){
                listaNumeros.remove(i);// se remove o tamanho da lista diminiu e
                i = i - 1;
            }
        }

        System.out.println("Total da soma dos pares:" + somaTotalDePares);
        System.out.println("Lista de números pares:" + listaNumeros);

    }
}

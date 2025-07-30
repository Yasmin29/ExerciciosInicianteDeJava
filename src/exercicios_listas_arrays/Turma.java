package exercicios_listas_arrays;

import java.util.ArrayList;
import java.util.List;

public class Turma {
//     5. Lista de Listas -
//     Turmas de uma escola
//    Crie uma List<List<String>>
//    onde cada sublista representa uma turma com nomes de alunos.
//    - Adicione 2 turmas com pelo menos 3 nomes cada.
//    - Imprima todos os nomes de todas as turmas.

    public static void main(String [] Args) {


        List<List<String>> turma = new ArrayList<>();

        List<String> turmaUm = new ArrayList();
        turmaUm.add("Yasmin");
        turmaUm.add("Guilherme kawaii");
        turmaUm.add("Elder");

        List<String> turmaDois = new ArrayList<>();
        turmaDois.add("Pedro");
        turmaDois.add("Zotto");
        turmaDois.add("Carioca");

        List<String> turmaTres = new ArrayList<>();
        turmaTres.add("Pamela");
        turmaTres.add("Petter");
        turmaTres.add("Joana");

        turma.add(turmaUm);
        turma.add(turmaDois);
        turma.add(turmaTres);

        //Vou ter que percorrer as 3 listas i vai ir até 3
        // e vou ter que percorrer as listas de dentro da lista v
        for(int i = 0; i < turma.size(); i++){
            System.out.println("Turma: " + turma.get(i));
            for(int j = 0; j < turma.get(i).size(); j++){ //vai pegar a posição 1 e o tamanho da lista 1
                System.out.println("Nome Aluno: " + turma.get(i).get(j));
            }
        }
    }
}

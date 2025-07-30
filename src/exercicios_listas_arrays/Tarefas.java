package exercicios_listas_arrays;

import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    String descricao;
    Boolean concluida;

    public Tarefas(String descricao, Boolean concluida){
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public static void main(String[] args) {
        List<Tarefas> listaDeTarefas = new ArrayList<>();
        Integer totalConcluida = 0;

        Tarefas tarefaUm = new Tarefas("Lavar roupa", true);
        listaDeTarefas.add(tarefaUm);

        Tarefas tarefaDois = new Tarefas("Arrumar coisas da cleidi", false);
        listaDeTarefas.add(tarefaDois);

        Tarefas tarefaTres = new Tarefas("Terminar meus trabalhos do curso", false);
        listaDeTarefas.add(tarefaTres);

        Tarefas tarefaQuatro = new Tarefas("Tomar banho", false);
        listaDeTarefas.add(tarefaQuatro);

        Tarefas tarefaCinco = new Tarefas("Rever aulas", true);
        listaDeTarefas.add(tarefaCinco);


        for(int i = 0; i < listaDeTarefas.size(); i++){
            if(listaDeTarefas.get(i).concluida == false){
                System.out.println("Tarefas pendente: " + listaDeTarefas.get(i).descricao);
            } else {
                totalConcluida += 1;
            }

        }

        System.out.println("Total de tarefas concluídas: " + totalConcluida);

    }

}

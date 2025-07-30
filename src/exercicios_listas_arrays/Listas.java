package exercicios_listas_arrays;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    private List<String> itens;

    public Listas() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String novoItem) {
        itens.add(novoItem);
    }

    public void removerItem(String itemRemovido) {
        itens.remove(itemRemovido);
    }

    public void printarListaInteira() {
        System.out.println(itens);
    }

    public void ordemAlfabetica(){
        String auxiliar;
        for(int i = 0; i < itens.size(); i++){
            for(int j = 0 ; j < itens.size() - 1; j++) {
                if(itens.get(j).compareTo(itens.get(j+1)) > 0){
                    auxiliar = itens.remove(j);
                    itens.add(j+1, auxiliar);
                }
            }
        }
    }

    public static void main(String[] args) {
        Listas lista = new Listas();
        lista.adicionarItem("Gui");
        lista.adicionarItem("Casmin");
        lista.adicionarItem("Amanda");
        lista.ordemAlfabetica();
        lista.printarListaInteira();
    }
}

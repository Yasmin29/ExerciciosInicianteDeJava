package exercicios_listas_arrays;

import java.util.ArrayList;
import java.util.List;

public class Formulario {
    public static void main(String[] Args){
        List<Object> objects = new ArrayList<>();

        objects.add("Texto");
        objects.add(15);
        objects.add(0.0);
        objects.add(false);
        objects.add("Texto da vida");

        for(int i = 0; i < objects.size(); i++){
            if(objects.get(i) instanceof String){
                System.out.println("Este tipo é String: " + objects.get(i));
            }
            else if(objects.get(i) instanceof Integer){
                System.out.println("Este tipo é Integer: " + objects.get(i));
            }
            else if(objects.get(i) instanceof Double){
                System.out.println("Este é o tipo Double: " + objects.get(i));
            }
            else if(objects.get(i) instanceof Boolean){
                System.out.println("Este é o tipo Boolean: " + objects.get(i));
            }
        }
    }
}

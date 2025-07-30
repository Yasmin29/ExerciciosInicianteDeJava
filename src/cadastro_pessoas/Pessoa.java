package cadastro_pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        List<String> maioresDeIdade = new ArrayList<String>();
        String nomeDoMaisVelho = "nome";
        Scanner entrada = new Scanner(System.in);
        String resposta = "S";

        do {
            System.out.println("Digite o nome:");
            String nome = entrada.next();

            System.out.println("Digite a idade: ");
            int idade = entrada.nextInt();

            Pessoa pessoa = new Pessoa(nome, idade);
            listaPessoas.add(pessoa);

            System.out.println("Deseja continuar?: S/N");
            resposta = entrada.next();

        } while (resposta.equalsIgnoreCase("S"));

        for(int i = 0; i < listaPessoas.size(); i++){
            if(listaPessoas.get(i).idade >= 18){
                maioresDeIdade.add(listaPessoas.get(i).nome);
            }
            for(int j = 0; j < listaPessoas.size(); j++){
                if(listaPessoas.get(i).idade > listaPessoas.get(j).idade){
                    nomeDoMaisVelho = listaPessoas.get(i).nome;
                }
            }
        }

        System.out.println("Maiores de idade: " + maioresDeIdade);
        System.out.println("Mais velho:" + nomeDoMaisVelho);
    }
}



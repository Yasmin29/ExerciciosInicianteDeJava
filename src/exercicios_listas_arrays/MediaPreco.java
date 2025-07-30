package exercicios_listas_arrays;

public class MediaPreco {

    public static void main(String[] args){
        double[] preco = {5.10, 10.20, 30.50};
        double total = 0.0;
        double media = 0.0;
        double maiorPreco = 0.0;
        double menorPreco = 0.0;
        for(int i=0; i <= preco.length - 1; i++){

            total = total + preco[i];
            for(int j = 0; j <= preco.length - 1; j++){
                if(preco[i] < preco[j]){
                    menorPreco = preco[i];
                }
                if(preco[i] > preco[j]){
                    maiorPreco = preco[i];
                }
            }
        }

        media = total / preco.length;
        System.out.println("Média: " + media);
        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + menorPreco);

    }
}

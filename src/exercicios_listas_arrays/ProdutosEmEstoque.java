package exercicios_listas_arrays;

public class ProdutosEmEstoque {
    String nome;
    Double preco;
    int quantidade;

    public ProdutosEmEstoque(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] Args){
        int totalDeItensNoEstoque = 0;
        ProdutosEmEstoque produtoUm = new ProdutosEmEstoque("Banana", 2.50, 9);
        ProdutosEmEstoque produtoDois = new ProdutosEmEstoque("Feijão", 10.50, 5);
        ProdutosEmEstoque produtosTres = new ProdutosEmEstoque("Arroz", 200.00, 80);

        ProdutosEmEstoque[] arrayProdutos = {produtoUm, produtoDois, produtosTres};

        for(int i = 0; i < arrayProdutos.length; i++){
            totalDeItensNoEstoque += arrayProdutos[i].quantidade;
            if(arrayProdutos[i].quantidade < 10){
                System.out.println("Produto com menos de 10 quantidades no estoque:" + arrayProdutos[i].nome);
            }
        }

        System.out.println("Total de itens em estoque: " + totalDeItensNoEstoque);
    }

}

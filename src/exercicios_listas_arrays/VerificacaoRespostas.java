package exercicios_listas_arrays;

public class VerificacaoRespostas {
    public static void main(String[] args) {
        boolean[] gabarito = {true, false, true, true, false};
        boolean[] respostaAluno = {true, false, true, true, false};
        int nota = 0;
//Eu vou comparar gabarito com resposta de Aluno, então tenho que fazer gabarito[0] == resposta de aluno[0]
        for(int i = 0; i <= gabarito.length - 1; i++){
            if(gabarito[i] == respostaAluno[i]){
                nota = nota + 1;
            }
        }

        System.out.println("Acertos: " + nota);
    }
}

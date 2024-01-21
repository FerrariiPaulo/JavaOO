public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoPlano;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int duracaoMinutos;

    void exibeFichaTecnica() {
        System.out.println("Filme: " +  nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        nota += somaAvaliacoes;
    }
}
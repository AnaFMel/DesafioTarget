import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Double> faturamento = new ArrayList<>();
        faturamento.add(22174.1664);
        faturamento.add(24537.6698);
        faturamento.add(26139.6134);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(26742.6612);
        faturamento.add(0.0);
        faturamento.add(42889.2258);
        faturamento.add(46251.174);
        faturamento.add(11191.4722);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(3847.4823);
        faturamento.add(373.7838);
        faturamento.add(2659.7563);
        faturamento.add(48924.2448);
        faturamento.add(18419.2614);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(35240.1826);
        faturamento.add(43829.1667);
        faturamento.add(18235.6852);
        faturamento.add(4355.0662);
        faturamento.add(13327.1025);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(25681.8318);
        faturamento.add(1718.1221);
        faturamento.add(13220.495);
        faturamento.add(8414.61);

        double menor = 0.0;
        double maior = 0.0;
        double divisao = 0.0;
        double soma = 0.0;
        double media = 0.0;
        int acima = 0;

        for (int i = 0; i < faturamento.size(); i++) {
            if (i == 0) {
                menor = faturamento.get(i);
            }
            if (faturamento.get(i) > maior) {
                maior = faturamento.get(i);
            } else if ((faturamento.get(i) == 0.0)) {
                continue;
            } else if (faturamento.get(i) < menor) {
                menor = faturamento.get(i);
            }
        }
        for (Double faturamentoDiario : faturamento) {
            if (faturamentoDiario != 0.0) {
                soma += faturamentoDiario;
                divisao++;
            }
        }
        media = soma / divisao;
        for (Double faturamentoDiario : faturamento) {
            if (faturamentoDiario > media) {
                acima++;
            }
        }

        System.out.println("Maior valor de faturamento ocorrido do mês: " + maior);
        System.out.println("Menor valor de faturamento ocorrido do mês: " + menor);
        System.out.println("O faturamento diário superou a média mensal em " + acima + " dias desse mês");
    }
}
import java.util.HashMap;

public class Ex4 {
    public static void main(String[] args) {
        HashMap<String, Double> valoresIndexados = new HashMap<>();
        HashMap<String, Double> porcentagensIndexadas = new HashMap<>();
        valoresIndexados.put("SP", 67836.43);
        valoresIndexados.put("RJ", 36678.66);
        valoresIndexados.put("MG", 29229.88);
        valoresIndexados.put("ES", 27165.48);
        valoresIndexados.put("outros", 19849.53);

        double total = 0;
        double porcentagem = 0;

        for (Double valor : valoresIndexados.values()) {
            total += valor;
        }
        for (HashMap.Entry<String, Double> valor : valoresIndexados.entrySet()) {
            porcentagem = valor.getValue() / total;
            porcentagensIndexadas.put(valor.getKey(), porcentagem * 100);
        }
        System.out.println("Percentual de cada estado dentro do faturamento total:");
        for (HashMap.Entry<String, Double> valor : porcentagensIndexadas.entrySet()) {
            System.out.println(valor.getKey() + ": %" + valor.getValue());
        }

    }
}
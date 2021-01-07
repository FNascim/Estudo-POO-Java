public class Faturamento {
    public static void main(String[] args) {
        Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

        Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

        Double faturamento = 0.0;
        Double faturamentoSemana = 0.0;
        Double[] faturamentoMaior = new Double[4];
        for (int i = 0; i < mes.length; i++)
        {

            Double[] semana = mes[i];
            for (int j = 0; j < semana.length; j++)
            {
                Double dia = semana[j];
                if (semana[j] > faturamento)
                {
                    faturamento = semana[j];
                }
                faturamentoSemana += semana[j];
            }
            faturamentoMaior[i] = faturamentoSemana;
            faturamentoSemana = 0.0;
        }
        Double f = 0.0;
        Double s = 0.0;
        for (int x = 0; x< faturamentoMaior.length; x++)
        {

            if (faturamentoMaior[x] > f)
            {
                f = faturamentoMaior[x];
                s = x+1.0;
            }
        }
        System.out.println("Maior faturamento: " + faturamento);
        System.out.println("Semana com maior faturamento: " + s);
        System.out.println("Faturamento da semana com maior faturamento: " + f);
    }
}

package Map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {



        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carros = new HashMap<>(){{
           put("gol", 16.1);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};
        System.out.println(carros);

        System.out.println("Substitua o consumo do gol por 15,2km/l: ");
        carros.put("gol", 15.2);
        System.out.println(carros);

        System.out.println("Confira se o modelo Tucson está no dicionário: "+ carros.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carros.get("uno"));

        //System.out.println("Exiba o terceiro modelo adcionado: "); Não trabalha com índices

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumo = carros.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais economico e seu modelo: " );
        Double consumos = Collections.max(carros.values());

        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEficiente = " ";

        for (Map.Entry<String, Double> entry : entries ) {
            if (entry.getValue().equals(consumos)){
                modeloMaisEficiente = entry.getKey();
            }
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumos);

        System.out.println("Exiba o modelo menos economico e seu consumo: ");

        double consumoMenos = Collections.min(carros.values());
        String modeloMenos = " ";
        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            if(entry.getValue().equals(consumoMenos)) {
                modeloMenos = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenos + " - " + consumoMenos);
            }
        }

        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a soma dos consumos: " + (soma/carros.size()));

        Iterator <Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6))  iterator1.remove();
        }
        System.out.println("Remova os carros que o consumo igual a 15.6 km/l: " + carros);

        System.out.println("Exiba os carros na ordem que foi inserida: ");
        Map<String, Double> carros2 = new LinkedHashMap<>(){{
            put("gol", 16.1);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros2);

        System.out.println("Ordenado pelo modelo: ");
        Map<String, Double> carros3 = new TreeMap<>(carros2);
        System.out.println(carros3);

        System.out.println("Apague o dicionario carros: ");
        carros.clear();
        System.out.println(carros);

        System.out.println("Verifique se o dicionario está vazio: " + carros.isEmpty());
    }



}

package Set;

import java.util.*;

public class ExemploSet {
    public static void main (String[] args){
        System.out.println("Crie um conjunto e adcione notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5,9.3,5d,7d,8d,0d,3.6));
        System.out.println(notas);

//        System.out.println("Exiba a nota da posição 5.0: "); //Não consigo trabalhar com posição dentro d set
//        System.out.println("Adcione nas lista a nota 8.0: "); //Não consigo trabalhar com posição dentro d set
//        System.out.println("Substitua a nota 8.0 pela nota 6.0: "); //Não consigo trabalhar com posição dentro d set

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a menor nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba na lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){            
            Double next = iterator1.next();
            if(next < 7.0) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exibir as notas na sequencia que foi informada: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(8d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apagar todo conjunto:");
        notas2.clear();
        System.out.println(notas2);
        System.out.println("Confira se o conjunto está vazio: " + notas2.isEmpty());


    }
}

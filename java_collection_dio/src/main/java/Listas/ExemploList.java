package Listas;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {

        //List<Double> notas = new ArrayList<Double>();

        //ArrayList<Double> notas = new ArrayList<>(); //Não recomendado (programar para interface não para implementação)

        //List<Double> notas = new ArrayList<>(Array.asList(7d, 8.5,9.3,5d,0d, 3.6));

        //List<Double> notas = ArrayList<>(7d, 8.5,9.3,5d,0d, 3.6); //Não pode adcionar nem tirar elementos da lista
        //notas.add(10d);
        //System.out.println(notas);

        //List<Double> notas = List.of(7d, 8.5,9.3,5d,0d, 3.6); //Não pode adcionar nem tirar elementos da lista
        //notas.add(1d);
        //notas.remove(5d);0
        //System.out.println(notas);

//        List<Character> consoantesMeuNome = new Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
//        System.out.println(consoantesMeuNome);

        System.out.println("Crie uma lista e adcione as sete notas.");
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adcione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

//      System.out.println("Exiba as notas na ordem que foram infomados: ");
//      for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a teceira nota adcionada: " + notas.get(2));
        System.out.println((notas.toString()));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a menor nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores " );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){     //Verifica se há elementos na proxima posição da lista
            Double next = iterator.next(); //Põe o proximo elemento dentro da variável next
            soma += next; //Atribui e soma o valor de next na variável soma (assim vai somando e atribuindo)
        }
        System.out.println("A soma é: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        Double menor = 0d;
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next < 7d) {
                iterator1.remove();
            }
            System.out.println(notas);
        }

/*        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);*/

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());










    }
}
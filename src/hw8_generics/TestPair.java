package hw8_generics;

/**
 * 1. Реализуйте обобщенный класс Pair<E>, позволяющий сохранять пару элементов типа Е.
 * Предоставьте методы доступа для получения первого и второго элементов.
 *
 * 2.Видоизмените класс из предыдущего упражнения, введя методы mах() и min()
 * для получения наибольшего и наименьшего из двух элементов.
 * Наложите соответствующее ограничение на обобщенный тип Е.
 */

public class TestPair {
    public static void main(String[] args) {

        Pair<Integer> pair = new Pair<>(6, 2);
        System.out.println(pair.getE1()+", "+pair.getE2());


        PairMaxMin<Integer> pairMaxMin = new PairMaxMin<>(7, 3);
        System.out.println(pairMaxMin.min());
        System.out.println(pairMaxMin.max());

    }
}

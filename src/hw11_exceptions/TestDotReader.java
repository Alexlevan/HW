package hw11_exceptions;

import java.util.List;

public class TestDotReader {
    public static void main(String[] args) {

        List<Double> list = new DotReader().readValues();
        System.out.println(list);
        System.out.println(DotReader.sumOfValues(list));
    }
}

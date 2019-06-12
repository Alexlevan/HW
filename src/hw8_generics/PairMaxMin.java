package hw8_generics;

public class PairMaxMin<E extends Comparable<E>> {
    private E first;
    private E second;

    public PairMaxMin(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public E max(){
        return (getFirst().compareTo(getSecond())) > 0 ? getFirst() : getSecond();
    }

    public E min(){
        return (getFirst().compareTo(getSecond())) < 0 ? getFirst() : getSecond();
    }
}

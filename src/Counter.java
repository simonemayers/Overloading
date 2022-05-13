public class Counter {
    private int x;
    private int startValue;

    public Counter() {
        x = 0;
    }

    public Counter(int startValue) {
        x = startValue;
    }

    public int value() {
        return x;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            x += increaseBy;
        }
    }

    public void increase() {
        x += 1;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            x -= decreaseBy;
        }
    }

    public void decrease() {
        x -= 1;
    }

    @Override public String toString() {
        return "Counter{" +
                "x=" + x +
                ", startValue=" + startValue +
                '}';
    }

    public static void main(String[] args) {
        Counter n1 = new Counter(2);
        System.out.println(n1);
        n1.increase(2);
        n1.decrease(1);
        System.out.println(n1);

        Counter n2 = new Counter(2);
        System.out.println(n2);
        n2.increase(5);
        n2.decrease(4);
        System.out.println(n2);

        Counter n3 = new Counter(2);
        System.out.println(n3);
        n3.increase(6);
        n3.decrease(1);
        System.out.println(n3);
    }

}

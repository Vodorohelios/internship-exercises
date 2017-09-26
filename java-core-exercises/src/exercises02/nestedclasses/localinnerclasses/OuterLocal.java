package exercises02.nestedclasses.localinnerclasses;

public class OuterLocal {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        OuterLocal outerLocal = new OuterLocal();
        outerLocal.calculate();
    }
}
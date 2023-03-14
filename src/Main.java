public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        calc.println.accept(calc.isNotZero.test(a) && calc.isNotZero.test(b) ?
                calc.devide.apply(a, b) : "На ноль делить нельзя");
    }
}

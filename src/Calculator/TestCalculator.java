package Calculator;

public class TestCalculator {

    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculatorImpl(10);
        ExpertCalculator expertCalculator = new ExpertCalculatorImpl(10);
        System.out.println(expertCalculator.evaluate("2+3+7"));
        System.out.println(expertCalculator.evaluate("4-3"));
        System.out.println(expertCalculator.evaluate("2*3"));
        System.out.println(expertCalculator.evaluate("4/2"));
        System.out.println(expertCalculator.evaluate("4*2-3"));
        System.out.println(expertCalculator.evaluate("(2+3)*5"));
        System.out.println(expertCalculator.evaluate("2+2*2-(2+3*2)"));
    }
}

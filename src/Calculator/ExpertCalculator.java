package Calculator;

public interface ExpertCalculator extends BasicCalculator {

    // ridicare la putere:
    Long pow(Integer x, Integer n);
    // radical
    Double root(Integer x,Integer n);
    // factorial
    Long factorial(Integer n);

    Double evaluate(String expression);

}
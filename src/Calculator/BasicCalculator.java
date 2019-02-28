package Calculator;

public interface BasicCalculator {

//overloading la aceeasi metoda: acelasi nume , tip diferit de parametrii

    Long add(Integer... array);
    Long add(Long... array);
    Double add(Double... array);

    Long multiply(Integer... array);
    Long multiply(Long... array);
    Double multiply(Double... array);

    Long subtract(Integer a, Integer b);
    Long subtract(Long a, Long b);
    Double subtract(Double a, Double b);

    Long divide(Integer a, Integer b);
    Long divide(Long a, Long b);
    Double divide(Double a, Double b);
    // TODO: Sa implementam la fel si celelalte metode
    // TODO: multiply de toate felurile, scadere, impartire

}

package Calculator;

public class BasicCalculatorImpl implements BasicCalculator {
    private Integer floatingPointNumbers;

    public BasicCalculatorImpl(Integer n) {
        floatingPointNumbers = n;
    }

    protected Integer getFloatingPointNumber() {
        return floatingPointNumbers;
    }

    @Override
    // e tot un array... pe care il folosim putin altfel(cand apelam in main, nu mai e nevoie sa cream array de elemente, ci doar punem elem in paranteza metodei

    public Long add(Integer... array) {
        Long sum = 0L;
        for (Integer number: array) {
            sum += number;
        }
        return sum;
    }

    @Override
    public Long add(Long... array) {
        Long sum = 0L;
        for (Long number: array) {
            sum += number;
        }
        return sum;
    }

    @Override
    public Double add(Double... array) {
        Double sum = 0.0;
        for (Double number: array) {
            sum += number;
        }
        return sum;
    }

    @Override
    public Long multiply(Integer... array) {
        Long result = 1L;
        for (Integer number: array) {
            result *= number;
        }
        return result;
    }

    @Override
    public Long multiply(Long... array) {
        Long result = 1L;
        for (Long number: array) {
            result *= number;
        }
        return result;
    }

    @Override
    public Double multiply(Double... array) {
        Double result = 1.0;
        for (Double number: array) {
            result *= number;
        }
        return result;
    }

    @Override
    public Long subtract(Integer a, Integer b) {
        return Long.valueOf(a-b);
    }


    @Override
    public Long subtract(Long a, Long b) {
        return a-b;
    }

    @Override
    public Double subtract(Double a, Double b) {
        return a-b;
    }

    @Override
    public Long divide(Integer a, Integer b) {
        return Long.valueOf(a/b);
    }

    @Override
    public Long divide(Long a, Long b) {
        return a/b;
    }

    @Override
    public Double divide(Double a, Double b) {
        return a/b;
    }
}

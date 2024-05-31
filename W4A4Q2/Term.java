package W4A4Q2;

public class Term {
    private final int power;
    private final int coeff;

    public int getPow() {
        return power;
    }

    public int getCo() {
        return coeff;
    }

    public Term(int coeff, int power) {
        this.power = power;
        this.coeff = coeff;
    }

    public Term multiply(Term other) {
        return new Term(coeff * other.coeff,power+other.power);
    }

    @Override
    public String toString() {
        if (power == 0) {
            return String.valueOf(coeff);
        }

        return coeff + "x^" + power;
    }
}
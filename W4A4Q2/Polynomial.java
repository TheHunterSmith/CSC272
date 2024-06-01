package W4A4Q2;

import java.util.Iterator;
import java.util.LinkedList;

public class Polynomial implements Iterable<Term> {
    LinkedList<Term> terms;

    public void add(Term newTerm) {

        if (newTerm.getCo() == 0) {
            return;
        }

        for (int i = 0; i < terms.size(); i++) {
            Term term = terms.get(i);
            if (newTerm.getPow() > term.getPow()) {
                terms.add(i, newTerm);
                return;
            } 
            
                else if (newTerm.getPow() == term.getPow()) {
                int value = term.getCo() + newTerm.getCo();
                if(value == 0){
                    terms.remove(i);
                    return;
                }

                int potency = term.getPow();
                terms.set(i, new Term(value, potency));
                return;
            }
        }

        terms.add(newTerm);
    }

    public Polynomial() {
        terms = new LinkedList<>();
    }

    public Polynomial(Term term) {
        this();
        terms.add(term);
    }

    public int degree() {
        return terms.size();
    }

    public void print() {
        for (int i = 0; i < terms.size(); i++) {
            Term term = terms.get(i);
            System.out.print(((term.getCo() > 0 && i != 0) ? "+" : "") + term);
        }
    }

    public void add(Polynomial polynomial) {
        for (Term term : polynomial) {
            add(term);
        }
    }

    Polynomial multiply(Polynomial polynomial) {
        Polynomial polynomialResult = new Polynomial();
        for (Term term1 : polynomial) {
            for (Term term2 : this) {
                polynomialResult.add(term1.multiply(term2));
            }
        }

        return polynomialResult;
    }

    @Override
    public Iterator<Term> iterator() {
        return terms.iterator();
    }

    public static void main(String[] args) {
        Polynomial p = new Polynomial(new Term(-10, 0));
        p.add(new Polynomial(new Term(-1, 1)));
        p.add(new Polynomial(new Term(9, 7)));
        p.add(new Polynomial(new Term(5, 10)));
        p.print();
        System.out.println();
        Polynomial q = p.multiply(p);
        q.print();
    }
}

/**
 * I started getting a little lost while doing this. I started using new ways that I
 * haven't used before, such as the Iterator, and quite frankly
 * I have never really played with Linked lists before either. I did end up with
 * the correct answer when multiplying p(x)*p(x), I will just have to review,
 * I think I may have gotten lucky.
**/
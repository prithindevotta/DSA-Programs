package cp.CodingNinjas;

public class Fractions {
    public static void main(String[] args){
        Fraction f1 = new Fraction(1, 20);
        Fraction f2 = new Fraction(2, 30);
        Fraction.add(f1, f2).print();
        f1.add(f2);
        f1.print();
    }
}

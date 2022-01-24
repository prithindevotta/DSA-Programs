package cp.CodingNinjas;

public class ComplexNumbers {
    public static void main(String[] args){
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(5, -8);
        c1.print();
        c2.print();

        Complex.add(c1, c2).print();
        c1.add(c2);
        c1.print();


        c1.multiply(c2);
        c1.print();

        c1.conjugate().print();
    }
}

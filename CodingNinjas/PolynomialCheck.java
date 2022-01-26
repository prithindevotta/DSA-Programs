package cp.CodingNinjas;

public class PolynomialCheck {
    public static void main(String[] args){
        Polynomial poly = new Polynomial();
        Polynomial poly2 = new Polynomial();
        poly.setCoefficient(5, 2);
        poly.setCoefficient(2, 4);
        poly.setCoefficient(12, 3);
        poly2.setCoefficient(0, 2);
        poly2.setCoefficient(5, 7);
        poly2.setCoefficient(2, 4);
        poly2.setCoefficient(13, 3);
        poly.print();
        System.out.println();
        poly2.print();
        System.out.println();
        Polynomial.add(poly, poly2).print();
//        poly.add(poly2);
//        poly.subtract(poly2);
//        poly.multiply(poly2);
//        poly.print();
//        System.out.println();
//        System.out.println(poly.evaluate(2));
    }
}

package cp.CodingNinjas;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            //TODO error out
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getDenominator(){
        return denominator;
    }
    public int getNumerator(){
        return numerator;
    }

    public void setDenominator(int denominator) {
        if(denominator == 0){
            return;
        }
        this.denominator = denominator;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    private void simplify() {
        int gcd = 1;
        int min = Math.min(this.numerator, this.denominator);
        for(int i=2; i<min; i++){
            if(numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    void add(Fraction f){
        numerator = numerator*f.denominator + f.numerator*denominator;
        denominator = denominator*f.denominator;
        simplify();
    }
    static Fraction add(Fraction f1, Fraction f2){
        int num = f1.numerator*f2.denominator + f2.numerator* f1.denominator;
        int den = f1.denominator* f2.denominator;
        return new Fraction(num, den);
    }
    void print(){
        if (denominator == 1){
            System.out.println(numerator);
        }
        else{
            System.out.println(numerator + "/" + denominator);
        }
    }
}

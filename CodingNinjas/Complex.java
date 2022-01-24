package cp.CodingNinjas;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public void setReal(int real){
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public int getReal() {
        return real;
    }
    public void print(){
        if (imaginary<0){
            System.out.println(real + " - i" + Math.abs(imaginary));
        }
        else{
            System.out.println(real + " + i" + imaginary);
        }
    }
    public void add (Complex c){
        real = this.real+c.real;
        imaginary = this.imaginary+c.imaginary;
    }
    public void multiply(Complex c){
        int temp = real*c.real + -1*imaginary*c.imaginary;
        this.imaginary = real*c.imaginary + imaginary*c.real;
        this.real = temp;
    }
    public Complex conjugate(){
        return new Complex(real, -1*imaginary);
    }
    public static Complex add(Complex c1, Complex c2){
        int realNum = c1.real+c2.real;
        int imagNum = c1.imaginary+c2.imaginary;
        return new Complex(realNum, imagNum);
    }
}

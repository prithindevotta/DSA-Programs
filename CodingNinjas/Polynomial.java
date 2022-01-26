package cp.CodingNinjas;

public class Polynomial {
    private DynamicArray arr;
    private int degree;
    public Polynomial(){
        arr = new DynamicArray();
        degree = 0;
        arr.set(0, 0);
    }
    public void setCoefficient(int power, int coeff){
        if(power>degree){
            for(int i=degree+1; i<power; i++){
                arr.set(i, 0);
            }
            arr.set(power, coeff);
            degree = power;
        }
        else{
            arr.set(power, coeff);
        }
    }

    public int getCoefficient(int degree){
        if(degree>this.degree){
            return 0;
        }
        return arr.get(degree);
    }

    public int getDegree(){
        return degree;
    }
    public void print(){
        for (int i=0; i<=degree; i++){
            if(arr.get(i) != 0 && i != degree){
                System.out.print(arr.get(i) + "x^" + i + "+");
            }
            if(i == degree){
                System.out.print(arr.get(i) + "x^" + i);
            }
        }
    }
    public void add(Polynomial p2){
        for (int i=0; i<=Integer.max(degree, p2.getDegree()); i++){
            arr.set(i, arr.get(i)+ p2.getCoefficient(i));
        }
        for (int i=0; i<=Integer.max(degree, p2.getDegree()); i++){
            if (arr.get(i) != 0){
                degree = i;
            }
        }
    }
    public void subtract(Polynomial p2){
        for (int i=0; i<=Integer.max(degree, p2.degree); i++){
            arr.set(i, arr.get(i)- p2.getCoefficient(i));
        }
        for (int i=0; i<=Integer.max(degree, p2.degree); i++){
            if (arr.get(i) != 0){
                degree = i;
            }
        }
    }
    public void multiply(Polynomial p2){
        int temp[] = new int[degree+p2.getDegree()+1];
        for (int i=0; i<=p2.getDegree(); i++){
            for (int j = 0; j<=degree; j++){
                temp[i+j] += arr.get(j)*p2.getCoefficient(i);
            }
        }
        for (int i=0; i< temp.length; i++){
            arr.set(i, temp[i]);
        }
        degree = degree+p2.getDegree();
    }
    public int evaluate(int x){
        int eval = 0;
        for (int i=0; i<=degree; i++){
            eval+=arr.get(i)*Math.pow(x, i);
        }
        return eval;
    }
    public static Polynomial add(Polynomial p1, Polynomial p2){
        Polynomial temp = new Polynomial();
        for (int i=0; i<=Integer.max(p1.getDegree(), p2.getDegree()); i++){
            temp.setCoefficient(i, p1.getCoefficient(i)+ p2.getCoefficient(i));
        }
        return temp;
    }
}

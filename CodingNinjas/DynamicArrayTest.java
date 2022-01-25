package cp.CodingNinjas;

public class DynamicArrayTest {
    public static void main(String[] args){
        DynamicArray d = new DynamicArray();
        for (int i=0; i<100; i++){
            d.add(i+10);
        }
//        System.out.println(d.size());
        System.out.println(d.get(70));
        System.out.println(d.removeLast());
        d.set(10, 21);
        System.out.println(d.get(10));
        System.out.println(d.size());
    }
}

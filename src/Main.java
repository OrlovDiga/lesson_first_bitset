public class Main {
    public static void main(String[] args){
         Bitset a = new Bitset(3);
         a.add(3);
         a.add(1);
         a.add("dad");
         a.iterSet();



        Bitset b = new Bitset(4);
        b.add(3);
        b.add(41);
        b.add("dad");
        b.add(1);


        a.intersection(b);


    }
}

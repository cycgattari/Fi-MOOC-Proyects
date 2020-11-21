
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        
        Stack p = new Stack();
        p.add("a3ac75");
        p.add("6431ff");
        System.out.println(p.take());

    }
}

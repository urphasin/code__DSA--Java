package stream;

public class Stream {
    public static void main() {
        skip("hello", "world");
        axioms();
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);

        }
    }

    static void axioms() {

    }

}

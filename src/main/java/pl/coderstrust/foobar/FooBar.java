package pl.coderstrust.foobar;

public class FooBar {

    public static void main(String[] args) {

        for(int i=0; i<101; i++) {
            System.out.print(i + " ");

            if(i%3 == 0) {
                System.out.print("Foo");
            }

            if(i%5 == 0) {
                System.out.print("Bar");
            }

            System.out.print("\n");
        }
    }
}

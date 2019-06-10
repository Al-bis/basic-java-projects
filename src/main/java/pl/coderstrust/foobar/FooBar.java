package pl.coderstrust.foobar;

public class FooBar {

    public static void main(String[] args) {

        printFooBar(101);
    }

    private static void printFooBar(int amount) {

        StringBuilder fooBar = new StringBuilder();

        for(int i = 0; i < amount; i++) {
            fooBar.append(i).append(" ");

            if(i % 3 == 0) {
                fooBar.append("Foo");
            }

            if(i % 5 == 0) {
                fooBar.append("Bar");
            }

            System.out.println(fooBar.toString());
            fooBar.setLength(0);
        }
    }
}

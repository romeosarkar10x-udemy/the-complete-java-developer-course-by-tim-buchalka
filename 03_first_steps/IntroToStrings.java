public class IntroToStrings {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("'myString' is equal to '" + myString + "'");
        System.out.println("I wish I had \u00241,000,000,000");

        String lastString = "12";
        System.out.println(lastString + (34 + 5 + 6) + 7);

        double myDouble = 234.88232849238542348921749231749213794721394723197491274;
        float myFloat = 234.88232849238542348921749231749213794721394723197491274f;

        System.out.println("Double | 123" + myDouble);
        System.out.printf("Double | %.20f\n", myDouble);

        System.out.println("Float | 123" + myFloat);
        System.out.printf("Float | %.20f\n", myFloat);
    }
}

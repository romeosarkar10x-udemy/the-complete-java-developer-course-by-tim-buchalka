public class AbbreviatedOperators {
    public static void main(String[] args) {
        int result = 0;
        result = result - 1;

        System.out.println("Result: " + result);
        
        result++;

        System.out.println("Result: " + result);

        result += 1;
        System.out.println("Result: " + result);

        result += 2.3;
        System.out.println("Result: " + result);

        result = (int) (2.3 + result);
        System.out.println("Result: " + result);
    }
}

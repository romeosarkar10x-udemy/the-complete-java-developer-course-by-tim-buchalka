public class PrimitiveTypes {
    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("myMinIntValue: " + myMinIntValue + ", myMaxIntValue: " + myMaxIntValue);

        System.out.println("maxValueOverflow: " + (myMaxIntValue + 1));
        System.out.println("minValueUnderflow: " + (myMinIntValue - 1));

        int i = 1_123_123_123;
        System.out.println("i: " + i);
    }
}

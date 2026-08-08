class Expressions {
    public static void main(String[] args) {
        int myFirstNum = 10 + 5 + (2 * 10);
        int mySecondNum = 12;
        int myThirdNum = 6;

        System.out.printf("%d, %d, %d\n", myFirstNum, mySecondNum, myThirdNum);

        myThirdNum = 2 * myFirstNum;
        
        System.out.printf("%d, %d, %d\n", myFirstNum, mySecondNum, myThirdNum);

        int myTotal = myFirstNum + mySecondNum + myThirdNum;
        System.out.printf("Total: %d\n", myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.printf("Last one: %d\n", myLastOne);
    }
}

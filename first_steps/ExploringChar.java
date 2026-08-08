public class ExploringChar {
    public static void main(String[] args) {
        char myCharacter = 'x';
        System.out.println("myChar: " + myCharacter);
        System.out.println("Size: " + Character.SIZE + " bits");

        // char[] myCharArray = { 'R', 'o', 'm', 'e', 'o' };
        // System.out.println("myCharArray: " + myCharArray);

        String emoji = "😀";
        String anotherEmoji = "❤";

        System.out.println("Length: " + emoji.length());
        System.out.println("Length: " + anotherEmoji.length());
    }
}

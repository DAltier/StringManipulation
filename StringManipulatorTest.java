public class StringManipulatorTest {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Trim and concat");
    StringManipulator manipulator1 = new StringManipulator();
    String str = manipulator1.trimAndConcat("    Hello     ","     World    ");
    System.out.println(str); // HelloWorld 
    System.out.println();

    System.out.println("Index of char");
    StringManipulator manipulator2 = new StringManipulator();
    char letter = 'o';
    Integer a2 = manipulator2.getIndexOrNull("Coding", letter);
    Integer b2 = manipulator2.getIndexOrNull("Hello World", letter);
    Integer c2 = manipulator2.getIndexOrNull("Hi", letter);
    System.out.println(a2); // 1
    System.out.println(b2); // 4
    System.out.println(c2); // null
    System.out.println();

    System.out.println("Index of substring");
    StringManipulator manipulator3 = new StringManipulator();
    String word3 = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer a3 = manipulator3.getIndexOrNull(word3, subString);
    Integer b3 = manipulator3.getIndexOrNull(word3, notSubString);
    System.out.println(a3); // 2
    System.out.println(b3); // null
    System.out.println();

    System.out.println("Substring concat with string");
    StringManipulator manipulator4 = new StringManipulator();
    String word4 = manipulator4.concatSubstring("Hello", 1, 2, "world");
    System.out.println(word4); // eworld

  }
}
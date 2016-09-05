
public class Except {
  public static void main(String[] args) {
    try {
      Integer a = 0;
      a /= a;
    } catch(NullPointerException ex) {
      System.out.println("nullPointer");
    } catch(Exception ex) {
      System.out.println("exception");
    } finally {
      System.out.println("finally");
    }
  }
}


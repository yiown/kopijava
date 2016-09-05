public class Palindrome {

  public static boolean recursivePalindrome(String str) {
    if(str.length() <= 1)
      return true;
    else
      return str.charAt(0) == str.charAt(str.length()-1) &&
             recursivePalindrome(str.substring(1, str.length()-1));
  }

  public static boolean isPalindrome(String str) {
    return new StringBuilder(str).reverse().toString().equals(str);
  }

  public static void main(String[] args) {
    String str = args[0];

    long startTime;
    long endTime;
    boolean res;

    startTime = System.nanoTime();
    res = isPalindrome(str);
    endTime = System.nanoTime();
    System.out.println("reverse : " + (endTime-startTime) + " : " + (res ? "yes" : "no"));
    
    startTime = System.nanoTime();
    res = recursivePalindrome(str);
    endTime = System.nanoTime();
    System.out.println("recursive : " + (endTime-startTime) + " : " + (res ? "yes" : "no"));
  }
}


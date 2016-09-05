import java.util.ArrayList;
import java.util.Scanner;

public class Sort {

  public static void sortComp(ArrayList<Integer> numLst) {
    numLst.sort((a, b) -> a - b);
  }

  public static void main(String[] args) {
    System.out.println("Reading input ...");
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numLst = new ArrayList<>(1000000);
    while(in.hasNextInt())
      numLst.add(in.nextInt());
    System.out.println("Reading finished with " + numLst.size() + " numbers.");

    long startTime;
    long stopTime;

    startTime = System.nanoTime();
    sortComp(numLst);
    stopTime = System.nanoTime();
    System.out.println("sortComp in " + (stopTime - startTime) + "ns");
    for(Integer i : numLst)
      System.out.print(i + ", ");
    System.out.println();
  }

}


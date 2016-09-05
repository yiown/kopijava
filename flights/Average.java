import java.util.Scanner;
import java.util.ArrayList;

public class Average {

  public static double directAvg(Integer[] nums) {
    double sum = 0d;
    for(Integer n : nums)
      sum += n;
    return sum / nums.length;
  }

  public static double onTheFlyAvg(ArrayList<Integer> nums) {
    double avg = 0;
    int i = 1;
    for(Integer n : nums) {
      avg = avg + (n - avg) / i;
      i++;
    }
    return avg;
  }

  public static double reduceAvg(ArrayList<Integer> nums) {
    return nums.parallelStream()
        .mapToDouble(Integer::doubleValue)
        .average().getAsDouble();
  }

  public static void main(String[] args) {
    System.out.println("Reading input ...");
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numLst = new ArrayList<>(100000000);
    while(in.hasNextInt())
      numLst.add(in.nextInt());
    System.out.println("Reading finished with " + numLst.size() + " numbers.");

    long startTime;
    double result;
    long stopTime;

    startTime = System.nanoTime();
    result = directAvg(numLst.toArray(new Integer[numLst.size()]));
    stopTime = System.nanoTime();
    System.out.println("directAvg " + result + " in " + (stopTime - startTime) + "ns");

    startTime = System.nanoTime();
    result = onTheFlyAvg(numLst);
    stopTime = System.nanoTime();
    System.out.println("onTheFlyAvg " + result + " in " + (stopTime - startTime) + "ns");

    startTime = System.nanoTime();
    result = reduceAvg(numLst);
    stopTime = System.nanoTime();
    System.out.println("reduceAvg " + result + " in " + (stopTime - startTime) + "ns");
  }

}


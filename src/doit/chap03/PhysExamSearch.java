package doit.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PhyscData[] x = {new PhyscData("태균", 185, 0.3), new PhyscData("오현", 162, 0.3)};
    int idx = Arrays
        .binarySearch(x, new PhyscData("", scanner.nextInt(), 0.0), PhyscData.HEIGHT_ORDER);

    System.out.print(idx);
  }

  static class PhyscData {

    public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
    public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparaoter();
    private String name;
    private int height;
    private double vision;

    public PhyscData(String name, int height, double vision) {
      this.name = name;
      this.height = height;
      this.vision = vision;
    }

    public String toString() {
      return name + " " + height + " " + vision;
    }

    private static class HeightOrderComparator implements Comparator<PhyscData> {

      @Override
      public int compare(PhyscData o1, PhyscData o2) {
        return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
      }
    }

    private static class VisionOrderComparaoter implements Comparator<PhyscData> {

      @Override
      public int compare(PhyscData o1, PhyscData o2) {
        return (o1.vision > o2.vision) ? 1 : (o1.vision < o2.vision) ? -1 : 0;
      }
    }
  }
}

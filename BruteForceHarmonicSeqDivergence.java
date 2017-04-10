package BruteForceHarmonicSeqDivergence;

  public class BruteForceHarmonicSeqDivergence {
    public static void main (String[] args) {
        double var = 1;
        double count = 1;
  for (int i=1; i<2147483647; i++) {
        var+=(1/count);
        count++;

      }
          System.out.println(var);
    }
  }
public class SystemArraycopyTest {
  public static void main(String[] args) {
    StringBuffer[] A = new StringBuffer[2];
    A[0] = new StringBuffer("hogehoge");
    A[1] = new StringBuffer("foobar");

    StringBuffer[] B = new StringBuffer[2];

    B[0] = new StringBuffer("purupuru1");
    B[1] = new StringBuffer("purupuru2");


    System.arraycopy(A,1,B,1,1);// B[1]だけA[1]からコピー

    System.out.println
      ("B[0]の値は" + B[0]); // 結果 purupuru1
    System.out.println
      ("B[1]の値は" + B[1]); // 結果 foobar

    A[0] = A[0].replace(0, 3, "tii");
    A[1] = A[1].replace(0, 3, "toi");

    System.out.println
      ("A[0]の値は" + A[0]); // 結果 tiiehoge
    System.out.println
      ("A[1]の値は" + A[1]); // 結果 toibar
    System.out.println
      ("B[0]の値は" + B[0]); // 結果 purupuru1
    System.out.println
      ("B[1]の値は" + B[1]); // 結果 toibar
    
  }
}


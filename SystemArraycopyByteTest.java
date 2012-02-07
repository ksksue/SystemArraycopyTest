public class SystemArraycopyByteTest {
  public static void main(String[] args) {
    byte[] A = new byte[2];
    A[0] = 1;
    A[1] = 2;

    byte[] B = new byte[2];
    B[0] = 3;
    B[1] = 4;

    System.arraycopy(A,1,B,1,1);// B[1]だけA[1]からコピー

    System.out.println
      ("A[0]の値は" + A[0]); // 結果 1
    System.out.println
      ("A[1]の値は" + A[1]); // 結果 2
    System.out.println
      ("B[0]の値は" + B[0]); // 結果 3
    System.out.println
      ("B[1]の値は" + B[1]); // 結果 2

    A[0] = 5;
    A[1] = 6;

    System.out.println
      ("A[0]の値は" + A[0]); // 結果 5
    System.out.println
      ("A[1]の値は" + A[1]); // 結果 6
    System.out.println
      ("B[0]の値は" + B[0]); // 結果 3
    System.out.println
      ("B[1]の値は" + B[1]); // 結果 2
    
  }
}


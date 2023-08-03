import java.util.Scanner;

public class NestedLoopEg {
    public static void main(String args[]) {
        // loop outer
        for (int i = 1; i <= 4; i++) {
            // loop inner
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }

        // loop outer
        for (int i = 1; i <= 4; i++) {
            // loop inner
            for (int j = 1; j <= 4; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
// nestedloopeg given by mam
  
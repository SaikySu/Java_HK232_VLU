//BT 9
public class CongHaiMaTran {
    public static void main(String[] agrs) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 1, 3, 5 }, { 5, 2, 5 }, { 3, 2, 6 } };
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

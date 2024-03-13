// BT10:
public class NhanHaiMaTran {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 4 }, { 4, 5, 8 }, { 5, 7, 2 } };
        int b[][] = { { 1, 3, 7 }, { 3, 9, 1 }, { 3, 2, 6 } };
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

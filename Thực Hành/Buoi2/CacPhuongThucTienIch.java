
import java.util.Arrays;

public class CacPhuongThucTienIch {
    public static void main(String[] args) {
        int arr[] = { 15, 5, 10, 20, 25 };
        // int b;
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - 1; j++) {
        // if (arr[i] >= arr[i + 1]) {
        // b = arr[i];
        // arr[i] = arr[i + 1];
        // arr[i + 1] = b;
        // }
        // }
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Sau khi dung Sort: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sau khi dung Sort: ");
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 20);
        if (index < 0) {
            System.out.println("Khong tim thay gia tri");
        } else {
            System.out.println("Tim thay gia tri 20 tại index " + index);
        }
        Arrays.fill(arr, 49);
        System.out.println("Sau khi goi ham fill: ");
        System.out.println(Arrays.toString(arr));
    }
}

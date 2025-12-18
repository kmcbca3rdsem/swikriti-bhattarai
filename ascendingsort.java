import java.util.Arrays;
public class ascendingsort {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 3};

        Arrays.sort(arr);

        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
    
}

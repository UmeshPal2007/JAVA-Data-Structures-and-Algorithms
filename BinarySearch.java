public class BinarySearch {

    // Iterative Approach
    public static int binarySearch(int[] arr, int tar) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (tar > arr[mid]) {
                st = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Recursive Approach
    public static int recBinarySearch(int[] arr, int tar, int st, int end) {
        if (st <= end) {
            int mid = st + (end - st) / 2;

            if (tar > arr[mid]) {
                return recBinarySearch(arr, tar, mid + 1, end);
            } else if (tar < arr[mid]) {
                return recBinarySearch(arr, tar, st, mid - 1);
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Driver Function
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int tar = 10;
        
        // Iterative Approach
        System.out.println("Iterative Approach : " + binarySearch(arr, tar));
        
        // Recursive Approach
        System.out.println("Recursive Approach : " + binarySearch(arr, tar));
    }
}
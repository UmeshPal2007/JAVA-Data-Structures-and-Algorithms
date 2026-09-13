import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    // Merge Step-Function
    public static void merge(List<Integer> arr, int st, int mid, int end) {
        List<Integer> temp = new ArrayList<>();
        int i = st; //Left Side (start)
        int j = mid + 1; //Right Side (start)

        while (i <= mid) && j <= end) {
            if (arr.get(i) <= arr.get(j)) {
                temp.add(arr.get(i));
                i++;
            } else {
                temp.add(arr.get(j));
                j++;
            }
        }

        while (i <= mid) { //For Left half
            temp.add(arr.get(i));
            i++;
        }

        while (j <= end) { //For right Half
            temp.add(arr.get(j));
            j++;
        }

        for (int idx = 0; idx < temp.size(); idx++) {
            arr.Set(idx + st, temp.get(idx));
        }
    }
    
    //MergeSort (Recursive Function)
    public static void mergeSort (List<Integer arr, int st, int end) {
        if (st < end) {
            int mid = st + (end-st)/2;
            mergeSort(arr, st, mid); //Left Half
            mergeSort(arr, mid+1, end); //Right Half
            merge(arr, st, mid, end);
        } 
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(12 ,31 ,35 ,8 ,32, 17));
        mergeSort(arr, 0,arr.size()-1);

        for (int val : arr) {
            System.out.print(val + " ");       
        }
        System.out.println();
    }
}

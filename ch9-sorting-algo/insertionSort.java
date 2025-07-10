public class insertionSort {
    // demonstration of insertion sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {  // start from index 1
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];  // shift larger element to the right
                prev--;
            }
            arr[prev + 1] = curr;  // insert current element at its sorted position
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        print(arr);
    }
}

package BinarySearch;

//descending order binary search
public class dcsbinaysearch {
    public static void main(String[] args) {
        int arr[] = { 30, 28, 20, 16, 4 };
        int key = 28;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                end = mid - 1; // reverse logic (descending)
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Not found");
    }
}
package BinarySearch;
//Search insert position of K in a sorted array

public class insertposition {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 7 };
        int k = 3;
        int position = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                System.out.println("Found at index: " + mid);
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                position = mid;
                end = mid - 1;
            }
        }
        System.out.println("Insert at index: " + position);
    }
}

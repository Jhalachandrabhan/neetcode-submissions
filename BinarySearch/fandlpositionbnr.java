package BinarySearch;

//find first and last position of an element in sorted array
public class fandlpositionbnr {

    // Method moved OUTSIDE main()
    public static int findfirst(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    // Method moved OUTSIDE main()
    public static int findlast(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 9, 10 };
        int target = 7;

        // Actually calling the methods and printing results
        int first = findfirst(arr, target);
        int last = findlast(arr, target);

        System.out.println("First position of " + target + " : " + first);
        System.out.println("Last position of " + target + " : " + last);
    }
}

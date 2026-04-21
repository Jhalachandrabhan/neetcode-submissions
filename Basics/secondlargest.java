public class secondlargest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int largest = arr[0];
        int seclarge = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                seclarge = largest;
                largest = arr[i];
            } else if (arr[i] > seclarge && arr[i] != largest) {
                seclarge = arr[i];
            }
        }
        System.out.println("the second largest is " + seclarge);
    }
}

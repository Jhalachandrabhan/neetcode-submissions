class largestinarray {
    public static int largestno(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 5, 9, 2, 1 };
        System.out.println(largestno(arr));
    }
}
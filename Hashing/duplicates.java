package Hashing;

import java.util.HashSet;

public class duplicates {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6 };

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (set.contains(arr[i])) {
                System.out.println("Duplicate found: " + arr[i]);
            } else {
                set.add(arr[i]);
            }
        }

    }

}

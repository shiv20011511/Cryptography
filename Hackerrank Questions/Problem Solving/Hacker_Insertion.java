//Hackerrank Question Insertion Sort 2

import java.util.ArrayList;
import java.util.List;

public class Hacker_Insertion{
public static void main(String args[]){
List<Integer> arr=new ArrayList<>();

arr.add(3);
arr.add(4);
arr.add(7);
arr.add(5);
arr.add(6);
arr.add(2);
arr.add(1);

System.out.println("Array Without Insertion -->>  "+arr);
int n=arr.size();


insertionSort2(n,arr);
}
public static void insertionSort2(int n, List<Integer> arr) {
    // Write your code here
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
            // Print the list after each insertion
            printList(arr);
        }
    }


    // Helper method to print the list
    public static void printList(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    



}
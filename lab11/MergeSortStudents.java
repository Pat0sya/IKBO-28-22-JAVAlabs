package mirea.javalabs.lab11;

import java.util.Arrays;

public class MergeSortStudents {
    public static void main(String[] args){
        String[] Students1 = {"Alice","Bob","Charlie"};
        String[] Students2 = {"David","Eve","Frank"};
        String[] studentsMerged = mergeSort(merge(Students1, Students2));
        System.out.println(Arrays.toString(studentsMerged));


    }
    public static String[] mergeSort(String[] arr){
        if (arr.length <= 1){
            return arr;
        }
        int mid = arr.length/2;
        String[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        String[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);
        leftHalf = mergeSort(leftHalf);
        rightHalf = mergeSort(rightHalf);
        return merge(leftHalf, rightHalf);
    }
    public static String[] merge(String[] left, String[] right){
        String[] result = new String[left.length+ right.length];
        int leftIdx =0, rightIdx = 0, resultIdx = 0;
        while(leftIdx<left.length&&rightIdx<right.length){
            if (left[leftIdx].compareTo(right[rightIdx])< 0){
                result[resultIdx]=left[leftIdx];
                leftIdx++;
            }else{
                result[resultIdx] = right[rightIdx];
                rightIdx++;
            }
            resultIdx++;

        }
        while (leftIdx<left.length){
            result[resultIdx] = left[leftIdx];
            leftIdx++;
            resultIdx++;
        }
        while (rightIdx<right.length){
            result[resultIdx] = right[rightIdx];
            rightIdx++;
            resultIdx++;
        }
        return result;
    }
}

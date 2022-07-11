package Sort;

import static Sort.SortUtils.showArr;

public class MergeSort {
    static int[] B=new int[100];
    public static void main(String[] args) {
        int[] arr={19,21,23,3,7,8,14,26,35};
        int[] B=new int[arr.length];
        System.out.println("排序前");
        showArr(arr);
        mergesort(arr,0,arr.length-1,B);
        System.out.println("排序后");
        showArr(arr);
    }

    public static void merge(int[] A,int low,int mid,int high,int[] B){
        int k = 0;
        int i = low,j = mid+1;
        while(i <= mid && j <= high) {
            if (A[i] < A[j]) {
                B[k++] = A[i++];
            } else {
                B[k++] = A[j++];
            }
        }
        while(i <= mid){
            B[k++] = A[i++];
        }

        while(j <= high){
            B[k++] = A[j++];
        }

        for(int t=0;t<k;t++){
            A[low+t] = B[t];
        }
    }
    public static void mergesort(int[] A,int low,int high,int[] B){
        if(low<high){
            int mid = (low+high)/2;
            mergesort(A,low,mid,B); //对左边序列进行归并排序
            mergesort(A,mid+1,high,B);  //对右边序列进行归并排序
            merge(A,low,mid,high,B);    //合并两个有序序列
        }
    }
}


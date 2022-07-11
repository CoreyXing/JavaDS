package Sort;
//简单选择排序的实现
import static Sort.SortUtils.showArr;
import static Sort.SortUtils.Swap;


public class SimpleSelectSort {

    public static void main(String[] args) {
        int[] arr={19,21,23,3,7,8,14,26,35};
        System.out.println("排序前");
        showArr(arr);
        simpleselectsort(arr);
        System.out.println("排序后");
        showArr(arr);
    }
    public static void simpleselectsort(int[] A){
        for(int i=0;i<A.length-1;i++){//从前往后遍历，每次固定一个元素位置
            int min =i;
            for(int j=i+1;j<A.length-1;j++)
                if(A[j]<A[min])
                    min=j;
            if(min!=i)
                Swap(A,min,i);

        }
    }
}


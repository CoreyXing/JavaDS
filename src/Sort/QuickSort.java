package Sort;
//快速排序算法实现
import static Sort.SortUtils.showArr;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr={19,21,23,3,7,8,14,26,35};
        System.out.println("排序前");
        showArr(arr);
        quicksort(arr,0,arr.length-1);
        System.out.println("排序后");
        showArr(arr);
    }
    private static void quicksort(int[] A,int low,int high){
        if(low<high){//递归算法
            int pivotpos=partition(A,low,high);
            quicksort(A,low,pivotpos-1);
            quicksort(A,pivotpos+1,high);

        }
    }
    private static int partition(int[] A, int low,int high){//执行确定一个位置
        int pivot=A[low];    //中轴元素
        while(low<high){     //退出循环条件,退出是low==high
            while(low<high&&A[high]>=pivot) //从后往前找
                high--;
            A[low]=A[high];//找到合适位置
            while(low<high&&A[low]<=pivot)//从前往后找
                low++;
            A[high]=A[low];
        }
        A[low]=pivot;
        return low;
    }
}

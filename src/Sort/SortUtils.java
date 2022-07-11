package Sort;

public class SortUtils {
    public static void showArr(int []arr) {
        //增强for循环打印
        for(int a:arr) {
            System.out.print(a+"\t");

        }
        System.out.println();

    }
    public static void Swap(int[] A,int index1,int index2){//实现数组中两个值的交换
        int t;
        t=A[index1];
        A[index1]=A[index2];
        A[index2]=t;
    }

}

package Sort;
//冒泡排序的实现
import static Sort.SortUtils.showArr;

public class MaopaoSort {
    public static void main(String[] args) {
        int []arr= {3,2,8,4,7};//创建数组
        System.out.println("排序前");
        showArr(arr);//打印显示排序前
        //循环实现冒泡排序
        for(int i=0;i<arr.length-1;i++)//每执行一次外循环就会导致最大的数字“归位”
            for (int j = 0; j < arr.length - i - 1; j++) {//之后内循环不需要考虑已经固定的位
                if (arr[j] > arr[j + 1]) {//大的数字换到后面去
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        showArr(arr);
        }

//    //打印方法
//    private static void showArr(int []arr) {
//        //增强for循环打印
//        for(int a:arr) {
//            System.out.print(a+"\t");
//
//        }
//        System.out.println();
//
//    }
}

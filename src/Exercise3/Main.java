package Exercise3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Random random = new Random();

        double[] array = new double[10];
        int len = array.length;
        for(int i = 0; i<=9; i++){
            double num = -99 + (99 - -99) * random.nextDouble();
            array[i] = num;
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Desea ordenar por 1. Bubble Sort o 2. Quick Sort");
        int resp = scan.nextInt();

        if(resp == 1){
            System.out.println("Ordenando por Bubble Sort");
            OrderNums.BubbleSort(array, len);
            for(int i = 0; i<len; ++i){
                System.out.print(array[i] + " ");
            }
        }else if(resp == 2){
            System.out.println("Ordenando por Quick Sort");
            double[] newArr = OrderNums.QuickSort(array, len);
            for(int i = 0; i<len; ++i){
                System.out.print(newArr[i] + " ");
            }
        }
    }
}

package Exercise3;

import java.util.Arrays;

public class OrderNums {

    public static void BubbleSort(double[] listNums, int len){
        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(listNums[j+1]<listNums[j]){
                    double swap = listNums[j];
                    listNums[j] = listNums[j+1];
                    listNums[j+1] = swap;
                }
            }
        }
    }

    public static double[] QuickSort(double[] arr, int elements) {
        if(elements < 2){
            return arr;
        }

        int current_position=0;
        double temp;

        for(int i=1; i<elements; i++)
        {
            if(arr[i] <= arr[0])
            {
                current_position++;
                temp = arr[i];
                arr[i] = arr[current_position];
                arr[current_position] = temp;

            }
        }

        temp = arr[0];
        arr[0] = arr[current_position];
        arr[current_position] = temp; //Brings pivot to it's appropriate position

        double[] left = QuickSort(arr,current_position); //sorts the elements to the left of pivot

        double[] arr2 = Arrays.copyOfRange(arr, current_position+1, elements);//separates elements right of pivot

        double[] right = QuickSort(arr2, elements-current_position-1); //sorts the elements to the right of pivot

        double[] final_array = new double[elements]; //final array, to merge everything together

        for(int i=0; i<current_position; i++)
        {
            final_array[i] = left[i];
        }
        final_array[current_position] = arr[current_position];
        for(int i=current_position+1; i<elements; i++)
        {
            final_array[i] = right[i-current_position-1];
        }

        return final_array;

    }

}

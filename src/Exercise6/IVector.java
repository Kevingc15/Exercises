package Exercise6;

import java.util.Scanner;
import java.util.Vector;

public class IVector {

    public static void main (String[] args){

        Vector<Integer> vector = new Vector<>(10);
        Scanner scan = new Scanner(System.in);
        boolean cond = false;
        int num;

        while(!cond){
            System.out.println("Give me a number:");
            num = scan.nextInt();
            scan.skip("\n");
            vector.add(num);

            if(vector.size() > 1){
                int size = vector.size();
                if(vector.get(size - 2) == vector.get(size - 1)){
                    for(int i = 0; i < size; i++){
                        System.out.println(vector.get(i));
                    }
                    cond = true;
                }
            }
        }

    }

}

package Week99;

import java.sql.Array;

public class ArrayVullen {

    public int[] maakArray(){
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 12;
        array[2] = 33;
        array[3] = -9;
        array[4] = 14;
        return array;
    }

    public int[] veranderArray(int[] array){
        array[1] = 6;
        array[4] = array[4] + 2;
        return array;
    }
}

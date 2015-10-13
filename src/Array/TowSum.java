package Array;

import java.util.HashMap;
import java.util.*;

/**
 * Created by fyang on 7/14/2015.
 */
public class TowSum {
    public static int[] twoSum(int [] numbers, int target)
    {
        HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
        int n=numbers.length;
        int[] result=new int[2];
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i]))
            {
                result[0] = map.get(target - numbers[i]) + 1;
                result[1]=i+1;
                break;
            }
            else
            {
                map.put(numbers[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // write your code here
        int[] arr={2, 7, 11, 15};
        int[] result=twoSum(arr,17);

    }
}

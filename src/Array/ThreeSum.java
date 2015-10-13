package Array;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by fyang on 8/10/2015.
 */
public class ThreeSum {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num){
        ArrayList<ArrayList<Integer>> rst=new ArrayList<ArrayList<Integer>>();
        if(num==null || num.length<3){//Extreme cases
            return rst;
        }

        Arrays.sort(num);

        for(int i=0;i<num.length-2;i++){
            if(i!=0 && num[1]==num[i-1]) {
                continue;//skip duplicates
            }

            int left=i+1;
            int right=num.length-1;
             while(left<right){

             }
        }

        return rst;
    }
}

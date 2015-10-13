package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/**
 * Created by fyang on 10/13/2015.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits)
    {
        int carry=1;
        ArrayList<Integer> newDigits=new ArrayList<Integer>();


        for(int i=digits.length-1;i>=0;i--)
        {
            carry+=digits[i];
            newDigits.add(0,carry%10);
            carry/=10;
        }

        if(carry==1) newDigits.add(0,1);

        int[] result=new int[newDigits.size()];
        for(int i=0;i<newDigits.size();i++)
        {
            result[i]=newDigits.get(i);
        }

        return result;
    }
}

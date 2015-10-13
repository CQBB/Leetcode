package Array;

/**
 * Created by fyang on 6/29/2015.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates2(int A[], int n){
        if(n<=2) return n;
        int index=2;
        for(int i=2; i<n;i++)
        {
            if(A[i]!=A[index-2])
                A[index++]=A[i];
        }

        return index;
    }
}

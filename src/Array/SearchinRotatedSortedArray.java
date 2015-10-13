package Array;

/**
 * Created by fyang on 7/9/2015.
 */
public class SearchinRotatedSortedArray {
    public static int search(int A[], int n, int target)
    {
        int first=0;
        int last=n;
        int mid=0;
        while(first!=last)
        {
            mid=(first+last)/2;
            if(A[mid]==target)
                return mid;
            if(A[first]<=A[mid])
            {
                if(A[first]<=target && target<A[mid])
                    last=mid;
                else
                    first=mid+1;
            }
            else
                if(A[mid]<target && target<=A[last-1])
                    first=mid+1;
                else
                    last=mid;
        }

        return -1;
    }


}

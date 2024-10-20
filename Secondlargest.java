import java.util.Arrays;
public class Secondlargest {
    static int getSecondlargest(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=arr[n-1])
            {
                return arr[i];
            }
        }
        return -1;

    }
    public static void main (String[] args)
    {
        int arr[]={5,10,7,35,12};
        System.out.println(getSecondlargest(arr));
    }
}

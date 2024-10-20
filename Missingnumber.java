public class Missingnumber {
    public static void missingnumber(int arr[] , int n)
    {
        for(int i=1;i<=n;i++)
        {
            boolean found=false;
            for(int val:arr)
            {
                if (val==i) 
                {
                    found=true;
                    break;
                }
            }
            if (!found) 
            {
                System.out.println(i + "");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,8,9};
        int n = 9;
        System.out.println("Missing Numbers are");
        missingnumber(arr, n);
    }
}

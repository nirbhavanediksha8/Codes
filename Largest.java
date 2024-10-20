public class Largest {
    public static void main(String[] args) {
        int arr[] = {5,10,7,35,12};
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max = arr[i];
        }
        System.out.println("Largest array is " +max);
    }
    
}

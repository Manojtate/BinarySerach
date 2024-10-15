import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter element in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element in the array that you want to search");
        int key=sc.nextInt();

        int check=binarySearch(arr,key);
        System.out.println(check==-1 ? "Element is not Present in array":"Element is present at index :- "+check);

    }
    public static int binarySearch(int arr[],int key)
    {
          int left=0;int right=arr.length-1;

          while(left <=right)
          {
             int mid=(left + right) /2;
             if(key== arr[mid])
             return mid;
             if(key > arr[mid])
             left=mid+1;
             else
             right=mid-1;

          }
          return -1;
    }
}

import java.util.*;
public class Binary{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the array size");
    int n=sc.nextInt();
    
    int arr[]=new int[n];
     System.out.print("array elements ARE:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
     }
    
     System.out.println("enter the element you want:");
     int target=sc.nextInt();
     int l=0;
    int r=n-1;
    while(l<=r){
        int mid=(l+r)/2;
        if(target==arr[mid])
        {
            System.out.println(mid);
            return ;
        }
        else if( target>arr[mid]){
            l=mid+1;
        }
        else {
            r=mid-1;
        }
    }
    
}
}
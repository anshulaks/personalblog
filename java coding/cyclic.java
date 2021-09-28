import java.util.Arrays; 
import java.util.Scanner;
class codespeedy
{ 
    
static int a[] = new int[]{1, 2, 3}; 
  
public static void main(String[] args) { 
System.out.println("Input Array is"); 
System.out.println(Arrays.toString(a)); 
    
int x = a[a.length-1], i; 
for (i = a.length-1; i > 0; i--) 
  a[i] = a[i-1]; 
a[0] = x;
    
System.out.println("Rotated Array is"); 
System.out.println(Arrays.toString(a)); 
} 
} 
// import java.util.Arrays;
 
// public class cyclic
// {
//     static int arr[] = new int[]{1, 2, 3, 4, 5};
     
//     // Method for rotation
//     static void rotate()
//     {
//        int x = arr[arr.length-1], i;
//        for (i = arr.length-1; i > 0; i--)
//           arr[i] = arr[i-1];
//        arr[0] = x;
//     }
     
//     /* Driver program */
//     public static void main(String[] args)
//     {
//         System.out.println("Given Array is");
//         System.out.println(Arrays.toString(arr));
         
//         rotate();
         
//         System.out.println("Rotated Array is");
//         System.out.println(Arrays.toString(arr));
//     }
// }
    


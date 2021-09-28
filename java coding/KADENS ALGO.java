import java.io.*;
    // Java program to print largest contiguous array sum
    import java.util.*;
    import java.util.Scanner;
    
    class Kadane
    {
        public static void main (String[] args)
        {int n;  
            Scanner sc=new Scanner(System.in);  
            System.out.print("Enter the number of elements you want to store: ");  
            //reading the number of elements from the that we want to enter  
            n=sc.nextInt();  
            //creates an array in the memory of length 10  
            int[] a = new int[10];  
            System.out.println("Enter the elements of the array: ");  
            for(int i=0; i<n; i++)  
            {  
            //reading array elements from the user   
            a[i]=sc.nextInt();  
            }  
            // int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
            System.out.println("Maximum contiguous sum is " +
                                        maxSubArraySum(a));
        }
    
        static int maxSubArraySum(int a[])
        {
            int size = a.length;
            int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
    
            for (int i = 0; i < size; i++)
            {
                max_ending_here = max_ending_here + a[i];
                if (max_so_far < max_ending_here)
                    max_so_far = max_ending_here;
                if (max_ending_here < 0)
                    max_ending_here = 0;
            }
            return max_so_far;
        }
    }
    
    


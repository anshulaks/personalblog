import java.util.*;
public class unionandintersection{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 9, 13, 15, 16, 17};

        un(arr1, arr2);
    }

 static int uni(int arr1[],int arr2[])
 {
     int i,j=0;
     while(i<arr1.length && j<arr2.length)
     {
         if(arr1[i]<arr2[j]){
         System.out.println(arr1[i]+"");
        i++;}
     
     else if(arr2[j]<arr1[i]){
        System.out.println(arr2[i]+"");
     j++;}
     else {
         
         System.out.println(arr1[i]+"");
         i++;
         j++;
     }}
 
     while (i < arr1.length) {
        System.out.print(arr1[i] + " ");
        i++;
    }

    while (j < arr2.length) {
        System.out.print(arr2[j] + " ");
        j++;
    }

 
 
 
    }



}

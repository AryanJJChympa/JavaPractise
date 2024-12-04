import java.util.Scanner;
class reversearray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
        System.out.println("The Reversed array is : ");
        for(int elements: arr){
            System.out.print(elements+" ");
        }
    }    
}

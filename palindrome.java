// import java.util.Scanner;

// class palindrome{
//     public static void main(String args[]){
//         int num=123;
//         int temp=num;
//         int rev=0;
//         while(num!=0){
//             int reverse=num%10;
//             rev=rev* 10+reverse;
//             num/=10;
//         }
//         if(temp==rev){
//             System.out.println("Yes");
//         }else{
//             System.out.println("No");
//         }
//     }
// }

import java.util.Scanner;

class palindrome{
    public static void main(String args[]){
    int n=8;
    int  arr[1000];
    arr[0]=0;
    arr[1]=1;
    for(int i=2;i<=n-1;i++){
        arr[i]=arr[i-1]+arr[i-2];
    }
    cout<<arr[n-1]<<" ";
} 
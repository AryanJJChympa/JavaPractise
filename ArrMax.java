class ArrMax {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,9,12};
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);                      
    }    
}

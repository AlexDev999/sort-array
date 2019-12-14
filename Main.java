class Main{
    public static void main(String[] args) {
        int[] arr = {
            12,
            13,
            43,
            1,
            143
        };
        boolean bool = false;
        int temp;
       while(!bool){
            bool = true;
            for(int i = 0; i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] =temp;
                    bool = false;
                }
            }   
        }
      for(int i:arr){
            System.out.println(i);
        }
    }
}
public class better0_1_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,0,1,2,0,1,0,1,2,0,1,2,0};
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;


        for(int i = 0; i < n; i++){
            if(arr[i] == 0 ){
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i =0; i <count0; i++){
            arr[i] =0;
        }
        for(int i = count0; i< count0 + count1; i++){
            arr[i] = 1;
        }
        for(int i = count0 + count1; i<n; i++){
            arr[i] =2;

        }
        int l =0;
        for(int val : arr){
            System.out.println("array "+ l + "  like that : " + val);
            l++;
        }
        System.out.println(arr.length);
    }
}

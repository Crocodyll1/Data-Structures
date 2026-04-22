public class SortArrayWithBruteforce_method {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0,2,1,0,2,1,2,1,0};
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i =0; i <n; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }

        }
        for(int i =0; i<count0; i++){
            arr[i] = 0;
              }
        for(int i =count0; i<count0+count1; i++){
            arr[i] = 1;
        }
        for(int i =count0+count1; i<n; i++){
            arr[i  ] = 2;
        }
        for(int val : arr){
            System.out.println(val + " ");
        }



//        int cout0 = 0;
//        int cout1 =0;
//        int cout2 = 0 ;
//
//        for(int i =0; i<n; i++){
//            if(arr[i] == 0){
//                cout0++;
//            }
//            else if(arr[i] == 1){
//                cout1++;
//            }
//            else{
//                cout2++;
//            }
//        }
//        for(int i =0; i<cout0; i++){
//            arr[i] = 0;
//        }
//        for(int i = cout0; i <cout0+cout1; i++){
//            arr[i] = 1;
//        }
//        for(int i =cout0+cout1; i<n; i++){
//            arr[i] = 2;
//        }
//
//        for(int val : arr){
//            System.out.println(val+ " ");
//        }

    }
}


/*
  Sort an Array of 0,1,2
  brutefore:

  store values of 0,1,2 in variables and put the variable values in arr;
  now print

  TC = O(N)
 */
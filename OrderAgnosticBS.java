class OrderAgnosticBS{
    public static void main(String[] args){
        int[] array  = {99,75,66,54,23,12,1};
        int index = orderagnostic(array,23);
        System.out.println(index);
    }

    static int orderagnostic(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];


        while(start <= end){
            int mid = start + (end-start)/2 ;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                //array is in ascending order
                if(arr[mid] > target){
                     end = mid - 1 ;   
                }else{
                     start = mid + 1 ;   
                }                
            }else{
                //array is in descending order
                if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }

        return -1;
    }

    // static boolean findOrder(int[] arr){
    //     int start = 0;
    //     int end = arr.length - 1;

    //     if(start > end){
    //         return false;
    //     }else{
    //         return true;
    //     }
    // }
}
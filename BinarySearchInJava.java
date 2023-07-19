class BinarySearchInJava{

    public static void main(String[] args){
        int[] array = {1,2,4,5,6,9,14,17,19,25,30,35};
        int indexAtElement = binarySearch(array,25);
        System.out.println(indexAtElement);

    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = (start + end) / 2 ;

            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1;    
        }else{
                start = mid + 1;
        }
 
    }
      return -1;
    }

}
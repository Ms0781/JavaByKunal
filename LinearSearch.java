class LinearSearch{
    public static void main(String[] args){

        int[] array = {23,14,56,78,90,25,45};
        int index = linearSearchInRange(array,2,5,90);
        System.out.println(index);
    }
        //search in array 
        //if item found in array then return indice of element and if not found then return -1;

        static int linearsearch(int[] arr,int target){
            if(arr.length == 0){
                return -1;
            }

            //run for loop
            for(int index = 0;index<arr.length;index++){
                //check if element is equal to target
                int element = arr[index];
                if(element == target){
                    return index;
                }
            }

            //this line execute if no target element found in array
            return -1;
        }


        static int linearSearchInRange(int[] arr,int start,int end,int target){
                      if(arr.length == 0){
                return -1;
            }

            //run for loop
            for(int index = start;index<=end;index++){
                //check if element is equal to target
                int element = arr[index];
                if(element == target){
                    return index;
                }
            }

            //this line execute if no target element found in array
            return -1;
              
        }
    }

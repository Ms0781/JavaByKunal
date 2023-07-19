class Searchin2Darray{
    public static void main(String[] args){
            int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };

            int[] anwser = search(array,8);
            System.out.println("Item found at row :" + anwser[0] + " and at col : " + anwser[1]);
    }

    static int[] search(int[][] arr,int targetValue){
        for(int row = 0;row<arr.length;row++){
            for(int col = 0; col< arr[row].length;col++){
                if(arr[row][col] == targetValue){
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
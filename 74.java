class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m*n-1;
        while(low<=high){
            int mid = (low + high)/2;
            int rows = mid/n;
            int cols = mid%n;
            if(matrix[rows][cols]== target){
                return true;
            }
            else if(matrix[rows][cols]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
            return false;
    }
}

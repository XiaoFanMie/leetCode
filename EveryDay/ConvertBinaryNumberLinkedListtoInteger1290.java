package EveryDay;

public class ConvertBinaryNumberLinkedListtoInteger1290 {
    public static int diagonalSum(int[][] mat) {
        int i = 0;
        int res = 0;
        while( i < mat.length){
            res += mat[i][i];
            i++;
        }
        int j = mat.length-1;
        while( j >= 0){
            res += mat[mat.length-j-1][j];
            j--;
        }
        return mat.length%2==0?res:res-mat[(int)(mat.length/2)][(int)(mat.length/2)];
    }

    public static void main(String[] args) {
        int[][] nums = {{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};
        System.out.println(diagonalSum(nums));
    }
}

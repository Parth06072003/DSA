public class leetcode48 {
    public static void rotate(int[][] matrix) {
        int temp=0;
        for(int i =0;i<matrix.length;i++)
            for(int j=i+1;j<matrix.length;j++)
                {temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;}
        for (int i=0;i<matrix.length;i++)
            for(int j=matrix.length-1,k=0;j>=matrix.length/2;j--,k++)
            {
                temp= matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=temp;
            }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j]);
                
            }
            System.out.println(" ");
        }
    }
}

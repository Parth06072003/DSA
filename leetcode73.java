public class leetcode73 {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        // Step 1: Mark rows and columns that should be set to zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: Set marked rows to zero
        for (int i = 0; i < rows; i++) {
            if (row[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set marked columns to zero
        for (int j = 0; j < cols; j++) {
            if (col[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
}
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,0,6},{7,8,9}};
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j]);
                
            }
            System.out.println(" ");
        }
    }
}

public class OtherAlgorithm {

    public static void main(String[] args) {
        int size = 1024; // Size of the matrices
        double[][] matrixA = generateMatrix(size);
        double[][] matrixB = generateMatrix(size);
        double[][] result = multiplyMatrices(matrixA, matrixB, size);

        System.out.println("Matrix multiplication completed.");
    }

    private static double[][] generateMatrix(int size) {
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Math.random();
            }
        }
        return matrix;
    }

    private static double[][] multiplyMatrices(double[][] matrixA, double[][] matrixB, int size) {
        double[][] result = new double[size][size];
        int blockSize = 64;

        for (int i = 0; i < size; i += blockSize) {
            for (int j = 0; j < size; j += blockSize) {
                for (int k = 0; k < size; k += blockSize) {
                    for (int ii = i; ii < Math.min(i + blockSize, size); ii++) {
                        for (int jj = j; jj < Math.min(j + blockSize, size); jj++) {
                            for (int kk = k; kk < Math.min(k + blockSize, size); kk++) {
                                result[ii][jj] += matrixA[ii][kk] * matrixB[kk][jj];
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
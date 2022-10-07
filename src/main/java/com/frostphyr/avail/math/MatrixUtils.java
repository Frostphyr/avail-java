package com.frostphyr.avail.math;

/**
 * Utility class containing methods to assist with using matrices that are 
 * represented as arrays.
 * 
 * @since 1.0
 */
public class MatrixUtils {
	
	private static final String EXCEPTION_MESSAGE_INVALID_MATRIX = "Invalid matrix, must not be null and every row of the matrix must be the same size";
	private static final String EXCEPTION_MESSAGE_SIZE_MISMATCH = "matrix1 and matrix2 must be the same size";
	private static final String EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH = "Number of columns of matrix1 must be equal to the number of rows of matrix2";
	
	private MatrixUtils() {
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(byte[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(short[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(int[] matrix) {
		return matrix != null&& matrix.length != 0;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(long[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(float[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(double[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(char[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 * @since 1.5
	 */
	public static boolean validateMatrix(boolean[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(Object[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(byte[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		
		int rowLength = matrix[0].length;
		if (rowLength == 0) {
			return false;
		}
		
		for (byte[] r : matrix) {
			if (r == null || r.length != rowLength) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(short[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		
		int rowLength = matrix[0].length;
		if (rowLength == 0) {
			return false;
		}
		
		for (short[] r : matrix) {
			if (r == null || r.length != rowLength) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		} else if (matrix.length == 0) {
			return true;
		}
		
		int rowLength = matrix[0].length;
		if (rowLength == 0) {
			return false;
		}
		
		for (int[] r : matrix) {
			if (r == null || r.length != rowLength) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(long[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		
		int rowLength = matrix[0].length;
		if (rowLength == 0) {
			return false;
		}
		
		for (long[] r : matrix) {
			if (r == null || r.length != rowLength) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(float[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		
		int rowLength = matrix[0].length;
		if (rowLength == 0) {
			return false;
		}
		
		for (float[] r : matrix) {
			if (r == null || r.length != rowLength) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(double[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		
		int rowLength = matrix[0].length;
		if (rowLength == 0) {
			return false;
		}
		
		for (double[] r : matrix) {
			if (r == null || r.length != rowLength) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(char[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		
		int rowLength = matrix[0].length;
		if (rowLength == 0) {
			return false;
		}
		
		for (char[] r : matrix) {
			if (r == null || r.length != rowLength) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 * @since 1.5
	 */
	public static boolean validateMatrix(boolean[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		
		int rowLength = matrix[0].length;
		if (rowLength == 0) {
			return false;
		}
		
		for (boolean[] r : matrix) {
			if (r == null || r.length != rowLength) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns whether {@code matrix} is valid. A matrix is valid if it meets 
	 * the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if {@code matrix} is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(Object[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		
		int rowLength = matrix[0].length;
		if (rowLength == 0) {
			return false;
		}
		
		for (Object[] r : matrix) {
			if (r == null || r.length != rowLength) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(byte[])
	 */
	public static byte[][] transpose(byte[] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		byte[][] result = new byte[matrix.length][1];
		for (int i = 0; i < matrix.length; i++) {
			result[i][0] = matrix[i];
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(short[])
	 */
	public static short[][] transpose(short[] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		short[][] result = new short[matrix.length][1];
		for (int i = 0; i < matrix.length; i++) {
			result[i][0] = matrix[i];
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(int[])
	 */
	public static int[][] transpose(int[] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		int[][] result = new int[matrix.length][1];
		for (int i = 0; i < matrix.length; i++) {
			result[i][0] = matrix[i];
		}
		return result;
	}
	
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(long[])
	 */
	public static long[][] transpose(long[] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		long[][] result = new long[matrix.length][1];
		for (int i = 0; i < matrix.length; i++) {
			result[i][0] = matrix[i];
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(float[])
	 */
	public static float[][] transpose(float[] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		float[][] result = new float[matrix.length][1];
		for (int i = 0; i < matrix.length; i++) {
			result[i][0] = matrix[i];
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(double[])
	 */
	public static double[][] transpose(double[] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		double[][] result = new double[matrix.length][1];
		for (int i = 0; i < matrix.length; i++) {
			result[i][0] = matrix[i];
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(char[])
	 */
	public static char[][] transpose(char[] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		char[][] result = new char[matrix.length][1];
		for (int i = 0; i < matrix.length; i++) {
			result[i][0] = matrix[i];
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(boolean[])
	 * @since 1.5
	 */
	public static boolean[][] transpose(boolean[] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		boolean[][] result = new boolean[matrix.length][1];
		for (int i = 0; i < matrix.length; i++) {
			result[i][0] = matrix[i];
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(Object[])
	 */
	public static Object[][] transpose(Object[] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		Object[][] result = new Object[matrix.length][1];
		for (int i = 0; i < matrix.length; i++) {
			result[i][0] = matrix[i];
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(byte[][])
	 */
	public static byte[][] transpose(byte[][] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		byte[][] result = new byte[matrix[0].length][matrix.length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[c][r] = matrix[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(short[][])
	 */
	public static short[][] transpose(short[][] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		short[][] result = new short[matrix[0].length][matrix.length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[c][r] = matrix[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(int[][])
	 */
	public static int[][] transpose(int[][] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		int[][] result = new int[matrix[0].length][matrix.length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[c][r] = matrix[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(long[][])
	 */
	public static long[][] transpose(long[][] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		long[][] result = new long[matrix[0].length][matrix.length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[c][r] = matrix[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(float[][])
	 */
	public static float[][] transpose(float[][] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		float[][] result = new float[matrix[0].length][matrix.length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[c][r] = matrix[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(double[][])
	 */
	public static double[][] transpose(double[][] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		double[][] result = new double[matrix[0].length][matrix.length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[c][r] = matrix[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(char[][])
	 */
	public static char[][] transpose(char[][] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		char[][] result = new char[matrix[0].length][matrix.length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[c][r] = matrix[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(char[][])
	 */
	public static boolean[][] transpose(boolean[][] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		boolean[][] result = new boolean[matrix[0].length][matrix.length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[c][r] = matrix[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the transpose of {@code matrix}. The transpose is created by 
	 * flipping {@code matrix}, where each row will become a column and each 
	 * column will become a row.
	 * 
	 * @param matrix the matrix to transpose
	 * @return the transpose of {@code matrix}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(Object[][])
	 */
	public static Object[][] transpose(Object[][] matrix) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		Object[][] result = new Object[matrix[0].length][matrix.length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[c][r] = matrix[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(byte[])
	 */
	public static byte[] add(byte[] matrix1, byte[] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		byte[] result = new byte[matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			result[i] = (byte) (matrix1[i] + matrix2[i]);
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(short[])
	 */
	public static short[] add(short[] matrix1, short[] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		short[] result = new short[matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			result[i] = (short) (matrix1[i] + matrix2[i]);
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(int[])
	 */
	public static int[] add(int[] matrix1, int[] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		int[] result = new int[matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			result[i] = matrix1[i] + matrix2[i];
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(long[])
	 */
	public static long[] add(long[] matrix1, long[] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		long[] result = new long[matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			result[i] = matrix1[i] + matrix2[i];
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(float[])
	 */
	public static float[] add(float[] matrix1, float[] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		float[] result = new float[matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			result[i] = matrix1[i] + matrix2[i];
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(double[])
	 */
	public static double[] add(double[] matrix1, double[] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		double[] result = new double[matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			result[i] = matrix1[i] + matrix2[i];
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(char[])
	 */
	public static char[] add(char[] matrix1, char[] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		char[] result = new char[matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			result[i] = (char) (matrix1[i] + matrix2[i]);
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(byte[][])
	 */
	public static byte[][] add(byte[][] matrix1, byte[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		byte[][] result = new byte[matrix1.length][matrix1[0].length];
		for (int r = 0; r < matrix1.length; r++) {
			for (int c = 0; c < matrix1[0].length; c++) {
				result[r][c] = (byte) (matrix1[r][c] + matrix2[r][c]);
			}
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(short[][])
	 */
	public static short[][] add(short[][] matrix1, short[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		short[][] result = new short[matrix1.length][matrix1[0].length];
		for (int r = 0; r < matrix1.length; r++) {
			for (int c = 0; c < matrix1[0].length; c++) {
				result[r][c] = (short) (matrix1[r][c] + matrix2[r][c]);
			}
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(int[][])
	 */
	public static int[][] add(int[][] matrix1, int[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		int[][] result = new int[matrix1.length][matrix1[0].length];
		for (int r = 0; r < matrix1.length; r++) {
			for (int c = 0; c < matrix1[0].length; c++) {
				result[r][c] = matrix1[r][c] + matrix2[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(long[][])
	 */
	public static long[][] add(long[][] matrix1, long[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		long[][] result = new long[matrix1.length][matrix1[0].length];
		for (int r = 0; r < matrix1.length; r++) {
			for (int c = 0; c < matrix1[0].length; c++) {
				result[r][c] = matrix1[r][c] + matrix2[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(float[][])
	 */
	public static float[][] add(float[][] matrix1, float[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		float[][] result = new float[matrix1.length][matrix1[0].length];
		for (int r = 0; r < matrix1.length; r++) {
			for (int c = 0; c < matrix1[0].length; c++) {
				result[r][c] = matrix1[r][c] + matrix2[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(double[][])
	 */
	public static double[][] add(double[][] matrix1, double[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		double[][] result = new double[matrix1.length][matrix1[0].length];
		for (int r = 0; r < matrix1.length; r++) {
			for (int c = 0; c < matrix1[0].length; c++) {
				result[r][c] = matrix1[r][c] + matrix2[r][c];
			}
		}
		return result;
	}
	
	/**
	 * Returns the sum of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to add
	 * @param matrix2 the second matrix to add
	 * @return the sum of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if they are different sizes
	 * @see #validateMatrix(char[][])
	 */
	public static char[][] add(char[][] matrix1, char[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
		}
		
		char[][] result = new char[matrix1.length][matrix1[0].length];
		for (int r = 0; r < matrix1.length; r++) {
			for (int c = 0; c < matrix1[0].length; c++) {
				result[r][c] = (char) (matrix1[r][c] + matrix2[r][c]);
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(byte[])
	 * @see #validateMatrix(byte[][])
	 */
	public static byte[] multiply(byte[] matrix1, byte[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		byte[] result = new byte[matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2[0].length; c2++) {
				result[c2] += matrix1[r1] * matrix2[r1][c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(short[])
	 * @see #validateMatrix(short[][])
	 */
	public static short[] multiply(short[] matrix1, short[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		short[] result = new short[matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2[0].length; c2++) {
				result[c2] += matrix1[r1] * matrix2[r1][c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(int[])
	 * @see #validateMatrix(int[][])
	 */
	public static int[] multiply(int[] matrix1, int[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		int[] result = new int[matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2[0].length; c2++) {
				result[c2] += matrix1[r1] * matrix2[r1][c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(long[])
	 * @see #validateMatrix(long[][])
	 */
	public static long[] multiply(long[] matrix1, long[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		long[] result = new long[matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2[0].length; c2++) {
				result[c2] += matrix1[r1] * matrix2[r1][c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(float[])
	 * @see #validateMatrix(float[][])
	 */
	public static float[] multiply(float[] matrix1, float[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		float[] result = new float[matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2[0].length; c2++) {
				result[c2] += matrix1[r1] * matrix2[r1][c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(double[])
	 * @see #validateMatrix(double[][])
	 */
	public static double[] multiply(double[] matrix1, double[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		double[] result = new double[matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2[0].length; c2++) {
				result[c2] += matrix1[r1] * matrix2[r1][c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(char[])
	 * @see #validateMatrix(char[][])
	 */
	public static char[] multiply(char[] matrix1, char[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		char[] result = new char[matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2[0].length; c2++) {
				result[c2] += matrix1[r1] * matrix2[r1][c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(byte[])
	 * @see #validateMatrix(byte[][])
	 */
	public static byte[][] multiply(byte[][] matrix1, byte[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		byte[][] result = new byte[matrix1.length][matrix2.length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2.length; c2++) {
				result[r1][c2] += matrix1[r1][0] * matrix2[c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(short[])
	 * @see #validateMatrix(short[][])
	 */
	public static short[][] multiply(short[][] matrix1, short[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		short[][] result = new short[matrix1.length][matrix2.length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2.length; c2++) {
				result[r1][c2] += matrix1[r1][0] * matrix2[c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(int[])
	 * @see #validateMatrix(int[][])
	 */
	public static int[][] multiply(int[][] matrix1, int[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		int[][] result = new int[matrix1.length][matrix2.length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2.length; c2++) {
				result[r1][c2] += matrix1[r1][0] * matrix2[c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(long[])
	 * @see #validateMatrix(long[][])
	 */
	public static long[][] multiply(long[][] matrix1, long[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		long[][] result = new long[matrix1.length][matrix2.length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2.length; c2++) {
				result[r1][c2] += matrix1[r1][0] * matrix2[c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(float[])
	 * @see #validateMatrix(float[][])
	 */
	public static float[][] multiply(float[][] matrix1, float[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		float[][] result = new float[matrix1.length][matrix2.length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2.length; c2++) {
				result[r1][c2] += matrix1[r1][0] * matrix2[c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(double[])
	 * @see #validateMatrix(double[][])
	 */
	public static double[][] multiply(double[][] matrix1, double[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		double[][] result = new double[matrix1.length][matrix2.length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2.length; c2++) {
				result[r1][c2] += matrix1[r1][0] * matrix2[c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(char[])
	 * @see #validateMatrix(char[][])
	 */
	public static char[][] multiply(char[][] matrix1, char[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		char[][] result = new char[matrix1.length][matrix2.length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c2 = 0; c2 < matrix2.length; c2++) {
				result[r1][c2] += matrix1[r1][0] * matrix2[c2];
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(byte[][])
	 */
	public static byte[][] multiply(byte[][] matrix1, byte[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		byte[][] result = new byte[matrix1.length][matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c1 = 0; c1 < matrix1[0].length; c1++) {
				for (int c2 = 0; c2 < matrix2[0].length; c2++) {
					result[r1][c2] += matrix1[r1][c1] * matrix2[c1][c2];
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(short[][])
	 */
	public static short[][] multiply(short[][] matrix1, short[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		short[][] result = new short[matrix1.length][matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c1 = 0; c1 < matrix1[0].length; c1++) {
				for (int c2 = 0; c2 < matrix2[0].length; c2++) {
					result[r1][c2] += matrix1[r1][c1] * matrix2[c1][c2];
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(int[][])
	 */
	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		int[][] result = new int[matrix1.length][matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c1 = 0; c1 < matrix1[0].length; c1++) {
				for (int c2 = 0; c2 < matrix2[0].length; c2++) {
					result[r1][c2] += matrix1[r1][c1] * matrix2[c1][c2];
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(long[][])
	 */
	public static long[][] multiply(long[][] matrix1, long[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		long[][] result = new long[matrix1.length][matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c1 = 0; c1 < matrix1[0].length; c1++) {
				for (int c2 = 0; c2 < matrix2[0].length; c2++) {
					result[r1][c2] += matrix1[r1][c1] * matrix2[c1][c2];
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(float[][])
	 */
	public static float[][] multiply(float[][] matrix1, float[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		float[][] result = new float[matrix1.length][matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c1 = 0; c1 < matrix1[0].length; c1++) {
				for (int c2 = 0; c2 < matrix2[0].length; c2++) {
					result[r1][c2] += matrix1[r1][c1] * matrix2[c1][c2];
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(double[][])
	 */
	public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		double[][] result = new double[matrix1.length][matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c1 = 0; c1 < matrix1[0].length; c1++) {
				for (int c2 = 0; c2 < matrix2[0].length; c2++) {
					result[r1][c2] += matrix1[r1][c1] * matrix2[c1][c2];
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix1} and {@code matrix2}.
	 * 
	 * @param matrix1 the first matrix to multiply
	 * @param matrix2 the second matrix to multiply
	 * @return the product of {@code matrix1} and {@code matrix2}
	 * @throws IllegalArgumentException if {@code matrix1} or {@code matrix2} 
	 * is not a valid matrix or if the number of columns of {@code matrix1} 
	 * don't equal the number of rows of {@code matrix2}
	 * @see #validateMatrix(char[][])
	 */
	public static char[][] multiply(char[][] matrix1, char[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_COLUMN_ROW_MISMATCH);
		}
		
		char[][] result = new char[matrix1.length][matrix2[0].length];
		for (int r1 = 0; r1 < matrix1.length; r1++) {
			for (int c1 = 0; c1 < matrix1[0].length; c1++) {
				for (int c2 = 0; c2 < matrix2[0].length; c2++) {
					result[r1][c2] += matrix1[r1][c1] * matrix2[c1][c2];
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(byte[])
	 */
	public static byte[] multiply(byte[] matrix, byte scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		byte[] result = new byte[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			result[i] = (byte) (matrix[i] * scalar);
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(short[])
	 */
	public static short[] multiply(short[] matrix, short scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		short[] result = new short[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			result[i] = (short) (matrix[i] * scalar);
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(int[])
	 */
	public static int[] multiply(int[] matrix, int scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		int[] result = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			result[i] = matrix[i] * scalar;
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(long[])
	 */
	public static long[] multiply(long[] matrix, long scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		long[] result = new long[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			result[i] = matrix[i] * scalar;
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(float[])
	 */
	public static float[] multiply(float[] matrix, float scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		float[] result = new float[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			result[i] = matrix[i] * scalar;
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(double[])
	 */
	public static double[] multiply(double[] matrix, double scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		double[] result = new double[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			result[i] = matrix[i] * scalar;
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(char[])
	 */
	public static char[] multiply(char[] matrix, char scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		char[] result = new char[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			result[i] = (char) (matrix[i] * scalar);
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(byte[][])
	 */
	public static byte[][] multiply(byte[][] matrix, byte scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		byte[][] result = new byte[matrix.length][matrix[0].length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[r][c] = (byte) (matrix[r][c] * scalar);
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(short[][])
	 */
	public static short[][] multiply(short[][] matrix, short scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		short[][] result = new short[matrix.length][matrix[0].length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[r][c] = (short) (matrix[r][c] * scalar);
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(int[][])
	 */
	public static int[][] multiply(int[][] matrix, int scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		int[][] result = new int[matrix.length][matrix[0].length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[r][c] = matrix[r][c] * scalar;
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(long[][])
	 */
	public static long[][] multiply(long[][] matrix, long scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		long[][] result = new long[matrix.length][matrix[0].length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[r][c] = matrix[r][c] * scalar;
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(float[][])
	 */
	public static float[][] multiply(float[][] matrix, float scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		float[][] result = new float[matrix.length][matrix[0].length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[r][c] = matrix[r][c] * scalar;
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(double[][])
	 */
	public static double[][] multiply(double[][] matrix, double scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		double[][] result = new double[matrix.length][matrix[0].length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[r][c] = matrix[r][c] * scalar;
			}
		}
		return result;
	}
	
	/**
	 * Returns the product of {@code matrix} and {@code scalar}.
	 * 
	 * @param matrix the matrix to multiply the scalar by
	 * @param scalar the scalar to multiply {@code matrix} by
	 * @return the product of {@code matrix} and {@code scalar}
	 * @throws IllegalArgumentException if {@code matrix} is not a valid matrix
	 * @see #validateMatrix(char[][])
	 */
	public static char[][] multiply(char[][] matrix, char scalar) {
		if (!validateMatrix(matrix)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		}
		
		char[][] result = new char[matrix.length][matrix[0].length];
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				result[r][c] = (char) (matrix[r][c] * scalar);
			}
		}
		return result;
	}

}

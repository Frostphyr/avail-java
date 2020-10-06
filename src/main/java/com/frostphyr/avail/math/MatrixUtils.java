package com.frostphyr.avail.math;

/**
 * Utility class containing methods to assist with using matrices that are 
 * represented as arrays.
 * 
 * @since 1.0
 */
public class MatrixUtils {
	
	private static final String EXCEPTION_MESSAGE_SIZE_MISMATCH = "Number of columns of matrix1 must be equal to rows of matrix2";
	private static final String EXCEPTION_MESSAGE_INVALID_MATRIX = "Every row of a matrix must be the same size";
	
	/**
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if the matrix is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(byte[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if the matrix is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(short[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if the matrix is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(int[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if the matrix is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(long[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if the matrix is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(float[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if the matrix is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(double[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if the matrix is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(char[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>It is not {@code null}
	 *   <li>It is not empty (length is greater than 0)
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code true} if the matrix is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(Object[] matrix) {
		return matrix != null && matrix.length != 0;
	}
	
	/**
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code} if the matrix is valid; {@code false} otherwise
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
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code} if the matrix is valid; {@code false} otherwise
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
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code} if the matrix is valid; {@code false} otherwise
	 */
	public static boolean validateMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
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
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code} if the matrix is valid; {@code false} otherwise
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
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code} if the matrix is valid; {@code false} otherwise
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
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code} if the matrix is valid; {@code false} otherwise
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
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code} if the matrix is valid; {@code false} otherwise
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
	 * Returns whether the specified matrix is valid. A matrix is valid if it 
	 * meets the following criteria:
	 * 
	 * <ul>
	 *   <li>The matrix or any row (array) is not {@code null}
	 *   <li>The matrix or any row (array) is not empty (length is greater 
	 *   than 0)
	 *   <li>Every row (array) is the same length
	 * </ul>
	 * 
	 * @param matrix the matrix to validate
	 * @return {@code} if the matrix is valid; {@code false} otherwise
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(byte[])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(short[])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(int[])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(long[])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(float[])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(double[])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(char[])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(Object[])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(byte[][])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(short[][])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(int[][])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(long[][])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(float[][])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(double[][])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(char[][])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Transposes the specified matrix and returns the result.
	 * 
	 * @see #validateMatrix(Object[][])
	 * @param matrix the matrix to transpose; must be a valid matrix
	 * @return the transposition of the specified matrix
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(byte[])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(short[])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(int[])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(long[])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(float[])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(double[])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(char[])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(byte[][])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(short[][])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(int[][])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(long[][])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(float[][])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(double[][])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Adds the two specified matrices and returns the result. Both matrices 
	 * must be the same size.
	 * 
	 * @see #validateMatrix(char[][])
	 * @param matrix1 the first matrix to add; must be a valid matrix
	 * @param matrix2 the second matrix to add; must be a valid matrix
	 * @return the sum of both specified matrices
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(byte[])
	 * @see #validateMatrix(byte[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static byte[] multiply(byte[] matrix1, byte[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(short[])
	 * @see #validateMatrix(short[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static short[] multiply(short[] matrix1, short[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(short[])
	 * @see #validateMatrix(short[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static int[] multiply(int[] matrix1, int[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(long[])
	 * @see #validateMatrix(long[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static long[] multiply(long[] matrix1, long[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(float[])
	 * @see #validateMatrix(float[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static float[] multiply(float[] matrix1, float[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(double[])
	 * @see #validateMatrix(double[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static double[] multiply(double[] matrix1, double[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(char[])
	 * @see #validateMatrix(char[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static char[] multiply(char[] matrix1, char[][] matrix2) {
		if (!validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1.length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(byte[])
	 * @see #validateMatrix(byte[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static byte[][] multiply(byte[][] matrix1, byte[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(short[])
	 * @see #validateMatrix(short[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static short[][] multiply(short[][] matrix1, short[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(int[])
	 * @see #validateMatrix(int[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static int[][] multiply(int[][] matrix1, int[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(long[])
	 * @see #validateMatrix(long[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static long[][] multiply(long[][] matrix1, long[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(float[])
	 * @see #validateMatrix(float[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static float[][] multiply(float[][] matrix1, float[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(double[])
	 * @see #validateMatrix(double[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static double[][] multiply(double[][] matrix1, double[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(char[])
	 * @see #validateMatrix(char[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static char[][] multiply(char[][] matrix1, char[] matrix2) {
		if (!validateMatrix(matrix1)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != 1) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(byte[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static byte[][] multiply(byte[][] matrix1, byte[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(short[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static short[][] multiply(short[][] matrix1, short[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(int[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(long[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static long[][] multiply(long[][] matrix1, long[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(float[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static float[][] multiply(float[][] matrix1, float[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(double[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the two specified matrices and returns the result. The 
	 * number of columns of the first matrix must equal the number of rows of 
	 * the second matrix.
	 * 
	 * @see #validateMatrix(char[][])
	 * @param matrix1 the first matrix to multiply; must be a valid matrix
	 * @param matrix2 the second matrix to multiply; must be a valid matrix
	 * @return the product of both specified matrices
	 */
	public static char[][] multiply(char[][] matrix1, char[][] matrix2) {
		if (!validateMatrix(matrix1) || !validateMatrix(matrix2)) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_INVALID_MATRIX);
		} else if (matrix1[0].length != matrix2.length) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE_SIZE_MISMATCH);
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(byte[])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(short[])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(int[])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(long[])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(float[])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(double[])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(char[])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(byte[][])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(short[][])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(int[][])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(long[][])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(float[][])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(double[][])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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
	 * Multiplies the specified matrix by the specified scalar.
	 * 
	 * @see #validateMatrix(char[][])
	 * @param matrix the matrix to multiply the scalar by; must be a valid 
	 * matrix
	 * @param scalar the scalar to multiply the matrix with
	 * @return the product of the specified matrix and scalar
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

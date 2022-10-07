package com.frostphyr.avail.math;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MatrixUtilsTest {
	
	private final int[] matrix1x3_1 = {1, 2, 3};
	private final int[] matrix1x3_2 = {4, 5, 6};
	
	private final int[][] matrix2x3_1 = {
			{1, 2, 3},
			{4, 5, 6}
	};
	
	private final int[][] matrix2x3_2 = {
			{7, 8, 9},
			{10, 11, 12}
	};
	
	private final int[][] matrix3x3 = {
			{7, 8, 9},
			{10, 11, 12},
			{13, 14, 15}
	};
	
	private final int[][] matrix3x1 = {
			{4},
			{5},
			{6}
	};
	
	@Test
	public void testValidateMatrix1d() {
		assertTrue(MatrixUtils.validateMatrix(matrix1x3_1));
		assertFalse(MatrixUtils.validateMatrix((int[]) null));
		assertFalse(MatrixUtils.validateMatrix(new int[0]));
	}
	
	@Test
	public void testValidateMatrix2d() {
		assertTrue(MatrixUtils.validateMatrix(matrix2x3_1));
		assertFalse(MatrixUtils.validateMatrix((int[][]) null));
		assertFalse(MatrixUtils.validateMatrix(new int[0][0]));
		assertFalse(MatrixUtils.validateMatrix(new int[3][0]));
		assertFalse(MatrixUtils.validateMatrix(new int[0][3]));
		assertFalse(MatrixUtils.validateMatrix(new int[][] {
			{1, 2, 3},
			{4, 5},
			{6, 7, 8}
		}));
	}
	
	@Test
	public void testTranspose1d() {
		assertArrayEquals(new int[][] {
			{1},
			{2},
			{3}
		}, MatrixUtils.transpose(matrix1x3_1));
	}
	
	@Test
	public void testTranspose2d() {
		assertArrayEquals(new int[][] {
			{1, 4},
			{2, 5},
			{3, 6}
		}, MatrixUtils.transpose(matrix2x3_1));
	}
	
	@Test
	public void testAdd1d() {
		assertArrayEquals(new int[] {
				5, 7, 9
		}, MatrixUtils.add(matrix1x3_1, matrix1x3_2));
	}
	
	@Test
	public void testAdd2d() {
		assertArrayEquals(new int[][] {
				{8, 10, 12},
				{14, 16, 18}
		}, MatrixUtils.add(matrix2x3_1, matrix2x3_2));
	}
	
	@Test
	public void testMultiply1d2d() {
		assertArrayEquals(new int[] {
			66, 72, 78
		}, MatrixUtils.multiply(matrix1x3_1, matrix3x3));
		
		assertThrows(IllegalArgumentException.class, () -> MatrixUtils.multiply(matrix1x3_1, matrix2x3_1));
	}
	
	@Test
	public void testMultiply2d1d() {
		assertArrayEquals(new int[][] {
			{4, 8, 12},
			{5, 10, 15},
			{6, 12, 18}
		}, MatrixUtils.multiply(matrix3x1, matrix1x3_1));
		
		assertThrows(IllegalArgumentException.class, () -> MatrixUtils.multiply(matrix3x3, matrix1x3_1));
	}
	
	@Test
	public void testMultiply2d2d() {
		assertArrayEquals(new int[][] {
			{66, 72, 78},
			{156, 171, 186}
		}, MatrixUtils.multiply(matrix2x3_1, matrix3x3));
		
		assertThrows(IllegalArgumentException.class, () -> MatrixUtils.multiply(matrix3x3, matrix2x3_1));
	}
	
	@Test
	public void testMultiplyScalar1d() {
		assertArrayEquals(new int[] {
				2, 4, 6
		}, MatrixUtils.multiply(matrix1x3_1, 2));
	}
	
	@Test
	public void testMultiplyScalar2d() {
		assertArrayEquals(new int[][] {
				{2, 4, 6},
				{8, 10, 12}
		}, MatrixUtils.multiply(matrix2x3_1, 2));
	}

}

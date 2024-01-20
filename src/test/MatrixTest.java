package test;

import junit.framework.TestCase;
import org.junit.Test;

public class MatrixTest extends TestCase {

    @Test(expected = NullPointerException.class)
    public void determinantTest1(){
        double[][] forMatrix = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix matrix = new Matrix(forMatrix);
        double actualResult = matrix.determinant();
        double expectedResult = 0.0;
        assertEquals(actualResult, expectedResult);

    }

    @Test
    public void determinantTest2(){
        double[][] forMatrix = {{-1,-2,-3}, {-4,-5,-6}, {-7,-8,-9}};
        Matrix matrix = new Matrix(forMatrix);
        double actualResult = matrix.determinant();
        double expectedResult = 0.0;
        assertEquals(actualResult, expectedResult);
    }

    public void testAddMatrix1(){
        double[][] forTestAddMatrixT = {{1,2,3,1}, {4,5,6,3}, {7,8,9,5}};
        double[][] forTestAddMatrix0 = {{1,2,3,3}, {4,5,6,6}, {7,8,9,9}};
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrix0 = new Matrix(forTestAddMatrix0);
        IMatrix actualResult = matrixT.add(matrix0);

        double[][] arrayExpected = {{2,4,6,4}, {8,10,12,9}, {14,16,18,14}};
        IMatrix expectedResult = new Matrix(arrayExpected);
        //assertEquals(actualResult, expectedResult);
    }
}

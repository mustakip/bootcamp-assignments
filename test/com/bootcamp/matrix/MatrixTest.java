package com.bootcamp.matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {


  @Test
  void shouldAddTwoMatricesAndReturnAMatrix() {
    List<List<Double>> list1 = new ArrayList<>();
    list1.set(0, Arrays.asList(1D, 2D));
    list1.set(1, Arrays.asList(4D, 5D));

    List<List<Double>> list2 = new ArrayList<>();
    list2.set(0, Arrays.asList(1D, 2D));
    list2.set(1, Arrays.asList(4D, 5D));

    List<List<Double>> expectedMatrix = new ArrayList<>();
    expectedMatrix.set(0, Arrays.asList(2D, 4D));
    expectedMatrix.set(1, Arrays.asList(8D, 10D));

    Matrix matrix1 = new Matrix(list1);
    Matrix matrix2 = new Matrix(list2);

    assertEquals(matrix1.add(matrix2), expectedMatrix);
  }
}

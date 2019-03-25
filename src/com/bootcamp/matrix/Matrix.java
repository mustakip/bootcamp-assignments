package com.bootcamp.matrix;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
  private List<List<Double>> matrix;

  public Matrix(List<List<Double>> matrix) {
    this.matrix = matrix;
  }

  Matrix add(Matrix anotherMatrix) {
    List<List<Double>> newMatrix = new ArrayList<>();
    for(int rowNo = 0; rowNo < matrix.size(); rowNo++) {
      List<Double> listAddition = add(this.matrix.get(rowNo), anotherMatrix.matrix.get(rowNo));
      newMatrix.set(rowNo, listAddition);
    }
    return new Matrix(newMatrix);
  }

  List add(List<Double> list1, List<Double> list2) {
    List<Double> additionList = new ArrayList<>();
    for(int i = 0; i < list1.size(); i++) {
      Double addition = list1.get(i) + list2.get(i);
      additionList.set(i, addition);
    }
    return additionList;
  }
}

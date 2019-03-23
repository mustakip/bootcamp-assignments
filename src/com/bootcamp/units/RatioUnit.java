package com.bootcamp.units;

import java.math.BigDecimal;
import java.util.HashMap;

class RatioUnit extends Unit {
  private static final Object LENGTH = new Object();
  static final RatioUnit FEET = new RatioUnit(new BigDecimal(25 * 12), LENGTH);
  static final RatioUnit INCH = new RatioUnit(new BigDecimal(25), LENGTH);
  static final RatioUnit CENTIMETER = new RatioUnit(new BigDecimal(10), LENGTH);
  static final RatioUnit MILLIMETER = new RatioUnit(new BigDecimal(1), LENGTH);
  private static final Object VOLUME = new Object();
  static final RatioUnit GALLON = new RatioUnit(new BigDecimal(3), VOLUME);
  static final RatioUnit LITRE = new RatioUnit(new BigDecimal(1), VOLUME);
  private static HashMap<Object, Unit> standardUnits = new HashMap<>();

  static {
    standardUnits.put(LENGTH, RatioUnit.INCH);
    standardUnits.put(VOLUME, RatioUnit.LITRE);
  }

  private RatioUnit(BigDecimal ratio, Object type) {
    super(ratio, type);
  }

  @Override
  BigDecimal convertToBaseUnitValue(BigDecimal value) {
    return this.ratio.multiply(value);
  }

  @Override
  Unit getStandardUnit() {
    return standardUnits.get(this.type);
  }

  @Override
  BigDecimal convertToStandardUnitValue(BigDecimal baseValue) {
    return baseValue.divide(getStandardUnit().ratio);
  }
}
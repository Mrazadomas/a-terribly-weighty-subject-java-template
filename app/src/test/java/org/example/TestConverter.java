package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestConverter {
  // In this lab, I will write the tests for you to give you
  // an example of what they should look like. In the future,
  // you will be responsible for writing the tests. Update the
  // Converter class to make these tests pass.

  Converter converter;

  @BeforeEach
  void setUp() {
    converter = new Converter();
  }

  @Test
  public void testZeroOuncesToPounds() {
    assertEquals("0.0000 lbs", Converter.toPounds(0));
  }

  @Test
  public void test1OunceToPounds() {
    assertEquals("0.0625 lbs", Converter.toPounds(1));
  }

  @Test
  public void test2OuncesToPounds() {
    assertEquals("0.1250 lbs", Converter.toPounds(2));
  }

  @Test
  public void test16OuncesToPounds() {
    assertEquals("1.0000 lb", Converter.toPounds(16));
  }

  @Test
  public void test24OuncesToPounds() {
    assertEquals("1.5000 lbs", Converter.toPounds(24));
  }

  @Test
  public void test32OuncesToPounds() {
    assertEquals("2.0000 lbs", Converter.toPounds(32));
  }

  @Test
  public void testZeroOuncesToPoundsAndOunces() {
    assertEquals("0 lbs 0 oz", Converter.toPoundsAndOunces(0));
  }

  @Test
  public void test1OunceToPoundsAndOunces() {
    assertEquals("0 lbs 1 oz", Converter.toPoundsAndOunces(1));
  }

  @Test
  public void test2OuncesToPoundsAndOunces() {
    assertEquals("0 lbs 2 oz", Converter.toPoundsAndOunces(2));
  }

  @Test
  public void test16OuncesToPoundsAndOunces() {
    assertEquals("1 lb 0 oz", Converter.toPoundsAndOunces(16));
  }

  @Test
  public void test24OuncesToPoundsAndOunces() {
    assertEquals("1 lb 8 oz", Converter.toPoundsAndOunces(24));
  }

  @Test
  public void test32OuncesToPoundsAndOunces() {
    assertEquals("2 lbs 0 oz", Converter.toPoundsAndOunces(32));
  }
}

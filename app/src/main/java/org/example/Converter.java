package org.example;
import java.text.DecimalFormat;

   

public class Converter {
  // Write the code needed to make the tests in
  // TestConverter.java pass. I have provided the
  // tests for you in this lab to give you an example
  // of how they should look. In the future, you will
  // be responsible for writing your own tests.

  // After you have written the code to make the tests
  // pass, exercise your code in a driver function in
  // App.java. This shows that your business logic can
  // run in a console program.



    public static String toPounds(int oz) {
        double pound = (double)oz / 16;
        DecimalFormat df = new DecimalFormat("0.0000"); 
        String pounds = df.format(((double)oz) / 16);
        if (pound == 1) {
            String resultS = pounds + " lb";
            return resultS;
        }
        String result = pounds + " lbs";
        return result;
    }

    public static String toPoundsAndOunces(int oz) {
        double pound = (double)oz / 16;
        int pounds = oz / 16;
        int ozLeft = oz % 16;
        if (pound >= 1 && pound < 2) {
            String resultS = pounds + " lb " + ozLeft + " oz";
            return resultS;
        }
        String result = pounds + " lbs " + ozLeft + " oz";
        return result;
    }
}

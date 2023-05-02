package com.Day9;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class CE1 {
  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s) {
	  
	  System.out.println("Add "+(n+s));
  }
  @Test(dataProvider = "dp")
  public void sub(Integer n, Integer s) {
	 
	  System.out.println("Subraction "+(n-s));
  }
  @Test(dataProvider = "dp")
  public void mul(Integer n, Integer s) {
	  
	  System.out.println("Multiplication "+n*s);
  }
  @Test(dataProvider = "dp")
  public void div(Integer n, Integer s) {
	  
	  System.out.println("Division "+n/s);
  }
 

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 21, 5 },
      new Object[] { 31, 9 },
    };
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 06 21:02:49 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaClassExample_ESTest extends JavaClassExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaClassExample javaClassExample0 = new JavaClassExample();
      javaClassExample0.setName("n!@mht3lu*(_%beY6jO");
      String string0 = javaClassExample0.getName();
      assertEquals("n!@mht3lu*(_%beY6jO", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaClassExample javaClassExample0 = new JavaClassExample();
      javaClassExample0.setName("");
      String string0 = javaClassExample0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaClassExample javaClassExample0 = new JavaClassExample();
      String string0 = javaClassExample0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JavaClassExample.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 17:21:10 GMT 2019
 */

package basicajax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import basicajax.Echo;
import javax.faces.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Echo_ESTest extends Echo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Echo echo0 = new Echo();
      echo0.setStr((String) null);
      String string0 = echo0.getStr();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Echo echo0 = new Echo();
      String string0 = echo0.getStr();
      assertEquals("hello", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Echo echo0 = new Echo();
      ActionEvent actionEvent0 = mock(ActionEvent.class, new ViolatedAssumptionAnswer());
      echo0.reset(actionEvent0);
      String string0 = echo0.getStr();
      assertEquals("", string0);
  }
}
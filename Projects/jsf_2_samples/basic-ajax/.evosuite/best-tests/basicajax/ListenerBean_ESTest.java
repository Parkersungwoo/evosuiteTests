/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 17:22:21 GMT 2019
 */

package basicajax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import basicajax.ListenerBean;
import javax.faces.component.UIGraphic;
import javax.faces.component.behavior.BehaviorBase;
import javax.faces.event.AjaxBehaviorEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListenerBean_ESTest extends ListenerBean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListenerBean listenerBean0 = new ListenerBean();
      listenerBean0.setHello("");
      listenerBean0.update((AjaxBehaviorEvent) null);
      int int0 = listenerBean0.getLength();
      assertEquals(1, listenerBean0.getEventCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ListenerBean listenerBean0 = new ListenerBean();
      listenerBean0.setHello((String) null);
      listenerBean0.getHello();
      assertEquals(5, listenerBean0.getLength());
      assertEquals(0, listenerBean0.getEventCount());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ListenerBean listenerBean0 = new ListenerBean();
      assertEquals("Hello", listenerBean0.getHello());
      
      listenerBean0.setHello("");
      listenerBean0.getHello();
      assertEquals(0, listenerBean0.getEventCount());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ListenerBean listenerBean0 = new ListenerBean();
      listenerBean0.setHello((String) null);
      UIGraphic uIGraphic0 = new UIGraphic();
      BehaviorBase behaviorBase0 = new BehaviorBase();
      AjaxBehaviorEvent ajaxBehaviorEvent0 = new AjaxBehaviorEvent(uIGraphic0, behaviorBase0);
      // Undeclared exception!
      try { 
        listenerBean0.update(ajaxBehaviorEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("basicajax.ListenerBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ListenerBean listenerBean0 = new ListenerBean();
      String string0 = listenerBean0.getHello();
      assertEquals("Hello", string0);
      assertEquals(0, listenerBean0.getEventCount());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ListenerBean listenerBean0 = new ListenerBean();
      listenerBean0.update((AjaxBehaviorEvent) null);
      int int0 = listenerBean0.getEventCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ListenerBean listenerBean0 = new ListenerBean();
      int int0 = listenerBean0.getEventCount();
      assertEquals(0, int0);
      assertEquals("Hello", listenerBean0.getHello());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ListenerBean listenerBean0 = new ListenerBean();
      int int0 = listenerBean0.getLength();
      assertEquals(0, listenerBean0.getEventCount());
      assertEquals(5, int0);
  }
}

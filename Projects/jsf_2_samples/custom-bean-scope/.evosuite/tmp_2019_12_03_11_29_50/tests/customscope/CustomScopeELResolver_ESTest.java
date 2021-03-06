/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 17:31:58 GMT 2019
 */

package customscope;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import customscope.CustomScopeELResolver;
import java.beans.FeatureDescriptor;
import java.util.Iterator;
import java.util.Locale;
import javax.el.ELContext;
import javax.el.PropertyNotFoundException;
import javax.faces.context.FacesContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CustomScopeELResolver_ESTest extends CustomScopeELResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CustomScopeELResolver customScopeELResolver0 = new CustomScopeELResolver();
      FeatureDescriptor featureDescriptor0 = new FeatureDescriptor();
      Class<?> class0 = customScopeELResolver0.getCommonPropertyType((ELContext) null, featureDescriptor0);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CustomScopeELResolver customScopeELResolver0 = new CustomScopeELResolver();
      Class<?> class0 = customScopeELResolver0.getCommonPropertyType((ELContext) null, (Object) null);
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CustomScopeELResolver customScopeELResolver0 = new CustomScopeELResolver();
      Object object0 = new Object();
      FeatureDescriptor featureDescriptor0 = new FeatureDescriptor();
      Object object1 = customScopeELResolver0.getValue((ELContext) null, featureDescriptor0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CustomScopeELResolver customScopeELResolver0 = new CustomScopeELResolver();
      // Undeclared exception!
      try { 
        customScopeELResolver0.getValue((ELContext) null, (Object) null, (Object) null);
        fail("Expecting exception: PropertyNotFoundException");
      
      } catch(PropertyNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("customscope.CustomScopeELResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CustomScopeELResolver customScopeELResolver0 = new CustomScopeELResolver();
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      Object object0 = customScopeELResolver0.getValue((ELContext) null, (Object) null, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CustomScopeELResolver customScopeELResolver0 = new CustomScopeELResolver();
      Object object0 = new Object();
      FeatureDescriptor featureDescriptor0 = new FeatureDescriptor();
      customScopeELResolver0.setValue((ELContext) null, object0, featureDescriptor0, featureDescriptor0);
      assertFalse(featureDescriptor0.isPreferred());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CustomScopeELResolver customScopeELResolver0 = new CustomScopeELResolver();
      Object object0 = new Object();
      Class<?> class0 = customScopeELResolver0.getType((ELContext) null, (Object) null, object0);
      assertEquals("class java.lang.Object", class0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CustomScopeELResolver customScopeELResolver0 = new CustomScopeELResolver();
      Iterator<FeatureDescriptor> iterator0 = customScopeELResolver0.getFeatureDescriptors((ELContext) null, (Object) null);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CustomScopeELResolver customScopeELResolver0 = new CustomScopeELResolver();
      boolean boolean0 = customScopeELResolver0.isReadOnly((ELContext) null, (Object) null, (Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try { 
        CustomScopeELResolver.destroyScope((FacesContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("customscope.CustomScopeELResolver", e);
      }
  }
}

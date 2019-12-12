import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        testAdd testAdd0 = new testAdd();
        java.lang.Class<?> wildcardClass1 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass3 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass3 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass3 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass3 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass17 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass17 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass19 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass17 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass5 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str20 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str22 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str24 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass25 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass17 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass19 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "1" + "'", str18.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass19 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str20 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass17 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str20 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass21 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "1" + "'", str18.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass19 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str20 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str22 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str20 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass21 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str20 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass19 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str20 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str22 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str24 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "1" + "'", str18.equals("1"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass17 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass7 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass11 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "1" + "'", str18.equals("1"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass17 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass13 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str8 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str10 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str18 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str20 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1" + "'", str14.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str14 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str16 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 100);
        java.lang.String str12 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        testAdd testAdd0 = new testAdd();
        java.lang.String str2 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str4 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str6 = null; // flaky: testAdd0.testAdd((java.lang.Integer) (-1));
        java.lang.String str8 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.String str10 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str12 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str14 = null; // flaky: testAdd0.testAdd((java.lang.Integer) 0);
        java.lang.String str16 = testAdd0.testAdd((java.lang.Integer) 1);
        java.lang.String str18 = testAdd0.testAdd((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass19 = testAdd0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1" + "'", str10.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1" + "'", str12.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1" + "'", str16.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.Class<?> wildcardClass1 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass2 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.Class<?> wildcardClass3 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass3 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        java.lang.String str4 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.Class<?> wildcardClass7 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.Class<?> wildcardClass6 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        java.lang.Class<?> wildcardClass4 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.Class<?> wildcardClass4 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        java.lang.String str7 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass8 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass4 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        java.lang.Class<?> wildcardClass6 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        java.lang.String str6 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass7 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.Class<?> wildcardClass9 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("hi!");
        java.lang.String str6 = javaClassExample0.getName();
        java.lang.String str7 = javaClassExample0.getName();
        javaClassExample0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str4 = javaClassExample0.getName();
        java.lang.String str5 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass6 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        java.lang.String str4 = javaClassExample0.getName();
        java.lang.String str5 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass6 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("");
        java.lang.Class<?> wildcardClass8 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass7 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        java.lang.String str4 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass5 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        java.lang.String str7 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str10 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("");
        java.lang.String str8 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str9 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        java.lang.String str7 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        java.lang.String str7 = javaClassExample0.getName();
        java.lang.String str8 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("");
        java.lang.Class<?> wildcardClass8 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        java.lang.String str4 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        java.lang.String str9 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass10 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        java.lang.String str4 = javaClassExample0.getName();
        java.lang.String str5 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("");
        java.lang.String str8 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        java.lang.String str9 = javaClassExample0.getName();
        java.lang.String str10 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        java.lang.String str4 = javaClassExample0.getName();
        java.lang.String str5 = javaClassExample0.getName();
        java.lang.String str6 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("");
        javaClassExample0.setName("");
        java.lang.String str8 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str9 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass10 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        javaClassExample0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("hi!");
        java.lang.String str10 = javaClassExample0.getName();
        java.lang.String str11 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        java.lang.String str4 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str7 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        java.lang.String str4 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        java.lang.String str4 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str7 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        java.lang.String str9 = javaClassExample0.getName();
        java.lang.Class<?> wildcardClass10 = javaClassExample0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        java.lang.String str7 = javaClassExample0.getName();
        java.lang.String str8 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        javaClassExample0.setName("hi!");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        java.lang.String str8 = javaClassExample0.getName();
        java.lang.String str9 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        javaClassExample0.setName("");
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        javaClassExample0.setName("hi!");
        java.lang.String str8 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        JavaClassExample javaClassExample0 = new JavaClassExample();
        java.lang.String str1 = javaClassExample0.getName();
        java.lang.String str2 = javaClassExample0.getName();
        java.lang.String str3 = javaClassExample0.getName();
        javaClassExample0.setName("");
        java.lang.String str6 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        java.lang.String str9 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        java.lang.String str12 = javaClassExample0.getName();
        javaClassExample0.setName("hi!");
        java.lang.String str15 = javaClassExample0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }
}


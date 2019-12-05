public class AddTwoIntegers {

        public static void main(String[] args) {

            int first = 10;
            int second = 20;

            int sum = add(first, second);

            System.out.println("The sum is: " + sum);
        }

        public static int add(int int1, int int2) {
            return int1 + int2;
        }

    public static int subtract(int int1, int int2) {
        return int1 - int2;
    }

    public static int multiply(int int1, int int2) {
        return int1 * int2;
    }

    public static String substring(String s, int length) {
            return s.substring(0, length);
    }

    public static String wacky(String s) {
        String output = s.replace("a", "e");
        output = output.replace("b", "c");
        output = output.replace("f", "p");
        output = output.replace("t", "v");
        output = output.toUpperCase();
        return output;
    }


    }

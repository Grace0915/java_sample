public class FizzBuzz {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        int max = Integer.parseInt(args[0]);
        String result = null;
        for (int i = 0; i < max; i++) {
            int num = i + 1;
            result = "";
            if (num % 3 == 0 && num % 5 == 0) {
                result = "FizzBuzz";
            } else if (num % 5 == 0) {
                result = "Buzz";
            } else if (num % 3 == 0) {
                result = "Fizz";
            } else {
                result = "" + num;
            }
            System.out.println(result);
        }
    }
}
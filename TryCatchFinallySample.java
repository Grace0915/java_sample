public class TryCatchFinallySample {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
            Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
    }
}

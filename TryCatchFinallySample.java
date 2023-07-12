public class TryCatchFinallySample {

	public static void main(String[] args) {
		① {
			System.out.println("①");
			Integer.parseInt(args[0]);
		} ② (Exception e) {
			System.out.println("②");
		} ③ {
			System.out.println("③");
		}
	}
}

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String firstBinaryString = "101";
        String secondBinaryString = "1000";
        System.out.printf("%s + %s = %s%n",firstBinaryString, secondBinaryString,
                binOps.sum(firstBinaryString, secondBinaryString));
        System.out.printf("%s * %s = %s%n", firstBinaryString, secondBinaryString,
                binOps.mult(firstBinaryString, secondBinaryString));
    }
}

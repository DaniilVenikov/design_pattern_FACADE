public class BinOps {

    public String sum(String firstBinaryString, String secondBinaryString){
        return Integer.toBinaryString(Integer.parseInt(firstBinaryString, 2)
                + Integer.parseInt(secondBinaryString, 2));
    }

    public String mult(String firstBinaryString, String secondBinaryString){
        return Integer.toBinaryString(Integer.parseInt(firstBinaryString, 2)
                * Integer.parseInt(secondBinaryString, 2));
    }


}

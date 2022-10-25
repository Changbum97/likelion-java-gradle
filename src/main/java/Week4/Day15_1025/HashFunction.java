package Week4.Day15_1025;

public class HashFunction {
    public int hash(String key) {
        int asciiSum = 0;
        for(int i = 0 ; i < key.length() ; i ++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 10000;
    }

    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        int result = hf.hash("changbum");
        System.out.println(result);
    }

}

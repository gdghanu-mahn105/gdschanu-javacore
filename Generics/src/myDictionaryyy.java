public class myDictionaryyy<K, V> {
    private K word;
    private V mean;

    public myDictionaryyy(K word, V mean) {
        this.word = word;
        this.mean = mean;
    }

    public void setWord(K word) {
        this.word = word;
    }

    public void setMean(V mean) {
        this.mean = mean;
    }

    public K getWord() {
        return word;
    }

    public V getMean() {
        return mean;
    }

    public static void main(String[] args) {
        myDictionaryyy<String, String> tuDien = new myDictionaryyy<>("entertain", "giai tri");
        String English = tuDien.getWord();
        String Vietnamese = tuDien.getMean();
        System.out.println(English + ": " + Vietnamese);


    }

}

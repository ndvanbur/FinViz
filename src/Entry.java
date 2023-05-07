public class Entry {
    String date;
    double open;
    double high;
    double low;
    double close;
    int volume;

    public Entry(String date, double prices[], int volume){
        this.date = date;
        this.open = prices[0];
        this.high = prices[1];
        this.low = prices[2];
        this.close = prices[3];
        this.volume = volume;

    }
}
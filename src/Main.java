public class Main {

    public static void main(String[] args) {
        DataCenter dataCenter = new DataCenter(args[0]);
        Writer writer = new Writer("data.csv");
        while(dataCenter.error != -1){
            Entry entry = dataCenter.getNextEntry();
            writer.writeEntry(entry);


        }
        writer.endWriting();





    }
}

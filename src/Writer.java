import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    File file;
    String path;
    FileWriter local_writer;
    int count;
    public Writer(String path){
        this.path = path;
        this.file = new File(path);
        try {
            local_writer = new FileWriter(file);
            local_writer.write("day,price\n");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        count = 0;
    }
    public void writeEntry(Entry entry){
        try {
            local_writer.write(Integer.toString(count) + "," + entry.close + "\n");
            count ++;
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void endWriting(){
        try {
            local_writer.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

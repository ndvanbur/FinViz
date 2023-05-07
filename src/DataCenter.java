import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DataCenter {
    File data;
    String path;
    Scanner scanner;
    int error;

    public DataCenter(String path_to_data){
        error = 0;
        path = path_to_data;
        data = new File(path_to_data);
        if(!data.canRead()){
            System.out.println("Error, unable to access data\n");
            error = -1;
        }else{
            try {
                scanner = new Scanner(data);
                scanner.useDelimiter("[,\n]");
                scanner.nextLine();
            }catch(FileNotFoundException e){
                System.out.println("Error reading file with scanner");
                error = -1;
            }
        }


    }
    public Entry getNextEntry() {
        String date;
        double pricing[] = new double[5];
        int volume;

        date = scanner.next();
        for(int i = 0; i < 5; i ++){
            pricing[i] = Double.parseDouble(scanner.next());
        }
        volume = Integer.parseInt(scanner.next());
        Entry entry =  new Entry(date, pricing, volume);
        if(!scanner.hasNext()){
            error = -1;
        }
        return entry;

    }
}


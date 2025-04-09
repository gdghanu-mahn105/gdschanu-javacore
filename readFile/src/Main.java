import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myFile = new File("test.txt");
            FileWriter myWriter = new FileWriter(myFile);
            myWriter.write("hello this is the first line\n");
            myWriter.write("hello this is the second line\n");
            myWriter.close();// nhớ đóng FileWriter
            Scanner myReader = new Scanner(myFile);// đọc nội dung
            // kiểm tra xem có còn dòng nào trong tệp để đọc không
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            if (myFile.exists()) {
                System.out.println("File name: " + myFile.getName());
                System.out.println("AbsolutePath: " + myFile.getAbsolutePath());
                System.out.println("File size in bytes" + myFile.length());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
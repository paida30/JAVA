import java.io.*;

public class TestThrows {

    static void readfile()throws IOException{
        FileReader file = new FileReader("vivaan_notes.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
    }

    public static void main(String[] args) {
        try {
            readfile();
        } catch (   IOException e) {
            System.err.println("Caller handled File Error for Vivaan:"+ e.getMessage());
        }
    }
}

import java.io.FileReader;

public class chara_stream {
    public static void main(String[] args) {
        FileReader reader=new FileReader("/home/abinav/Program/java/abinesh.java");
        int ch;
        while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
    }
}


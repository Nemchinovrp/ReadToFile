import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) {

        byte[] data = null;
        try {
            File file = new File("D://text.txt");
            FileInputStream fis = new FileInputStream(file);
            data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        String s = null;
        try {
            s = new String(data, "WINDOWS-1251");
        } catch (UnsupportedEncodingException ex) {

        }

        String[] text = s.split(" ");
        for (String word : text) {
            System.out.println(word);
        }

    }
}


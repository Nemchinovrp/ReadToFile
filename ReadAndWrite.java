public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("/home/roman/Desktop/text.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();
        String s = new String(data, "windows-1251");
        String array = s.toUpperCase().replaceAll("JAVA", "javascript").toUpperCase();
        
        File fileOut = new File("/home/roman/Desktop/out.txt");
        System.out.println(fileOut.createNewFile());
        FileOutputStream fos = new FileOutputStream(fileOut);
        fos.write(array.getBytes());
        fos.close();
    }
}

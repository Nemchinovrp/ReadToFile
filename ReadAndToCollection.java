public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("/home/roman/Desktop/text.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();
        String s = new String(data, "UTF-8");
        String[] array = s.toLowerCase().trim().split(" ");
        Set<String> set = new HashSet<>();
        for(String word : array){
            set.add(word);
        }
        for(String s1 : set){
            System.out.println(s1);
        }
        
    }
}

package Day10;

import java.io.*;

public class FileStats {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        int lineCount = 0, wordCount = 0, charCount = 0;

        while ((line = br.readLine()) != null) {
            lineCount++;
            String[] words = line.trim().split("\\s+");
            if (!line.trim().isEmpty()) {
                wordCount += words.length;
            }
            charCount += line.length();
        }
        br.close();

        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
    }
}

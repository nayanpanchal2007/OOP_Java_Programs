/**
 * 8.1 Write a program that will count the number of characters, words, and
 * lines in a file. Words are separated by whitespace characters. The file name
 * should be passed as a command-line argument.
 */

import java.io.*;

public class FileCount {
    public static void main(String[] args) {
        int charCount = 0, wordCount = 0, lineCount = 0;

        if (args.length < 1) {
            System.out.println("Please provide file name");
            return;
        }

        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
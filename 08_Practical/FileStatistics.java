/**
 * 8.3 Write a Java program that reads a text file named data.txt. The program
 * should count and display: The total number of lines, The total number of
 * words, The total number of characters (excluding spaces and newline
 * characters), Use FileReader / BufferedReader for reading the file.
 * Handle exceptions like FileNotFoundException and IOException.
 */

import java.io.*;

public class FileStatistics {
    public static void main(String[] args) {
        int lineCount = 0, wordCount = 0, charCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }

                String noSpace = line.replaceAll("\\s+", "");
                charCount += noSpace.length();
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces & newline): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
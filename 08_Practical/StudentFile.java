/**
 * 8.2 Create a file named students.txt. Write at least three student records
 * (roll number, name, marks) into the file. Read the file content and display
 * all student records on the console. Handle exceptions like IOException
 * properly using try-catch-finally.
 */

import java.io.*;

public class StudentFile {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            fw.write("1 Nayan 85\n");
            fw.write("2 Rahul 78\n");
            fw.write("3 Priya 92\n");
            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File error occurred");
        } finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
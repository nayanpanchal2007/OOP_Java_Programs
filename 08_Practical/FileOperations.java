/**
 * 8.4 Write a Java program that takes file name(s) and commands from the
 * command line arguments and performs the following operations:
 * ● Copy a file from source to destination.
 * ● Delete a given file.
 * ● Rename a file.
 * After performing the operation, the program should print the following file
 * properties:
 * ● File name
 * ● Absolute path
 * ● File size (in bytes)
 * ● Whether the file is readable/writable
 * ● Last modified date
 * Use File class methods for properties, and handle exceptions such as
 * IOException and FileNotFoundException.
 */

import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid arguments");
            return;
        }

        String command = args[0];

        try {
            File file;

            if (command.equalsIgnoreCase("copy")) {
                File source = new File(args[1]);
                File dest = new File(args[2]);

                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(dest);

                int ch;
                while ((ch = fis.read()) != -1) {
                    fos.write(ch);
                }

                fis.close();
                fos.close();

                file = dest;
            }

            else if (command.equalsIgnoreCase("delete")) {
                file = new File(args[1]);
                if (file.delete()) {
                    System.out.println("File deleted successfully");
                } else {
                    System.out.println("Unable to delete file");
                }
            }

            else if (command.equalsIgnoreCase("rename")) {
                File oldFile = new File(args[1]);
                File newFile = new File(args[2]);

                if (oldFile.renameTo(newFile)) {
                    System.out.println("File renamed successfully");
                } else {
                    System.out.println("Rename failed");
                }

                file = newFile;
            }

            else {
                System.out.println("Invalid command");
                return;
            }

            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Last Modified: " + file.lastModified());

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File operation error");
        }
    }
}
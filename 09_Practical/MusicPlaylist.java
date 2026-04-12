/**
 * 9.3 Write a Java program to simulate a Music Playlist using
 * LinkedList<String>. Perform the following operations:
 * 1. Add songs to the playlist.
 * 2. Display the full playlist.
 * 3. Play the first song (remove from front).
 * 4. Skip the last song (remove from end).
 * 5. Display the updated playlist after each operation.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            String song = sc.nextLine();
            playlist.add(song);
        }

        System.out.println("\nFull Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }

        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("\nPlaying (removed first): " + firstSong);
        }

        System.out.println("Playlist after playing first song:");
        for (String song : playlist) {
            System.out.println(song);
        }

        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("\nSkipped (removed last): " + lastSong);
        }

        System.out.println("Playlist after skipping last song:");
        for (String song : playlist) {
            System.out.println(song);
        }

        sc.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.footballscoreevent;

/**
 *
 * @author WANITTRA
 */
import java.util.Scanner;
public class FootballScoreEvent {

    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();
        
        LiveScoreDisplay sub1 = new LiveScoreDisplay("Subscriber1");
        LiveScoreDisplay sub2 = new LiveScoreDisplay("Subscriber2");

        source.addScoreListener(sub1);
        source.addScoreListener(sub2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("End of program.");
                break;
            }

            source.setScore(input);
        }

        scanner.close();
    }
}

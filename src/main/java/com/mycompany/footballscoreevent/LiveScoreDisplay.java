/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.footballscoreevent;

/**
 *
 * @author WANITTRA
 */
public class LiveScoreDisplay implements ScoreListener {
    private String name;

    public LiveScoreDisplay(String name) {
        this.name = name;
    }

    @Override
    public void scoreChanged(ScoreEvent event) {
        System.out.println("live result: " + event.getScore());
    }
}
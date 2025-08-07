/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.footballscoreevent;

/**
 *
 * @author WANITTRA
 */
import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();

    public void addScoreListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeScoreListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScore(String score) {
        ScoreEvent event = new ScoreEvent(score);
        notifyListeners(event);
    }

    private void notifyListeners(ScoreEvent event) {
        for (ScoreListener listener : listeners) {
            listener.scoreChanged(event);
        }
    }
}

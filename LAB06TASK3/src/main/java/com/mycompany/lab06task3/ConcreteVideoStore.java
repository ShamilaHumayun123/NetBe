/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06task3;

/**
 *
 * @author SHAMILA HUMAYUN
 */
import java.util.ArrayList;
import java.util.List;
public class ConcreteVideoStore implements VideoStore {
    private List<Video> videos;

    public ConcreteVideoStore() {
        videos = new ArrayList<>();
    }

    @Override
    public void addVideo(Video video) {
        videos.add(video);
    }

    @Override
    public List<Video> getAllVideos() {
        return videos;
    }
}

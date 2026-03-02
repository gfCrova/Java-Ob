package com.patterns.designPatterns.Structural.Facade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversorFacade videoConversorFacade = new VideoConversorFacade();
        File file = videoConversorFacade.convertVideo("video.mp4", "mp4");
        System.out.println("Video converted and saved in: " + file);
    }
}


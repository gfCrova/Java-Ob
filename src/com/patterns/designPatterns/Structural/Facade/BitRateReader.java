package com.patterns.designPatterns.Structural.Facade;

public class BitRateReader {

    public static VideoFile read(VideoFile file, Codec codec){
        System.out.println("BitRateReader: Reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec){
        System.out.println("BitRateReader: Converting file...");
        return buffer;
    }
}

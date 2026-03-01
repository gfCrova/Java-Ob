package com.designPatterns.Structural.Facade;

import java.io.File;

public class VideoConversorFacade {
    public File convertVideo(String fileName, String format){
        System.out.println("VideoConversorFacade: Starting conversion...");

        VideoFile videoFile = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(videoFile);
        Codec destinationCodec;

        if (format.equals("mp4")){
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitRateReader.read(videoFile, sourceCodec);
        VideoFile intermediateResult = BitRateReader.convert(buffer, destinationCodec);

        File store = (new AudioMixer()).fix(intermediateResult);

        System.out.println("VideoConversorFacade: Conversion finished.");
        return store;
    }
}

package com.patterns.designPatterns.Structural.Facade;

import java.io.File;

/**
 * El Facade encapsula la complejidad del subsistema de conversión de video ofreciendo un único punto de entrada simple 'convertVideo()',
 * reduciendo el acoplamiento entre el cliente y las múltiples clases involucradas en el proceso.
 * **/

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

package doback;

//import java.beans.Encoder;
import java.io.File;
import it.sauronsoftware.jave.*;

public class VideoToAudio {
	
	File audios; 
	File setaudios;
	
	public void RootFile(String str) {
		audios = new File(str);
	}
	
	public void setRootFile(String str) {
		setaudios = new File(str);
	}
	
	public void ConvertToAudio() {
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("libmp3lame");
		audio.setBitRate(new Integer(128000));
		audio.setChannels(new Integer(2));
		audio.setSamplingRate(new Integer(44100));
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("mp3");
		attrs.setAudioAttributes(audio);
		Encoder encoder = new Encoder();
		try {
			encoder.encode(this.audios, this.setaudios, attrs);
			System.out.println("완료1");
		} catch (Exception e) {
			System.out.println("File to Converter");
		}
		System.out.println("완료2");
	}
}

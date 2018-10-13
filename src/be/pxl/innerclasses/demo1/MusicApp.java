package be.pxl.innerclasses.demo1;

public class MusicApp {
    public static void main(String[] args) {
            Musician musician = new Musician();
            musician.play();

            Musician.Instrument instrument = new Musician().new Instrument();
            instrument.makeNoise();
    }
}

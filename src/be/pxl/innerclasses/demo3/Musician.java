package be.pxl.innerclasses.demo3;

public class Musician {
    public void play(){
        Instrument instrument = new Instrument() {
            @Override
            public void makeNoise() {
                System.out.println("BamBimBom");
            }
        };

        instrument.makeNoise();
    }
}

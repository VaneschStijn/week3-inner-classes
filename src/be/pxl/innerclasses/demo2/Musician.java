package be.pxl.innerclasses.demo2;

public class Musician {
    public void play(){
        //int x = 5;
        //Implicit final x in Class Instrument
        class Instrument{

            public void makeNoise(){
                System.out.println("BamBimBom");
                //System.out.println(x);
            }
        }
        Instrument instrument = new Instrument();
        instrument.makeNoise();
    }
}

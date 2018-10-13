package be.pxl.innerclasses.demo1;

public class Musician {
    public void play(){
        new Instrument().makeNoise();
    }

    public class Instrument{
        public void makeNoise(){
            System.out.println("BamBimBom");
        }
    }
}

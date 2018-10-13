package be.pxl.innerclasses.opdracht1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;

public class Gearbox {
    private final int maxGears;
    private boolean clutchIsIn;
    private ArrayList<Gear> gears = new ArrayList<>();
    private int currentGear;

    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        for (int i = 0; i <= this.maxGears ; i++) {
            Gear gear = new Gear();
            gear.setGearNumber(i);
            gear.setRatio();

            addGear(gear);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(Gear gear){
        gears.add(gear);
    }

    public void changeGear(int newGear){
        if(clutchIsIn == true && newGear > 0){
            currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }else{
            System.out.println("knegedengknegedengHoeHoe");
            currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn == true){
            System.out.println("knegedengknegedengHoeHoe");
            return  0;
        }else{
            return gears.get(currentGear).driveSpeed(revs);
        }
    }

    private class Gear{
        private int gearNumber;
        private double ratio;

        private void setRatio() {
            ratio = gearNumber * 5.3;
        }

        private void setGearNumber(int gearNumber){
            this.gearNumber = gearNumber;
        }

        public double driveSpeed(int revs){
            return revs * ratio;
        }
    }
}

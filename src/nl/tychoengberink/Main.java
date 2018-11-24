package nl.tychoengberink;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       Main main = new Main();
       main.run();
    }


    public void run(){
        ArrayList<Integer>Gradelist = new ArrayList<Integer>(Arrays.asList(1,2,3,4,2,4,1));
        GradingForm gf = new GradingForm(Gradelist);
        System.out.println(gf.getGrade());

    }
}
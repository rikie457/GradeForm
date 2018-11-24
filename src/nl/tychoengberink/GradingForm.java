package nl.tychoengberink;

import java.util.ArrayList;
import java.util.Arrays;

public class GradingForm {
    private ArrayList<Integer> Critereas;
    private int indexFormated, finalscore;


    public GradingForm(ArrayList<Integer> _Critereas) {
        Critereas = _Critereas;
    }


    public int getCrit(int index) {
        if (index < 8 && index > 0) {
            this.indexFormated = index - 1;
            return Critereas.get(indexFormated);
        } else {
            return -1;
        }
    }

    public void setCrit(int index, int score) {
        if (index < 8 && index > 0 && score > -1 && score < 5) {
            this.indexFormated = index - 1;
            Critereas.set(indexFormated, score);
        } else {
            System.out.print("Index must be between 1 and 7 ");
        }
    }

    public double getGrade() {
        for (int i = 0; i < this.Critereas.size(); i++) {
            this.finalscore = this.finalscore + this.Critereas.get(i);
        }
        return (double) finalscore / 28 * 10;
    }
}

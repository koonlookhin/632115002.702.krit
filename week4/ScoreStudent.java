package week4;

import java.util.Set;

class Score {
    private int score;
public Score(){
    score=0;
}
    public int getScore() {
        return score;
    }

    public void setScore(int sScore) {
        score = sScore;
    }
}

public class ScoreStudent {
    public static void main(String[] agrs) {
        double avg=0;
        Score[] student;
        student = new Score[100];
        for (int i = 0; i < 100; i++) {
            student[i]=new Score();
            student[i].setScore((int) (Math.random() * 101));
            System.out.println("The student number " + (i + 1) + " score is " + student[i].getScore());
        }
        avg =Average(student);
        System.out.println("The average : "+avg); 
    }

    public static double Average(Score[] score) {
        double avgCal=0;
        double sum=0;
        for(int i =0;i<100;i++){
            sum=score[i].getScore()+sum;
        } 
        avgCal=sum/100;
        return avgCal;
    }
}

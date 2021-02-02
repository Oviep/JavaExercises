package Exercises;

public class Student {

    private String name;
    private double avgScore;

    public Student(String name, double avgScore) {
        this.name = name;

        if (avgScore > 0.0) {
            if (avgScore <= 100)
                this.avgScore = avgScore;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        if (avgScore > 0.0)
            if (avgScore <= 100)
                this.avgScore = avgScore;
    }

    public String letterGrade() {
        String letterGrade = "";

        if (avgScore >= 90)
            letterGrade = "A";
        else if (avgScore >= 80)
            letterGrade = "B";
        else if (avgScore >= 70)
            letterGrade = "C";
        else if (avgScore >= 60)
            letterGrade = "D";
        else {
            letterGrade = "F";
        }
        return letterGrade;
    }
}


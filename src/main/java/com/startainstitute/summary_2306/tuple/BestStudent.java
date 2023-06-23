package com.startainstitute.summary_2306.tuple;

public class BestStudent {

    private final String studentName;
    private final int score;

    public BestStudent(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "BestStudent{" +
                "studentName='" + studentName + '\'' +
                ", score=" + score +
                '}';
    }
}

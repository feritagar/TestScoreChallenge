package com.agarferit;

public class Main {

    public static void main(String[] args) throws InvalidTestScores {
        TestScores testScores = new TestScores(new double[] { 190, 80, 95,78 });
        try
        {
            double averageScore = testScores.averageTestScore();
            System.out.println("Your average score is " + averageScore);
        }
        catch (InvalidTestScores e)
        {
            System.out.println(e.getMessage());
        }

    }
}



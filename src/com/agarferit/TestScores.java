package com.agarferit;

public class TestScores {
    private double[] testScores;
    private double testTotal = 0;
    private double average = 0;

    public TestScores(double[] testScores) 
    {
        this.testScores = testScores;
    }

    public double averageTestScore() throws  InvalidTestScores {

        for (int i = 0; i < testScores.length; i++)
        {
            double score = testScores[i];
            if (score < 0 || score > 100)
            {
                throw new InvalidTestScores();
            }
            testTotal += testScores[i];
        }

        return average =testTotal / testScores.length;
    }
}


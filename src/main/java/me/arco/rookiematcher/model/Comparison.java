/*
 * Copyright Arnaud Coel (c) 2018.
 * Licensed by https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package me.arco.rookiematcher.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Comparison
{
    private Person rookie, buddy;
    private Map<Question, Double> questionAndScore;

    public Comparison(Person rookie, Person buddy)
    {
        this.rookie = rookie;
        this.buddy = buddy;

        this.questionAndScore = new LinkedHashMap<Question, Double>();
    }

    public Person getRookie()
    {
        return rookie;
    }

    public void setRookie(Person rookie)
    {
        this.rookie = rookie;
    }

    public Person getBuddy()
    {
        return buddy;
    }

    public void setBuddy(Person buddy)
    {
        this.buddy = buddy;
    }

    public void addQuestionAndScore(Question question, double score)
    {
        questionAndScore.put(question, score);
    }

    private double getTotalMatch()
    {
        double output = 0;
        double maxScore = 0;
        double matchScore = 0;

        for(Map.Entry<Question, Double> entry : questionAndScore.entrySet())
            maxScore += entry.getKey().getWeight();

        for(Map.Entry<Question, Double> entry : questionAndScore.entrySet())
            matchScore += entry.getValue();

        output = matchScore / maxScore * 100;

        return output;
    }

    @Override
    public String toString()
    {
        return "Comparison{" +
                "rookie=" + rookie +
                ", buddy=" + buddy +
                ", match=" + getTotalMatch() +
                '}';
    }
}

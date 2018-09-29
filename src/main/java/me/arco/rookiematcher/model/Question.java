/*
 * Copyright Arnaud Coel (c) 2018.
 * Licensed by https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package me.arco.rookiematcher.model;

public class Question
{
    private String question;
    private double weight;

    public Question(String question, double weight)
    {
        this.question = question;
        this.weight = weight;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Question{" +
                "question='" + question + '\'' +
                ", weight=" + weight +
                '}';
    }
}

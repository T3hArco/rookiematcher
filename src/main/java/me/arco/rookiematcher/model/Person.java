/*
 * Copyright Arnaud Coel (c) 2018.
 * Licensed by https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package me.arco.rookiematcher.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Person
{
    private String enterpriseId;
    private boolean buddy;

    private Map<Question, String> questionAndAnswers;
    private List<Comparison> comparisons;

    public Person()
    {
        this.questionAndAnswers = new LinkedHashMap<Question, String>();
        this.comparisons = new ArrayList<Comparison>();
    }

    public Person(String enterpriseId, boolean buddy)
    {
        this.enterpriseId = enterpriseId;
        this.buddy = buddy;

        this.questionAndAnswers = new LinkedHashMap<Question, String>();
        this.comparisons = new ArrayList<Comparison>();
    }

    public String getEnterpriseId()
    {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId)
    {
        this.enterpriseId = enterpriseId;
    }

    public boolean isBuddy()
    {
        return buddy;
    }

    public void setBuddy(boolean buddy)
    {
        this.buddy = buddy;
    }

    public Map<Question, String> getQuestionAndAnswers()
    {
        return questionAndAnswers;
    }

    public void setQuestionAndAnswers(Map<Question, String> questionAndAnswers)
    {
        this.questionAndAnswers = questionAndAnswers;
    }

    public void addQuestionAndAnswer(Question question, String answer)
    {
        this.questionAndAnswers.put(question, answer);
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "enterpriseId='" + enterpriseId + '\'' +
                ", buddy=" + buddy +
                '}';
    }
}

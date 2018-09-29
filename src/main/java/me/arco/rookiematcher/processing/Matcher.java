/*
 * Copyright Arnaud Coel (c) 2018.
 * Licensed by https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package me.arco.rookiematcher.processing;

import me.arco.rookiematcher.model.Comparison;
import me.arco.rookiematcher.model.Person;
import me.arco.rookiematcher.model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Matcher
{
    private ArrayList<Person> mix, buddies, rookies;

    public Matcher(ArrayList<Person> mix)
    {
        this.buddies = new ArrayList<Person>();
        this.rookies = new ArrayList<Person>();

        this.mix = mix;

        split();
    }

    /**
     * Function that simply splits buddies and rookies. Should only be called once.
     */
    private void split()
    {
        for (Person person : mix)
            if (person.isBuddy())
                buddies.add(person);
            else
                rookies.add(person);
    }

    /**
     * Logic to compare questions
     */
    public List<Comparison> compare()
    {
        List<Comparison> comparisons = new ArrayList<Comparison>();

        // this loop will compare each rookie to all available buddies, and will add a scoring mechanism
        for(Person rookie : rookies)
        {
            for(Person buddy : buddies)
            {
                Comparison comparison = new Comparison(rookie, buddy);

                // this loop iterates all the qeustion and answers of the rookie and will compare them to the ones of the buddy.
                for(Map.Entry<Question, String> rookieQuestionEntry : rookie.getQuestionAndAnswers().entrySet())
                {
                    double questionWeight = rookieQuestionEntry.getKey().getWeight();
                    double score;

                    String rookieAnswer = rookieQuestionEntry.getValue();
                    String buddyAnswer = buddy.getQuestionAndAnswers().get(rookieQuestionEntry.getKey());

                    score = ((rookieAnswer.equals(buddyAnswer)) ? questionWeight : 0);

                    comparison.addQuestionAndScore(rookieQuestionEntry.getKey(), score);
                }

                comparisons.add(comparison);
            }
        }

        return comparisons;
    }
}

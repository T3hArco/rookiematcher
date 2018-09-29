/*
 * Copyright Arnaud Coel (c) 2018.
 * Licensed by https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package me.arco.rookiematcher.dummy;

import me.arco.rookiematcher.model.Person;
import me.arco.rookiematcher.model.Question;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class DummyQuestionAndAnswerProvider
{
    public static ArrayList<Question> provide(ArrayList<Person> people)
    {
        ArrayList<Question> output = new ArrayList<Question>();

        output.add(new Question("Where did you study?", 1));
        output.add(new Question("What entity of Accenture will you join?", 5));
        output.add(new Question("What is your preferred language?", 5));
        output.add(new Question("Cats or dogs?", 0.25));
        output.add(new Question("Tea or coffee?", 0.25));
        output.add(new Question("Extrovert or introvert?", 0.25));
        output.add(new Question("Think before you talk or talk before you think", 1));

        for(Person person : people)
        {
            for(int i = 0; i < output.size(); i++)
            {
                Question question = output.get(i);

                if(question.getQuestion().contains("or"))
                    person.addQuestionAndAnswer(output.get(i), Math.abs(((person.getEnterpriseId().hashCode() * i) % 2)) + "");
                else
                    person.addQuestionAndAnswer(output.get(i), Math.abs((person.getEnterpriseId().hashCode() % (i + 1))) + "");
            }
        }
        return output;
    }
}

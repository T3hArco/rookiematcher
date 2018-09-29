/*
 * Copyright Arnaud Coel (c) 2018.
 * Licensed by https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package me.arco.rookiematcher;

import me.arco.rookiematcher.controller.MainController;
import me.arco.rookiematcher.dummy.DummyPersonProvider;
import me.arco.rookiematcher.dummy.DummyQuestionAndAnswerProvider;
import me.arco.rookiematcher.model.Comparison;
import me.arco.rookiematcher.model.Person;
import me.arco.rookiematcher.model.Question;
import me.arco.rookiematcher.processing.Matcher;
import me.arco.rookiematcher.view.Main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Map;

public class Runner
{
    private ArrayList<Question> questions;

    public static void main(String[] args)
    {
        ArrayList<Person> dummies = DummyPersonProvider.provide();

        DummyQuestionAndAnswerProvider.provide(dummies);

        /*for(Person dummy : dummies)
        {
            System.out.println(dummy.getEnterpriseId());

            for(Map.Entry<Question, String> rookieQuestionEntry : dummy.getQuestionAndAnswers().entrySet())
            {
                System.out.printf("%s (%s)\n", rookieQuestionEntry.getKey(), rookieQuestionEntry.getValue());
            }

            System.out.println();
        }*/

        Matcher matcher = new Matcher(dummies);

        for(Comparison comparison : matcher.compare())
        {
            System.out.println(comparison);
        }

        new MainController();
    }
}

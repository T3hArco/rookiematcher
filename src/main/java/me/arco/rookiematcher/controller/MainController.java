/*
 * Copyright Arnaud Coel (c) 2018.
 * Licensed by https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package me.arco.rookiematcher.controller;

import me.arco.rookiematcher.view.Main;

import javax.swing.*;

public class MainController
{
    public MainController()
    {
        init();
    }

    private void init()
    {
        JFrame frame = new JFrame("Rookies Matcher");
        frame.setContentPane(new Main().mainView);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

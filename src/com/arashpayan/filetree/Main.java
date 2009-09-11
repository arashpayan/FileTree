/* This file is part of FileTree.

    FileTree is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License (or the Lesser GPL)
    as published by the Free Software Foundation; either version 3 of the
    License, or (at your option) any later version.

    FileTree is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
 */
/*
 * Main.java
 *
 * Created on August 1, 2007, 4:32 PM
 * Copyright 2007 Arash Payan
 */

package com.arashpayan.filetree;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author Arash Payan (http://www.arashpayan.com)
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Container container = jframe.getContentPane();
        container.setLayout(new BorderLayout());
        FileTree fileTree = new FileTree();
        fileTree.setShowHiddenFiles(false);
        fileTree.setDeleteEnabled(true);
        JScrollPane scrollPane = new JScrollPane(fileTree);
        container.add(scrollPane, BorderLayout.CENTER);
        jframe.setSize(400, 500);
        jframe.setLocationByPlatform(true);
        jframe.setVisible(true);
    }
    
}

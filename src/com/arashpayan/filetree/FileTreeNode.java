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
 * FileTreeNode.java
 *
 * Created on August 4, 2007, 4:47 PM
 * Copyright 2007 Arash Payan
 */

package com.arashpayan.filetree;

import java.io.File;

/**
 * A class used for representations of <code>File</code> objects in the
 * <code>FileTree</code>.
 * @author Arash Payan (http://www.arashpayan.com)
 */
public class FileTreeNode {
    
    /**
     * Creates a new instance of FileTreeNode
     * @param file The <code>File</code> that will be represented by this class.
     */
    public FileTreeNode(File file) {
        if (file == null)
            throw new IllegalArgumentException("Null file not allowed");

        this.file = file;
    }

    /**
     * returns the representation of this <code>File</code> best suited for use in
     * the <code>FileTree</code>.
     * @return the representation of this <code>File</code> as a <code>String</code>
     */
    public String toString() {
        String name = file.getName();
        if (!Constants.isWindows)
            return name;

        if (name.length() == 0)
            return file.getPath();

        if (Constants.isVista)
        {
            if (name.equals(WINDOWS_MYCOMPUTER))
                return "Computer";
            if (name.equals(WINDOWSVISTA_NETWORK))
                return "Network";
            return name;
        }

        // the Windows XP and 2K case
        if (name.equals(WINDOWS_MYCOMPUTER))
            return "My Computer";
        if (name.equals(WINDOWS_MYNETWORKPLACES))
            return "My Network Places";

        return name;
    }

    /**
     * the object being represented
     */
    public File file;
    /**
     * the hex string that represents 'My Computer' in Windows
     */
    public static final String WINDOWS_MYCOMPUTER = "::{20D04FE0-3AEA-1069-A2D8-08002B30309D}";
    /**
     * the hex string that represents 'My Network Places' in Win2k and XP
     */
    public static final String WINDOWS_MYNETWORKPLACES = "::{208D2C60-3AEA-1069-A2D7-08002B30309D}";
    /**
     * the hex string that represents 'Network' in Vista
     */
    public static final String WINDOWSVISTA_NETWORK = "::{F02C1A0D-BE21-4350-88B0-7367FC96EF3C}";
    
}

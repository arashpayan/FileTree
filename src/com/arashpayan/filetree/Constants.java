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
 * Constants.java
 *
 * Created on August 4, 2007, 4:49 PM
 * Copyright 2007 Arash Payan
 */

package com.arashpayan.filetree;

/**
 * some handy constants that can be used throughout the program
 * @author Arash Payan (http://www.arashpayan.com)
 */
public class Constants {
    /**
     * the name of the OS as given by the Java system property "os.name"
     */
    public final static String osname = System.getProperty("os.name");
    /**
     * true if the program is running on OS X
     */
    public final static boolean isOSX = osname.equalsIgnoreCase("Mac OS X");
    /**
     * true if the program is running on Linux
     */
    public final static boolean isLinux = osname.equalsIgnoreCase("Linux");
    /**
     * true if the program is running on Solaris
     */
    public final static boolean isSolaris = osname.equalsIgnoreCase("SunOS");
    /**
     * true if the program is running on Windows Vista
     */
    public final static boolean isVista = osname.equalsIgnoreCase("Windows Vista");
    /**
     * true if the program is running on Windows
     */
    public final static boolean isWindows = !(isOSX || isLinux || isSolaris);
}

package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //In this class we will implement the repeated steps of reading
    // from configuration.properties file

    //#1- Create the object of Properties

    private static Properties properties = new Properties();

    static {

        try {

            //#2- Get the path and open the file
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");

            //#3- Load the opened file into properties object
            properties.load(fileInputStream);

            //closing the file in JVM Memory
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //#4- Use the object to read from the configuration.properties file
    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }


}

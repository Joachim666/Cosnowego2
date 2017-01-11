package com.company;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Files;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-10.
 */
public class CSV {
    public static void saveArraytoSCV(Integer[][] data, String filePath){

        List<String> stringList= new ArrayList<>();

        for (int i = 0; i <data.length ; i++) {
            Integer []row = data[i];
            String text= Joiner.on(",").join(row);
            stringList.add(text);
        }



        File file = new File(filePath);

        try {
            for (String line : stringList) {


                Files.append(line+System.lineSeparator(), file, Charsets.UTF_8);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

package com.company;

import org.apache.commons.mail.EmailException;

public class Main {

    public static void main(String[] args) throws EmailException {

        Integer [][] data = new Integer[][]{{1,2},{3,4}};

        CSV.saveArraytoSCV(data,"test.csv");
        MailSender.sendMain("javandwro1@gmail.com","Hello bro","To ja:)");

    }
}

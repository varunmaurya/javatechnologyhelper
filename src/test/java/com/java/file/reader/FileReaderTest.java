package com.java.file.reader;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Varun Maurya on 3/13/2017.
 */
public class FileReaderTest {
    @Autowired
    private static FileReader fileReader;

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        reader.read();
    }
}

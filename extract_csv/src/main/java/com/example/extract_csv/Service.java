package com.example.extract_csv;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Scanner;

@Component
public class Service {

    public void sayHello() throws IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("TNVDR_To_ACA.csv").getFile());
        InputStream inputStream = new FileInputStream(file);
        StringBuilder resultStringBuilder = new StringBuilder();

        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        finally {
            inputStream.close();
        }
        System.out.println(resultStringBuilder);
    }

}

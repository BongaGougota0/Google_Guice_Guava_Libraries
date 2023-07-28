package org.example.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Util
{
    public static void readFile(String filename) throws IOException
    {
        Reader reader = null;
        String[] headers = {"DataType","SystemName","EventDate"
                ,"TransactionNumber","CustomerID","CustomerName"
                ,"TransactionDate","ProductCode","Amount"};

        reader = new FileReader("src/main/resources/" + filename);

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(headers)
                .setSkipHeaderRecord(true).build();

        Iterable<CSVRecord> csvRecordIterable = csvFormat.parse(reader);

        for(CSVRecord record : csvRecordIterable)
        {
            System.out.println("Amount Record :" + record.get("Amount"));
        }

    }
}

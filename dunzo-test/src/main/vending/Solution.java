package main.vending;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.ir.debug.ClassHistogramElement;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

public class Solution {

    public static void main(String[] args) {
        final String path = "";
        //URL url = new URL(path);
        try {
            /*HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("content-type", "application/json");
            InputStream is = connection.getInputStream();
*/
            String str = "{\n" +
                    "    \"outlets\": {\n" +
                    "      \"count\": 3\n" +
                    "    },\n" +
                    "    \"quantity\": {\n" +
                    "      \"water\": 500,\n" +
                    "      \"milk\": 500,\n" +
                    "      \"tea\": 100,\n" +
                    "      \"sugar\": 100,\n" +
                    "      \"coffee\": 100\n" +
                    "    },\n" +
                    "    \"beverages\": {\n" +
                    "      \"hotTea\": {\n" +
                    "        \"water\": 200,\n" +
                    "        \"milk\": 100,\n" +
                    "        \"sugar\": 10,\n" +
                    "        \"tea\": 30\n" +
                    "      },\n" +
                    "      \"greenTea\": {\n" +
                    "        \"water\": 100,\n" +
                    "        \"sugar\": 50,\n" +
                    "        \"tea\": 30\n" +
                    "      }\n" +
                    "    }\n" +
                    "}";
            InputStream inputStream = new ByteArrayInputStream(str.getBytes());


            Machine machine = new ObjectMapper().readValue(inputStream, Machine.class);
            System.out.println(machine);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

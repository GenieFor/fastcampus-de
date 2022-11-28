package com.fastcampus.de.clip12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourceStatement {

    public static void main(String[] args) throws IOException {

        /* 기존방식 */
        FileOutputStream out1 = new FileOutputStream("test1.txt");
        try {
            out1.write("Hello World!".getBytes(StandardCharsets.UTF_8));
            out1.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out1.close();

        /*
            try with resource 방식
            try with resource는 resource 방식이 AutoClose를 포함하고 있는 경우에만 사용가능
         */
        try (FileOutputStream out = new FileOutputStream("test.txt"))
        {
            out.write("Hello World!".getBytes(StandardCharsets.UTF_8));
            out.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.fastcampus.de.clip12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        try
        {
            if (FileValidator.validate(path))
            {
                System.out.println("File " + path + " exists.");
            }
            else
            {
                System.out.println("File" + path + " doesn't exists");
            }
        }
        catch (IllegalPathAccessError illegalPathAccessError)
        {
            System.out.println(illegalPathAccessError.getMessage());
            illegalPathAccessError.printStackTrace();
            System.out.println("Program is forced to quit.");
            System.exit(1);
        }
    }
}

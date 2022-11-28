package com.fastcampus.de.clip12;

import java.io.File;

public class FileValidator {

    public static boolean validate(String path) throws IllegalPathAccessError
    {
        if (path.startsWith("/Users/"))
        {
            // success
            File file = new File(path);
            return file.exists();
        }
        else
        {
            throw new IllegalPathAccessError(path);
        }
    }
}

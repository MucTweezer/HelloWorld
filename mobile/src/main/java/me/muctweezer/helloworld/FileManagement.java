package me.muctweezer.helloworld

import java.io.*;

private static final String FILENAME = "temp.txt";

public class FileManagement {

    public static void saveFile() {
        String data = "Oh my gosh.";
        FileOutputStream outputStream;
        
        try {
            deleteFile();
            
            outputStream = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            outputStream.write(data.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private File getFile() {
        File myFile = new File(context.getFilesDir(), FILENAME);
        return myFile;
    }
    
    public static void deleteFile() {
        if fileExists() {
            getFile().delete();
        }
    }
    
    private boolean fileExists() {
        return getFile().exists();
    }
}

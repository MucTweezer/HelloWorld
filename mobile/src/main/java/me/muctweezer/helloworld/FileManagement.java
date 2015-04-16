package me.muctweezer.helloworld

import java.io.*;

private static final String FILENAME = "temp.txt";

public class FileManagement {

    public static void saveFile() {
        String data = "Oh my gosh.";
        FileOutputStream outputStream;
        
        try {
            if fileExists() {
                deleteFile();
            }
            
            outputStream = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            outputStream.write(data.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void openFile() {
    }
    
    public static void deleteFile() {
    }
    
    private boolean fileExists() {
    }
}

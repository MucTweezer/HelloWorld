/*
 * Testing out the saving, deleting, and opening of a single file.
 * I have opted to use a bunch of static methods and filename to test out a system with only a single file.
 * (Perhaps using static methods was not going to work after all. I guess I'm going to make this more of a helper class.
 * MainActivity is going to have to create an instance of this on startup and keep that instance.
 * Presumably, I would use this for persistent non-temporary data storage for an app.
 * All data would be stored in the single file, which would be recreated upon each save (not appended).
 */
 
package me.muctweezer.helloworld;

import android.content.Context;
import java.io.*;

public class FileManagement {
    private final String FILENAME = "temp.txt";
    private String myData = "oh my gosh";
    private Context myContext;
    private File myFile;

    public FileManagement(Context tempContext) {
        myContext = tempContext;
        myFile = new File(myContext.getFilesDir(), FILENAME);
    }

    public void saveFile() {
        FileOutputStream outputStream;
        
        try {
            deleteFile();
            
            outputStream = myContext.openFileOutput(FILENAME, Context.MODE_PRIVATE);
            outputStream.write(myData.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private File getFile() {
        File myFile = new File(myContext.getFilesDir(), FILENAME);
        return myFile;
    }
    
    public void deleteFile() {
        if(fileExists()) {
            myFile.delete();
        }
    }
    
    private boolean fileExists() {
        return myFile.exists();
    }
    
    public String getData() {
        return myData;
    }
    public void setData(String tempString) {
        myData = tempString;
    }
}

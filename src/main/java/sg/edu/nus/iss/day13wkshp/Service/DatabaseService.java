package sg.edu.nus.iss.day13wkshp.Service;

import java.io.*;
import java.nio.file.*;
import java.nio.file.Path;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
    
    private File dataDir = new File("some directory");


    public File getDataDir() {
        return this.dataDir;
    }

    public void setDataDir(File dataDir) {
        this.dataDir = dataDir;
    }

    // /Users/<username/data
    // /home/data
    public boolean isDataDirValid() {
        return dataDir.exists() && dataDir.isDirectory() && dataDir.canWrite();
    }
    
}

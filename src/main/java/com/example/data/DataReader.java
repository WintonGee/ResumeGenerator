package com.example.data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public List<String> readData(String directory) throws IOException {
        List<String> data = new ArrayList<>();
        Files.list(Paths.get(directory)).forEach(filePath -> {
            if (Files.isRegularFile(filePath)) {
                try {
                    data.addAll(Files.readAllLines(filePath));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        return data;
    }

    public List<String> readExperienceData() throws IOException {
        return readData("data/experience");
    }

    public List<String> readProjectData() throws IOException {
        return readData("data/project");
    }
}

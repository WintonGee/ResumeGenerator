package com.example.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ExperienceGenerator {
    public String generateExperience(List<String> filePaths) throws IOException {
        List<String> experienceLines = new ArrayList<>();
        for (String filePath : filePaths) {
            experienceLines.addAll(Files.readAllLines(Paths.get(filePath)));
        }

        StringBuilder experienceSection = new StringBuilder("\\section*{Experience}\n");
        for (String line : experienceLines) {
            experienceSection.append(line).append(" \\\\\n");
        }
        return experienceSection.toString();
    }
}

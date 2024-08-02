package com.example.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProjectsGenerator {
    public String generateProjects(List<String> filePaths) throws IOException {
        List<String> projectsLines = new ArrayList<>();
        for (String filePath : filePaths) {
            projectsLines.addAll(Files.readAllLines(Paths.get(filePath)));
        }

        StringBuilder projectsSection = new StringBuilder("\\section*{Programming Projects}\n");
        for (String line : projectsLines) {
            projectsSection.append(line).append(" \\\\\n");
        }
        return projectsSection.toString();
    }
}

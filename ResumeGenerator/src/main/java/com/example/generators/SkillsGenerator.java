package com.example.generators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SkillsGenerator {
    public String generateSkills(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        StringBuilder skillsSection = new StringBuilder("\\section*{Skills}\n");
        for (String line : lines) {
            skillsSection.append(line).append(" \\\\\n");
        }
        return skillsSection.toString();
    }
}

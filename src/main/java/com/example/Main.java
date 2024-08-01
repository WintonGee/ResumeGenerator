package com.example;

import com.example.data.DataReader;
import com.example.data.WebContentReader;
import com.example.data.WordFrequencyAnalyzer;
import com.example.generators.HeaderGenerator;
import com.example.generators.ResumeGenerator;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // URL to fetch content from
        String url = "https://example.com"; // Replace with the target URL
        String outputFilePath = "word_frequencies.txt";

        WebContentReader reader = new WebContentReader();
        WordFrequencyAnalyzer analyzer = new WordFrequencyAnalyzer();
        DataReader dataReader = new DataReader();

        try {
            // Fetch words from URL
            List<String> words = reader.fetchWordsFromUrl(url);

            // Count word frequencies
            Map<String, Integer> wordCount = analyzer.countWordFrequencies(words);

            // Sort word frequencies
            List<Map.Entry<String, Integer>> sortedEntries = analyzer.sortWordFrequencies(wordCount);

            // Write sorted word frequencies to file
            analyzer.writeWordFrequenciesToFile(sortedEntries, outputFilePath);

            System.out.println("Word frequencies written to " + outputFilePath);

            // Read experience and project data
            List<String> experienceData = dataReader.readExperienceData();
            List<String> projectData = dataReader.readProjectData();

            // Print read data (for testing purposes)
            System.out.println("Experience Data: " + experienceData);
            System.out.println("Project Data: " + projectData);

            // User data for the header
            String name = "Winton Gee";
            String email = "wintongee@gmail.com";
            String phone = "415-806-3004";
            String linkedin = "https://www.linkedin.com/in/wintongee/";
            String website = "https://wintongee.com";
            String github = "https://github.com/wintongee";

            // Generate the header
            HeaderGenerator headerGenerator = new HeaderGenerator();
            String header = headerGenerator.generateHeader(name, email, phone, linkedin, website, github);

            // Generate the full resume
            ResumeGenerator resumeGenerator = new ResumeGenerator();
            String pdfPath = resumeGenerator.generateResume(header);

            // Output the path to the generated PDF
            System.out.println("Generated resume: " + pdfPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

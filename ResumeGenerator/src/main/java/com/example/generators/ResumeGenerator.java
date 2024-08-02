package com.example.generators;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ResumeGenerator {
    
    // Escape special characters in LaTeX
    private String escapeLaTeX(String content) {
        return content.replace("\\", "\\textbackslash{}")
                      .replace("#", "\\#")
                      .replace("$", "\\$")
                      .replace("%", "\\%")
                      .replace("&", "\\&")
                      .replace("_", "\\_")
                      .replace("{", "\\{")
                      .replace("}", "\\}")
                      .replace("~", "\\textasciitilde{}")
                      .replace("^", "\\textasciicircum{}");
    }

    // Generate the header section of the resume
    private String generateHeader(Map<String, String> headerData) {
        return "\\begin{center}\n" +
                "    \\textbf{\\Large " + escapeLaTeX(headerData.get("Name")) + "} \\\\\n" +
                "    \\vspace{5pt}\n" +
                "    \\href{mailto:" + escapeLaTeX(headerData.get("Email")) + "}{" + escapeLaTeX(headerData.get("Email")) + "} | " +
                escapeLaTeX(headerData.get("Phone")) + " | " +
                "\\href{" + escapeLaTeX(headerData.get("LinkedIn")) + "}{" + escapeLaTeX(headerData.get("LinkedIn")) + "} | " +
                "\\href{" + escapeLaTeX(headerData.get("Website")) + "}{" + escapeLaTeX(headerData.get("Website")) + "} | " +
                "\\href{" + escapeLaTeX(headerData.get("GitHub")) + "}{" + escapeLaTeX(headerData.get("GitHub")) + "}\n" +
                "\\end{center}\n";
    }

    // Generate a LaTeX section
    private String generateSection(String title, String content) {
        return "\\section*{" + escapeLaTeX(title) + "}\n" + escapeLaTeX(content) + "\n";
    }

    // Main method to generate the resume
    public void generateResume(Map<String, String> headerData, String education, String experience, String projects, String skills) throws IOException {
        String resumeContent = "\\documentclass[a4paper,10pt]{article}\n" +
                "\\usepackage[margin=0.5in]{geometry}\n" +
                "\\usepackage{hyperref}\n" +
                "\\usepackage{enumitem}\n" +
                "\\usepackage{parskip}\n" +
                "\\begin{document}\n" +
                "\\pagenumbering{gobble}\n" +
                generateHeader(headerData) +
                generateSection("Education", education) +
                generateSection("Experience", experience) +
                generateSection("Programming Projects", projects) +
                generateSection("Skills", skills) +
                "\\end{document}\n";

        // Write the LaTeX document to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output/resume.tex"))) {
            writer.write(resumeContent);
        }
    }
}

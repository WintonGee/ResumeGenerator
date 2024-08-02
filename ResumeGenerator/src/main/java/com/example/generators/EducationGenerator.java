package com.example.generators;

public class EducationGenerator {

    private static final String INSTITUTION = "California Polytechnic State University";
    private static final String DEGREE = "Bachelor of Science Degree in \\textbf{Computer Science}";
    private static final String LOCATION = "San Luis Obispo, CA";
    private static final String DATES = "June 2024";

    public String generateEducation() {
        StringBuilder education = new StringBuilder();

        education.append("\\section*{Education}\n")
                 .append("\\vspace{-18pt}\n")  // Adjust space above the line
                 .append("\\noindent\\rule{\\textwidth}{0.4pt}\n")
                 .append("\\vspace{5pt}\n")  // Adjust space below the line
                 .append("\\begin{tabularx}{\\textwidth}{@{}lXr@{}}\n")
                 .append("\\textbf{").append(INSTITUTION).append("} & & ").append(LOCATION).append(" \\\\\n")
                 .append(DEGREE).append(" & & ").append(DATES).append("\n")
                 .append("\\end{tabularx}\n");

        return education.toString();
    }
}

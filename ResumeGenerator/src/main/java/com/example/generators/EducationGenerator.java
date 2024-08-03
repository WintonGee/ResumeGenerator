package com.example.generators;

import com.example.util.LatexUtils;

public class EducationGenerator {

    private static final String INSTITUTION = "California Polytechnic State University";
    private static final String DEGREE = "Bachelor of Science Degree in \\textbf{Computer Science}";
    private static final String LOCATION = "San Luis Obispo, CA";
    private static final String DATES = "June 2024";

    public String generateEducation() {
        StringBuilder education = new StringBuilder();

        education.append(LatexUtils.generateSectionHeader("Education"))
                 .append("\\begin{tabularx}{\\textwidth}{@{}lXr@{}}\n")
                 .append("\\textbf{").append(INSTITUTION).append("} & & ").append(LOCATION).append(" \\\\\n")
                 .append(DEGREE).append(" & & ").append(DATES).append("\n")
                 .append("\\end{tabularx}\n");

        return education.toString();
    }
}

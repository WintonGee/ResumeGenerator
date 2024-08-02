package com.example;

import com.example.generators.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        HeaderGenerator headerGenerator = new HeaderGenerator();
        EducationGenerator educationGenerator = new EducationGenerator();
        String header = headerGenerator.generateHeader();
        String education = educationGenerator.generateEducation();

        StringBuilder resumeContent = new StringBuilder();
        resumeContent.append("\\documentclass[a4paper,10pt]{article}\n")
                     .append("\\usepackage[margin=0.5in]{geometry}\n")
                     .append("\\usepackage{hyperref}\n")
                     .append("\\usepackage[utf8]{inputenc}\n")
                     .append("\\usepackage{tabularx}\n")
                     .append("\\usepackage{array}\n")
                     .append("\\hypersetup{\n")
                     .append("    colorlinks=true,\n")
                     .append("    linkcolor=blue,\n")
                     .append("    filecolor=blue,\n")
                     .append("    urlcolor=blue,\n")
                     .append("}\n")
                     .append("\\begin{document}\n")
                     .append(header)
                     .append(education)
                     .append("\\end{document}\n");

        try {
            Files.write(Paths.get("output/resume.tex"), resumeContent.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Process process = Runtime.getRuntime().exec("pdflatex -output-directory=output output/resume.tex");
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

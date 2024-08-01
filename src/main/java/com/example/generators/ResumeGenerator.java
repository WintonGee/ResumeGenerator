package com.example.generators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResumeGenerator {
    private static final String OUTPUT_DIRECTORY = "output";
    private static final String OUTPUT_PATH = OUTPUT_DIRECTORY + "/resume.tex";

    public String generateResume(String header) {
        // Create the output directory if it doesn't exist
        File outputDir = new File(OUTPUT_DIRECTORY);
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        // Create the full LaTeX document with the generated header
        String latexDocument = "\\documentclass[a4paper,10pt]{article}\n" +
                "\\usepackage[margin=0.5in]{geometry}\n" +
                "\\usepackage{hyperref}\n" +
                "\\begin{document}\n" +
                header +
                "\\end{document}";

        // Write the LaTeX document to a .tex file
        writeFile(OUTPUT_PATH, latexDocument);

        // Compile the .tex file to PDF
        compileLatexToPdf(OUTPUT_PATH);

        return OUTPUT_DIRECTORY + "/resume.pdf";
    }

    private void writeFile(String path, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void compileLatexToPdf(String texFilePath) {
        try {
            Process process = Runtime.getRuntime()
                    .exec("pdflatex -output-directory=" + OUTPUT_DIRECTORY + " " + texFilePath);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

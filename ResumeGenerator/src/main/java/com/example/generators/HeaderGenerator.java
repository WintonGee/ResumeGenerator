package com.example.generators;

public class HeaderGenerator {
    public String generateHeader() {
        String name = "Winton Gee";
        String email = "wintongee@gmail.com";
        String phone = "415-806-3004";
        String linkedIn = "linkedin.com/in/wintongee";
        String website = "wintongee.com";
        String gitHub = "github.com/wintongee";

        return String.format(
                "\\begin{center}\n" +
                "    \\textbf{\\Large %s} \\\\\n" +
                "    \\vspace{5pt}\n" +
                "    \\href{mailto:%s}{%s} \\textbar{} %s \\textbar{} \\href{https://%s}{%s} \\textbar{} \\href{https://%s}{%s} \\textbar{} \\href{https://%s}{%s}\n" +
                "\\end{center}\n",
                name,
                email, email, phone,
                linkedIn, linkedIn,
                website, website,
                gitHub, gitHub
        );
    }
}

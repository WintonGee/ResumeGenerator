package generator;

public class HeaderGenerator {
    public String generateHeader(String name, String email, String phone, String linkedin, String website, String github) {
        return "\\begin{center}\n" +
               "    \\textbf{\\Large " + name + "} \\\\\n" +
               "    \\href{mailto:" + email + "}{" + email + "} | " + phone + " | " +
               "\\href{" + linkedin + "}{" + linkedin + "} | " +
               "\\href{" + website + "}{" + website + "} | " +
               "\\href{" + github + "}{" + github + "}\n" +
               "\\end{center}\n";
    }
}

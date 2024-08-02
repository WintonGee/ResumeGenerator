import generator.*;

public class Main {
    public static void main(String[] args) {
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
    }
}

package com.example.generators;

import com.example.data.Experience;
import java.util.List;

import com.example.util.LatexUtils;

public class ExperienceGenerator {

    private List < Experience > experiences;

    public ExperienceGenerator(List < Experience > experiences) {
        this.experiences = experiences;
    }

    public String generateExperience() {
        StringBuilder experienceSection = new StringBuilder();
        experienceSection.append(LatexUtils.generateSectionHeader("Experience"));
        

        for (Experience experience : experiences) {
            experienceSection.append(formatExperience(experience));
        }

        return experienceSection.toString();
    }

    private String formatExperience(Experience experience) {
        StringBuilder experienceEntry = new StringBuilder();
        experienceEntry.append("\\begin{tabularx}{\\textwidth}{ l X r }\n")
                .append(formatExperienceHeader(experience))
                .append("\\end{tabularx}\n")
                .append("\\begin{itemize}[leftmargin=*,label=\\textbullet]\n");

        for (String responsibility : experience.getResponsibilities()) {
            experienceEntry.append(formatResponsibility(responsibility));
        }

        experienceEntry.append("\\end{itemize}\n")
                .append("\\vspace{10pt}\n");

        return experienceEntry.toString();
    }

    private String formatExperienceHeader(Experience experience) {
        return String.format("\\textbf{%s} & \\centering \\textbf{%s} & \\textbf{%s} \\\\\n",
                experience.getTitle(), experience.getCompany(), experience.getDate());
    }

    private String formatResponsibility(String responsibility) {
        return String.format("  \\item %s\n", responsibility);
    }
}
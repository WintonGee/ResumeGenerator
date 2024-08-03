package com.example.generators;

import com.example.data.Project;
import com.example.util.LatexUtils;

import java.util.List;

public class ProjectsGenerator {

    private List<Project> projects;

    public ProjectsGenerator(List<Project> projects) {
        this.projects = projects;
    }

    public String generateProjects() {
        StringBuilder projectSection = new StringBuilder();
        projectSection.append(LatexUtils.generateSectionHeader("Projects"));

        for (Project project : projects) {
            projectSection.append("\\textbf{").append(LatexUtils.latexify(project.getName())).append("} (").append(LatexUtils.latexify(project.getKeywordDescription())).append(") \\\\\n")
                          .append("\\begin{itemize}[leftmargin=*,label=\\textbullet]\n");
            for (String detail : project.getDetails()) {
                projectSection.append("  \\item ").append(LatexUtils.latexify(detail)).append("\n");
            }
            projectSection.append("\\end{itemize}\n")
                          .append("\\vspace{10pt}\n");
        }

        return projectSection.toString();
    }
}

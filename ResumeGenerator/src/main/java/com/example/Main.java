package com.example;

import com.example.generators.*;
import com.example.data.Experience;
import com.example.data.Project;
import com.example.data.Skills;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HeaderGenerator headerGenerator = new HeaderGenerator();
        EducationGenerator educationGenerator = new EducationGenerator();
        ExperienceGenerator experienceGenerator = createExperienceGenerator();
        ProjectsGenerator projectsGenerator = createProjectsGenerator();
        SkillsGenerator skillsGenerator = createSkillsGenerator();

        ResumeGenerator resumeGenerator = new ResumeGenerator(headerGenerator, educationGenerator, experienceGenerator, projectsGenerator, skillsGenerator);
        resumeGenerator.generateResume();
    }

    private static ExperienceGenerator createExperienceGenerator() {
        List<Experience> experiences = new ArrayList<>();
        Experience exp1 = new Experience("Software Engineering Intern", "Ricoh USA", "June 2023 - September 2023");
        exp1.addResponsibility("Deployed 8 Python-based Lambda functions on AWS Lambda as part of the Microservices team");
        exp1.addResponsibility("Ensured quality through leveraging Postman for API testing and comparing test results across NoSQL servers");
        exp1.addResponsibility("Followed the instructions and expectations for each Lambda function as specified on Azure DevOps");

        Experience exp2 = new Experience("Software Engineering Intern", "ListIt", "April 2023 - June 2023");
        exp2.addResponsibility("Collaborated with a team of 5 classmates to deliver an intuitive todo list web app within 3 sprints");
        exp2.addResponsibility("Achieved 100% test coverage across 57 JavaScript functions using JEST in a Full Stack project");
        exp2.addResponsibility("Implemented continuous integration, ESLint, and Prettier for code consistency and reduced merge errors");

        Experience exp3 = new Experience("Software Engineer Intern", "Tribot", "March 2020 - August 2022");
        exp3.addResponsibility("Utilized Tribot Java Script SDK to automate character progression and resource collection on 200 activities and 70 quests in an MMORPG game");
        exp3.addResponsibility("Released 4 free software automation products to attract 250 users for private custom automation projects");
        exp3.addResponsibility("Collaborated with customers to develop 5 successful custom projects, continually improving processes by incorporating new ideas and solving previously unaccounted problems");
        exp3.addResponsibility("Devoted 3000 hours to rewriting code on free products to improve resource efficiency and organization, while continuously exploring new tools such as React, MongoDB, and OpenAI");

        experiences.add(exp1);
        experiences.add(exp2);
        experiences.add(exp3);

        return new ExperienceGenerator(experiences);
    }

    private static ProjectsGenerator createProjectsGenerator() {
        List<Project> projects = new ArrayList<>();
        Project proj1 = new Project("PantryCraft");
        proj1.addKeyword("JavaScript", "HTML/CSS", "Python", "SQL");
        proj1.addDetail("Created a Full Stack food recipe generation website that creates recipes based on user-input ingredients");
        proj1.addDetail("Incorporated 3 machine learning tools: OpenAI to dynamically generate recipes and Computer Vision with Optical Character Recognition for simplified ingredient inputs through receipt scanning");
        proj1.addDetail("Leveraged 3 key components: React for a dynamic frontend, Express for a robust backend, and MongoDB for storing generated recipes and user ingredient inputs in JSON format");

        Project proj2 = new Project("Cryptocurrency Trading Bot");
        proj2.addKeyword("Java");
        proj2.addDetail("Developed an application to profit through trading cryptocurrencies through identifying market trends");
        proj2.addDetail("Applied 6 technical trading indicators, moving averages, Bollinger bands, RSI, MACD, Fibonacci retracement, and Stochastic oscillator to determine trade decisions");
        proj2.addDetail("Stored and utilized 5 years of past data on trade volumes and prices using Binance API and Gson API");

        Project proj3 = new Project("Hotel Reservation System");
        proj3.addKeyword("SQL", "Java");
        proj3.addDetail("Built an application to manage the SQL database of a hotel reservation system containing sample data of 10,000 reservations");
        proj3.addDetail("Generated 5 personalized reservation options based on preferred room type and desired dates of stay");
        proj3.addDetail("Incorporated error handling to ensure accurate reservations by validating date ranges and room availability");

        projects.add(proj1);
        projects.add(proj2);
        projects.add(proj3);

        return new ProjectsGenerator(projects);
    }

    private static SkillsGenerator createSkillsGenerator() {
        Skills skills = new Skills();
        skills.addProgrammingLanguage("Java", "Python", "JavaScript", "SQL", "C++", "C", "Scala", "HTML/CSS", "Assembly", "C#");
        skills.addTool("Git", "Linux", "MongoDB", "JSON", "OpenAI", "Computer Vision", "Spark", "REST API", "React", "Express");

        return new SkillsGenerator(skills);
    }
}

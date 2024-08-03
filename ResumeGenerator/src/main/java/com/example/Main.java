package com.example;

import com.example.generators.*;
import com.example.data.Experience;
import com.example.data.Project;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HeaderGenerator headerGenerator = new HeaderGenerator();
        EducationGenerator educationGenerator = new EducationGenerator();
        ExperienceGenerator experienceGenerator = createExperienceGenerator();
        ProjectsGenerator projectsGenerator = createProjectsGenerator();

        ResumeGenerator resumeGenerator = new ResumeGenerator(headerGenerator, educationGenerator, experienceGenerator, projectsGenerator);
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

        experiences.add(exp1);
        experiences.add(exp2);

        return new ExperienceGenerator(experiences);
    }

    private static ProjectsGenerator createProjectsGenerator() {
        List<Project> projects = new ArrayList<>();

        Project proj1 = new Project("PantryCraft, Senior Project", "JavaScript, HTML/CSS, Python, SQL");
        proj1.addDetail("Created a Full Stack food recipe generation website that creates recipes based on user-input ingredients");
        proj1.addDetail("Incorporated 3 machine learning tools: OpenAI to dynamically generate recipes and Computer Vision with Optical Character Recognition for simplified ingredient inputs through receipt scanning");
        proj1.addDetail("Leveraged 3 key components: React for a dynamic frontend, Express for a robust backend, and MongoDB for storing generated recipes and user ingredient inputs in JSON format");

        Project proj2 = new Project("Cryptocurrency Trading Bot, Personal Project", "Java");
        proj2.addDetail("Developed an application to profit through trading cryptocurrencies through identifying market trends");
        proj2.addDetail("Applied 6 technical trading indicators, moving averages, Bollinger bands, RSI, MACD, Fibonacci retracement, and Stochastic oscillator to determine trade decisions");
        proj2.addDetail("Stored and utilized 5 years of past data on trade volumes and prices using Binance API and Gson API");

        Project proj3 = new Project("Hotel Reservation System, Databases Final Project", "SQL, Java");
        proj3.addDetail("Built an application to manage the SQL database of a hotel reservation system containing sample data of 10,000 reservations");
        proj3.addDetail("Generated 5 personalized reservation options based on preferred room type and desired dates of stay");
        proj3.addDetail("Incorporated error handling to ensure accurate reservations by validating date ranges and room availability");

        projects.add(proj1);
        projects.add(proj2);
        projects.add(proj3);

        return new ProjectsGenerator(projects);
    }
}

package com.example.initializers;

import com.example.data.Experience;
import java.util.ArrayList;
import java.util.List;

public class ExperienceInitializer {
    public static List<Experience> initializeExperiences() {
        List<Experience> experiences = new ArrayList<>();
        Experience exp1 = new Experience("Software Engineering Intern", "Ricoh USA", "June 2023 - September 2023");
        exp1.addResponsibility("Deployed 8 Python-based Lambda functions on AWS Lambda, increasing scalability by 40%");
        exp1.addResponsibility("Ensured 99.9% uptime by leveraging Postman for API testing and resolving NoSQL server discrepancies");
        exp1.addResponsibility("Improved deployment speed by 20% by adhering to Azure DevOps guidelines");

        Experience exp2 = new Experience("Software Engineering Intern", "ListIt", "April 2023 - June 2023");
        exp2.addResponsibility("Collaborated with a team of 5 to develop a todo list web app, delivering 3 sprints on time");
        exp2.addResponsibility("Achieved 100% test coverage across 57 JavaScript functions using JEST");
        exp2.addResponsibility("Reduced merge errors by 50% by implementing CI, ESLint, and Prettier");

        Experience exp3 = new Experience("Software Engineer Intern", "Tribot", "March 2020 - August 2022");
        exp3.addResponsibility("Automated character progression and resource collection in an MMORPG game, enhancing user experience");
        exp3.addResponsibility("Attracted 250 users by releasing 4 free software automation products");
        exp3.addResponsibility("Improved resource efficiency and organization by rewriting code on free products, exploring new tools like React, MongoDB, and OpenAI");

        experiences.add(exp1);
        experiences.add(exp2);
        experiences.add(exp3);

        return experiences;
    }
}

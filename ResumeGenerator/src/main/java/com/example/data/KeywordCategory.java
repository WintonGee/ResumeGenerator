package com.example.data;

import java.util.*;

public enum KeywordCategory {

    PROGRAMMING_LANGUAGES("C", "C#", "C++", "Java", "JavaScript", "Python", "Ruby", "Scala", "Kotlin", "Go", "PHP", "Swift", "TypeScript", "Rust", "Perl"),

    FRONTEND_FRAMEWORKS("React", "Angular", "Vue.js", "Next.js", "Nuxt.js", "Svelte", "Backbone.js", "Bootstrap", "Tailwind CSS", "Material-UI", "Chakra UI", "Ant Design"),

    BACKEND_FRAMEWORKS("Spring", "Spring Boot", "Django", "Flask", "Ruby on Rails", "Express.js", "ASP.NET", "Hibernate", "Node.js", "Koa", "Gin"),

    DATABASES("MySQL", "PostgreSQL", "MongoDB", "Redis", "Elasticsearch", "SQLite", "MariaDB", "Oracle DB", "Microsoft SQL Server", "Cassandra", "Firebase Realtime Database", "Firestore", "DynamoDB", "CouchDB", "Neo4j", "GraphDB"),

    TOOLS("Git", "Docker", "Kubernetes", "Terraform", "Ansible", "Jenkins", "Travis CI", "CircleCI", "AWS", "Azure", "Google Cloud Platform", "GitHub", "GitLab", "Bitbucket", "JIRA", "Confluence", "Slack"),

    CONCEPTS("Microservices", "CI/CD", "REST API", "GraphQL", "Agile", "Scrum", "TDD", "BDD", "Serverless", "Cloud Computing", "DevOps", "Performance Tuning", "Scalability", "Load Balancing", "OAuth", "JWT", "Message Brokers", "Service Mesh", "MVC", "ORM", "API Gateway"),

    AI_ML("Machine Learning", "Deep Learning", "Natural Language Processing", "Computer Vision", "TensorFlow", "Keras", "PyTorch", "Scikit-Learn", "Pandas", "NumPy", "Jupyter", "Kaggle", "AWS SageMaker", "Google AI Platform", "Hadoop", "Spark", "Kafka", "Data Visualization", "Data Analysis", "Feature Engineering", "Model Deployment", "Hyperparameter Tuning"),

    VERSION_CONTROL("GitHub", "GitLab", "Bitbucket"),
    
    PROJECT_MANAGEMENT("JIRA", "Trello", "Asana", "Monday.com");

    private final List<String> keywords;

    KeywordCategory(String... keywords) {
        List<String> keywordList = Arrays.asList(keywords);
        Collections.sort(keywordList);
        this.keywords = Collections.unmodifiableList(keywordList);
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public static KeywordOptions getKeywordOptions(KeywordCategory category, String defaultValue) {
        return new KeywordOptions(defaultValue, category.getKeywords().toArray(new String[0]));
    }
}

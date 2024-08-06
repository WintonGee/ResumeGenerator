package com.example.data;

import java.util.*;

public enum KeywordCategory {
    BACKEND("Agile", "Amazon Web Services", "API", "API Gateway", "ASP.NET", "AWS", "Azure", "Back End", 
            "BEA WebLogic", "C", "C#", "C++", "CI/CD", "Cloud Computing", "Collaboration", "Computer Science", 
            "Continuous Deployment", "Continuous Integration", "Database", "Django", "Docker", "Elixir", 
            "Express.js", "Flask", "Full Stack", "Git", "Go", "Google Cloud Platform", "GraphQL", "gRPC", 
            "Hibernate", "Java", "JavaScript", "JWT", "Kafka", "Kotlin", "Kubernetes", "Load Balancing", 
            "Message Brokers", "Microservices", "MongoDB", "MVC", "MySQL", "Node.js", "NoSQL", "OAuth", 
            "ORM Technologies", "Performance Tuning", "PHP", "PostgreSQL", "Postman", "Python", "RabbitMQ", 
            "Redis", "REST API", "RESTful", "Ruby", "Ruby on Rails", "Scala", "Scalability", "Serverless", 
            "Service Mesh", "SOAP", "Software Development", "Software Engineering", "Spring", "Spring MVC", 
            "SQL", "Technical", "TDD", "Terraform", "TypeScript", "Web Development", "WebSphere"),

    FRONTEND("AJAX", "Accessibility", "Angular", "Ant Design", "Backbone.js", "Babel", "Bootstrap", 
             "Canvas API", "Chakra UI", "CSS", "CSR", "Cross-Browser Compatibility", "D3.js", "ES6", 
             "GraphQL", "HTML", "JavaScript", "jQuery", "LESS", "Material-UI", "MobX", "Next.js", 
             "Nuxt.js", "Postman", "Progressive Web Apps", "React", "Redux", "Responsive Design", "SASS", 
             "SEO", "Service Workers", "Single Page Applications", "SPA", "SSR", "Styled Components", 
             "Tailwind CSS", "Three.js", "TypeScript", "Vue.js", "WebAssembly", "Webpack", "WebSockets"),

    DATABASE("ACID", "Aerospike", "Amazon RDS", "ArangoDB", "BASE", "CAP Theorem", "Cassandra", "ClickHouse", 
             "CockroachDB", "CouchDB", "Couchbase", "Data Lakes", "Data Warehousing", "Database Tuning", 
             "DynamoDB", "Elasticsearch", "ETL", "Firebase Realtime Database", "Firestore", "Google BigQuery", 
             "GraphDB", "HBase", "Indexing", "InfluxDB", "MariaDB", "Memcached", "Microsoft SQL Server", 
             "MongoDB", "MySQL", "Neo4j", "NewSQL", "NoSQL", "Oracle DB", "PostgreSQL", "Presto", 
             "Query Optimization", "Redis", "Redshift", "Replication", "Sharding", "Snowflake", "SQLite", 
             "TimescaleDB", "Trino", "VoltDB"),

    AI_ML("Anomaly Detection", "AutoML", "AWS SageMaker", "Big Data", "CatBoost", "Computer Vision", 
          "Cross-Validation", "Data Analysis", "Data Preprocessing", "Data Visualization", "Deep Learning", 
          "Feature Engineering", "Flume", "Generative Models", "Google AI Platform", "H2O.ai", "Hadoop", 
          "Hive", "Hyperparameter Tuning", "Image Processing", "Jupyter", "Kafka", "Keras", "LightGBM", 
          "Machine Learning", "Matplotlib", "MLOps", "Model Deployment", "Model Evaluation", 
          "Natural Language Processing", "Natural Language Understanding", "NLTK", "NumPy", "OpenCV", 
          "Pandas", "Postman", "PyTorch", "Reinforcement Learning", "Scikit-Learn", "Seaborn", "Spark", 
          "SpaCy", "Speech Recognition", "TensorFlow", "Text Mining", "Time Series Analysis", "XGBoost");

    private final List<String> keywords;

    KeywordCategory(String... keywords) {
        List<String> keywordList = Arrays.asList(keywords);
        Collections.sort(keywordList);
        this.keywords = Collections.unmodifiableList(keywordList);
    }

    public List<String> getKeywords() {
        return keywords;
    }
}

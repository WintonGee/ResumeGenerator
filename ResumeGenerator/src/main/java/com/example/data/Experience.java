package com.example.data;

import java.util.ArrayList;
import java.util.List;

import com.example.data.*;

public class Experience {
    private String title;
    private String company;
    private String date;
    private List<DynamicSentence> details;

    public Experience(String title, String company, String date) {
        this.title = title;
        this.company = company;
        this.date = date;
        this.details = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getDate() {
        return date;
    }

    public List<DynamicSentence> getDetails() {
        return details;
    }

    public void addDetail(DynamicSentence detail) {
        this.details.add(detail);
    }

    // TODO implement a method to filter out sentences with a lower score?
    public List<String> getResponsibilities() {
        List<String> responsibilities = new ArrayList<>();

        details.sort((ds1, ds2) -> {
            int score1 = ds1.isDescription() ? Integer.MAX_VALUE : ds1.getScore();
            int score2 = ds2.isDescription() ? Integer.MAX_VALUE : ds2.getScore();
            return Integer.compare(score2, score1);
        });

        for (DynamicSentence detail : details) {
            System.out.println(detail.getScore() + " " + detail.generate());
            responsibilities.add(detail.generate());
        }
        return responsibilities;
    }
}

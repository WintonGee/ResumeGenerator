package com.example.data;

import java.util.ArrayList;
import java.util.List;

import com.example.util.LatexUtils;

public class Experience {
    private String title;
    private String company;
    private String date;
    private List<String> responsibilities;

    public Experience(String title, String company, String date) {
        this.title = title;
        this.company = company;
        this.date = date;
        this.responsibilities = new ArrayList<>();
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

    // TODO load the final dynamic string then latexify it
    

    public List<String> getResponsibilities() {
        return responsibilities;
    }

    public void addResponsibility(String responsibility) {
        this.responsibilities.add(LatexUtils.latexify(responsibility));
    }
}

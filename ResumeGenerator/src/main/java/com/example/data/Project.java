package com.example.data;

import java.util.ArrayList;
import java.util.List;

import com.example.util.LatexUtils;

public class Project {
    private String name;
    private String keywordDescription;
    private List<String> details;

    public Project(String name, String keywordDescription) {
        this.name = name;
        this.keywordDescription = keywordDescription;
        this.details = new ArrayList<>();
    }

    public void addDetail(String detail) {
        details.add(LatexUtils.latexify(detail));
    }

    public String getName() {
        return name;
    }

    public String getKeywordDescription() {
        return keywordDescription;
    }

    public List<String> getDetails() {
        return details;
    }
}

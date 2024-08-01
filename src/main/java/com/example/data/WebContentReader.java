package com.example.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebContentReader {
    public List<String> fetchWordsFromUrl(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        String text = doc.body().text();

        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            words.add(matcher.group().toLowerCase());
        }
        return words;
    }
}

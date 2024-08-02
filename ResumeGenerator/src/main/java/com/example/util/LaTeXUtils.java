package com.example.util;

public class LatexUtils {
    public static String escapeLatex(String input) {
        if (input == null) {
            return "";
        }
        return input.replace("\\", "\\textbackslash{}")
                    .replace("{", "\\{")
                    .replace("}", "\\}")
                    .replace("#", "\\#")
                    .replace("_", "\\_")
                    .replace("^", "\\^{}")
                    .replace("~", "\\~{}")
                    .replace("%", "\\%")
                    .replace("$", "\\$")
                    .replace("&", "\\&");
    }
}

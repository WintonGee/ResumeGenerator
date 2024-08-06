import java.util.List;
import java.util.StringJoiner;

public class KeywordOptions {
    private String defaultValue;
    private List<String> alternativeValues;

    public KeywordOptions(String defaultValue, String... alternativeValues) {
        this(defaultValue, new ArrayList<>(List.of(alternativeValues)));
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public List<String> getAlternativeValues() {
        return alternativeValues;
    }

    // TODO make a method that will only include the values that are contained within the keywords

    // TODO remove this
    public String getAllValues() {
        if (alternativeValues == null || alternativeValues.isEmpty()) {
            return defaultValue;
        }

        StringJoiner joiner = new StringJoiner(", ");
        for (String value : alternativeValues) {
            joiner.add(value);
        }
        return joiner.toString();
    }
}

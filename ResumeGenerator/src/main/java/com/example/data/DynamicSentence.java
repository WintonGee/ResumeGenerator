public class DynamicSentence {

    private String template;
    private Map<String, KeywordOptions> keywordMap;

    public DynamicSentence(String template) {
        this.template = template;
        this.keywordMap = new HashMap<>();
    }

    public void setKeyword(String key, KeywordOptions keywordOptions) {
        this.keywordMap.put(key, keywordOptions);
    }

    // TODO need to update method to select the best keywords based on the keywords provided
    public String generate() {
        String result = template;
        for (Map.Entry<String, KeywordOptions> entry : keywordMap.entrySet()) {
            String values = entry.getValue().getAllValues();
            result = result.replace("{" + entry.getKey() + "}", values);
        }
        return result;
    }
}

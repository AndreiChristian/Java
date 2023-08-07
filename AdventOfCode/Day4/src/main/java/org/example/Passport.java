package org.example;

import java.util.HashMap;
import java.util.Map;

public class Passport {
    private Map<String, String> fields = new HashMap<>();

    public void addField(String key, String value) {
        fields.put(key, value);
    }

    public Map<String, String> getFields() {
        return fields;
    }
}

package uk.co.chrisjenx.calligraphy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

final class CalligraphyEnumAttribute {

    private final Map<Integer, String> mEnumIntMap = new HashMap<>();
    private final Map<String, String> mEnumNameMap = new HashMap<>();

    public void add(String enumName, int enumId, String fontPath) {
        mEnumIntMap.put(enumId, fontPath);
        mEnumNameMap.put(enumName, fontPath);
    }

    public boolean isEmpty() {
        return mEnumIntMap.isEmpty();
    }

    public String getFontPath(int enumId) {
        return mEnumIntMap.get(enumId);
    }

    public String getFontPath(String enumName) {
        return mEnumNameMap.get(enumName);
    }

    public Collection<String> getFontPaths() {
        return mEnumNameMap.values();
    }
}


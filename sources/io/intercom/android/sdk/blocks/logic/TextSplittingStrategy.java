package io.intercom.android.sdk.blocks.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TextSplittingStrategy {
    private static final String NEW_LINE = "\n";
    private static final String NEW_LINE_REPLACEMENT = "<br>";
    private static final String NEW_PARAGRAPH_DELIMETER = "\n\n";

    public List<String> apply(String str) {
        String[] split = str.split(NEW_PARAGRAPH_DELIMETER);
        for (int i10 = 0; i10 < split.length; i10++) {
            split[i10] = split[i10].replace(NEW_LINE, NEW_LINE_REPLACEMENT);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(split));
        arrayList.removeAll(Collections.singleton(""));
        return arrayList;
    }
}

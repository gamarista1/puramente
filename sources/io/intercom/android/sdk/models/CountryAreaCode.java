package io.intercom.android.sdk.models;

import java.util.ArrayList;
import java.util.List;

public class CountryAreaCode {
    public static final CountryAreaCode UNKNOWN = new Builder().build();
    private List<String> areaCodes;
    private String code;
    private String dialCode;
    private String emoji;
    private int priority;

    public static final class Builder {
        List<String> areaCodes;
        String code;
        String dialCode;
        String emoji;
        Integer priority;

        public CountryAreaCode build() {
            return new CountryAreaCode(this);
        }
    }

    CountryAreaCode(Builder builder) {
        int i10;
        String str = builder.code;
        String str2 = "";
        this.code = str == null ? str2 : str;
        String str3 = builder.dialCode;
        this.dialCode = str3 != null ? str3 : str2;
        String str4 = builder.emoji;
        this.emoji = str4 == null ? "🌎" : str4;
        Integer num = builder.priority;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.intValue();
        }
        this.priority = i10;
        this.areaCodes = new ArrayList();
        List<String> list = builder.areaCodes;
        if (list != null) {
            for (String next : list) {
                if (next != null) {
                    this.areaCodes.add(next);
                }
            }
        }
    }

    public List<String> getAreaCodes() {
        return this.areaCodes;
    }

    public String getCode() {
        return this.code;
    }

    public String getDialCode() {
        return this.dialCode;
    }

    public String getEmoji() {
        return this.emoji;
    }

    public int getPriority() {
        return this.priority;
    }
}

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.Serializable;

public class PropertyNamingStrategy implements Serializable {
    @Deprecated
    public static final PropertyNamingStrategy CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES;
    public static final PropertyNamingStrategy KEBAB_CASE = new KebabCaseStrategy();
    public static final PropertyNamingStrategy LOWER_CAMEL_CASE = new PropertyNamingStrategy();
    public static final PropertyNamingStrategy LOWER_CASE = new LowerCaseStrategy();
    @Deprecated
    public static final PropertyNamingStrategy PASCAL_CASE_TO_CAMEL_CASE;
    public static final PropertyNamingStrategy SNAKE_CASE;
    public static final PropertyNamingStrategy UPPER_CAMEL_CASE;

    public static class KebabCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            int length;
            if (str == null || (length = str.length()) == 0) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder((length >> 1) + length);
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                char lowerCase = Character.toLowerCase(charAt);
                if (lowerCase == charAt) {
                    if (i10 > 1) {
                        sb2.insert(sb2.length() - 1, '-');
                    }
                    i10 = 0;
                } else {
                    if (i10 == 0 && i11 > 0) {
                        sb2.append('-');
                    }
                    i10++;
                }
                sb2.append(lowerCase);
            }
            return sb2.toString();
        }
    }

    public static class LowerCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            return str.toLowerCase();
        }
    }

    @Deprecated
    public static class LowerCaseWithUnderscoresStrategy extends SnakeCaseStrategy {
    }

    @Deprecated
    public static class PascalCaseStrategy extends UpperCamelCaseStrategy {
    }

    public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy {
        public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
            return translate(str);
        }

        public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
            return translate(str);
        }

        public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        public abstract String translate(String str);
    }

    public static class SnakeCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length * 2);
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (i11 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z10 && i10 > 0 && sb2.charAt(i10 - 1) != '_') {
                            sb2.append('_');
                            i10++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sb2.append(charAt);
                    i10++;
                }
            }
            if (i10 > 0) {
                return sb2.toString();
            }
            return str;
        }
    }

    public static class UpperCamelCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            char charAt;
            char upperCase;
            if (str == null || str.length() == 0 || (charAt = str.charAt(0)) == (upperCase = Character.toUpperCase(charAt))) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(str);
            sb2.setCharAt(0, upperCase);
            return sb2.toString();
        }
    }

    static {
        SnakeCaseStrategy snakeCaseStrategy = new SnakeCaseStrategy();
        SNAKE_CASE = snakeCaseStrategy;
        UpperCamelCaseStrategy upperCamelCaseStrategy = new UpperCamelCaseStrategy();
        UPPER_CAMEL_CASE = upperCamelCaseStrategy;
        CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES = snakeCaseStrategy;
        PASCAL_CASE_TO_CAMEL_CASE = upperCamelCaseStrategy;
    }

    public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
        return str;
    }

    public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
        return str;
    }

    public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }

    public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }
}

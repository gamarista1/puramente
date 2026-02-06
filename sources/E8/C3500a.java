package e8;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: e8.a  reason: case insensitive filesystem */
public @interface C3500a {
    String customType() default "__default_type__";

    boolean defaultBoolean() default false;

    double defaultDouble() default 0.0d;

    float defaultFloat() default 0.0f;

    int defaultInt() default 0;

    String name();
}

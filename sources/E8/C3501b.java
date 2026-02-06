package e8;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: e8.b  reason: case insensitive filesystem */
public @interface C3501b {
    String customType() default "__default_type__";

    double defaultDouble() default 0.0d;

    float defaultFloat() default 0.0f;

    int defaultInt() default 0;

    String[] names();
}

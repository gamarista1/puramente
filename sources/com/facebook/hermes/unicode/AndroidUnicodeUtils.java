package com.facebook.hermes.unicode;

import B7.a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J \u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007J \u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\rH\u0007J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0005H\u0007R\u000e\u0010\u0015\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/hermes/unicode/AndroidUnicodeUtils;", "", "<init>", "()V", "localeCompare", "", "left", "", "right", "dateFormat", "unixtimeMs", "", "formatDate", "", "formatTime", "convertToCase", "input", "targetCase", "useCurrentLocale", "normalize", "form", "TARGET_UPPERCASE", "TARGET_LOWERCASE", "FORM_C", "FORM_D", "FORM_KC", "FORM_KD", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@a
public final class AndroidUnicodeUtils {
    private static final int FORM_C = 0;
    private static final int FORM_D = 1;
    private static final int FORM_KC = 2;
    private static final int FORM_KD = 3;
    public static final AndroidUnicodeUtils INSTANCE = new AndroidUnicodeUtils();
    private static final int TARGET_LOWERCASE = 1;
    private static final int TARGET_UPPERCASE = 0;

    private AndroidUnicodeUtils() {
    }

    @a
    public static final String convertToCase(String str, int i10, boolean z10) {
        Locale locale;
        C6496s.h(str, MetricTracker.Object.INPUT);
        if (z10) {
            locale = Locale.getDefault();
        } else {
            locale = Locale.ENGLISH;
        }
        if (i10 == 0) {
            C6496s.e(locale);
            String upperCase = str.toUpperCase(locale);
            C6496s.g(upperCase, "toUpperCase(...)");
            return upperCase;
        } else if (i10 == 1) {
            C6496s.e(locale);
            String lowerCase = str.toLowerCase(locale);
            C6496s.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        } else {
            throw new IllegalStateException("Invalid target case");
        }
    }

    @a
    public static final String dateFormat(double d10, boolean z10, boolean z11) {
        DateFormat dateFormat;
        if (z10 && z11) {
            dateFormat = DateFormat.getDateTimeInstance(2, 2);
        } else if (z10) {
            dateFormat = DateFormat.getDateInstance(2);
        } else if (z11) {
            dateFormat = DateFormat.getTimeInstance(2);
        } else {
            throw new IllegalStateException("Bad dateFormat configuration");
        }
        return dateFormat.format(Long.valueOf((long) d10)).toString();
    }

    @a
    public static final int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @a
    public static final String normalize(String str, int i10) {
        if (i10 == 0) {
            String normalize = Normalizer.normalize(str, Normalizer.Form.NFC);
            C6496s.g(normalize, "normalize(...)");
            return normalize;
        } else if (i10 == 1) {
            String normalize2 = Normalizer.normalize(str, Normalizer.Form.NFD);
            C6496s.g(normalize2, "normalize(...)");
            return normalize2;
        } else if (i10 == 2) {
            String normalize3 = Normalizer.normalize(str, Normalizer.Form.NFKC);
            C6496s.g(normalize3, "normalize(...)");
            return normalize3;
        } else if (i10 == 3) {
            String normalize4 = Normalizer.normalize(str, Normalizer.Form.NFKD);
            C6496s.g(normalize4, "normalize(...)");
            return normalize4;
        } else {
            throw new IllegalStateException("Invalid form");
        }
    }
}

package mh;

import Ef.m;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ih.f;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;

public abstract class F {
    public static final B a(Number number, String str, String str2) {
        C6496s.h(number, "value");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(str2, "output");
        return e(-1, m(number, str, str2));
    }

    public static final D b(Number number, String str) {
        C6496s.h(number, "value");
        C6496s.h(str, "output");
        return new D("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + k(str, 0, 1, (Object) null));
    }

    public static final D c(Number number, String str, String str2) {
        C6496s.h(number, "value");
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(str2, "output");
        return new D(m(number, str, str2));
    }

    public static final D d(f fVar) {
        C6496s.h(fVar, "keyDescriptor");
        return new D("Value of type '" + fVar.i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVar.h() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final B e(int i10, String str) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        return new B(str);
    }

    public static final B f(int i10, String str, CharSequence charSequence) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(charSequence, MetricTracker.Object.INPUT);
        return e(i10, str + "\nJSON input: " + j(charSequence, i10));
    }

    public static final B g(String str, String str2) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(str2, MetricTracker.Object.INPUT);
        return e(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + k(str2, 0, 1, (Object) null));
    }

    public static final Void h(C6584a aVar, String str) {
        C6496s.h(aVar, "<this>");
        C6496s.h(str, "entity");
        aVar.w("Trailing comma before the end of JSON " + str, aVar.f72182a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new C6527k();
    }

    public static /* synthetic */ Void i(C6584a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return h(aVar, str);
    }

    public static final CharSequence j(CharSequence charSequence, int i10) {
        String str;
        C6496s.h(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i10 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return str2 + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        if (i11 <= 0) {
            str = "";
        } else {
            str = str2;
        }
        if (i12 >= charSequence.length()) {
            str2 = "";
        }
        return str + charSequence.subSequence(m.d(i11, 0), m.h(i12, charSequence.length())).toString() + str2;
    }

    public static /* synthetic */ CharSequence k(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return j(charSequence, i10);
    }

    public static final Void l(C6584a aVar, Number number) {
        C6496s.h(aVar, "<this>");
        C6496s.h(number, "result");
        C6584a.x(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, (Object) null);
        throw new C6527k();
    }

    private static final String m(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + k(str2, 0, 1, (Object) null);
    }
}

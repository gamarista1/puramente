package ge;

import Sg.p;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.jvm.internal.C6496s;

public abstract class i {
    public static final String a(String str) {
        C6496s.h(str, "eventName");
        if (!p.J(str, "on", false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(2);
        C6496s.g(substring, "substring(...)");
        return VerticalAlignment.TOP + substring;
    }
}

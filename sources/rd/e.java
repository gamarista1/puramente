package Rd;

import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

public abstract class e {
    public static final String a(Throwable th2) {
        String str;
        C6496s.h(th2, "<this>");
        String localizedMessage = th2.getLocalizedMessage();
        Throwable cause = th2.getCause();
        if (cause != null) {
            str = a(cause);
        } else {
            str = null;
        }
        return C6565s.x0(C6565s.s(localizedMessage, str), ": ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
    }
}

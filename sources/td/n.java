package Td;

import Sg.p;
import java.util.regex.Pattern;

public abstract class n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f52712a = m.class.getSimpleName();

    /* access modifiers changed from: private */
    public static final String c(String str) {
        if (str == null) {
            return null;
        }
        if (p.J(str, "file:///", false, 2, (Object) null)) {
            return str;
        }
        return Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}

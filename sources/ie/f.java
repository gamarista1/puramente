package Ie;

import Fe.C3023l;
import kotlin.jvm.internal.C6496s;

public abstract class f {
    public static final boolean a(String str) {
        C6496s.h(str, "className");
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            C3023l.l("Could not find " + str + ". If expected, import the dependency into your app.");
            return false;
        }
    }
}

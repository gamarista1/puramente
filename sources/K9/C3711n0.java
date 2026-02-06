package k9;

import java.util.HashSet;

/* renamed from: k9.n0  reason: case insensitive filesystem */
public abstract class C3711n0 {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet f45708a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static String f45709b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (C3711n0.class) {
            if (f45708a.add(str)) {
                f45709b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (C3711n0.class) {
            str = f45709b;
        }
        return str;
    }
}

package f2;

import java.util.HashSet;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet f20289a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static String f20290b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (x.class) {
            if (f20289a.add(str)) {
                f20290b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (x.class) {
            str = f20290b;
        }
        return str;
    }
}

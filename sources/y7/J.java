package y7;

import Sg.p;

public final class J {

    /* renamed from: a  reason: collision with root package name */
    public static final J f49616a = new J();

    private J() {
    }

    public static final boolean a(String str) {
        boolean z10 = false;
        if (str == null || str.length() == 0) {
            return false;
        }
        if (p.a0(str, ' ', 0, false, 6, (Object) null) >= 0) {
            z10 = true;
        }
        return !z10;
    }
}

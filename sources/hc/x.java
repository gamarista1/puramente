package Hc;

import Sg.p;
import android.util.Base64;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f51048a = new x();

    /* renamed from: b  reason: collision with root package name */
    private static final String f51049b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f51050c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f51051d;

    static {
        String encodeToString = Base64.encodeToString(p.s(w.f51047a.e()), 10);
        f51049b = encodeToString;
        f51050c = "firebase_session_" + encodeToString + "_data";
        f51051d = "firebase_session_" + encodeToString + "_settings";
    }

    private x() {
    }

    public final String a() {
        return f51050c;
    }

    public final String b() {
        return f51051d;
    }
}

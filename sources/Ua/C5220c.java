package ua;

import com.google.android.gms.common.api.c;

/* renamed from: ua.c  reason: case insensitive filesystem */
public abstract class C5220c extends c {
    public static String a(int i10) {
        switch (i10) {
            case 12500:
                return "A non-recoverable sign in failure occurred";
            case 12501:
                return "Sign in action cancelled";
            case 12502:
                return "Sign-in in progress";
            default:
                return c.a(i10);
        }
    }
}

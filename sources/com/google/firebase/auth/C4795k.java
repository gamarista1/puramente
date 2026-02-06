package com.google.firebase.auth;

import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.firebase.auth.k  reason: case insensitive filesystem */
public abstract class C4795k {
    public static C4789h a(String str, String str2) {
        C4536s.f(str);
        C4536s.f(str2);
        return new C4793j(str, str2);
    }

    public static C4789h b(String str, String str2) {
        if (C4793j.s0(str2)) {
            return new C4793j(str, (String) null, str2, (String) null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}

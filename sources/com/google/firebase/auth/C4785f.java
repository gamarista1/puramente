package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzau;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.google.firebase.auth.f  reason: case insensitive filesystem */
public class C4785f {

    /* renamed from: g  reason: collision with root package name */
    private static final zzau f57017g;

    /* renamed from: a  reason: collision with root package name */
    private final String f57018a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57019b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57020c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57021d;

    /* renamed from: e  reason: collision with root package name */
    private final String f57022e;

    /* renamed from: f  reason: collision with root package name */
    private final String f57023f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f57017g = zzau.zza(hashMap);
    }

    private C4785f(String str) {
        String e10 = e(str, "apiKey");
        String e11 = e(str, "oobCode");
        String e12 = e(str, "mode");
        if (e10 == null || e11 == null || e12 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        this.f57018a = C4536s.f(e10);
        this.f57019b = C4536s.f(e11);
        this.f57020c = C4536s.f(e12);
        this.f57021d = e(str, "continueUrl");
        this.f57022e = e(str, "languageCode");
        this.f57023f = e(str, "tenantId");
    }

    public static C4785f c(String str) {
        C4536s.f(str);
        try {
            return new C4785f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains(ActionType.LINK)) {
                return Uri.parse(C4536s.f(parse.getQueryParameter(ActionType.LINK))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f57019b;
    }

    public int b() {
        zzau zzau = f57017g;
        if (zzau.containsKey(this.f57020c)) {
            return ((Integer) zzau.get(this.f57020c)).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f57023f;
    }
}

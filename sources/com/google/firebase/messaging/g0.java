package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4535q;
import java.util.regex.Pattern;

final class g0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f57531d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f57532a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57533b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57534c;

    private g0(String str, String str2) {
        this.f57532a = d(str2, str);
        this.f57533b = str;
        this.f57534c = str + "!" + str2;
    }

    static g0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new g0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f57531d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    public static g0 f(String str) {
        return new g0("S", str);
    }

    public static g0 g(String str) {
        return new g0("U", str);
    }

    public String b() {
        return this.f57533b;
    }

    public String c() {
        return this.f57532a;
    }

    public String e() {
        return this.f57534c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (!this.f57532a.equals(g0Var.f57532a) || !this.f57533b.equals(g0Var.f57533b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f57533b, this.f57532a);
    }
}

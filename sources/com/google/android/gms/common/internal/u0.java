package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.net.Uri;

public final class u0 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f54235f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    private final String f54236a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54237b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f54238c;

    /* renamed from: d  reason: collision with root package name */
    private final int f54239d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f54240e;

    public u0(ComponentName componentName, int i10) {
        this.f54236a = null;
        this.f54237b = null;
        C4536s.l(componentName);
        this.f54238c = componentName;
        this.f54239d = 4225;
        this.f54240e = false;
    }

    public final ComponentName a() {
        return this.f54238c;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent b(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.f54236a
            if (r1 == 0) goto L_0x0060
            boolean r1 = r5.f54240e
            r2 = 0
            if (r1 == 0) goto L_0x0050
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.f54236a
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0024 }
            android.net.Uri r3 = f54235f     // Catch:{ IllegalArgumentException -> 0x0024 }
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r6 = r6.call(r3, r4, r2, r1)     // Catch:{ IllegalArgumentException -> 0x0024 }
            goto L_0x0033
        L_0x0024:
            r6 = move-exception
            java.lang.String r1 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
            r6 = r2
        L_0x0033:
            if (r6 != 0) goto L_0x0036
            goto L_0x003f
        L_0x0036:
            java.lang.String r1 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r6.getParcelable(r1)
            r2 = r6
            android.content.Intent r2 = (android.content.Intent) r2
        L_0x003f:
            if (r2 != 0) goto L_0x0050
            java.lang.String r6 = r5.f54236a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
        L_0x0050:
            if (r2 != 0) goto L_0x006b
            java.lang.String r6 = r5.f54236a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            java.lang.String r6 = r5.f54237b
            android.content.Intent r6 = r0.setPackage(r6)
            return r6
        L_0x0060:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.f54238c
            android.content.Intent r2 = r6.setComponent(r0)
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.u0.b(android.content.Context):android.content.Intent");
    }

    public final String c() {
        return this.f54237b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!C4535q.b(this.f54236a, u0Var.f54236a) || !C4535q.b(this.f54237b, u0Var.f54237b) || !C4535q.b(this.f54238c, u0Var.f54238c) || this.f54240e != u0Var.f54240e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C4535q.c(this.f54236a, this.f54237b, this.f54238c, 4225, Boolean.valueOf(this.f54240e));
    }

    public final String toString() {
        String str = this.f54236a;
        if (str != null) {
            return str;
        }
        C4536s.l(this.f54238c);
        return this.f54238c.flattenToString();
    }

    public u0(String str, String str2, int i10, boolean z10) {
        C4536s.f(str);
        this.f54236a = str;
        C4536s.f(str2);
        this.f54237b = str2;
        this.f54238c = null;
        this.f54239d = 4225;
        this.f54240e = z10;
    }
}

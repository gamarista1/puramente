package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import ya.C5291h;

/* renamed from: com.google.android.gms.common.internal.v  reason: case insensitive filesystem */
public class C4539v {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f54241a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54242b;

    public C4539v(Context context) {
        C4536s.l(context);
        Resources resources = context.getResources();
        this.f54241a = resources;
        this.f54242b = resources.getResourcePackageName(C5291h.f62281a);
    }

    public String a(String str) {
        int identifier = this.f54241a.getIdentifier(str, "string", this.f54242b);
        if (identifier == 0) {
            return null;
        }
        return this.f54241a.getString(identifier);
    }
}

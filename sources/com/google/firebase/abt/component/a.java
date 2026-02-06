package com.google.firebase.abt.component;

import android.content.Context;
import ic.C5027b;
import java.util.HashMap;
import java.util.Map;
import vb.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f56840a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f56841b;

    /* renamed from: c  reason: collision with root package name */
    private final C5027b f56842c;

    protected a(Context context, C5027b bVar) {
        this.f56841b = context;
        this.f56842c = bVar;
    }

    /* access modifiers changed from: protected */
    public c a(String str) {
        return new c(this.f56841b, this.f56842c, str);
    }

    public synchronized c b(String str) {
        try {
            if (!this.f56840a.containsKey(str)) {
                this.f56840a.put(str, a(str));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return (c) this.f56840a.get(str);
    }
}

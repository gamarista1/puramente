package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C4535q;

/* renamed from: com.google.android.gms.common.api.internal.b  reason: case insensitive filesystem */
public final class C4490b {

    /* renamed from: a  reason: collision with root package name */
    private final int f54001a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54002b;

    /* renamed from: c  reason: collision with root package name */
    private final a.d f54003c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54004d;

    private C4490b(a aVar, a.d dVar, String str) {
        this.f54002b = aVar;
        this.f54003c = dVar;
        this.f54004d = str;
        this.f54001a = C4535q.c(aVar, dVar, str);
    }

    public static C4490b a(a aVar, a.d dVar, String str) {
        return new C4490b(aVar, dVar, str);
    }

    public final String b() {
        return this.f54002b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4490b)) {
            return false;
        }
        C4490b bVar = (C4490b) obj;
        if (!C4535q.b(this.f54002b, bVar.f54002b) || !C4535q.b(this.f54003c, bVar.f54003c) || !C4535q.b(this.f54004d, bVar.f54004d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f54001a;
    }
}

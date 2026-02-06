package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

/* renamed from: androidx.work.impl.g  reason: case insensitive filesystem */
public final class C1847g extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1847g f18932c = new C1847g();

    private C1847g() {
        super(11, 12);
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}

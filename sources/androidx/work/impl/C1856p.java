package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

/* renamed from: androidx.work.impl.p  reason: case insensitive filesystem */
public final class C1856p extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1856p f18941c = new C1856p();

    private C1856p() {
        super(8, 9);
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}

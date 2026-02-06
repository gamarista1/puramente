package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

/* renamed from: androidx.work.impl.m  reason: case insensitive filesystem */
public final class C1853m extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1853m f18938c = new C1853m();

    private C1853m() {
        super(4, 5);
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gVar.z("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}

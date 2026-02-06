package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

/* renamed from: androidx.work.impl.o  reason: case insensitive filesystem */
public final class C1855o extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1855o f18940c = new C1855o();

    private C1855o() {
        super(7, 8);
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}

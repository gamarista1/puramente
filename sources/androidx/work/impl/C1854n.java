package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

/* renamed from: androidx.work.impl.n  reason: case insensitive filesystem */
public final class C1854n extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1854n f18939c = new C1854n();

    private C1854n() {
        super(6, 7);
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}

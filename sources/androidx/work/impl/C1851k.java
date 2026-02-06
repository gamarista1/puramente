package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

/* renamed from: androidx.work.impl.k  reason: case insensitive filesystem */
public final class C1851k extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1851k f18936c = new C1851k();

    private C1851k() {
        super(1, 2);
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        gVar.z("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        gVar.z("DROP TABLE IF EXISTS alarmInfo");
        gVar.z("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}

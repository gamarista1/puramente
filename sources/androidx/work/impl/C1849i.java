package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

/* renamed from: androidx.work.impl.i  reason: case insensitive filesystem */
public final class C1849i extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1849i f18934c = new C1849i();

    private C1849i() {
        super(15, 16);
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        gVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        gVar.z("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        gVar.z("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        gVar.z("DROP TABLE `SystemIdInfo`");
        gVar.z("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}

package androidx.work.impl;

import v3.C2756b;
import y3.g;

class K extends C2756b {
    public K() {
        super(17, 18);
    }

    public void a(g gVar) {
        gVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        gVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}

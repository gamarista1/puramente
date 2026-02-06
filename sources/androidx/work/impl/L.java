package androidx.work.impl;

import v3.C2756b;
import y3.g;

class L extends C2756b {
    public L() {
        super(18, 19);
    }

    public void a(g gVar) {
        gVar.z("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}

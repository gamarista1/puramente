package Lc;

import Kc.h;
import java.util.Collections;
import java.util.Map;
import ub.C5230g;

public class c extends e {
    public c(h hVar, C5230g gVar, long j10) {
        super(hVar, gVar);
        if (j10 != 0) {
            super.G("Range", "bytes=" + j10 + "-");
        }
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "GET";
    }

    /* access modifiers changed from: protected */
    public Map l() {
        return Collections.singletonMap("alt", "media");
    }
}

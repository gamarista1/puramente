package ub;

import com.google.android.gms.common.internal.C4536s;

public class m extends Exception {
    protected m() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(str);
        C4536s.g(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str, Throwable th2) {
        super(str, th2);
        C4536s.g(str, "Detail message must not be empty");
    }
}

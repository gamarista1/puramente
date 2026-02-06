package dh;

import Zg.G;

public abstract class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final G f67422a = new G("NO_OWNER");

    /* renamed from: b  reason: collision with root package name */
    private static final G f67423b = new G("ALREADY_LOCKED_BY_OWNER");

    public static final C5817a a(boolean z10) {
        return new b(z10);
    }

    public static /* synthetic */ C5817a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}

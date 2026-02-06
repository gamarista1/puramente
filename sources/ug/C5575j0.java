package Ug;

import Zg.G;

/* renamed from: Ug.j0  reason: case insensitive filesystem */
public abstract class C5575j0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final G f65388a = new G("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final G f65389b = new G("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}

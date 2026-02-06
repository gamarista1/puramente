package dh;

import Zg.G;

public abstract class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final int f67434a = J.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final G f67435b = new G("PERMIT");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final G f67436c = new G("TAKEN");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final G f67437d = new G("BROKEN");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final G f67438e = new G("CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f67439f = J.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    public static final d a(int i10, int i11) {
        return new e(i10, i11);
    }

    public static /* synthetic */ d b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    /* access modifiers changed from: private */
    public static final g j(long j10, g gVar) {
        return new g(j10, gVar, 0);
    }
}

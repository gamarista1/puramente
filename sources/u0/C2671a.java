package u0;

import androidx.collection.L;
import androidx.collection.X;
import kotlin.jvm.internal.C6496s;
import r0.K1;

/* renamed from: u0.a  reason: case insensitive filesystem */
public final class C2671a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C2673c f26467a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C2673c f26468b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public L f26469c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public L f26470d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f26471e;

    public final boolean i(C2673c cVar) {
        if (!this.f26471e) {
            K1.a("Only add dependencies during a tracking");
        }
        L l10 = this.f26469c;
        if (l10 != null) {
            C6496s.e(l10);
            l10.h(cVar);
        } else if (this.f26467a != null) {
            L a10 = X.a();
            C2673c cVar2 = this.f26467a;
            C6496s.e(cVar2);
            a10.h(cVar2);
            a10.h(cVar);
            this.f26469c = a10;
            this.f26467a = null;
        } else {
            this.f26467a = cVar;
        }
        L l11 = this.f26470d;
        if (l11 != null) {
            C6496s.e(l11);
            return !l11.x(cVar);
        } else if (this.f26468b != cVar) {
            return true;
        } else {
            this.f26468b = null;
            return false;
        }
    }
}

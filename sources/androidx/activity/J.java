package androidx.activity;

import androidx.lifecycle.C1798v;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public abstract class J {

    public static final class a extends G {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f10774d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, C6798l lVar) {
            super(z10);
            this.f10774d = lVar;
        }

        public void d() {
            this.f10774d.invoke(this);
        }
    }

    public static final G a(H h10, C1798v vVar, boolean z10, C6798l lVar) {
        C6496s.h(h10, "<this>");
        C6496s.h(lVar, "onBackPressed");
        a aVar = new a(z10, lVar);
        if (vVar != null) {
            h10.i(vVar, aVar);
        } else {
            h10.h(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ G b(H h10, C1798v vVar, boolean z10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vVar = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(h10, vVar, z10, lVar);
    }
}

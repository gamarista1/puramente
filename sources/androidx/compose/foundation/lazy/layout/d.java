package androidx.compose.foundation.lazy.layout;

import E.L;
import E.N;
import E.Q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import yf.C6798l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Q f13030a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f13031b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final N f13032c;

    /* renamed from: d  reason: collision with root package name */
    private h f13033d;

    private final class a implements L {

        /* renamed from: a  reason: collision with root package name */
        private final List f13034a = new ArrayList();

        public a() {
        }

        public void a(int i10) {
            c(i10, e.f13036a);
        }

        public final List b() {
            return this.f13034a;
        }

        public void c(int i10, long j10) {
            h c10 = d.this.c();
            if (c10 != null) {
                this.f13034a.add(c10.c(i10, j10, d.this.f13032c));
            }
        }
    }

    public interface b {
        void a();

        void cancel();
    }

    public d(Q q10, C6798l lVar) {
        this.f13030a = q10;
        this.f13031b = lVar;
        this.f13032c = new N();
    }

    public final List b() {
        C6798l lVar = this.f13031b;
        if (lVar == null) {
            return C6565s.n();
        }
        a aVar = new a();
        lVar.invoke(aVar);
        return aVar.b();
    }

    public final h c() {
        return this.f13033d;
    }

    public final Q d() {
        return this.f13030a;
    }

    public final b e(int i10, long j10) {
        b d10;
        h hVar = this.f13033d;
        if (hVar == null || (d10 = hVar.d(i10, j10, this.f13032c)) == null) {
            return a.f12976a;
        }
        return d10;
    }

    public final void f(h hVar) {
        this.f13033d = hVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Q q10, C6798l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : q10, (i10 & 2) != 0 ? null : lVar);
    }
}

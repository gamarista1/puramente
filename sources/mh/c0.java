package mh;

import gh.C5987k;
import ih.e;
import ih.f;
import ih.j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lh.C6538b;
import lh.i;
import yf.C6798l;

public abstract class c0 {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f72191a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(N n10) {
            super(1);
            this.f72191a = n10;
        }

        public final void a(i iVar) {
            C6496s.h(iVar, "it");
            this.f72191a.f71759a = iVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i) obj);
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean b(f fVar) {
        if ((fVar.h() instanceof e) || fVar.h() == j.b.f68505a) {
            return true;
        }
        return false;
    }

    public static final i c(C6538b bVar, Object obj, C5987k kVar) {
        C6496s.h(bVar, "json");
        C6496s.h(kVar, "serializer");
        N n10 = new N();
        new N(bVar, new a(n10)).m(kVar, obj);
        Object obj2 = n10.f71759a;
        if (obj2 != null) {
            return (i) obj2;
        }
        C6496s.v("result");
        return null;
    }
}

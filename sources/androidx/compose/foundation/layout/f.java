package androidx.compose.foundation.layout;

import C.C1086d;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1676z0;
import k0.c;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

public final class f implements C1086d {

    /* renamed from: a  reason: collision with root package name */
    public static final f f12848a = new f();

    public static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12849a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(1);
            this.f12849a = cVar;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    public static final class b extends C6498u implements C6798l {
        public b() {
            super(1);
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    private f() {
    }

    public i e(i iVar, c cVar) {
        C6798l lVar;
        if (C1676z0.b()) {
            lVar = new a(cVar);
        } else {
            lVar = C1676z0.a();
        }
        return iVar.h(new BoxChildDataElement(cVar, false, lVar));
    }

    public i f(i iVar) {
        C6798l lVar;
        c e10 = c.f23044a.e();
        if (C1676z0.b()) {
            lVar = new b();
        } else {
            lVar = C1676z0.a();
        }
        return iVar.h(new BoxChildDataElement(e10, true, lVar));
    }
}

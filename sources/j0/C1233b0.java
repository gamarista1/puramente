package J0;

import Ef.m;
import a0.C1538b;
import k0.f;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

/* renamed from: J0.b0  reason: case insensitive filesystem */
public abstract class C1233b0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final a f3775a;

    /* renamed from: J0.b0$a */
    public static final class a extends i.c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    /* renamed from: J0.b0$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1538b f3776a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1538b bVar) {
            super(1);
            this.f3776a = bVar;
        }

        /* renamed from: a */
        public final Boolean invoke(i.b bVar) {
            this.f3776a.b(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.b2(-1);
        f3775a = aVar;
    }

    public static final int d(i.b bVar, i.b bVar2) {
        if (C6496s.c(bVar, bVar2)) {
            return 2;
        }
        if (k0.b.a(bVar, bVar2)) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final C1538b e(i iVar, C1538b bVar) {
        C1538b bVar2 = new C1538b(new i[m.d(bVar.q(), 16)], 0);
        bVar2.b(iVar);
        b bVar3 = null;
        while (bVar2.t()) {
            i iVar2 = (i) bVar2.y(bVar2.q() - 1);
            if (iVar2 instanceof f) {
                f fVar = (f) iVar2;
                bVar2.b(fVar.a());
                bVar2.b(fVar.b());
            } else if (iVar2 instanceof i.b) {
                bVar.b(iVar2);
            } else {
                if (bVar3 == null) {
                    bVar3 = new b(bVar);
                }
                iVar2.c(bVar3);
                bVar3 = bVar3;
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public static final void f(V v10, i.c cVar) {
        C6496s.f(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        v10.b(cVar);
    }
}

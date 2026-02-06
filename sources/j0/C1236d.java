package J0;

import I0.k;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

/* renamed from: J0.d  reason: case insensitive filesystem */
public abstract class C1236d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final a f3845a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final C6798l f3846b = b.f3848a;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C6798l f3847c = c.f3849a;

    /* renamed from: J0.d$a */
    public static final class a implements k {
        a() {
        }

        public Object a(I0.c cVar) {
            return cVar.a().invoke();
        }
    }

    /* renamed from: J0.d$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f3848a = new b();

        b() {
            super(1);
        }

        public final void a(C1234c cVar) {
            cVar.o2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1234c) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J0.d$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3849a = new c();

        c() {
            super(1);
        }

        public final void a(C1234c cVar) {
            cVar.r2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1234c) obj);
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean d(C1234c cVar) {
        i.c o10 = C1245k.m(cVar).j0().o();
        C6496s.f(o10, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((z0) o10).l2();
    }
}

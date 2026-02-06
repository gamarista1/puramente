package F;

import E.J;
import H0.G;
import Ug.L;
import c1.f;
import c1.r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.O;
import qf.h;
import yf.C6798l;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f2088a;

    /* renamed from: b  reason: collision with root package name */
    private static final v f2089b;

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f2093a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f2093a = i10;
        }

        /* renamed from: a */
        public final Integer invoke(C1174i iVar) {
            return Integer.valueOf(iVar.getIndex() - this.f2093a);
        }
    }

    static {
        int[] iArr = new int[0];
        int[] iArr2 = iArr;
        int[] iArr3 = iArr;
        f2088a = iArr;
        a aVar = r1;
        a aVar2 = new a();
        List n10 = C6565s.n();
        long a10 = r.f19235b.a();
        C c10 = r1;
        C c11 = new C(iArr, iArr);
        D d10 = r0;
        D d11 = new D(new J());
        f2089b = new v(iArr2, iArr3, 0.0f, aVar, false, false, false, c10, d10, f.b(1.0f, 0.0f, 2, (Object) null), 0, n10, a10, 0, 0, 0, 0, 0, L.a(h.f72645a), (DefaultConstructorMarker) null);
    }

    public static final C1174i a(q qVar, int i10) {
        if (qVar.k().isEmpty()) {
            return null;
        }
        int index = ((C1174i) C6565s.o0(qVar.k())).getIndex();
        if (i10 > ((C1174i) C6565s.z0(qVar.k())).getIndex() || index > i10) {
            return null;
        }
        return (C1174i) C6565s.r0(qVar.k(), C6565s.l(qVar.k(), 0, 0, new b(i10), 3, (Object) null));
    }

    public static final v b() {
        return f2089b;
    }

    public static final class a implements G {

        /* renamed from: a  reason: collision with root package name */
        private final int f2090a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2091b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f2092c = O.i();

        a() {
        }

        public int d() {
            return this.f2091b;
        }

        public int e() {
            return this.f2090a;
        }

        public Map p() {
            return this.f2092c;
        }

        public void q() {
        }
    }
}

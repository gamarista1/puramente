package m3;

import Ef.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import m3.C2224x;
import m3.G;
import m3.Z;
import mf.C6559l;
import mf.C6565s;
import yf.C6798l;

/* renamed from: m3.C  reason: case insensitive filesystem */
public final class C2198C implements N {

    /* renamed from: e  reason: collision with root package name */
    public static final a f23758e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C2198C f23759f = new C2198C(C2224x.b.f24139g.e());

    /* renamed from: a  reason: collision with root package name */
    private final List f23760a;

    /* renamed from: b  reason: collision with root package name */
    private int f23761b;

    /* renamed from: c  reason: collision with root package name */
    private int f23762c;

    /* renamed from: d  reason: collision with root package name */
    private int f23763d;

    /* renamed from: m3.C$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2198C a(C2224x.b bVar) {
            if (bVar != null) {
                return new C2198C(bVar);
            }
            C2198C d10 = C2198C.f23759f;
            C6496s.f(d10, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
            return d10;
        }

        private a() {
        }
    }

    /* renamed from: m3.C$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23764a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                m3.t[] r0 = m3.C2220t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                m3.t r1 = m3.C2220t.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f23764a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2198C.b.<clinit>():void");
        }
    }

    public C2198C(List list, int i10, int i11) {
        C6496s.h(list, "pages");
        this.f23760a = C6565s.h1(list);
        this.f23761b = i(list);
        this.f23762c = i10;
        this.f23763d = i11;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + getSize());
        }
    }

    private final G g(C2224x.a aVar) {
        int h10 = h(new i(aVar.e(), aVar.d()));
        this.f23761b = a() - h10;
        if (aVar.c() == C2220t.PREPEND) {
            int b10 = b();
            this.f23762c = aVar.g();
            return new G.c(h10, b(), b10);
        }
        int c10 = c();
        this.f23763d = aVar.g();
        return new G.b(b() + a(), h10, aVar.g(), c10);
    }

    private final int h(i iVar) {
        Iterator it = this.f23760a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            W w10 = (W) it.next();
            int[] e10 = w10.e();
            int length = e10.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (iVar.p(e10[i11])) {
                    i10 += w10.b().size();
                    it.remove();
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i10;
    }

    private final int i(List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((W) it.next()).b().size();
        }
        return i10;
    }

    private final int l() {
        Integer V02 = C6559l.V0(((W) C6565s.o0(this.f23760a)).e());
        C6496s.e(V02);
        return V02.intValue();
    }

    private final int m() {
        Integer T02 = C6559l.T0(((W) C6565s.z0(this.f23760a)).e());
        C6496s.e(T02);
        return T02.intValue();
    }

    private final G o(C2224x.b bVar) {
        int i10 = i(bVar.h());
        int i11 = b.f23764a[bVar.f().ordinal()];
        if (i11 == 1) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        } else if (i11 == 2) {
            int b10 = b();
            this.f23760a.addAll(0, bVar.h());
            this.f23761b = a() + i10;
            this.f23762c = bVar.j();
            ArrayList arrayList = new ArrayList();
            for (W b11 : bVar.h()) {
                C6565s.D(arrayList, b11.b());
            }
            return new G.d(arrayList, b(), b10);
        } else if (i11 == 3) {
            int c10 = c();
            int a10 = a();
            List list = this.f23760a;
            list.addAll(list.size(), bVar.h());
            this.f23761b = a() + i10;
            this.f23763d = bVar.i();
            int b12 = b() + a10;
            ArrayList arrayList2 = new ArrayList();
            for (W b13 : bVar.h()) {
                C6565s.D(arrayList2, b13.b());
            }
            return new G.a(b12, arrayList2, c(), c10);
        } else {
            throw new C6535s();
        }
    }

    public int a() {
        return this.f23761b;
    }

    public int b() {
        return this.f23762c;
    }

    public int c() {
        return this.f23763d;
    }

    public final Z.a e(int i10) {
        int i11 = 0;
        int b10 = i10 - b();
        while (b10 >= ((W) this.f23760a.get(i11)).b().size() && i11 < C6565s.p(this.f23760a)) {
            b10 -= ((W) this.f23760a.get(i11)).b().size();
            i11++;
        }
        return ((W) this.f23760a.get(i11)).f(b10, i10 - b(), ((getSize() - i10) - c()) - 1, l(), m());
    }

    public int getSize() {
        return b() + a() + c();
    }

    public final Object j(int i10) {
        f(i10);
        int b10 = i10 - b();
        if (b10 < 0 || b10 >= a()) {
            return null;
        }
        return k(b10);
    }

    public Object k(int i10) {
        int size = this.f23760a.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = ((W) this.f23760a.get(i11)).b().size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return ((W) this.f23760a.get(i11)).b().get(i10);
    }

    public final Z.b n() {
        int a10 = a() / 2;
        return new Z.b(a10, a10, l(), m());
    }

    public final G p(C2224x xVar) {
        C6496s.h(xVar, "pageEvent");
        if (xVar instanceof C2224x.b) {
            return o((C2224x.b) xVar);
        }
        if (xVar instanceof C2224x.a) {
            return g((C2224x.a) xVar);
        }
        throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    public final C2218q q() {
        int b10 = b();
        int c10 = c();
        ArrayList arrayList = new ArrayList();
        for (W b11 : this.f23760a) {
            C6565s.D(arrayList, b11.b());
        }
        return new C2218q(b10, c10, arrayList);
    }

    public String toString() {
        int a10 = a();
        ArrayList arrayList = new ArrayList(a10);
        for (int i10 = 0; i10 < a10; i10++) {
            arrayList.add(k(i10));
        }
        String x02 = C6565s.x0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null);
        return "[(" + b() + " placeholders), " + x02 + ", (" + c() + " placeholders)]";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2198C(C2224x.b bVar) {
        this(bVar.h(), bVar.j(), bVar.i());
        C6496s.h(bVar, "insertEvent");
    }
}

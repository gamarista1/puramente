package mh;

import Sg.p;
import gh.C5977a;
import gh.C5979c;
import gh.C5982f;
import gh.C5986j;
import ih.f;
import ih.j;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import jh.C6432a;
import jh.c;
import jh.e;
import kh.C6441b;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;
import lh.C6538b;
import lh.g;
import lh.h;
import lh.i;
import nh.C6624e;

public class W extends C6432a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final C6538b f72161a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f72162b;

    /* renamed from: c  reason: collision with root package name */
    public final C6584a f72163c;

    /* renamed from: d  reason: collision with root package name */
    private final C6624e f72164d;

    /* renamed from: e  reason: collision with root package name */
    private int f72165e = -1;

    /* renamed from: f  reason: collision with root package name */
    private a f72166f;

    /* renamed from: g  reason: collision with root package name */
    private final g f72167g;

    /* renamed from: h  reason: collision with root package name */
    private final C f72168h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f72169a;

        public a(String str) {
            this.f72169a = str;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f72170a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                mh.d0[] r0 = mh.d0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                mh.d0 r1 = mh.d0.LIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                mh.d0 r1 = mh.d0.MAP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                mh.d0 r1 = mh.d0.POLY_OBJ     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                mh.d0 r1 = mh.d0.OBJ     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f72170a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mh.W.b.<clinit>():void");
        }
    }

    public W(C6538b bVar, d0 d0Var, C6584a aVar, f fVar, a aVar2) {
        C c10;
        C6496s.h(bVar, "json");
        C6496s.h(d0Var, "mode");
        C6496s.h(aVar, "lexer");
        C6496s.h(fVar, "descriptor");
        this.f72161a = bVar;
        this.f72162b = d0Var;
        this.f72163c = aVar;
        this.f72164d = bVar.a();
        this.f72166f = aVar2;
        g f10 = bVar.f();
        this.f72167g = f10;
        if (f10.i()) {
            c10 = null;
        } else {
            c10 = new C(fVar);
        }
        this.f72168h = c10;
    }

    private final void K() {
        if (this.f72163c.F() == 4) {
            C6584a.x(this.f72163c, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }

    private final boolean L(f fVar, int i10) {
        String G10;
        C6538b bVar = this.f72161a;
        if (!fVar.j(i10)) {
            return false;
        }
        f g10 = fVar.g(i10);
        if (g10.b() || !this.f72163c.N(true)) {
            if (!C6496s.c(g10.h(), j.b.f68505a)) {
                return false;
            }
            if ((g10.b() && this.f72163c.N(false)) || (G10 = this.f72163c.G(this.f72167g.p())) == null || G.h(g10, bVar, G10) != -3) {
                return false;
            }
            this.f72163c.o();
        }
        return true;
    }

    private final int M() {
        boolean M10 = this.f72163c.M();
        if (this.f72163c.e()) {
            int i10 = this.f72165e;
            if (i10 == -1 || M10) {
                int i11 = i10 + 1;
                this.f72165e = i11;
                return i11;
            }
            C6584a.x(this.f72163c, "Expected end of the array or comma", 0, (String) null, 6, (Object) null);
            throw new C6527k();
        } else if (!M10 || this.f72161a.f().c()) {
            return -1;
        } else {
            F.h(this.f72163c, "array");
            throw new C6527k();
        }
    }

    private final int N() {
        boolean z10;
        int i10 = this.f72165e;
        boolean z11 = false;
        if (i10 % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f72163c.l(':');
        } else if (i10 != -1) {
            z11 = this.f72163c.M();
        }
        if (this.f72163c.e()) {
            if (z10) {
                if (this.f72165e == -1) {
                    C6584a aVar = this.f72163c;
                    int i11 = aVar.f72182a;
                    if (z11) {
                        C6584a.x(aVar, "Unexpected leading comma", i11, (String) null, 4, (Object) null);
                        throw new C6527k();
                    }
                } else {
                    C6584a aVar2 = this.f72163c;
                    int i12 = aVar2.f72182a;
                    if (!z11) {
                        C6584a.x(aVar2, "Expected comma after the key-value pair", i12, (String) null, 4, (Object) null);
                        throw new C6527k();
                    }
                }
            }
            int i13 = this.f72165e + 1;
            this.f72165e = i13;
            return i13;
        } else if (!z11 || this.f72161a.f().c()) {
            return -1;
        } else {
            F.i(this.f72163c, (String) null, 1, (Object) null);
            throw new C6527k();
        }
    }

    private final int O(f fVar) {
        int h10;
        boolean z10;
        boolean M10 = this.f72163c.M();
        while (true) {
            boolean z11 = true;
            if (this.f72163c.e()) {
                String P10 = P();
                this.f72163c.l(':');
                h10 = G.h(fVar, this.f72161a, P10);
                if (h10 == -3) {
                    z10 = false;
                } else if (!this.f72167g.f() || !L(fVar, h10)) {
                    C c10 = this.f72168h;
                } else {
                    z10 = this.f72163c.M();
                    z11 = false;
                }
                if (z11) {
                    M10 = Q(P10);
                } else {
                    M10 = z10;
                }
            } else if (!M10 || this.f72161a.f().c()) {
                C c11 = this.f72168h;
                if (c11 != null) {
                    return c11.d();
                }
                return -1;
            } else {
                F.i(this.f72163c, (String) null, 1, (Object) null);
                throw new C6527k();
            }
        }
        C c102 = this.f72168h;
        if (c102 != null) {
            c102.c(h10);
        }
        return h10;
    }

    private final String P() {
        if (this.f72167g.p()) {
            return this.f72163c.r();
        }
        return this.f72163c.i();
    }

    private final boolean Q(String str) {
        if (this.f72167g.j() || S(this.f72166f, str)) {
            this.f72163c.I(this.f72167g.p());
        } else {
            this.f72163c.A(str);
        }
        return this.f72163c.M();
    }

    private final void R(f fVar) {
        do {
        } while (o(fVar) != -1);
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !C6496s.c(aVar.f72169a, str)) {
            return false;
        }
        aVar.f72169a = null;
        return true;
    }

    public String B() {
        if (this.f72167g.p()) {
            return this.f72163c.r();
        }
        return this.f72163c.o();
    }

    public Object C(f fVar, int i10, C5977a aVar, Object obj) {
        boolean z10;
        C6496s.h(fVar, "descriptor");
        C6496s.h(aVar, "deserializer");
        if (this.f72162b == d0.MAP && (i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f72163c.f72183b.d();
        }
        Object C10 = super.C(fVar, i10, aVar, obj);
        if (z10) {
            this.f72163c.f72183b.f(C10);
        }
        return C10;
    }

    public boolean D() {
        boolean z10;
        C c10 = this.f72168h;
        if (c10 != null) {
            z10 = c10.b();
        } else {
            z10 = false;
        }
        if (z10 || C6584a.O(this.f72163c, false, 1, (Object) null)) {
            return false;
        }
        return true;
    }

    public int F(f fVar) {
        C6496s.h(fVar, "enumDescriptor");
        C6538b bVar = this.f72161a;
        String B10 = B();
        return G.i(fVar, bVar, B10, " at path " + this.f72163c.f72183b.a());
    }

    public byte H() {
        long m10 = this.f72163c.m();
        byte b10 = (byte) ((int) m10);
        if (m10 == ((long) b10)) {
            return b10;
        }
        C6584a aVar = this.f72163c;
        C6584a.x(aVar, "Failed to parse byte for input '" + m10 + '\'', 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    public C6624e a() {
        return this.f72164d;
    }

    public c b(f fVar) {
        C6496s.h(fVar, "descriptor");
        d0 b10 = e0.b(this.f72161a, fVar);
        this.f72163c.f72183b.c(fVar);
        this.f72163c.l(b10.f72209a);
        K();
        int i10 = b.f72170a[b10.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new W(this.f72161a, b10, this.f72163c, fVar, this.f72166f);
        } else if (this.f72162b == b10 && this.f72161a.f().i()) {
            return this;
        } else {
            return new W(this.f72161a, b10, this.f72163c, fVar, this.f72166f);
        }
    }

    public void c(f fVar) {
        C6496s.h(fVar, "descriptor");
        if (this.f72161a.f().j() && fVar.d() == 0) {
            R(fVar);
        }
        if (!this.f72163c.M() || this.f72161a.f().c()) {
            this.f72163c.l(this.f72162b.f72210b);
            this.f72163c.f72183b.b();
            return;
        }
        F.h(this.f72163c, "");
        throw new C6527k();
    }

    public final C6538b d() {
        return this.f72161a;
    }

    public i g() {
        return new T(this.f72161a.f(), this.f72163c).e();
    }

    public int h() {
        long m10 = this.f72163c.m();
        int i10 = (int) m10;
        if (m10 == ((long) i10)) {
            return i10;
        }
        C6584a aVar = this.f72163c;
        C6584a.x(aVar, "Failed to parse int for input '" + m10 + '\'', 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    public Void j() {
        return null;
    }

    public e l(f fVar) {
        C6496s.h(fVar, "descriptor");
        if (Y.b(fVar)) {
            return new C6583A(this.f72163c, this.f72161a);
        }
        return super.l(fVar);
    }

    public long m() {
        return this.f72163c.m();
    }

    public Object n(C5977a aVar) {
        C6496s.h(aVar, "deserializer");
        try {
            if (aVar instanceof C6441b) {
                if (!this.f72161a.f().o()) {
                    String c10 = U.c(aVar.getDescriptor(), this.f72161a);
                    String E10 = this.f72163c.E(c10, this.f72167g.p());
                    if (E10 == null) {
                        return U.d(this, aVar);
                    }
                    C5977a a10 = C5982f.a((C6441b) aVar, this, E10);
                    C6496s.f(a10, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.f72166f = new a(c10);
                    return a10.deserialize(this);
                }
            }
            return aVar.deserialize(this);
        } catch (C5986j e10) {
            String message = e10.getMessage();
            C6496s.e(message);
            String w02 = p.w0(p.Z0(message, 10, (String) null, 2, (Object) null), ".");
            String message2 = e10.getMessage();
            C6496s.e(message2);
            C6584a.x(this.f72163c, w02, 0, p.P0(message2, 10, ""), 2, (Object) null);
            throw new C6527k();
        } catch (C5979c e11) {
            String message3 = e11.getMessage();
            C6496s.e(message3);
            if (p.O(message3, "at path", false, 2, (Object) null)) {
                throw e11;
            }
            List a11 = e11.a();
            throw new C5979c(a11, e11.getMessage() + " at path: " + this.f72163c.f72183b.a(), e11);
        }
    }

    public int o(f fVar) {
        int i10;
        C6496s.h(fVar, "descriptor");
        int i11 = b.f72170a[this.f72162b.ordinal()];
        if (i11 == 2) {
            i10 = N();
        } else if (i11 != 4) {
            i10 = M();
        } else {
            i10 = O(fVar);
        }
        if (this.f72162b != d0.MAP) {
            this.f72163c.f72183b.g(i10);
        }
        return i10;
    }

    public short t() {
        long m10 = this.f72163c.m();
        short s10 = (short) ((int) m10);
        if (m10 == ((long) s10)) {
            return s10;
        }
        C6584a aVar = this.f72163c;
        C6584a.x(aVar, "Failed to parse short for input '" + m10 + '\'', 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    public float u() {
        C6584a aVar = this.f72163c;
        String q10 = aVar.q();
        try {
            float parseFloat = Float.parseFloat(q10);
            if (this.f72161a.f().a() || (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            F.l(this.f72163c, Float.valueOf(parseFloat));
            throw new C6527k();
        } catch (IllegalArgumentException unused) {
            C6584a.x(aVar, "Failed to parse type '" + AttributeType.FLOAT + "' for input '" + q10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }

    public double w() {
        C6584a aVar = this.f72163c;
        String q10 = aVar.q();
        try {
            double parseDouble = Double.parseDouble(q10);
            if (this.f72161a.f().a() || (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            F.l(this.f72163c, Double.valueOf(parseDouble));
            throw new C6527k();
        } catch (IllegalArgumentException unused) {
            C6584a.x(aVar, "Failed to parse type '" + "double" + "' for input '" + q10 + '\'', 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }

    public boolean y() {
        return this.f72163c.g();
    }

    public char z() {
        String q10 = this.f72163c.q();
        if (q10.length() == 1) {
            return q10.charAt(0);
        }
        C6584a aVar = this.f72163c;
        C6584a.x(aVar, "Expected single char, but got '" + q10 + '\'', 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }
}

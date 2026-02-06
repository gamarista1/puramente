package i0;

import Y.C0;
import Y.C1474c;
import Y.C1506p;
import Y.I;
import Y.J;
import Y.o1;
import Y.p1;
import a0.C1538b;
import a0.f;
import androidx.collection.H;
import androidx.collection.K;
import androidx.collection.L;
import androidx.collection.N;
import androidx.collection.W;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6527k;
import mf.C6559l;
import mf.C6565s;
import w.C2780Y;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public final class u {

    /* renamed from: k  reason: collision with root package name */
    public static final int f21781k = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f21782a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f21783b = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f21784c;

    /* renamed from: d  reason: collision with root package name */
    private final p f21785d = new b(this);

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f21786e = new c(this);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C1538b f21787f = new C1538b(new a[16], 0);

    /* renamed from: g  reason: collision with root package name */
    private C2052f f21788g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f21789h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public a f21790i;

    /* renamed from: j  reason: collision with root package name */
    private long f21791j = -1;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C6798l f21792a;

        /* renamed from: b  reason: collision with root package name */
        private Object f21793b;

        /* renamed from: c  reason: collision with root package name */
        private H f21794c;

        /* renamed from: d  reason: collision with root package name */
        private int f21795d = -1;

        /* renamed from: e  reason: collision with root package name */
        private final f f21796e = new f();

        /* renamed from: f  reason: collision with root package name */
        private final K f21797f = new K(0, 1, (DefaultConstructorMarker) null);

        /* renamed from: g  reason: collision with root package name */
        private final L f21798g = new L(0, 1, (DefaultConstructorMarker) null);

        /* renamed from: h  reason: collision with root package name */
        private final C1538b f21799h = new C1538b(new I[16], 0);

        /* renamed from: i  reason: collision with root package name */
        private final J f21800i = new C0357a(this);
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f21801j;

        /* renamed from: k  reason: collision with root package name */
        private final f f21802k = new f();

        /* renamed from: l  reason: collision with root package name */
        private final HashMap f21803l = new HashMap();

        /* renamed from: i0.u$a$a  reason: collision with other inner class name */
        public static final class C0357a implements J {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f21804a;

            C0357a(a aVar) {
                this.f21804a = aVar;
            }

            public void a(I i10) {
                a aVar = this.f21804a;
                aVar.f21801j = aVar.f21801j + 1;
            }

            public void b(I i10) {
                a aVar = this.f21804a;
                aVar.f21801j = aVar.f21801j - 1;
            }
        }

        public a(C6798l lVar) {
            this.f21792a = lVar;
        }

        private final void d(Object obj) {
            boolean z10;
            int i10 = this.f21795d;
            H h10 = this.f21794c;
            if (h10 != null) {
                long[] jArr = h10.f12106a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j10) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj2 = h10.f12107b[i14];
                                    if (h10.f12108c[i14] != i10) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    Object obj3 = obj;
                                    if (z10) {
                                        m(obj3, obj2);
                                    }
                                    if (z10) {
                                        h10.p(i14);
                                    }
                                } else {
                                    Object obj4 = obj;
                                }
                                j10 >>= 8;
                            }
                            Object obj5 = obj;
                            if (i12 != 8) {
                                return;
                            }
                        } else {
                            Object obj6 = obj;
                        }
                        if (i11 != length) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        private final void l(Object obj, int i10, Object obj2, H h10) {
            int i11;
            int i12;
            Object obj3 = obj;
            int i13 = i10;
            if (this.f21801j <= 0) {
                int o10 = h10.o(obj3, i13, -1);
                if (!(obj3 instanceof I) || o10 == i13) {
                    i11 = -1;
                } else {
                    I.a p10 = ((I) obj3).p();
                    this.f21803l.put(obj3, p10.a());
                    N b10 = p10.b();
                    f fVar = this.f21802k;
                    fVar.g(obj3);
                    Object[] objArr = b10.f12107b;
                    long[] jArr = b10.f12106a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j10 = jArr[i14];
                            if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j10 & 255) < 128) {
                                        x xVar = (x) objArr[(i14 << 3) + i17];
                                        if (xVar instanceof y) {
                                            ((y) xVar).s(C2053g.a(2));
                                        }
                                        fVar.a(xVar, obj3);
                                        i12 = 8;
                                    } else {
                                        i12 = i15;
                                    }
                                    j10 >>= i12;
                                    i17++;
                                    i15 = i12;
                                }
                                if (i16 != i15) {
                                    break;
                                }
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14++;
                        }
                    }
                    i11 = -1;
                }
                if (o10 == i11) {
                    if (obj3 instanceof y) {
                        ((y) obj3).s(C2053g.a(2));
                    }
                    this.f21796e.a(obj3, obj2);
                }
            }
        }

        private final void m(Object obj, Object obj2) {
            this.f21796e.f(obj2, obj);
            if ((obj2 instanceof I) && !this.f21796e.c(obj2)) {
                this.f21802k.g(obj2);
                this.f21803l.remove(obj2);
            }
        }

        public final void c() {
            this.f21796e.b();
            this.f21797f.h();
            this.f21802k.b();
            this.f21803l.clear();
        }

        public final void e(Object obj) {
            Object obj2 = obj;
            H h10 = (H) this.f21797f.o(obj2);
            if (h10 != null) {
                Object[] objArr = h10.f12107b;
                int[] iArr = h10.f12108c;
                long[] jArr = h10.f12106a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj3 = objArr[i13];
                                    int i14 = iArr[i13];
                                    m(obj2, obj3);
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                return;
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final C6798l f() {
            return this.f21792a;
        }

        public final boolean g() {
            return this.f21797f.f();
        }

        public final void h() {
            L l10 = this.f21798g;
            C6798l lVar = this.f21792a;
            Object[] objArr = l10.f12131b;
            long[] jArr = l10.f12130a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                lVar.invoke(objArr[(i10 << 3) + i12]);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            l10.m();
        }

        /* JADX INFO: finally extract failed */
        public final void i(Object obj, C6798l lVar, C6787a aVar) {
            Object obj2 = this.f21793b;
            H h10 = this.f21794c;
            int i10 = this.f21795d;
            this.f21793b = obj;
            this.f21794c = (H) this.f21797f.b(obj);
            if (this.f21795d == -1) {
                this.f21795d = p.H().f();
            }
            J j10 = this.f21800i;
            C1538b c10 = p1.c();
            try {
                c10.b(j10);
                C2057k.f21728e.h(lVar, (C6798l) null, aVar);
                c10.y(c10.q() - 1);
                Object obj3 = this.f21793b;
                C6496s.e(obj3);
                d(obj3);
                this.f21793b = obj2;
                this.f21794c = h10;
                this.f21795d = i10;
            } catch (Throwable th2) {
                c10.y(c10.q() - 1);
                throw th2;
            }
        }

        public final boolean j(Set set) {
            boolean z10;
            Iterator it;
            String str;
            HashMap hashMap;
            Object obj;
            char c10;
            Object b10;
            char c11;
            HashMap hashMap2;
            Object[] objArr;
            long[] jArr;
            Iterator it2;
            HashMap hashMap3;
            Object obj2;
            f fVar;
            long[] jArr2;
            Object[] objArr2;
            int i10;
            String str2;
            long[] jArr3;
            long[] jArr4;
            char c12;
            f fVar2;
            f fVar3;
            String str3;
            Object[] objArr3;
            long[] jArr5;
            HashMap hashMap4;
            int i11;
            long[] jArr6;
            f fVar4;
            HashMap hashMap5;
            f fVar5;
            Object[] objArr4;
            String str4;
            int i12;
            int i13;
            long j10;
            int i14;
            Object obj3;
            char c13;
            Object b11;
            char c14;
            HashMap hashMap6;
            Object[] objArr5;
            f fVar6;
            HashMap hashMap7;
            f fVar7;
            String str5;
            long j11;
            Object obj4;
            Object[] objArr6;
            f fVar8;
            char c15;
            Set set2 = set;
            f fVar9 = this.f21802k;
            HashMap hashMap8 = this.f21803l;
            f fVar10 = this.f21796e;
            L l10 = this.f21798g;
            String str6 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            char c16 = 7;
            long j12 = -9187201950435737472L;
            int i15 = 0;
            if (set2 instanceof a0.d) {
                W a10 = ((a0.d) set2).a();
                Object[] objArr7 = a10.f12131b;
                long[] jArr7 = a10.f12130a;
                int length = jArr7.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    z10 = false;
                    while (true) {
                        long j13 = jArr7[i16];
                        int i17 = length;
                        if ((((~j13) << c16) & j13 & j12) != j12) {
                            int i18 = 8 - ((~(i16 - i17)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j13 & 255) < 128) {
                                    Object obj5 = objArr7[(i16 << 3) + i19];
                                    if (!(obj5 instanceof y) || ((y) obj5).q(C2053g.a(2))) {
                                        if (!fVar9.c(obj5) || (b11 = fVar9.d().b(obj5)) == null) {
                                            jArr6 = jArr7;
                                            fVar4 = fVar9;
                                            hashMap5 = hashMap8;
                                            fVar5 = fVar10;
                                            objArr4 = objArr7;
                                            str4 = str6;
                                            i12 = i18;
                                            i13 = i19;
                                            j10 = j13;
                                            i14 = i16;
                                            obj3 = obj5;
                                        } else if (b11 instanceof L) {
                                            L l11 = (L) b11;
                                            Object[] objArr8 = l11.f12131b;
                                            long[] jArr8 = l11.f12130a;
                                            jArr6 = jArr7;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                objArr4 = objArr7;
                                                i12 = i18;
                                                i13 = i19;
                                                int i20 = 0;
                                                while (true) {
                                                    long j14 = jArr8[i20];
                                                    long[] jArr9 = jArr8;
                                                    i14 = i16;
                                                    if ((((~j14) << 7) & j14 & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                        int i22 = 0;
                                                        while (i22 < i21) {
                                                            if ((j14 & 255) < 128) {
                                                                objArr6 = objArr8;
                                                                I i23 = (I) objArr8[(i20 << 3) + i22];
                                                                C6496s.f(i23, str6);
                                                                str5 = str6;
                                                                Object obj6 = hashMap8.get(i23);
                                                                o1 d10 = i23.d();
                                                                if (d10 == null) {
                                                                    d10 = p1.q();
                                                                }
                                                                fVar6 = fVar9;
                                                                j11 = j13;
                                                                if (!d10.b(i23.p().a(), obj6)) {
                                                                    Object b12 = fVar10.d().b(i23);
                                                                    if (b12 != null) {
                                                                        if (b12 instanceof L) {
                                                                            L l12 = (L) b12;
                                                                            Object[] objArr9 = l12.f12131b;
                                                                            long[] jArr10 = l12.f12130a;
                                                                            int length3 = jArr10.length - 2;
                                                                            if (length3 >= 0) {
                                                                                obj4 = obj5;
                                                                                int i24 = 0;
                                                                                while (true) {
                                                                                    long j15 = jArr10[i24];
                                                                                    long[] jArr11 = jArr10;
                                                                                    hashMap7 = hashMap8;
                                                                                    if ((((~j15) << 7) & j15 & -9187201950435737472L) != -9187201950435737472L) {
                                                                                        int i25 = 8 - ((~(i24 - length3)) >>> 31);
                                                                                        int i26 = 0;
                                                                                        while (i26 < i25) {
                                                                                            if ((j15 & 255) < 128) {
                                                                                                fVar8 = fVar10;
                                                                                                l10.h(objArr9[(i24 << 3) + i26]);
                                                                                                c15 = 8;
                                                                                                z10 = true;
                                                                                            } else {
                                                                                                fVar8 = fVar10;
                                                                                                c15 = 8;
                                                                                            }
                                                                                            j15 >>= c15;
                                                                                            i26++;
                                                                                            fVar10 = fVar8;
                                                                                        }
                                                                                        fVar7 = fVar10;
                                                                                        if (i25 != 8) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        fVar7 = fVar10;
                                                                                    }
                                                                                    if (i24 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i24++;
                                                                                    hashMap8 = hashMap7;
                                                                                    jArr10 = jArr11;
                                                                                    fVar10 = fVar7;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            hashMap7 = hashMap8;
                                                                            fVar7 = fVar10;
                                                                            obj4 = obj5;
                                                                            l10.h(b12);
                                                                            z10 = true;
                                                                        }
                                                                    }
                                                                    hashMap7 = hashMap8;
                                                                    fVar7 = fVar10;
                                                                    obj4 = obj5;
                                                                } else {
                                                                    hashMap7 = hashMap8;
                                                                    fVar7 = fVar10;
                                                                    obj4 = obj5;
                                                                    this.f21799h.b(i23);
                                                                }
                                                            } else {
                                                                fVar6 = fVar9;
                                                                hashMap7 = hashMap8;
                                                                fVar7 = fVar10;
                                                                str5 = str6;
                                                                j11 = j13;
                                                                obj4 = obj5;
                                                                objArr6 = objArr8;
                                                            }
                                                            j14 >>= 8;
                                                            i22++;
                                                            str6 = str5;
                                                            objArr8 = objArr6;
                                                            obj5 = obj4;
                                                            fVar9 = fVar6;
                                                            j13 = j11;
                                                            hashMap8 = hashMap7;
                                                            fVar10 = fVar7;
                                                        }
                                                        fVar4 = fVar9;
                                                        hashMap6 = hashMap8;
                                                        fVar5 = fVar10;
                                                        str4 = str6;
                                                        j10 = j13;
                                                        obj3 = obj5;
                                                        objArr5 = objArr8;
                                                        if (i21 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        fVar4 = fVar9;
                                                        hashMap6 = hashMap8;
                                                        fVar5 = fVar10;
                                                        str4 = str6;
                                                        j10 = j13;
                                                        obj3 = obj5;
                                                        objArr5 = objArr8;
                                                    }
                                                    if (i20 == length2) {
                                                        break;
                                                    }
                                                    i20++;
                                                    i16 = i14;
                                                    jArr8 = jArr9;
                                                    str6 = str4;
                                                    objArr8 = objArr5;
                                                    obj5 = obj3;
                                                    fVar9 = fVar4;
                                                    j13 = j10;
                                                    hashMap8 = hashMap6;
                                                    fVar10 = fVar5;
                                                }
                                            } else {
                                                fVar4 = fVar9;
                                                hashMap6 = hashMap8;
                                                fVar5 = fVar10;
                                                objArr4 = objArr7;
                                                str4 = str6;
                                                i12 = i18;
                                                i13 = i19;
                                                j10 = j13;
                                                i14 = i16;
                                                obj3 = obj5;
                                            }
                                            hashMap5 = hashMap6;
                                        } else {
                                            jArr6 = jArr7;
                                            fVar4 = fVar9;
                                            fVar5 = fVar10;
                                            objArr4 = objArr7;
                                            str4 = str6;
                                            i12 = i18;
                                            i13 = i19;
                                            j10 = j13;
                                            i14 = i16;
                                            obj3 = obj5;
                                            I i27 = (I) b11;
                                            hashMap5 = hashMap8;
                                            Object obj7 = hashMap5.get(i27);
                                            o1 d11 = i27.d();
                                            if (d11 == null) {
                                                d11 = p1.q();
                                            }
                                            if (!d11.b(i27.p().a(), obj7)) {
                                                Object b13 = fVar5.d().b(i27);
                                                if (b13 != null) {
                                                    if (b13 instanceof L) {
                                                        L l13 = (L) b13;
                                                        Object[] objArr10 = l13.f12131b;
                                                        long[] jArr12 = l13.f12130a;
                                                        int length4 = jArr12.length - 2;
                                                        if (length4 >= 0) {
                                                            int i28 = 0;
                                                            while (true) {
                                                                long j16 = jArr12[i28];
                                                                if ((((~j16) << 7) & j16 & -9187201950435737472L) != -9187201950435737472L) {
                                                                    int i29 = 8 - ((~(i28 - length4)) >>> 31);
                                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                                        if ((j16 & 255) < 128) {
                                                                            l10.h(objArr10[(i28 << 3) + i30]);
                                                                            c14 = 8;
                                                                            z10 = true;
                                                                        } else {
                                                                            c14 = 8;
                                                                        }
                                                                        j16 >>= c14;
                                                                    }
                                                                    if (i29 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i28 == length4) {
                                                                    break;
                                                                }
                                                                i28++;
                                                            }
                                                        }
                                                    } else {
                                                        l10.h(b13);
                                                        z10 = true;
                                                    }
                                                }
                                            } else {
                                                this.f21799h.b(i27);
                                            }
                                        }
                                        Object b14 = fVar5.d().b(obj3);
                                        if (b14 != null) {
                                            if (b14 instanceof L) {
                                                L l14 = (L) b14;
                                                Object[] objArr11 = l14.f12131b;
                                                long[] jArr13 = l14.f12130a;
                                                int length5 = jArr13.length - 2;
                                                if (length5 >= 0) {
                                                    int i31 = 0;
                                                    while (true) {
                                                        long j17 = jArr13[i31];
                                                        if ((((~j17) << 7) & j17 & -9187201950435737472L) != -9187201950435737472L) {
                                                            int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                                            for (int i33 = 0; i33 < i32; i33++) {
                                                                if ((j17 & 255) < 128) {
                                                                    l10.h(objArr11[(i31 << 3) + i33]);
                                                                    c13 = 8;
                                                                    z10 = true;
                                                                } else {
                                                                    c13 = 8;
                                                                }
                                                                j17 >>= c13;
                                                            }
                                                            if (i32 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i31 == length5) {
                                                            break;
                                                        }
                                                        i31++;
                                                    }
                                                }
                                            } else {
                                                l10.h(b14);
                                                z10 = true;
                                            }
                                        }
                                        j13 = j10 >> 8;
                                        i19 = i13 + 1;
                                        hashMap8 = hashMap5;
                                        jArr7 = jArr6;
                                        objArr7 = objArr4;
                                        i18 = i12;
                                        i16 = i14;
                                        str6 = str4;
                                        fVar9 = fVar4;
                                        fVar10 = fVar5;
                                    }
                                }
                                jArr6 = jArr7;
                                fVar4 = fVar9;
                                hashMap5 = hashMap8;
                                fVar5 = fVar10;
                                objArr4 = objArr7;
                                str4 = str6;
                                i12 = i18;
                                i13 = i19;
                                j10 = j13;
                                i14 = i16;
                                j13 = j10 >> 8;
                                i19 = i13 + 1;
                                hashMap8 = hashMap5;
                                jArr7 = jArr6;
                                objArr7 = objArr4;
                                i18 = i12;
                                i16 = i14;
                                str6 = str4;
                                fVar9 = fVar4;
                                fVar10 = fVar5;
                            }
                            jArr5 = jArr7;
                            fVar3 = fVar9;
                            hashMap4 = hashMap8;
                            fVar2 = fVar10;
                            objArr3 = objArr7;
                            str3 = str6;
                            int i34 = i16;
                            if (i18 != 8) {
                                break;
                            }
                            length = i17;
                            i11 = i34;
                        } else {
                            jArr5 = jArr7;
                            fVar3 = fVar9;
                            hashMap4 = hashMap8;
                            fVar2 = fVar10;
                            objArr3 = objArr7;
                            str3 = str6;
                            length = i17;
                            i11 = i16;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i16 = i11 + 1;
                        hashMap8 = hashMap4;
                        jArr7 = jArr5;
                        objArr7 = objArr3;
                        str6 = str3;
                        fVar9 = fVar3;
                        fVar10 = fVar2;
                        c16 = 7;
                        j12 = -9187201950435737472L;
                    }
                } else {
                    z10 = false;
                }
            } else {
                f fVar11 = fVar9;
                HashMap hashMap9 = hashMap8;
                f fVar12 = fVar10;
                String str7 = str6;
                Iterator it3 = set2.iterator();
                z10 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof y) || ((y) next).q(C2053g.a(2))) {
                        f fVar13 = fVar11;
                        if (!fVar13.c(next) || (b10 = fVar13.d().b(next)) == null) {
                            it = it3;
                            hashMap = hashMap9;
                            obj = next;
                            fVar11 = fVar13;
                            str = str7;
                        } else if (b10 instanceof L) {
                            L l15 = (L) b10;
                            Object[] objArr12 = l15.f12131b;
                            long[] jArr14 = l15.f12130a;
                            int length6 = jArr14.length - 2;
                            if (length6 >= 0) {
                                int i35 = 0;
                                while (true) {
                                    long j18 = jArr14[i35];
                                    if ((((~j18) << 7) & j18 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i36 = 8 - ((~(i35 - length6)) >>> 31);
                                        int i37 = 0;
                                        while (i37 < i36) {
                                            if ((j18 & 255) < 128) {
                                                I i38 = (I) objArr12[(i35 << 3) + i37];
                                                str2 = str7;
                                                C6496s.f(i38, str2);
                                                it2 = it3;
                                                Object obj8 = hashMap9.get(i38);
                                                o1 d12 = i38.d();
                                                if (d12 == null) {
                                                    d12 = p1.q();
                                                }
                                                fVar = fVar13;
                                                jArr2 = jArr14;
                                                if (!d12.b(i38.p().a(), obj8)) {
                                                    Object b15 = fVar12.d().b(i38);
                                                    if (b15 != null) {
                                                        if (b15 instanceof L) {
                                                            L l16 = (L) b15;
                                                            Object[] objArr13 = l16.f12131b;
                                                            long[] jArr15 = l16.f12130a;
                                                            int length7 = jArr15.length - 2;
                                                            if (length7 >= 0) {
                                                                hashMap3 = hashMap9;
                                                                obj2 = next;
                                                                int i39 = 0;
                                                                while (true) {
                                                                    long j19 = jArr15[i39];
                                                                    objArr2 = objArr12;
                                                                    i10 = length6;
                                                                    if ((((~j19) << 7) & j19 & -9187201950435737472L) != -9187201950435737472L) {
                                                                        int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                                        int i41 = 0;
                                                                        while (i41 < i40) {
                                                                            if ((j19 & 255) < 128) {
                                                                                jArr4 = jArr15;
                                                                                l10.h(objArr13[(i39 << 3) + i41]);
                                                                                c12 = 8;
                                                                                z10 = true;
                                                                            } else {
                                                                                jArr4 = jArr15;
                                                                                c12 = 8;
                                                                            }
                                                                            j19 >>= c12;
                                                                            i41++;
                                                                            jArr15 = jArr4;
                                                                        }
                                                                        jArr3 = jArr15;
                                                                        if (i40 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr15;
                                                                    }
                                                                    if (i39 == length7) {
                                                                        break;
                                                                    }
                                                                    i39++;
                                                                    objArr12 = objArr2;
                                                                    length6 = i10;
                                                                    jArr15 = jArr3;
                                                                }
                                                            }
                                                        } else {
                                                            hashMap3 = hashMap9;
                                                            obj2 = next;
                                                            objArr2 = objArr12;
                                                            i10 = length6;
                                                            l10.h(b15);
                                                            z10 = true;
                                                        }
                                                    }
                                                    hashMap3 = hashMap9;
                                                    obj2 = next;
                                                    objArr2 = objArr12;
                                                    i10 = length6;
                                                } else {
                                                    hashMap3 = hashMap9;
                                                    obj2 = next;
                                                    objArr2 = objArr12;
                                                    i10 = length6;
                                                    this.f21799h.b(i38);
                                                }
                                            } else {
                                                it2 = it3;
                                                hashMap3 = hashMap9;
                                                obj2 = next;
                                                fVar = fVar13;
                                                jArr2 = jArr14;
                                                objArr2 = objArr12;
                                                i10 = length6;
                                                str2 = str7;
                                            }
                                            j18 >>= 8;
                                            i37++;
                                            it3 = it2;
                                            str7 = str2;
                                            next = obj2;
                                            jArr14 = jArr2;
                                            objArr12 = objArr2;
                                            length6 = i10;
                                            fVar13 = fVar;
                                            hashMap9 = hashMap3;
                                        }
                                        it = it3;
                                        hashMap2 = hashMap9;
                                        obj = next;
                                        fVar11 = fVar13;
                                        jArr = jArr14;
                                        objArr = objArr12;
                                        int i42 = length6;
                                        str = str7;
                                        if (i36 != 8) {
                                            break;
                                        }
                                        length6 = i42;
                                    } else {
                                        it = it3;
                                        hashMap2 = hashMap9;
                                        obj = next;
                                        fVar11 = fVar13;
                                        jArr = jArr14;
                                        objArr = objArr12;
                                        str = str7;
                                    }
                                    if (i35 == length6) {
                                        break;
                                    }
                                    i35++;
                                    it3 = it;
                                    str7 = str;
                                    next = obj;
                                    jArr14 = jArr;
                                    objArr12 = objArr;
                                    fVar13 = fVar11;
                                    hashMap9 = hashMap2;
                                }
                            } else {
                                it = it3;
                                hashMap2 = hashMap9;
                                obj = next;
                                fVar11 = fVar13;
                                str = str7;
                            }
                            hashMap = hashMap2;
                        } else {
                            it = it3;
                            obj = next;
                            fVar11 = fVar13;
                            str = str7;
                            I i43 = (I) b10;
                            hashMap = hashMap9;
                            Object obj9 = hashMap.get(i43);
                            o1 d13 = i43.d();
                            if (d13 == null) {
                                d13 = p1.q();
                            }
                            if (!d13.b(i43.p().a(), obj9)) {
                                Object b16 = fVar12.d().b(i43);
                                if (b16 != null) {
                                    if (b16 instanceof L) {
                                        L l17 = (L) b16;
                                        Object[] objArr14 = l17.f12131b;
                                        long[] jArr16 = l17.f12130a;
                                        int length8 = jArr16.length - 2;
                                        if (length8 >= 0) {
                                            int i44 = 0;
                                            while (true) {
                                                long j20 = jArr16[i44];
                                                if ((((~j20) << 7) & j20 & -9187201950435737472L) != -9187201950435737472L) {
                                                    int i45 = 8 - ((~(i44 - length8)) >>> 31);
                                                    for (int i46 = 0; i46 < i45; i46++) {
                                                        if ((j20 & 255) < 128) {
                                                            l10.h(objArr14[(i44 << 3) + i46]);
                                                            c11 = 8;
                                                            z10 = true;
                                                        } else {
                                                            c11 = 8;
                                                        }
                                                        j20 >>= c11;
                                                    }
                                                    if (i45 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i44 == length8) {
                                                    break;
                                                }
                                                i44++;
                                            }
                                        }
                                    } else {
                                        l10.h(b16);
                                        z10 = true;
                                    }
                                }
                            } else {
                                this.f21799h.b(i43);
                            }
                        }
                        Object b17 = fVar12.d().b(obj);
                        if (b17 != null) {
                            if (b17 instanceof L) {
                                L l18 = (L) b17;
                                Object[] objArr15 = l18.f12131b;
                                long[] jArr17 = l18.f12130a;
                                int length9 = jArr17.length - 2;
                                if (length9 >= 0) {
                                    int i47 = 0;
                                    while (true) {
                                        long j21 = jArr17[i47];
                                        if ((((~j21) << 7) & j21 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i48 = 8 - ((~(i47 - length9)) >>> 31);
                                            for (int i49 = 0; i49 < i48; i49++) {
                                                if ((j21 & 255) < 128) {
                                                    l10.h(objArr15[(i47 << 3) + i49]);
                                                    c10 = 8;
                                                    z10 = true;
                                                } else {
                                                    c10 = 8;
                                                }
                                                j21 >>= c10;
                                            }
                                            if (i48 != 8) {
                                                break;
                                            }
                                        }
                                        if (i47 == length9) {
                                            break;
                                        }
                                        i47++;
                                    }
                                }
                            } else {
                                l10.h(b17);
                                z10 = true;
                            }
                            hashMap9 = hashMap;
                            str7 = str;
                            it3 = it;
                        }
                    } else {
                        it = it3;
                        hashMap = hashMap9;
                        str = str7;
                    }
                    hashMap9 = hashMap;
                    str7 = str;
                    it3 = it;
                }
            }
            if (this.f21799h.t()) {
                C1538b bVar = this.f21799h;
                int q10 = bVar.q();
                if (q10 > 0) {
                    Object[] p10 = bVar.p();
                    while (true) {
                        o((I) p10[i15]);
                        int i50 = i15 + 1;
                        if (i50 >= q10) {
                            break;
                        }
                        i15 = i50;
                    }
                }
                this.f21799h.i();
            }
            return z10;
        }

        public final void k(Object obj) {
            Object obj2 = this.f21793b;
            C6496s.e(obj2);
            int i10 = this.f21795d;
            H h10 = this.f21794c;
            if (h10 == null) {
                h10 = new H(0, 1, (DefaultConstructorMarker) null);
                this.f21794c = h10;
                this.f21797f.r(obj2, h10);
                C6514M m10 = C6514M.f71813a;
            }
            l(obj, i10, obj2, h10);
        }

        public final void n(C6798l lVar) {
            long[] jArr;
            int i10;
            long j10;
            int i11;
            int i12;
            long[] jArr2;
            long j11;
            int i13;
            K k10 = this.f21797f;
            long[] jArr3 = k10.f12123a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j12 = jArr3[i14];
                    long j13 = -9187201950435737472L;
                    if ((((~j12) << 7) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j12 & 255) < 128) {
                                int i18 = (i14 << 3) + i17;
                                Object obj = k10.f12124b[i18];
                                H h10 = (H) k10.f12125c[i18];
                                Boolean bool = (Boolean) lVar.invoke(obj);
                                if (bool.booleanValue()) {
                                    Object[] objArr = h10.f12107b;
                                    int[] iArr = h10.f12108c;
                                    long[] jArr4 = h10.f12106a;
                                    int length2 = jArr4.length - 2;
                                    jArr2 = jArr3;
                                    if (length2 >= 0) {
                                        i12 = i16;
                                        int i19 = 0;
                                        while (true) {
                                            long j14 = jArr4[i19];
                                            i11 = i14;
                                            j10 = j12;
                                            j11 = -9187201950435737472L;
                                            if ((((~j14) << 7) & j14 & -9187201950435737472L) != -9187201950435737472L) {
                                                int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                for (int i21 = 0; i21 < i20; i21++) {
                                                    if ((j14 & 255) < 128) {
                                                        int i22 = (i19 << 3) + i21;
                                                        Object obj2 = objArr[i22];
                                                        int i23 = iArr[i22];
                                                        m(obj, obj2);
                                                    }
                                                    j14 >>= 8;
                                                }
                                                if (i20 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i19 == length2) {
                                                break;
                                            }
                                            i19++;
                                            i14 = i11;
                                            j12 = j10;
                                        }
                                    } else {
                                        i11 = i14;
                                        j10 = j12;
                                        i12 = i16;
                                        j11 = -9187201950435737472L;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i11 = i14;
                                    j10 = j12;
                                    i12 = i16;
                                    j11 = j13;
                                }
                                if (bool.booleanValue()) {
                                    k10.p(i18);
                                }
                                i13 = 8;
                            } else {
                                jArr2 = jArr3;
                                i11 = i14;
                                j10 = j12;
                                i12 = i16;
                                j11 = j13;
                                i13 = i15;
                            }
                            j12 = j10 >> i13;
                            i17++;
                            i15 = i13;
                            j13 = j11;
                            jArr3 = jArr2;
                            i16 = i12;
                            i14 = i11;
                        }
                        jArr = jArr3;
                        int i24 = i14;
                        if (i16 == i15) {
                            i10 = i24;
                        } else {
                            return;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = i14;
                    }
                    if (i10 != length) {
                        i14 = i10 + 1;
                        jArr3 = jArr;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void o(I i10) {
            long[] jArr;
            long[] jArr2;
            int i11;
            H h10;
            I i12 = i10;
            K k10 = this.f21797f;
            int f10 = p.H().f();
            Object b10 = this.f21796e.d().b(i12);
            if (b10 == null) {
                return;
            }
            if (b10 instanceof L) {
                L l10 = (L) b10;
                Object[] objArr = l10.f12131b;
                long[] jArr3 = l10.f12130a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr3[i13];
                        if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j10 & 255) < 128) {
                                    Object obj = objArr[(i13 << 3) + i16];
                                    H h11 = (H) k10.b(obj);
                                    jArr2 = jArr3;
                                    if (h11 == null) {
                                        h10 = new H(0, 1, (DefaultConstructorMarker) null);
                                        k10.r(obj, h10);
                                        C6514M m10 = C6514M.f71813a;
                                    } else {
                                        h10 = h11;
                                    }
                                    l(i12, f10, obj, h10);
                                    i11 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i11 = i14;
                                }
                                j10 >>= i11;
                                i16++;
                                i14 = i11;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i15 != i14) {
                                return;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i13 != length) {
                            i13++;
                            jArr3 = jArr;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                H h12 = (H) k10.b(b10);
                if (h12 == null) {
                    h12 = new H(0, 1, (DefaultConstructorMarker) null);
                    k10.r(b10, h12);
                    C6514M m11 = C6514M.f71813a;
                }
                l(i12, f10, b10, h12);
            }
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f21805a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(u uVar) {
            super(2);
            this.f21805a = uVar;
        }

        public final void a(Set set, C2057k kVar) {
            this.f21805a.i(set);
            if (this.f21805a.m()) {
                this.f21805a.r();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Set) obj, (C2057k) obj2);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f21806a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(u uVar) {
            super(1);
            this.f21806a = uVar;
        }

        public final void a(Object obj) {
            if (!this.f21806a.f21789h) {
                C1538b d10 = this.f21806a.f21787f;
                u uVar = this.f21806a;
                synchronized (d10) {
                    a c10 = uVar.f21790i;
                    C6496s.e(c10);
                    c10.k(obj);
                    C6514M m10 = C6514M.f71813a;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f21807a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(u uVar) {
            super(0);
            this.f21807a = uVar;
        }

        public final void invoke() {
            do {
                C1538b d10 = this.f21807a.f21787f;
                u uVar = this.f21807a;
                synchronized (d10) {
                    try {
                        if (!uVar.f21784c) {
                            uVar.f21784c = true;
                            C1538b d11 = uVar.f21787f;
                            int q10 = d11.q();
                            if (q10 > 0) {
                                Object[] p10 = d11.p();
                                int i10 = 0;
                                do {
                                    ((a) p10[i10]).h();
                                    i10++;
                                } while (i10 < q10);
                            }
                            uVar.f21784c = false;
                        }
                        C6514M m10 = C6514M.f71813a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (this.f21807a.m());
        }
    }

    public u(C6798l lVar) {
        this.f21782a = lVar;
    }

    /* access modifiers changed from: private */
    public final void i(Set set) {
        Object obj;
        Collection collection;
        do {
            obj = this.f21783b.get();
            if (obj == null) {
                collection = set;
            } else if (obj instanceof Set) {
                collection = C6565s.q(obj, set);
            } else if (obj instanceof List) {
                collection = C6565s.K0((Collection) obj, C6565s.e(set));
            } else {
                q();
                throw new C6527k();
            }
        } while (!C2780Y.a(this.f21783b, obj, collection));
    }

    /* access modifiers changed from: private */
    public final boolean m() {
        boolean z10;
        synchronized (this.f21787f) {
            z10 = this.f21784c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set p10 = p();
            if (p10 == null) {
                return z11;
            }
            synchronized (this.f21787f) {
                try {
                    C1538b bVar = this.f21787f;
                    int q10 = bVar.q();
                    if (q10 > 0) {
                        Object[] p11 = bVar.p();
                        int i10 = 0;
                        do {
                            if (!((a) p11[i10]).j(p10)) {
                                if (!z11) {
                                    z11 = false;
                                    i10++;
                                }
                            }
                            z11 = true;
                            i10++;
                        } while (i10 < q10);
                    }
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final i0.u.a n(yf.C6798l r6) {
        /*
            r5 = this;
            a0.b r0 = r5.f21787f
            int r1 = r0.q()
            if (r1 <= 0) goto L_0x001d
            java.lang.Object[] r0 = r0.p()
            r2 = 0
        L_0x000d:
            r3 = r0[r2]
            r4 = r3
            i0.u$a r4 = (i0.u.a) r4
            yf.l r4 = r4.f()
            if (r4 != r6) goto L_0x0019
            goto L_0x001e
        L_0x0019:
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x000d
        L_0x001d:
            r3 = 0
        L_0x001e:
            i0.u$a r3 = (i0.u.a) r3
            if (r3 != 0) goto L_0x0039
            i0.u$a r0 = new i0.u$a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            kotlin.jvm.internal.C6496s.f(r6, r1)
            r1 = 1
            java.lang.Object r6 = kotlin.jvm.internal.V.f(r6, r1)
            yf.l r6 = (yf.C6798l) r6
            r0.<init>(r6)
            a0.b r6 = r5.f21787f
            r6.b(r0)
            return r0
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.u.n(yf.l):i0.u$a");
    }

    private final Set p() {
        Object obj;
        Object obj2;
        Set set;
        do {
            obj = this.f21783b.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                q();
                throw new C6527k();
            }
        } while (!C2780Y.a(this.f21783b, obj, obj2));
        return set;
    }

    private final Void q() {
        C1506p.s("Unexpected notification");
        throw new C6527k();
    }

    /* access modifiers changed from: private */
    public final void r() {
        this.f21782a.invoke(new d(this));
    }

    public final void j() {
        synchronized (this.f21787f) {
            try {
                C1538b bVar = this.f21787f;
                int q10 = bVar.q();
                if (q10 > 0) {
                    Object[] p10 = bVar.p();
                    int i10 = 0;
                    do {
                        ((a) p10[i10]).c();
                        i10++;
                    } while (i10 < q10);
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(Object obj) {
        synchronized (this.f21787f) {
            try {
                C1538b bVar = this.f21787f;
                int q10 = bVar.q();
                int i10 = 0;
                for (int i11 = 0; i11 < q10; i11++) {
                    a aVar = (a) bVar.p()[i11];
                    aVar.e(obj);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.p()[i11 - i10] = bVar.p()[i11];
                    }
                }
                int i12 = q10 - i10;
                C6559l.w(bVar.p(), (Object) null, i12, q10);
                bVar.C(i12);
                C6514M m10 = C6514M.f71813a;
            } finally {
            }
        }
    }

    public final void l(C6798l lVar) {
        synchronized (this.f21787f) {
            try {
                C1538b bVar = this.f21787f;
                int q10 = bVar.q();
                int i10 = 0;
                for (int i11 = 0; i11 < q10; i11++) {
                    a aVar = (a) bVar.p()[i11];
                    aVar.n(lVar);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.p()[i11 - i10] = bVar.p()[i11];
                    }
                }
                int i12 = q10 - i10;
                C6559l.w(bVar.p(), (Object) null, i12, q10);
                bVar.C(i12);
                C6514M m10 = C6514M.f71813a;
            } finally {
            }
        }
    }

    public final void o(Object obj, C6798l lVar, C6787a aVar) {
        a n10;
        boolean z10;
        synchronized (this.f21787f) {
            n10 = n(lVar);
        }
        boolean z11 = this.f21789h;
        a aVar2 = this.f21790i;
        long j10 = this.f21791j;
        if (j10 != -1) {
            if (j10 == C1474c.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + C1474c.a() + ", name=" + C1474c.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f21789h = false;
            this.f21790i = n10;
            this.f21791j = C1474c.a();
            n10.i(obj, this.f21786e, aVar);
        } finally {
            this.f21790i = aVar2;
            this.f21789h = z11;
            this.f21791j = j10;
        }
    }

    public final void s() {
        this.f21788g = C2057k.f21728e.i(this.f21785d);
    }

    public final void t() {
        C2052f fVar = this.f21788g;
        if (fVar != null) {
            fVar.dispose();
        }
    }
}

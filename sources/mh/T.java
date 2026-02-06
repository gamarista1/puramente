package mh;

import ih.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6517a;
import lf.C6518b;
import lf.C6519c;
import lf.C6527k;
import lf.w;
import lh.C6539c;
import lh.g;
import lh.i;
import lh.p;
import lh.t;
import lh.v;
import lh.x;
import qf.C6658d;
import rf.C6680b;
import yf.q;

public final class T {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6584a f72144a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f72145b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72146c;

    /* renamed from: d  reason: collision with root package name */
    private int f72147d;

    static final class a extends k implements q {

        /* renamed from: b  reason: collision with root package name */
        int f72148b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f72149c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ T f72150d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(T t10, C6658d dVar) {
            super(3, dVar);
            this.f72150d = t10;
        }

        /* renamed from: i */
        public final Object invoke(C6519c cVar, C6514M m10, C6658d dVar) {
            a aVar = new a(this.f72150d, dVar);
            aVar.f72149c = cVar;
            return aVar.invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f72148b;
            if (i10 == 0) {
                w.b(obj);
                C6519c cVar = (C6519c) this.f72149c;
                byte F10 = this.f72150d.f72144a.F();
                if (F10 == 1) {
                    return this.f72150d.j(true);
                }
                if (F10 == 0) {
                    return this.f72150d.j(false);
                }
                if (F10 == 6) {
                    T t10 = this.f72150d;
                    this.f72148b = 1;
                    obj = t10.h(cVar, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (F10 == 8) {
                    return this.f72150d.f();
                } else {
                    C6584a.x(this.f72150d.f72144a, "Can't begin reading element, unexpected token", 0, (String) null, 6, (Object) null);
                    throw new C6527k();
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (i) obj;
        }
    }

    static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f72151a;

        /* renamed from: b  reason: collision with root package name */
        Object f72152b;

        /* renamed from: c  reason: collision with root package name */
        Object f72153c;

        /* renamed from: d  reason: collision with root package name */
        Object f72154d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f72155e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T f72156f;

        /* renamed from: g  reason: collision with root package name */
        int f72157g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(T t10, C6658d dVar) {
            super(dVar);
            this.f72156f = t10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f72155e = obj;
            this.f72157g |= Integer.MIN_VALUE;
            return this.f72156f.h((C6519c) null, this);
        }
    }

    public T(g gVar, C6584a aVar) {
        C6496s.h(gVar, "configuration");
        C6496s.h(aVar, "lexer");
        this.f72144a = aVar;
        this.f72145b = gVar.p();
        this.f72146c = gVar.c();
    }

    /* access modifiers changed from: private */
    public final i f() {
        boolean z10;
        byte j10 = this.f72144a.j();
        if (this.f72144a.F() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f72144a.e()) {
                arrayList.add(e());
                j10 = this.f72144a.j();
                if (j10 != 4) {
                    C6584a aVar = this.f72144a;
                    if (j10 == 9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i10 = aVar.f72182a;
                    if (!z10) {
                        C6584a.x(aVar, "Expected end of the array or comma", i10, (String) null, 4, (Object) null);
                        throw new C6527k();
                    }
                }
            }
            if (j10 == 8) {
                this.f72144a.k((byte) 9);
            } else if (j10 == 4) {
                if (this.f72146c) {
                    this.f72144a.k((byte) 9);
                } else {
                    F.h(this.f72144a, "array");
                    throw new C6527k();
                }
            }
            return new C6539c(arrayList);
        }
        C6584a.x(this.f72144a, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    private final i g() {
        return (i) C6518b.b(new C6517a(new a(this, (C6658d) null)), C6514M.f71813a);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(lf.C6519c r21, qf.C6658d r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof mh.T.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            mh.T$b r2 = (mh.T.b) r2
            int r3 = r2.f72157g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f72157g = r3
            goto L_0x001c
        L_0x0017:
            mh.T$b r2 = new mh.T$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f72155e
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r2.f72157g
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r4 == 0) goto L_0x0048
            if (r4 != r8) goto L_0x0040
            java.lang.Object r4 = r2.f72154d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r2.f72153c
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            java.lang.Object r10 = r2.f72152b
            mh.T r10 = (mh.T) r10
            java.lang.Object r11 = r2.f72151a
            lf.c r11 = (lf.C6519c) r11
            lf.w.b(r1)
            goto L_0x00a0
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            lf.w.b(r1)
            mh.a r1 = r0.f72144a
            byte r1 = r1.k(r5)
            mh.a r4 = r0.f72144a
            byte r4 = r4.F()
            if (r4 == r7) goto L_0x00ee
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r10 = r0
            r9 = r4
            r4 = r2
            r2 = r1
            r1 = r21
        L_0x0064:
            mh.a r11 = r10.f72144a
            boolean r11 = r11.e()
            if (r11 == 0) goto L_0x00c8
            boolean r2 = r10.f72145b
            if (r2 == 0) goto L_0x0077
            mh.a r2 = r10.f72144a
            java.lang.String r2 = r2.q()
            goto L_0x007d
        L_0x0077:
            mh.a r2 = r10.f72144a
            java.lang.String r2 = r2.o()
        L_0x007d:
            mh.a r11 = r10.f72144a
            r12 = 5
            r11.k(r12)
            lf.M r11 = lf.C6514M.f71813a
            r4.f72151a = r1
            r4.f72152b = r10
            r4.f72153c = r9
            r4.f72154d = r2
            r4.f72157g = r8
            java.lang.Object r11 = r1.b(r11, r4)
            if (r11 != r3) goto L_0x0096
            return r3
        L_0x0096:
            r18 = r11
            r11 = r1
            r1 = r18
            r19 = r4
            r4 = r2
            r2 = r19
        L_0x00a0:
            lh.i r1 = (lh.i) r1
            r9.put(r4, r1)
            mh.a r1 = r10.f72144a
            byte r1 = r1.j()
            if (r1 == r7) goto L_0x00c4
            if (r1 != r6) goto L_0x00b1
            r2 = r1
            goto L_0x00c8
        L_0x00b1:
            mh.a r12 = r10.f72144a
            r16 = 6
            r17 = 0
            java.lang.String r13 = "Expected end of the object or comma"
            r14 = 0
            r15 = 0
            mh.C6584a.x(r12, r13, r14, r15, r16, r17)
            lf.k r1 = new lf.k
            r1.<init>()
            throw r1
        L_0x00c4:
            r4 = r2
            r2 = r1
            r1 = r11
            goto L_0x0064
        L_0x00c8:
            if (r2 != r5) goto L_0x00d0
            mh.a r1 = r10.f72144a
            r1.k(r6)
            goto L_0x00e8
        L_0x00d0:
            if (r2 != r7) goto L_0x00e8
            boolean r1 = r10.f72146c
            if (r1 == 0) goto L_0x00dc
            mh.a r1 = r10.f72144a
            r1.k(r6)
            goto L_0x00e8
        L_0x00dc:
            mh.a r1 = r10.f72144a
            r2 = 0
            mh.F.i(r1, r2, r8, r2)
            lf.k r1 = new lf.k
            r1.<init>()
            throw r1
        L_0x00e8:
            lh.v r1 = new lh.v
            r1.<init>(r9)
            return r1
        L_0x00ee:
            mh.a r2 = r0.f72144a
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Unexpected leading comma"
            r4 = 0
            r5 = 0
            mh.C6584a.x(r2, r3, r4, r5, r6, r7)
            lf.k r1 = new lf.k
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.T.h(lf.c, qf.d):java.lang.Object");
    }

    private final i i() {
        String str;
        byte k10 = this.f72144a.k((byte) 6);
        if (this.f72144a.F() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f72144a.e()) {
                    break;
                }
                if (this.f72145b) {
                    str = this.f72144a.q();
                } else {
                    str = this.f72144a.o();
                }
                this.f72144a.k((byte) 5);
                linkedHashMap.put(str, e());
                k10 = this.f72144a.j();
                if (k10 != 4) {
                    if (k10 != 7) {
                        C6584a.x(this.f72144a, "Expected end of the object or comma", 0, (String) null, 6, (Object) null);
                        throw new C6527k();
                    }
                }
            }
            if (k10 == 6) {
                this.f72144a.k((byte) 7);
            } else if (k10 == 4) {
                if (this.f72146c) {
                    this.f72144a.k((byte) 7);
                } else {
                    F.i(this.f72144a, (String) null, 1, (Object) null);
                    throw new C6527k();
                }
            }
            return new v(linkedHashMap);
        }
        C6584a.x(this.f72144a, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
        throw new C6527k();
    }

    /* access modifiers changed from: private */
    public final x j(boolean z10) {
        String q10;
        if (this.f72145b || !z10) {
            q10 = this.f72144a.q();
        } else {
            q10 = this.f72144a.o();
        }
        String str = q10;
        if (z10 || !C6496s.c(str, "null")) {
            return new p(str, z10, (f) null, 4, (DefaultConstructorMarker) null);
        }
        return t.INSTANCE;
    }

    public final i e() {
        i iVar;
        byte F10 = this.f72144a.F();
        if (F10 == 1) {
            return j(true);
        }
        if (F10 == 0) {
            return j(false);
        }
        if (F10 == 6) {
            int i10 = this.f72147d + 1;
            this.f72147d = i10;
            if (i10 == 200) {
                iVar = g();
            } else {
                iVar = i();
            }
            this.f72147d--;
            return iVar;
        } else if (F10 == 8) {
            return f();
        } else {
            C6584a.x(this.f72144a, "Cannot read Json element because of unexpected " + C6585b.c(F10), 0, (String) null, 6, (Object) null);
            throw new C6527k();
        }
    }
}

package m3;

import Sg.p;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.r;
import mf.C6565s;
import qf.C6658d;

/* renamed from: m3.x  reason: case insensitive filesystem */
public abstract class C2224x {

    /* renamed from: m3.x$a */
    public static final class a extends C2224x {

        /* renamed from: a  reason: collision with root package name */
        private final C2220t f24134a;

        /* renamed from: b  reason: collision with root package name */
        private final int f24135b;

        /* renamed from: c  reason: collision with root package name */
        private final int f24136c;

        /* renamed from: d  reason: collision with root package name */
        private final int f24137d;

        /* renamed from: m3.x$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0403a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f24138a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    m3.t[] r0 = m3.C2220t.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f24138a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: m3.C2224x.a.C0403a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C2220t tVar, int i10, int i11, int i12) {
            super((DefaultConstructorMarker) null);
            C6496s.h(tVar, "loadType");
            this.f24134a = tVar;
            this.f24135b = i10;
            this.f24136c = i11;
            this.f24137d = i12;
            if (tVar == C2220t.REFRESH) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            } else if (f() <= 0) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + f()).toString());
            } else if (i12 < 0) {
                throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i12).toString());
            }
        }

        public final C2220t c() {
            return this.f24134a;
        }

        public final int d() {
            return this.f24136c;
        }

        public final int e() {
            return this.f24135b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24134a == aVar.f24134a && this.f24135b == aVar.f24135b && this.f24136c == aVar.f24136c && this.f24137d == aVar.f24137d) {
                return true;
            }
            return false;
        }

        public final int f() {
            return (this.f24136c - this.f24135b) + 1;
        }

        public final int g() {
            return this.f24137d;
        }

        public int hashCode() {
            return (((((this.f24134a.hashCode() * 31) + Integer.hashCode(this.f24135b)) * 31) + Integer.hashCode(this.f24136c)) * 31) + Integer.hashCode(this.f24137d);
        }

        public String toString() {
            String str;
            int i10 = C0403a.f24138a[this.f24134a.ordinal()];
            if (i10 == 1) {
                str = "end";
            } else if (i10 == 2) {
                str = "front";
            } else {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            return p.h("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.f24135b + "\n                    |   maxPageOffset: " + this.f24136c + "\n                    |   placeholdersRemaining: " + this.f24137d + "\n                    |)", (String) null, 1, (Object) null);
        }
    }

    /* renamed from: m3.x$b */
    public static final class b extends C2224x {

        /* renamed from: g  reason: collision with root package name */
        public static final a f24139g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public static final b f24140h;

        /* renamed from: a  reason: collision with root package name */
        private final C2220t f24141a;

        /* renamed from: b  reason: collision with root package name */
        private final List f24142b;

        /* renamed from: c  reason: collision with root package name */
        private final int f24143c;

        /* renamed from: d  reason: collision with root package name */
        private final int f24144d;

        /* renamed from: e  reason: collision with root package name */
        private final C2219s f24145e;

        /* renamed from: f  reason: collision with root package name */
        private final C2219s f24146f;

        /* renamed from: m3.x$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ b d(a aVar, List list, int i10, int i11, C2219s sVar, C2219s sVar2, int i12, Object obj) {
                if ((i12 & 16) != 0) {
                    sVar2 = null;
                }
                return aVar.c(list, i10, i11, sVar, sVar2);
            }

            public final b a(List list, int i10, C2219s sVar, C2219s sVar2) {
                C6496s.h(list, "pages");
                C6496s.h(sVar, "sourceLoadStates");
                return new b(C2220t.APPEND, list, -1, i10, sVar, sVar2, (DefaultConstructorMarker) null);
            }

            public final b b(List list, int i10, C2219s sVar, C2219s sVar2) {
                C6496s.h(list, "pages");
                C6496s.h(sVar, "sourceLoadStates");
                return new b(C2220t.PREPEND, list, i10, -1, sVar, sVar2, (DefaultConstructorMarker) null);
            }

            public final b c(List list, int i10, int i11, C2219s sVar, C2219s sVar2) {
                C6496s.h(list, "pages");
                C6496s.h(sVar, "sourceLoadStates");
                return new b(C2220t.REFRESH, list, i10, i11, sVar, sVar2, (DefaultConstructorMarker) null);
            }

            public final b e() {
                return b.f24140h;
            }

            private a() {
            }
        }

        /* renamed from: m3.x$b$b  reason: collision with other inner class name */
        static final class C0404b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f24147a;

            /* renamed from: b  reason: collision with root package name */
            Object f24148b;

            /* renamed from: c  reason: collision with root package name */
            Object f24149c;

            /* renamed from: d  reason: collision with root package name */
            Object f24150d;

            /* renamed from: e  reason: collision with root package name */
            Object f24151e;

            /* renamed from: f  reason: collision with root package name */
            Object f24152f;

            /* renamed from: g  reason: collision with root package name */
            Object f24153g;

            /* renamed from: h  reason: collision with root package name */
            Object f24154h;

            /* renamed from: i  reason: collision with root package name */
            Object f24155i;

            /* renamed from: j  reason: collision with root package name */
            Object f24156j;

            /* renamed from: k  reason: collision with root package name */
            Object f24157k;

            /* renamed from: l  reason: collision with root package name */
            /* synthetic */ Object f24158l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b f24159m;

            /* renamed from: n  reason: collision with root package name */
            int f24160n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0404b(b bVar, C6658d dVar) {
                super(dVar);
                this.f24159m = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f24158l = obj;
                this.f24160n |= Integer.MIN_VALUE;
                return this.f24159m.a((yf.p) null, this);
            }
        }

        static {
            a aVar = new a((DefaultConstructorMarker) null);
            f24139g = aVar;
            List e10 = C6565s.e(W.f23921e.a());
            r.c.a aVar2 = r.c.f24097b;
            f24140h = a.d(aVar, e10, 0, 0, new C2219s(aVar2.b(), aVar2.a(), aVar2.a()), (C2219s) null, 16, (Object) null);
        }

        public /* synthetic */ b(C2220t tVar, List list, int i10, int i11, C2219s sVar, C2219s sVar2, DefaultConstructorMarker defaultConstructorMarker) {
            this(tVar, list, i10, i11, sVar, sVar2);
        }

        public static /* synthetic */ b e(b bVar, C2220t tVar, List list, int i10, int i11, C2219s sVar, C2219s sVar2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                tVar = bVar.f24141a;
            }
            if ((i12 & 2) != 0) {
                list = bVar.f24142b;
            }
            List list2 = list;
            if ((i12 & 4) != 0) {
                i10 = bVar.f24143c;
            }
            int i13 = i10;
            if ((i12 & 8) != 0) {
                i11 = bVar.f24144d;
            }
            int i14 = i11;
            if ((i12 & 16) != 0) {
                sVar = bVar.f24145e;
            }
            C2219s sVar3 = sVar;
            if ((i12 & 32) != 0) {
                sVar2 = bVar.f24146f;
            }
            return bVar.d(tVar, list2, i13, i14, sVar3, sVar2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(yf.p r18, qf.C6658d r19) {
            /*
                r17 = this;
                r0 = r19
                boolean r1 = r0 instanceof m3.C2224x.b.C0404b
                if (r1 == 0) goto L_0x0017
                r1 = r0
                m3.x$b$b r1 = (m3.C2224x.b.C0404b) r1
                int r2 = r1.f24160n
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0017
                int r2 = r2 - r3
                r1.f24160n = r2
                r2 = r17
                goto L_0x001e
            L_0x0017:
                m3.x$b$b r1 = new m3.x$b$b
                r2 = r17
                r1.<init>(r2, r0)
            L_0x001e:
                java.lang.Object r0 = r1.f24158l
                java.lang.Object r3 = rf.C6680b.f()
                int r4 = r1.f24160n
                r5 = 10
                r6 = 1
                if (r4 == 0) goto L_0x006d
                if (r4 != r6) goto L_0x0065
                java.lang.Object r4 = r1.f24157k
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r7 = r1.f24156j
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r1.f24155i
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r9 = r1.f24154h
                java.util.Collection r9 = (java.util.Collection) r9
                java.lang.Object r10 = r1.f24153g
                int[] r10 = (int[]) r10
                java.lang.Object r11 = r1.f24152f
                m3.W r11 = (m3.W) r11
                java.lang.Object r12 = r1.f24151e
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r1.f24150d
                java.util.Collection r13 = (java.util.Collection) r13
                java.lang.Object r14 = r1.f24149c
                m3.t r14 = (m3.C2220t) r14
                java.lang.Object r15 = r1.f24148b
                m3.x$b r15 = (m3.C2224x.b) r15
                java.lang.Object r6 = r1.f24147a
                yf.p r6 = (yf.p) r6
                lf.w.b(r0)
                r16 = r11
                r11 = r8
                r8 = r14
                r14 = r9
                r9 = r15
                r15 = 1
                goto L_0x00e6
            L_0x0065:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x006d:
                lf.w.b(r0)
                m3.t r0 = r17.f()
                java.util.List r4 = r17.h()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = mf.C6565s.y(r4, r5)
                r6.<init>(r7)
                java.util.Iterator r4 = r4.iterator()
                r7 = r0
                r8 = r2
                r0 = r18
            L_0x008b:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x0108
                java.lang.Object r9 = r4.next()
                m3.W r9 = (m3.W) r9
                int[] r10 = r9.e()
                java.util.List r11 = r9.b()
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r12 = new java.util.ArrayList
                int r13 = mf.C6565s.y(r11, r5)
                r12.<init>(r13)
                java.util.Iterator r11 = r11.iterator()
                r13 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r4
                r4 = r7
            L_0x00b4:
                boolean r14 = r11.hasNext()
                if (r14 == 0) goto L_0x00f0
                java.lang.Object r14 = r11.next()
                r1.f24147a = r0
                r1.f24148b = r9
                r1.f24149c = r8
                r1.f24150d = r7
                r1.f24151e = r6
                r1.f24152f = r13
                r1.f24153g = r10
                r1.f24154h = r12
                r1.f24155i = r11
                r1.f24156j = r12
                r1.f24157k = r4
                r15 = 1
                r1.f24160n = r15
                java.lang.Object r14 = r0.invoke(r14, r1)
                if (r14 != r3) goto L_0x00de
                return r3
            L_0x00de:
                r16 = r13
                r13 = r7
                r7 = r12
                r12 = r6
                r6 = r0
                r0 = r14
                r14 = r7
            L_0x00e6:
                r7.add(r0)
                r0 = r6
                r6 = r12
                r7 = r13
                r12 = r14
                r13 = r16
                goto L_0x00b4
            L_0x00f0:
                r15 = 1
                java.util.List r12 = (java.util.List) r12
                int r11 = r13.d()
                java.util.List r13 = r13.c()
                m3.W r14 = new m3.W
                r14.<init>(r10, r12, r11, r13)
                r4.add(r14)
                r4 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                goto L_0x008b
            L_0x0108:
                r0 = r6
                java.util.List r0 = (java.util.List) r0
                int r9 = r8.j()
                int r10 = r8.i()
                m3.s r11 = r8.k()
                m3.s r12 = r8.g()
                m3.x$b r1 = new m3.x$b
                r13 = 0
                r6 = r1
                r8 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2224x.b.a(yf.p, qf.d):java.lang.Object");
        }

        public final b d(C2220t tVar, List list, int i10, int i11, C2219s sVar, C2219s sVar2) {
            C6496s.h(tVar, "loadType");
            C6496s.h(list, "pages");
            C6496s.h(sVar, "sourceLoadStates");
            return new b(tVar, list, i10, i11, sVar, sVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24141a == bVar.f24141a && C6496s.c(this.f24142b, bVar.f24142b) && this.f24143c == bVar.f24143c && this.f24144d == bVar.f24144d && C6496s.c(this.f24145e, bVar.f24145e) && C6496s.c(this.f24146f, bVar.f24146f)) {
                return true;
            }
            return false;
        }

        public final C2220t f() {
            return this.f24141a;
        }

        public final C2219s g() {
            return this.f24146f;
        }

        public final List h() {
            return this.f24142b;
        }

        public int hashCode() {
            int i10;
            int hashCode = ((((((((this.f24141a.hashCode() * 31) + this.f24142b.hashCode()) * 31) + Integer.hashCode(this.f24143c)) * 31) + Integer.hashCode(this.f24144d)) * 31) + this.f24145e.hashCode()) * 31;
            C2219s sVar = this.f24146f;
            if (sVar == null) {
                i10 = 0;
            } else {
                i10 = sVar.hashCode();
            }
            return hashCode + i10;
        }

        public final int i() {
            return this.f24144d;
        }

        public final int j() {
            return this.f24143c;
        }

        public final C2219s k() {
            return this.f24145e;
        }

        public String toString() {
            String str;
            Object obj;
            Object obj2;
            List b10;
            List b11;
            int i10 = 0;
            for (W b12 : this.f24142b) {
                i10 += b12.b().size();
            }
            int i11 = this.f24143c;
            String str2 = "none";
            if (i11 != -1) {
                str = String.valueOf(i11);
            } else {
                str = str2;
            }
            int i12 = this.f24144d;
            if (i12 != -1) {
                str2 = String.valueOf(i12);
            }
            C2219s sVar = this.f24146f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PageEvent.Insert for ");
            sb2.append(this.f24141a);
            sb2.append(", with ");
            sb2.append(i10);
            sb2.append(" items (\n                    |   first item: ");
            W w10 = (W) C6565s.q0(this.f24142b);
            if (w10 == null || (b11 = w10.b()) == null) {
                obj = null;
            } else {
                obj = C6565s.q0(b11);
            }
            sb2.append(obj);
            sb2.append("\n                    |   last item: ");
            W w11 = (W) C6565s.B0(this.f24142b);
            if (w11 == null || (b10 = w11.b()) == null) {
                obj2 = null;
            } else {
                obj2 = C6565s.B0(b10);
            }
            sb2.append(obj2);
            sb2.append("\n                    |   placeholdersBefore: ");
            sb2.append(str);
            sb2.append("\n                    |   placeholdersAfter: ");
            sb2.append(str2);
            sb2.append("\n                    |   sourceLoadStates: ");
            sb2.append(this.f24145e);
            sb2.append("\n                    ");
            String sb3 = sb2.toString();
            if (sVar != null) {
                sb3 = sb3 + "|   mediatorLoadStates: " + sVar + 10;
            }
            return p.h(sb3 + "|)", (String) null, 1, (Object) null);
        }

        private b(C2220t tVar, List list, int i10, int i11, C2219s sVar, C2219s sVar2) {
            super((DefaultConstructorMarker) null);
            this.f24141a = tVar;
            this.f24142b = list;
            this.f24143c = i10;
            this.f24144d = i11;
            this.f24145e = sVar;
            this.f24146f = sVar2;
            if (tVar != C2220t.APPEND && i10 < 0) {
                throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i10).toString());
            } else if (tVar != C2220t.PREPEND && i11 < 0) {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i11).toString());
            } else if (tVar == C2220t.REFRESH && list.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            }
        }
    }

    /* renamed from: m3.x$c */
    public static final class c extends C2224x {

        /* renamed from: a  reason: collision with root package name */
        private final C2219s f24161a;

        /* renamed from: b  reason: collision with root package name */
        private final C2219s f24162b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(C2219s sVar, C2219s sVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(sVar, (i10 & 2) != 0 ? null : sVar2);
        }

        public final C2219s c() {
            return this.f24162b;
        }

        public final C2219s d() {
            return this.f24161a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (C6496s.c(this.f24161a, cVar.f24161a) && C6496s.c(this.f24162b, cVar.f24162b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f24161a.hashCode() * 31;
            C2219s sVar = this.f24162b;
            if (sVar == null) {
                i10 = 0;
            } else {
                i10 = sVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            C2219s sVar = this.f24162b;
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f24161a + "\n                    ";
            if (sVar != null) {
                str = str + "|   mediatorLoadStates: " + sVar + 10;
            }
            return p.h(str + "|)", (String) null, 1, (Object) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C2219s sVar, C2219s sVar2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(sVar, "source");
            this.f24161a = sVar;
            this.f24162b = sVar2;
        }
    }

    /* renamed from: m3.x$d */
    public static final class d extends C2224x {

        /* renamed from: a  reason: collision with root package name */
        private final List f24163a;

        /* renamed from: b  reason: collision with root package name */
        private final C2219s f24164b;

        /* renamed from: c  reason: collision with root package name */
        private final C2219s f24165c;

        /* renamed from: m3.x$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f24166a;

            /* renamed from: b  reason: collision with root package name */
            Object f24167b;

            /* renamed from: c  reason: collision with root package name */
            Object f24168c;

            /* renamed from: d  reason: collision with root package name */
            Object f24169d;

            /* renamed from: e  reason: collision with root package name */
            Object f24170e;

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f24171f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f24172g;

            /* renamed from: h  reason: collision with root package name */
            int f24173h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, C6658d dVar2) {
                super(dVar2);
                this.f24172g = dVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f24171f = obj;
                this.f24173h |= Integer.MIN_VALUE;
                return this.f24172g.a((yf.p) null, this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List list, C2219s sVar, C2219s sVar2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(list, "data");
            this.f24163a = list;
            this.f24164b = sVar;
            this.f24165c = sVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(yf.p r9, qf.C6658d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof m3.C2224x.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                m3.x$d$a r0 = (m3.C2224x.d.a) r0
                int r1 = r0.f24173h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f24173h = r1
                goto L_0x0018
            L_0x0013:
                m3.x$d$a r0 = new m3.x$d$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f24171f
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f24173h
                r3 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 != r3) goto L_0x003d
                java.lang.Object r9 = r0.f24170e
                java.util.Collection r9 = (java.util.Collection) r9
                java.lang.Object r2 = r0.f24169d
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r0.f24168c
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r5 = r0.f24167b
                yf.p r5 = (yf.p) r5
                java.lang.Object r6 = r0.f24166a
                m3.x$d r6 = (m3.C2224x.d) r6
                lf.w.b(r10)
                goto L_0x0080
            L_0x003d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x0045:
                lf.w.b(r10)
                java.util.List r10 = r8.f24163a
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = mf.C6565s.y(r10, r4)
                r2.<init>(r4)
                java.util.Iterator r10 = r10.iterator()
                r6 = r8
                r7 = r10
                r10 = r9
                r9 = r2
                r2 = r7
            L_0x0060:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0086
                java.lang.Object r4 = r2.next()
                r0.f24166a = r6
                r0.f24167b = r10
                r0.f24168c = r9
                r0.f24169d = r2
                r0.f24170e = r9
                r0.f24173h = r3
                java.lang.Object r4 = r10.invoke(r4, r0)
                if (r4 != r1) goto L_0x007d
                return r1
            L_0x007d:
                r5 = r10
                r10 = r4
                r4 = r9
            L_0x0080:
                r9.add(r10)
                r9 = r4
                r10 = r5
                goto L_0x0060
            L_0x0086:
                java.util.List r9 = (java.util.List) r9
                m3.s r10 = r6.f24164b
                m3.s r0 = r6.f24165c
                m3.x$d r1 = new m3.x$d
                r1.<init>(r9, r10, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.C2224x.d.a(yf.p, qf.d):java.lang.Object");
        }

        public final List c() {
            return this.f24163a;
        }

        public final C2219s d() {
            return this.f24165c;
        }

        public final C2219s e() {
            return this.f24164b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (C6496s.c(this.f24163a, dVar.f24163a) && C6496s.c(this.f24164b, dVar.f24164b) && C6496s.c(this.f24165c, dVar.f24165c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f24163a.hashCode() * 31;
            C2219s sVar = this.f24164b;
            int i11 = 0;
            if (sVar == null) {
                i10 = 0;
            } else {
                i10 = sVar.hashCode();
            }
            int i12 = (hashCode + i10) * 31;
            C2219s sVar2 = this.f24165c;
            if (sVar2 != null) {
                i11 = sVar2.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            C2219s sVar = this.f24165c;
            String str = "PageEvent.StaticList with " + this.f24163a.size() + " items (\n                    |   first item: " + C6565s.q0(this.f24163a) + "\n                    |   last item: " + C6565s.B0(this.f24163a) + "\n                    |   sourceLoadStates: " + this.f24164b + "\n                    ";
            if (sVar != null) {
                str = str + "|   mediatorLoadStates: " + sVar + 10;
            }
            return p.h(str + "|)", (String) null, 1, (Object) null);
        }
    }

    public /* synthetic */ C2224x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Object a(yf.p pVar, C6658d dVar) {
        return C6496s.f(this, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>");
    }

    private C2224x() {
    }
}

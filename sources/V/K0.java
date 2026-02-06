package V;

import Ug.C5582n;
import Y.C1510r0;
import Y.o1;
import dh.C5817a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6496s;
import lf.v;
import qf.C6658d;

public final class K0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5817a f6663a = dh.c.b(false, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final C1510r0 f6664b = u1.d((Object) null, (o1) null, 2, (Object) null);

    private static final class a implements G0 {

        /* renamed from: a  reason: collision with root package name */
        private final N0 f6665a;

        /* renamed from: b  reason: collision with root package name */
        private final C5582n f6666b;

        public a(N0 n02, C5582n nVar) {
            this.f6665a = n02;
            this.f6666b = nVar;
        }

        public N0 a() {
            return this.f6665a;
        }

        public void b() {
            if (this.f6666b.a()) {
                C5582n nVar = this.f6666b;
                v.a aVar = v.f71841b;
                nVar.resumeWith(v.b(M0.ActionPerformed));
            }
        }

        public void dismiss() {
            if (this.f6666b.a()) {
                C5582n nVar = this.f6666b;
                v.a aVar = v.f71841b;
                nVar.resumeWith(v.b(M0.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(a(), aVar.a()) && C6496s.c(this.f6666b, aVar.f6666b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f6666b.hashCode();
        }
    }

    private static final class b implements N0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f6667a;

        /* renamed from: b  reason: collision with root package name */
        private final String f6668b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f6669c;

        /* renamed from: d  reason: collision with root package name */
        private final I0 f6670d;

        public b(String str, String str2, boolean z10, I0 i02) {
            this.f6667a = str;
            this.f6668b = str2;
            this.f6669c = z10;
            this.f6670d = i02;
        }

        public String a() {
            return this.f6668b;
        }

        public boolean b() {
            return this.f6669c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (C6496s.c(getMessage(), bVar.getMessage()) && C6496s.c(a(), bVar.a()) && b() == bVar.b() && getDuration() == bVar.getDuration()) {
                return true;
            }
            return false;
        }

        public I0 getDuration() {
            return this.f6670d;
        }

        public String getMessage() {
            return this.f6667a;
        }

        public int hashCode() {
            int i10;
            int hashCode = getMessage().hashCode() * 31;
            String a10 = a();
            if (a10 != null) {
                i10 = a10.hashCode();
            } else {
                i10 = 0;
            }
            return ((((hashCode + i10) * 31) + Boolean.hashCode(b())) * 31) + getDuration().hashCode();
        }
    }

    static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f6671a;

        /* renamed from: b  reason: collision with root package name */
        Object f6672b;

        /* renamed from: c  reason: collision with root package name */
        Object f6673c;

        /* renamed from: d  reason: collision with root package name */
        Object f6674d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f6675e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ K0 f6676f;

        /* renamed from: g  reason: collision with root package name */
        int f6677g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(K0 k02, C6658d dVar) {
            super(dVar);
            this.f6676f = k02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f6675e = obj;
            this.f6677g |= Integer.MIN_VALUE;
            return this.f6676f.d((N0) null, this);
        }
    }

    /* access modifiers changed from: private */
    public final void c(G0 g02) {
        this.f6664b.setValue(g02);
    }

    public static /* synthetic */ Object f(K0 k02, String str, String str2, boolean z10, I0 i02, C6658d dVar, int i10, Object obj) {
        I0 i03;
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            if (str3 == null) {
                i03 = I0.Short;
            } else {
                i03 = I0.Indefinite;
            }
            i02 = i03;
        }
        return k02.e(str, str3, z11, i02, dVar);
    }

    public final G0 b() {
        return (G0) this.f6664b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[Catch:{ all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00b2=Splitter:B:35:0x00b2, B:30:0x00a9=Splitter:B:30:0x00a9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(V.N0 r9, qf.C6658d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof V.K0.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            V.K0$c r0 = (V.K0.c) r0
            int r1 = r0.f6677g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6677g = r1
            goto L_0x0018
        L_0x0013:
            V.K0$c r0 = new V.K0$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f6675e
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f6677g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r4) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r9 = r0.f6674d
            V.K0$c r9 = (V.K0.c) r9
            java.lang.Object r9 = r0.f6673c
            dh.a r9 = (dh.C5817a) r9
            java.lang.Object r1 = r0.f6672b
            V.N0 r1 = (V.N0) r1
            java.lang.Object r0 = r0.f6671a
            V.K0 r0 = (V.K0) r0
            lf.w.b(r10)     // Catch:{ all -> 0x003e }
            goto L_0x00a9
        L_0x003e:
            r10 = move-exception
            goto L_0x00b2
        L_0x0041:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0049:
            java.lang.Object r9 = r0.f6673c
            dh.a r9 = (dh.C5817a) r9
            java.lang.Object r2 = r0.f6672b
            V.N0 r2 = (V.N0) r2
            java.lang.Object r6 = r0.f6671a
            V.K0 r6 = (V.K0) r6
            lf.w.b(r10)
            r10 = r9
            r9 = r2
            goto L_0x0070
        L_0x005b:
            lf.w.b(r10)
            dh.a r10 = r8.f6663a
            r0.f6671a = r8
            r0.f6672b = r9
            r0.f6673c = r10
            r0.f6677g = r4
            java.lang.Object r2 = r10.a(r5, r0)
            if (r2 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r6 = r8
        L_0x0070:
            r0.f6671a = r6     // Catch:{ all -> 0x009c }
            r0.f6672b = r9     // Catch:{ all -> 0x009c }
            r0.f6673c = r10     // Catch:{ all -> 0x009c }
            r0.f6674d = r0     // Catch:{ all -> 0x009c }
            r0.f6677g = r3     // Catch:{ all -> 0x009c }
            Ug.o r2 = new Ug.o     // Catch:{ all -> 0x009c }
            qf.d r3 = rf.C6680b.c(r0)     // Catch:{ all -> 0x009c }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x009c }
            r2.E()     // Catch:{ all -> 0x009c }
            V.K0$a r3 = new V.K0$a     // Catch:{ all -> 0x009c }
            r3.<init>(r9, r2)     // Catch:{ all -> 0x009c }
            r6.c(r3)     // Catch:{ all -> 0x009c }
            java.lang.Object r9 = r2.v()     // Catch:{ all -> 0x009c }
            java.lang.Object r2 = rf.C6680b.f()     // Catch:{ all -> 0x009c }
            if (r9 != r2) goto L_0x00a2
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x009c }
            goto L_0x00a2
        L_0x009c:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00b2
        L_0x00a2:
            if (r9 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00a9:
            r0.c(r5)     // Catch:{ all -> 0x00b0 }
            r9.e(r5)
            return r10
        L_0x00b0:
            r10 = move-exception
            goto L_0x00b6
        L_0x00b2:
            r0.c(r5)     // Catch:{ all -> 0x00b0 }
            throw r10     // Catch:{ all -> 0x00b0 }
        L_0x00b6:
            r9.e(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: V.K0.d(V.N0, qf.d):java.lang.Object");
    }

    public final Object e(String str, String str2, boolean z10, I0 i02, C6658d dVar) {
        return d(new b(str, str2, z10, i02), dVar);
    }
}

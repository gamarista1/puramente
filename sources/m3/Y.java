package m3;

import Ug.C5599w;
import Ug.C5600w0;
import Ug.C5603y;
import dh.C5817a;
import dh.c;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;
import yf.r;

public final class Y {

    /* renamed from: a  reason: collision with root package name */
    private final r f23927a;

    /* renamed from: b  reason: collision with root package name */
    private final C5599w f23928b = C5603y.b((C5600w0) null, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final C5817a f23929c;

    /* renamed from: d  reason: collision with root package name */
    private final C5599w[] f23930d;

    /* renamed from: e  reason: collision with root package name */
    private final Object[] f23931e;

    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f23932a;

        /* renamed from: b  reason: collision with root package name */
        Object f23933b;

        /* renamed from: c  reason: collision with root package name */
        Object f23934c;

        /* renamed from: d  reason: collision with root package name */
        int f23935d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f23936e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Y f23937f;

        /* renamed from: g  reason: collision with root package name */
        int f23938g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Y y10, C6658d dVar) {
            super(dVar);
            this.f23937f = y10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23936e = obj;
            this.f23938g |= Integer.MIN_VALUE;
            return this.f23937f.a(0, (Object) null, this);
        }
    }

    public Y(r rVar) {
        C6496s.h(rVar, "send");
        this.f23927a = rVar;
        this.f23929c = c.b(false, 1, (Object) null);
        C5599w[] wVarArr = new C5599w[2];
        for (int i10 = 0; i10 < 2; i10++) {
            wVarArr[i10] = C5603y.b((C5600w0) null, 1, (Object) null);
        }
        this.f23930d = wVarArr;
        Object[] objArr = new Object[2];
        for (int i11 = 0; i11 < 2; i11++) {
            objArr[i11] = C2212k.f24036a;
        }
        this.f23931e = objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: dh.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ca A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00db A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r17, java.lang.Object r18, qf.C6658d r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            r3 = 1
            boolean r4 = r2 instanceof m3.Y.a
            if (r4 == 0) goto L_0x001a
            r4 = r2
            m3.Y$a r4 = (m3.Y.a) r4
            int r5 = r4.f23938g
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.f23938g = r5
            goto L_0x001f
        L_0x001a:
            m3.Y$a r4 = new m3.Y$a
            r4.<init>(r1, r2)
        L_0x001f:
            java.lang.Object r2 = r4.f23936e
            java.lang.Object r5 = rf.C6680b.f()
            int r6 = r4.f23938g
            r7 = 3
            r8 = 2
            r9 = 0
            if (r6 == 0) goto L_0x0069
            if (r6 == r3) goto L_0x005d
            if (r6 == r8) goto L_0x004b
            if (r6 != r7) goto L_0x0043
            java.lang.Object r0 = r4.f23933b
            r3 = r0
            dh.a r3 = (dh.C5817a) r3
            java.lang.Object r0 = r4.f23932a
            m3.Y r0 = (m3.Y) r0
            lf.w.b(r2)     // Catch:{ all -> 0x0040 }
            goto L_0x00fa
        L_0x0040:
            r0 = move-exception
            goto L_0x0109
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004b:
            int r0 = r4.f23935d
            java.lang.Object r6 = r4.f23934c
            dh.a r6 = (dh.C5817a) r6
            java.lang.Object r8 = r4.f23933b
            java.lang.Object r10 = r4.f23932a
            m3.Y r10 = (m3.Y) r10
            lf.w.b(r2)
        L_0x005a:
            r2 = r0
            r0 = r10
            goto L_0x00ab
        L_0x005d:
            int r0 = r4.f23935d
            java.lang.Object r6 = r4.f23933b
            java.lang.Object r10 = r4.f23932a
            m3.Y r10 = (m3.Y) r10
            lf.w.b(r2)
            goto L_0x0095
        L_0x0069:
            lf.w.b(r2)
            Ug.w[] r2 = r1.f23930d
            r2 = r2[r0]
            boolean r2 = r2.o()
            if (r2 == 0) goto L_0x0089
            Ug.w r2 = r1.f23928b
            r4.f23932a = r1
            r6 = r18
            r4.f23933b = r6
            r4.f23935d = r0
            r4.f23938g = r3
            java.lang.Object r2 = r2.y(r4)
            if (r2 != r5) goto L_0x0094
            return r5
        L_0x0089:
            r6 = r18
            Ug.w[] r2 = r1.f23930d
            r2 = r2[r0]
            lf.M r10 = lf.C6514M.f71813a
            r2.j0(r10)
        L_0x0094:
            r10 = r1
        L_0x0095:
            dh.a r2 = r10.f23929c
            r4.f23932a = r10
            r4.f23933b = r6
            r4.f23934c = r2
            r4.f23935d = r0
            r4.f23938g = r8
            java.lang.Object r8 = r2.a(r9, r4)
            if (r8 != r5) goto L_0x00a8
            return r5
        L_0x00a8:
            r8 = r6
            r6 = r2
            goto L_0x005a
        L_0x00ab:
            java.lang.Object[] r10 = r0.f23931e     // Catch:{ all -> 0x00be }
            int r11 = r10.length     // Catch:{ all -> 0x00be }
            r12 = 0
            r13 = r12
        L_0x00b0:
            if (r13 >= r11) goto L_0x00c1
            r14 = r10[r13]     // Catch:{ all -> 0x00be }
            java.lang.Object r15 = m3.C2212k.f24036a     // Catch:{ all -> 0x00be }
            if (r14 != r15) goto L_0x00bc
            r10 = r3
            goto L_0x00c2
        L_0x00bc:
            int r13 = r13 + r3
            goto L_0x00b0
        L_0x00be:
            r0 = move-exception
            r3 = r6
            goto L_0x0109
        L_0x00c1:
            r10 = r12
        L_0x00c2:
            java.lang.Object[] r11 = r0.f23931e     // Catch:{ all -> 0x00be }
            r11[r2] = r8     // Catch:{ all -> 0x00be }
            int r8 = r11.length     // Catch:{ all -> 0x00be }
            r13 = r12
        L_0x00c8:
            if (r13 >= r8) goto L_0x00d6
            r14 = r11[r13]     // Catch:{ all -> 0x00be }
            java.lang.Object r15 = m3.C2212k.f24036a     // Catch:{ all -> 0x00be }
            if (r14 != r15) goto L_0x00d4
            r3 = r6
            goto L_0x0101
        L_0x00d4:
            int r13 = r13 + r3
            goto L_0x00c8
        L_0x00d6:
            if (r10 == 0) goto L_0x00db
            m3.f r2 = m3.C2207f.INITIAL     // Catch:{ all -> 0x00be }
            goto L_0x00e2
        L_0x00db:
            if (r2 != 0) goto L_0x00e0
            m3.f r2 = m3.C2207f.RECEIVER     // Catch:{ all -> 0x00be }
            goto L_0x00e2
        L_0x00e0:
            m3.f r2 = m3.C2207f.OTHER     // Catch:{ all -> 0x00be }
        L_0x00e2:
            yf.r r8 = r0.f23927a     // Catch:{ all -> 0x00be }
            java.lang.Object[] r10 = r0.f23931e     // Catch:{ all -> 0x00be }
            r11 = r10[r12]     // Catch:{ all -> 0x00be }
            r3 = r10[r3]     // Catch:{ all -> 0x00be }
            r4.f23932a = r0     // Catch:{ all -> 0x00be }
            r4.f23933b = r6     // Catch:{ all -> 0x00be }
            r4.f23934c = r9     // Catch:{ all -> 0x00be }
            r4.f23938g = r7     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r8.invoke(r11, r3, r2, r4)     // Catch:{ all -> 0x00be }
            if (r2 != r5) goto L_0x00f9
            return r5
        L_0x00f9:
            r3 = r6
        L_0x00fa:
            Ug.w r0 = r0.f23928b     // Catch:{ all -> 0x0040 }
            lf.M r2 = lf.C6514M.f71813a     // Catch:{ all -> 0x0040 }
            r0.j0(r2)     // Catch:{ all -> 0x0040 }
        L_0x0101:
            lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0040 }
            r3.e(r9)
            lf.M r0 = lf.C6514M.f71813a
            return r0
        L_0x0109:
            r3.e(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.Y.a(int, java.lang.Object, qf.d):java.lang.Object");
    }
}

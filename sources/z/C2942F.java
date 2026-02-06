package z;

import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import w.C2797i;
import w.C2801m;
import w.t0;
import w.u0;
import yf.C6787a;
import yf.C6798l;

/* renamed from: z.F  reason: case insensitive filesystem */
public final class C2942F {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final a f28872f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f28873g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C2801m f28874h = new C2801m(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final u0 f28875a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f28876b = Long.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C2801m f28877c = f28874h;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28878d;

    /* renamed from: e  reason: collision with root package name */
    private float f28879e;

    /* renamed from: z.F$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2801m a() {
            return C2942F.f28874h;
        }

        public final boolean b(float f10) {
            if (Math.abs(f10) < 0.01f) {
                return true;
            }
            return false;
        }

        private a() {
        }
    }

    /* renamed from: z.F$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f28880a;

        /* renamed from: b  reason: collision with root package name */
        Object f28881b;

        /* renamed from: c  reason: collision with root package name */
        Object f28882c;

        /* renamed from: d  reason: collision with root package name */
        float f28883d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f28884e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C2942F f28885f;

        /* renamed from: g  reason: collision with root package name */
        int f28886g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2942F f10, C6658d dVar) {
            super(dVar);
            this.f28885f = f10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f28884e = obj;
            this.f28886g |= Integer.MIN_VALUE;
            return this.f28885f.h((C6798l) null, (C6787a) null, this);
        }
    }

    /* renamed from: z.F$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2942F f28887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f28888b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f28889c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2942F f10, float f11, C6798l lVar) {
            super(1);
            this.f28887a = f10;
            this.f28888b = f11;
            this.f28889c = lVar;
        }

        public final void a(long j10) {
            long f10;
            if (this.f28887a.f28876b == Long.MIN_VALUE) {
                this.f28887a.f28876b = j10;
            }
            C2801m mVar = new C2801m(this.f28887a.i());
            if (this.f28888b == 0.0f) {
                f10 = this.f28887a.f28875a.b(new C2801m(this.f28887a.i()), C2942F.f28872f.a(), this.f28887a.f28877c);
            } else {
                f10 = Af.a.f(((float) (j10 - this.f28887a.f28876b)) / this.f28888b);
            }
            long j11 = f10;
            C2801m mVar2 = mVar;
            float f11 = ((C2801m) this.f28887a.f28875a.c(j11, mVar2, C2942F.f28872f.a(), this.f28887a.f28877c)).f();
            C2942F f12 = this.f28887a;
            f12.f28877c = (C2801m) f12.f28875a.d(j11, mVar2, C2942F.f28872f.a(), this.f28887a.f28877c);
            this.f28887a.f28876b = j10;
            this.f28887a.j(f11);
            this.f28889c.invoke(Float.valueOf(this.f28887a.i() - f11));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: z.F$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2942F f28890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f28891b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C2942F f10, C6798l lVar) {
            super(1);
            this.f28890a = f10;
            this.f28891b = lVar;
        }

        public final void a(long j10) {
            float i10 = this.f28890a.i();
            this.f28890a.j(0.0f);
            this.f28891b.invoke(Float.valueOf(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C6514M.f71813a;
        }
    }

    public C2942F(C2797i iVar) {
        this.f28875a = iVar.a(t0.f(C6490l.f71789a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r13 != 0.0f) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c A[Catch:{ all -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(yf.C6798l r13, yf.C6787a r14, qf.C6658d r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof z.C2942F.b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            z.F$b r0 = (z.C2942F.b) r0
            int r1 = r0.f28886g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f28886g = r1
            goto L_0x0018
        L_0x0013:
            z.F$b r0 = new z.F$b
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f28884e
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f28886g
            r3 = 0
            r4 = -9223372036854775808
            r6 = 0
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r8) goto L_0x0044
            if (r2 != r7) goto L_0x003c
            java.lang.Object r13 = r0.f28881b
            yf.a r13 = (yf.C6787a) r13
            java.lang.Object r14 = r0.f28880a
            z.F r14 = (z.C2942F) r14
            lf.w.b(r15)     // Catch:{ all -> 0x0039 }
            goto L_0x00d1
        L_0x0039:
            r13 = move-exception
            goto L_0x00df
        L_0x003c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0044:
            float r13 = r0.f28883d
            java.lang.Object r14 = r0.f28882c
            yf.a r14 = (yf.C6787a) r14
            java.lang.Object r2 = r0.f28881b
            yf.l r2 = (yf.C6798l) r2
            java.lang.Object r9 = r0.f28880a
            z.F r9 = (z.C2942F) r9
            lf.w.b(r15)     // Catch:{ all -> 0x005b }
            r15 = r9
            r11 = r0
            r0 = r14
            r14 = r2
            r2 = r11
            goto L_0x00a2
        L_0x005b:
            r13 = move-exception
            r14 = r9
            goto L_0x00df
        L_0x005f:
            lf.w.b(r15)
            boolean r15 = r12.f28878d
            if (r15 != 0) goto L_0x00e8
            qf.g r15 = r0.getContext()
            k0.l$b r2 = k0.l.f23090W
            qf.g$b r15 = r15.b(r2)
            k0.l r15 = (k0.l) r15
            if (r15 == 0) goto L_0x0079
            float r15 = r15.U()
            goto L_0x007b
        L_0x0079:
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x007b:
            r12.f28878d = r8
            r2 = r0
            r0 = r14
            r14 = r13
            r13 = r15
            r15 = r12
        L_0x0082:
            z.F$a r9 = f28872f     // Catch:{ all -> 0x00ae }
            float r10 = r15.f28879e     // Catch:{ all -> 0x00ae }
            boolean r9 = r9.b(r10)     // Catch:{ all -> 0x00ae }
            if (r9 != 0) goto L_0x00a9
            z.F$c r9 = new z.F$c     // Catch:{ all -> 0x00ae }
            r9.<init>(r15, r13, r14)     // Catch:{ all -> 0x00ae }
            r2.f28880a = r15     // Catch:{ all -> 0x00ae }
            r2.f28881b = r14     // Catch:{ all -> 0x00ae }
            r2.f28882c = r0     // Catch:{ all -> 0x00ae }
            r2.f28883d = r13     // Catch:{ all -> 0x00ae }
            r2.f28886g = r8     // Catch:{ all -> 0x00ae }
            java.lang.Object r9 = Y.C1495j0.c(r9, r2)     // Catch:{ all -> 0x00ae }
            if (r9 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            r0.invoke()     // Catch:{ all -> 0x00ae }
            int r9 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0082
        L_0x00a9:
            r13 = r0
            r11 = r15
            r15 = r14
            r14 = r11
            goto L_0x00b1
        L_0x00ae:
            r13 = move-exception
            r14 = r15
            goto L_0x00df
        L_0x00b1:
            float r0 = r14.f28879e     // Catch:{ all -> 0x0039 }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0039 }
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            goto L_0x00d4
        L_0x00bc:
            z.F$d r0 = new z.F$d     // Catch:{ all -> 0x0039 }
            r0.<init>(r14, r15)     // Catch:{ all -> 0x0039 }
            r2.f28880a = r14     // Catch:{ all -> 0x0039 }
            r2.f28881b = r13     // Catch:{ all -> 0x0039 }
            r15 = 0
            r2.f28882c = r15     // Catch:{ all -> 0x0039 }
            r2.f28886g = r7     // Catch:{ all -> 0x0039 }
            java.lang.Object r15 = Y.C1495j0.c(r0, r2)     // Catch:{ all -> 0x0039 }
            if (r15 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            r13.invoke()     // Catch:{ all -> 0x0039 }
        L_0x00d4:
            r14.f28876b = r4
            w.m r13 = f28874h
            r14.f28877c = r13
            r14.f28878d = r3
            lf.M r13 = lf.C6514M.f71813a
            return r13
        L_0x00df:
            r14.f28876b = r4
            w.m r15 = f28874h
            r14.f28877c = r15
            r14.f28878d = r3
            throw r13
        L_0x00e8:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "animateToZero called while previous animation is running"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2942F.h(yf.l, yf.a, qf.d):java.lang.Object");
    }

    public final float i() {
        return this.f28879e;
    }

    public final void j(float f10) {
        this.f28879e = f10;
    }
}

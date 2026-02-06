package y;

import D0.C1111b;
import D0.J;
import D0.T;
import k0.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import y.C2924i;
import yf.C6798l;
import yf.p;
import z.o;

/* renamed from: y.c  reason: case insensitive filesystem */
public abstract class C2918c {

    /* renamed from: y.c$a */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f28456a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28457b;

        /* renamed from: c  reason: collision with root package name */
        int f28458c;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f28457b = obj;
            this.f28458c |= Integer.MIN_VALUE;
            return C2918c.b((C1111b) null, this);
        }
    }

    /* renamed from: y.c$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f28459a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f28460b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2924i f28461c;

        /* renamed from: y.c$b$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C2924i f28462a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C2924i iVar) {
                super(1);
                this.f28462a = iVar;
            }

            public final void a(long j10) {
                this.f28462a.b(new C2924i.a.b(j10, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C2421g) obj).v());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2924i iVar, C6658d dVar) {
            super(2, dVar);
            this.f28461c = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f28461c, dVar);
            bVar.f28460b = obj;
            return bVar;
        }

        public final Object invoke(J j10, C6658d dVar) {
            return ((b) create(j10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f28459a;
            if (i10 == 0) {
                w.b(obj);
                a aVar = new a(this.f28461c);
                this.f28459a = 1;
                if (C2918c.d((J) this.f28460b, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: y.c$c  reason: collision with other inner class name */
    static final class C0475c extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        int f28463b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f28464c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f28465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0475c(C6798l lVar, C6658d dVar) {
            super(2, dVar);
            this.f28465d = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            C0475c cVar = new C0475c(this.f28465d, dVar);
            cVar.f28464c = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C1111b bVar, C6658d dVar) {
            return ((C0475c) create(bVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: D0.b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r7.f28463b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                lf.w.b(r8)
                goto L_0x0053
            L_0x0012:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001a:
                java.lang.Object r1 = r7.f28464c
                D0.b r1 = (D0.C1111b) r1
                lf.w.b(r8)
                goto L_0x0035
            L_0x0022:
                lf.w.b(r8)
                java.lang.Object r8 = r7.f28464c
                r1 = r8
                D0.b r1 = (D0.C1111b) r1
                r7.f28464c = r1
                r7.f28463b = r3
                java.lang.Object r8 = y.C2918c.b(r1, r7)
                if (r8 != r0) goto L_0x0035
                return r0
            L_0x0035:
                D0.A r8 = (D0.A) r8
                r8.a()
                yf.l r4 = r7.f28465d
                long r5 = r8.h()
                q0.g r8 = q0.C2421g.d(r5)
                r4.invoke(r8)
                r8 = 0
                r7.f28464c = r8
                r7.f28463b = r2
                java.lang.Object r8 = z.C2938B.l(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L_0x0053
                return r0
            L_0x0053:
                D0.A r8 = (D0.A) r8
                if (r8 == 0) goto L_0x005a
                r8.a()
            L_0x005a:
                lf.M r8 = lf.C6514M.f71813a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: y.C2918c.C0475c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    public static final java.lang.Object b(D0.C1111b r8, qf.C6658d r9) {
        /*
            boolean r0 = r9 instanceof y.C2918c.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            y.c$a r0 = (y.C2918c.a) r0
            int r1 = r0.f28458c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f28458c = r1
            goto L_0x0018
        L_0x0013:
            y.c$a r0 = new y.c$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f28457b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f28458c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.f28456a
            D0.b r8 = (D0.C1111b) r8
            lf.w.b(r9)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            lf.w.b(r9)
        L_0x0038:
            r0.f28456a = r8
            r0.f28458c = r3
            r9 = 0
            java.lang.Object r9 = D0.C1111b.u0(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L_0x0044
            return r1
        L_0x0044:
            D0.o r9 = (D0.C1124o) r9
            int r2 = r9.b()
            boolean r2 = D0.C1128t.c(r2)
            if (r2 == 0) goto L_0x0038
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x005a:
            if (r6 >= r4) goto L_0x006c
            java.lang.Object r7 = r2.get(r6)
            D0.A r7 = (D0.A) r7
            boolean r7 = D0.C1125p.a(r7)
            if (r7 != 0) goto L_0x0069
            goto L_0x0038
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x005a
        L_0x006c:
            java.util.List r8 = r9.c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2918c.b(D0.b, qf.d):java.lang.Object");
    }

    public static final i c(i iVar, C2924i iVar2) {
        return T.d(iVar, C2919d.f28466a, new b(iVar2, (C6658d) null));
    }

    public static final Object d(J j10, C6798l lVar, C6658d dVar) {
        Object c10 = o.c(j10, new C0475c(lVar, (C6658d) null), dVar);
        if (c10 == C6680b.f()) {
            return c10;
        }
        return C6514M.f71813a;
    }
}

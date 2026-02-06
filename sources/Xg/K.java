package Xg;

import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import yf.q;

final class K implements H {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f66455b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f66456c;

    static final class a extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f66457a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f66458b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ int f66459c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f66460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(K k10, C6658d dVar) {
            super(3, dVar);
            this.f66460d = k10;
        }

        public final Object i(C5695g gVar, int i10, C6658d dVar) {
            a aVar = new a(this.f66460d, dVar);
            aVar.f66458b = gVar;
            aVar.f66459c = i10;
            return aVar.invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((C5695g) obj, ((Number) obj2).intValue(), (C6658d) obj3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: Xg.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r9.f66457a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x003c
                if (r1 == r6) goto L_0x0038
                if (r1 == r5) goto L_0x0030
                if (r1 == r4) goto L_0x0028
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                goto L_0x0038
            L_0x0018:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0020:
                java.lang.Object r1 = r9.f66458b
                Xg.g r1 = (Xg.C5695g) r1
                lf.w.b(r10)
                goto L_0x008e
            L_0x0028:
                java.lang.Object r1 = r9.f66458b
                Xg.g r1 = (Xg.C5695g) r1
                lf.w.b(r10)
                goto L_0x007d
            L_0x0030:
                java.lang.Object r1 = r9.f66458b
                Xg.g r1 = (Xg.C5695g) r1
                lf.w.b(r10)
                goto L_0x0064
            L_0x0038:
                lf.w.b(r10)
                goto L_0x009c
            L_0x003c:
                lf.w.b(r10)
                java.lang.Object r10 = r9.f66458b
                r1 = r10
                Xg.g r1 = (Xg.C5695g) r1
                int r10 = r9.f66459c
                if (r10 <= 0) goto L_0x0053
                Xg.F r10 = Xg.F.START
                r9.f66457a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x0053:
                Xg.K r10 = r9.f66460d
                long r6 = r10.f66455b
                r9.f66458b = r1
                r9.f66457a = r5
                java.lang.Object r10 = Ug.V.a(r6, r9)
                if (r10 != r0) goto L_0x0064
                return r0
            L_0x0064:
                Xg.K r10 = r9.f66460d
                long r5 = r10.f66456c
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L_0x008e
                Xg.F r10 = Xg.F.STOP
                r9.f66458b = r1
                r9.f66457a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x007d
                return r0
            L_0x007d:
                Xg.K r10 = r9.f66460d
                long r4 = r10.f66456c
                r9.f66458b = r1
                r9.f66457a = r3
                java.lang.Object r10 = Ug.V.a(r4, r9)
                if (r10 != r0) goto L_0x008e
                return r0
            L_0x008e:
                Xg.F r10 = Xg.F.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f66458b = r3
                r9.f66457a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x009c:
                lf.M r10 = lf.C6514M.f71813a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.K.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66461a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f66462b;

        b(C6658d dVar) {
            super(2, dVar);
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(dVar);
            bVar.f66462b = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(F f10, C6658d dVar) {
            return ((b) create(f10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            C6680b.f();
            if (this.f66461a == 0) {
                w.b(obj);
                if (((F) this.f66462b) != F.START) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public K(long j10, long j11) {
        this.f66455b = j10;
        this.f66456c = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        } else if (j11 < 0) {
            throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
        }
    }

    public C5694f a(L l10) {
        return C5696h.n(C5696h.p(C5696h.O(l10, new a(this, (C6658d) null)), new b((C6658d) null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof K) {
            K k10 = (K) obj;
            if (this.f66455b == k10.f66455b && this.f66456c == k10.f66456c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f66455b) * 31) + Long.hashCode(this.f66456c);
    }

    public String toString() {
        List d10 = C6565s.d(2);
        if (this.f66455b > 0) {
            d10.add("stopTimeout=" + this.f66455b + "ms");
        }
        if (this.f66456c < Long.MAX_VALUE) {
            d10.add("replayExpiration=" + this.f66456c + "ms");
        }
        List a10 = C6565s.a(d10);
        return "SharingStarted.WhileSubscribed(" + C6565s.x0(a10, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null) + ')';
    }
}

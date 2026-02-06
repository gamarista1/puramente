package Xg;

import Yg.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.q;

abstract /* synthetic */ class v {

    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5694f f66708a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5694f f66709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f66710c;

        public a(C5694f fVar, C5694f fVar2, q qVar) {
            this.f66708a = fVar;
            this.f66709b = fVar2;
            this.f66710c = qVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object a10 = l.a(gVar, new C5694f[]{this.f66708a, this.f66709b}, v.c(), new b(this.f66710c, (C6658d) null), dVar);
            if (a10 == C6680b.f()) {
                return a10;
            }
            return C6514M.f71813a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f66711a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f66712b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f66713c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f66714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar, C6658d dVar) {
            super(3, dVar);
            this.f66714d = qVar;
        }

        /* renamed from: i */
        public final Object invoke(C5695g gVar, Object[] objArr, C6658d dVar) {
            b bVar = new b(this.f66714d, dVar);
            bVar.f66712b = gVar;
            bVar.f66713c = objArr;
            return bVar.invokeSuspend(C6514M.f71813a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: Xg.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r6.f66711a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                lf.w.b(r7)
                goto L_0x004c
            L_0x0012:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001a:
                java.lang.Object r1 = r6.f66712b
                Xg.g r1 = (Xg.C5695g) r1
                lf.w.b(r7)
                goto L_0x0040
            L_0x0022:
                lf.w.b(r7)
                java.lang.Object r7 = r6.f66712b
                r1 = r7
                Xg.g r1 = (Xg.C5695g) r1
                java.lang.Object r7 = r6.f66713c
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                yf.q r4 = r6.f66714d
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f66712b = r1
                r6.f66711a = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L_0x0040
                return r0
            L_0x0040:
                r3 = 0
                r6.f66712b = r3
                r6.f66711a = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L_0x004c
                return r0
            L_0x004c:
                lf.M r7 = lf.C6514M.f71813a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Xg.v.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f66715a = new c();

        c() {
            super(0);
        }

        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    public static final C5694f b(C5694f fVar, C5694f fVar2, q qVar) {
        return new a(fVar, fVar2, qVar);
    }

    /* access modifiers changed from: private */
    public static final C6787a c() {
        return c.f66715a;
    }
}

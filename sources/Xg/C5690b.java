package Xg;

import Wg.r;
import Yg.e;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6658d;
import qf.g;
import qf.h;
import yf.p;

/* renamed from: Xg.b  reason: case insensitive filesystem */
final class C5690b extends C5692d {

    /* renamed from: e  reason: collision with root package name */
    private final p f66493e;

    /* renamed from: Xg.b$a */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f66494a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f66495b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5690b f66496c;

        /* renamed from: d  reason: collision with root package name */
        int f66497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5690b bVar, C6658d dVar) {
            super(dVar);
            this.f66496c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66495b = obj;
            this.f66497d |= Integer.MIN_VALUE;
            return this.f66496c.i((r) null, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5690b(p pVar, g gVar, int i10, Wg.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i11 & 2) != 0 ? h.f72645a : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Wg.a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object i(Wg.r r5, qf.C6658d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Xg.C5690b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Xg.b$a r0 = (Xg.C5690b.a) r0
            int r1 = r0.f66497d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66497d = r1
            goto L_0x0018
        L_0x0013:
            Xg.b$a r0 = new Xg.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f66495b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f66497d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f66494a
            Wg.r r5 = (Wg.r) r5
            lf.w.b(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            lf.w.b(r6)
            r0.f66494a = r5
            r0.f66497d = r3
            java.lang.Object r6 = super.i(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r5 = r5.m()
            if (r5 == 0) goto L_0x004c
            lf.M r5 = lf.C6514M.f71813a
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Xg.C5690b.i(Wg.r, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public e j(g gVar, int i10, Wg.a aVar) {
        return new C5690b(this.f66493e, gVar, i10, aVar);
    }

    public C5690b(p pVar, g gVar, int i10, Wg.a aVar) {
        super(pVar, gVar, i10, aVar);
        this.f66493e = pVar;
    }
}

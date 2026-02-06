package z;

import Ug.K;
import Ug.L;
import Y.C1510r0;
import Y.o1;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import x.C2848L;
import x.C2850N;
import yf.C6798l;
import yf.p;

final class i implements y {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f28960a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final v f28961b = new b(this);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C2850N f28962c = new C2850N();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C1510r0 f28963d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C1510r0 f28964e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C1510r0 f28965f;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f28966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f28967b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2848L f28968c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f28969d;

        /* renamed from: z.i$a$a  reason: collision with other inner class name */
        static final class C0487a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f28970a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f28971b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i f28972c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p f28973d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0487a(i iVar, p pVar, C6658d dVar) {
                super(2, dVar);
                this.f28972c = iVar;
                this.f28973d = pVar;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0487a aVar = new C0487a(this.f28972c, this.f28973d, dVar);
                aVar.f28971b = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(v vVar, C6658d dVar) {
                return ((C0487a) create(vVar, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f28970a;
                if (i10 == 0) {
                    w.b(obj);
                    v vVar = (v) this.f28971b;
                    this.f28972c.f28963d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                    p pVar = this.f28973d;
                    this.f28970a = 1;
                    if (pVar.invoke(vVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    try {
                        w.b(obj);
                    } catch (Throwable th2) {
                        this.f28972c.f28963d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f28972c.f28963d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C2848L l10, p pVar, C6658d dVar) {
            super(2, dVar);
            this.f28967b = iVar;
            this.f28968c = l10;
            this.f28969d = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f28967b, this.f28968c, this.f28969d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f28966a;
            if (i10 == 0) {
                w.b(obj);
                C2850N g10 = this.f28967b.f28962c;
                v h10 = this.f28967b.f28961b;
                C2848L l10 = this.f28968c;
                C0487a aVar = new C0487a(this.f28967b, this.f28969d, (C6658d) null);
                this.f28966a = 1;
                if (g10.d(h10, l10, aVar, this) == f10) {
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

    public static final class b implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28974a;

        b(i iVar) {
            this.f28974a = iVar;
        }

        public float a(float f10) {
            boolean z10;
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            float floatValue = ((Number) this.f28974a.l().invoke(Float.valueOf(f10))).floatValue();
            C1510r0 j10 = this.f28974a.f28964e;
            boolean z11 = false;
            if (floatValue > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            j10.setValue(Boolean.valueOf(z10));
            C1510r0 i10 = this.f28974a.f28965f;
            if (floatValue < 0.0f) {
                z11 = true;
            }
            i10.setValue(Boolean.valueOf(z11));
            return floatValue;
        }
    }

    public i(C6798l lVar) {
        this.f28960a = lVar;
        Boolean bool = Boolean.FALSE;
        this.f28963d = u1.d(bool, (o1) null, 2, (Object) null);
        this.f28964e = u1.d(bool, (o1) null, 2, (Object) null);
        this.f28965f = u1.d(bool, (o1) null, 2, (Object) null);
    }

    public boolean b() {
        return ((Boolean) this.f28963d.getValue()).booleanValue();
    }

    public Object e(C2848L l10, p pVar, C6658d dVar) {
        Object e10 = L.e(new a(this, l10, pVar, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public float f(float f10) {
        return ((Number) this.f28960a.invoke(Float.valueOf(f10))).floatValue();
    }

    public final C6798l l() {
        return this.f28960a;
    }
}

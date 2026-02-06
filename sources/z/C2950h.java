package z;

import Ug.C5572i;
import androidx.compose.foundation.gestures.d;
import java.util.concurrent.CancellationException;
import k0.l;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import w.C2796h;
import w.C2799k;
import w.C2800l;
import w.C2814z;
import w.l0;
import yf.C6798l;
import yf.p;

/* renamed from: z.h  reason: case insensitive filesystem */
public final class C2950h implements n {

    /* renamed from: a  reason: collision with root package name */
    private C2814z f28947a;

    /* renamed from: b  reason: collision with root package name */
    private final l f28948b;

    /* renamed from: c  reason: collision with root package name */
    private int f28949c;

    /* renamed from: z.h$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f28950a;

        /* renamed from: b  reason: collision with root package name */
        Object f28951b;

        /* renamed from: c  reason: collision with root package name */
        int f28952c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f28953d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C2950h f28954e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f28955f;

        /* renamed from: z.h$a$a  reason: collision with other inner class name */
        static final class C0486a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f28956a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f28957b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ K f28958c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C2950h f28959d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0486a(K k10, v vVar, K k11, C2950h hVar) {
                super(1);
                this.f28956a = k10;
                this.f28957b = vVar;
                this.f28958c = k11;
                this.f28959d = hVar;
            }

            public final void a(C2796h hVar) {
                float floatValue = ((Number) hVar.e()).floatValue() - this.f28956a.f71756a;
                float a10 = this.f28957b.a(floatValue);
                this.f28956a.f71756a = ((Number) hVar.e()).floatValue();
                this.f28958c.f71756a = ((Number) hVar.f()).floatValue();
                if (Math.abs(floatValue - a10) > 0.5f) {
                    hVar.a();
                }
                C2950h hVar2 = this.f28959d;
                hVar2.g(hVar2.e() + 1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C2796h) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(float f10, C2950h hVar, v vVar, C6658d dVar) {
            super(2, dVar);
            this.f28953d = f10;
            this.f28954e = hVar;
            this.f28955f = vVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f28953d, this.f28954e, this.f28955f, dVar);
        }

        public final Object invoke(Ug.K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            float f10;
            K k10;
            C2799k kVar;
            Object f11 = C6680b.f();
            int i10 = this.f28952c;
            if (i10 == 0) {
                w.b(obj);
                if (Math.abs(this.f28953d) > 1.0f) {
                    K k11 = new K();
                    k11.f71756a = this.f28953d;
                    K k12 = new K();
                    C2799k c10 = C2800l.c(0.0f, this.f28953d, 0, 0, false, 28, (Object) null);
                    try {
                        C2814z d10 = this.f28954e.d();
                        C0486a aVar = new C0486a(k12, this.f28955f, k11, this.f28954e);
                        this.f28950a = k11;
                        this.f28951b = c10;
                        this.f28952c = 1;
                        if (l0.h(c10, d10, false, aVar, this, 2, (Object) null) == f11) {
                            return f11;
                        }
                        k10 = k11;
                    } catch (CancellationException unused) {
                        k10 = k11;
                        kVar = c10;
                        k10.f71756a = ((Number) kVar.n()).floatValue();
                        f10 = k10.f71756a;
                        return b.b(f10);
                    }
                } else {
                    f10 = this.f28953d;
                    return b.b(f10);
                }
            } else if (i10 == 1) {
                kVar = (C2799k) this.f28951b;
                k10 = (K) this.f28950a;
                try {
                    w.b(obj);
                } catch (CancellationException unused2) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = k10.f71756a;
            return b.b(f10);
        }
    }

    public C2950h(C2814z zVar, l lVar) {
        this.f28947a = zVar;
        this.f28948b = lVar;
    }

    public Object a(v vVar, float f10, C6658d dVar) {
        this.f28949c = 0;
        return C5572i.g(this.f28948b, new a(f10, this, vVar, (C6658d) null), dVar);
    }

    public final C2814z d() {
        return this.f28947a;
    }

    public final int e() {
        return this.f28949c;
    }

    public final void f(C2814z zVar) {
        this.f28947a = zVar;
    }

    public final void g(int i10) {
        this.f28949c = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2950h(C2814z zVar, l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(zVar, (i10 & 2) != 0 ? d.e() : lVar);
    }
}

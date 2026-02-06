package Yg;

import Ug.K;
import Ug.L;
import Ug.M;
import Ug.O;
import Wg.r;
import Wg.t;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.C6798l;
import yf.p;

public abstract class e implements q {

    /* renamed from: a  reason: collision with root package name */
    public final g f66783a;

    /* renamed from: b  reason: collision with root package name */
    public final int f66784b;

    /* renamed from: c  reason: collision with root package name */
    public final Wg.a f66785c;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66786a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f66787b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5695g f66788c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f66789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5695g gVar, e eVar, C6658d dVar) {
            super(2, dVar);
            this.f66788c = gVar;
            this.f66789d = eVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f66788c, this.f66789d, dVar);
            aVar.f66787b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f66786a;
            if (i10 == 0) {
                w.b(obj);
                C5695g gVar = this.f66788c;
                t n10 = this.f66789d.n((K) this.f66787b);
                this.f66786a = 1;
                if (C5696h.q(gVar, n10, this) == f10) {
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

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66790a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f66791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f66792c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, C6658d dVar) {
            super(2, dVar);
            this.f66792c = eVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f66792c, dVar);
            bVar.f66791b = obj;
            return bVar;
        }

        public final Object invoke(r rVar, C6658d dVar) {
            return ((b) create(rVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f66790a;
            if (i10 == 0) {
                w.b(obj);
                e eVar = this.f66792c;
                this.f66790a = 1;
                if (eVar.i((r) this.f66791b, this) == f10) {
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

    public e(g gVar, int i10, Wg.a aVar) {
        this.f66783a = gVar;
        this.f66784b = i10;
        this.f66785c = aVar;
    }

    static /* synthetic */ Object g(e eVar, C5695g gVar, C6658d dVar) {
        Object e10 = L.e(new a(gVar, eVar, (C6658d) null), dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public C5694f a(g gVar, int i10, Wg.a aVar) {
        g n12 = gVar.n1(this.f66783a);
        if (aVar == Wg.a.SUSPEND) {
            int i11 = this.f66784b;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = a.e.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            aVar = this.f66785c;
        }
        if (C6496s.c(n12, this.f66783a) && i10 == this.f66784b && aVar == this.f66785c) {
            return this;
        }
        return j(n12, i10, aVar);
    }

    public Object collect(C5695g gVar, C6658d dVar) {
        return g(this, gVar, dVar);
    }

    /* access modifiers changed from: protected */
    public String f() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Object i(r rVar, C6658d dVar);

    /* access modifiers changed from: protected */
    public abstract e j(g gVar, int i10, Wg.a aVar);

    public C5694f k() {
        return null;
    }

    public final p l() {
        return new b(this, (C6658d) null);
    }

    public final int m() {
        int i10 = this.f66784b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public t n(K k10) {
        return Wg.p.d(k10, this.f66783a, m(), this.f66785c, M.ATOMIC, (C6798l) null, l(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String f10 = f();
        if (f10 != null) {
            arrayList.add(f10);
        }
        if (this.f66783a != h.f72645a) {
            arrayList.add("context=" + this.f66783a);
        }
        if (this.f66784b != -3) {
            arrayList.add("capacity=" + this.f66784b);
        }
        if (this.f66785c != Wg.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f66785c);
        }
        return O.a(this) + '[' + C6565s.x0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null) + ']';
    }
}

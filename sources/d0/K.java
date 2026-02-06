package D0;

import H0.C1197s;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2421g;
import yf.C6798l;

public final class K implements H {

    /* renamed from: b  reason: collision with root package name */
    public C6798l f1397b;

    /* renamed from: c  reason: collision with root package name */
    private S f1398c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1399d;

    /* renamed from: e  reason: collision with root package name */
    private final G f1400e = new b(this);

    private enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    public static final class b extends G {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public a f1405b = a.Unknown;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f1406c;

        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f1407a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(K k10) {
                super(1);
                this.f1407a = k10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f1407a.b().invoke(motionEvent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: D0.K$b$b  reason: collision with other inner class name */
        static final class C0017b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f1408a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f1409b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0017b(b bVar, K k10) {
                super(1);
                this.f1408a = bVar;
                this.f1409b = k10;
            }

            public final void a(MotionEvent motionEvent) {
                a aVar;
                if (motionEvent.getActionMasked() == 0) {
                    b bVar = this.f1408a;
                    if (((Boolean) this.f1409b.b().invoke(motionEvent)).booleanValue()) {
                        aVar = a.Dispatching;
                    } else {
                        aVar = a.NotDispatching;
                    }
                    bVar.f1405b = aVar;
                    return;
                }
                this.f1409b.b().invoke(motionEvent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return C6514M.f71813a;
            }
        }

        static final class c extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f1410a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(K k10) {
                super(1);
                this.f1410a = k10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f1410a.b().invoke(motionEvent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return C6514M.f71813a;
            }
        }

        b(K k10) {
            this.f1406c = k10;
        }

        private final void h(C1124o oVar) {
            List c10 = oVar.c();
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((A) c10.get(i10)).p()) {
                    if (this.f1405b == a.Dispatching) {
                        C1197s b10 = b();
                        if (b10 != null) {
                            M.b(oVar, b10.H0(C2421g.f25320b.c()), new a(this.f1406c));
                        } else {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                    }
                    this.f1405b = a.NotDispatching;
                    return;
                }
            }
            C1197s b11 = b();
            if (b11 != null) {
                M.c(oVar, b11.H0(C2421g.f25320b.c()), new C0017b(this, this.f1406c));
                if (this.f1405b == a.Dispatching) {
                    int size2 = c10.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((A) c10.get(i11)).a();
                    }
                    C1116g d10 = oVar.d();
                    if (d10 != null) {
                        d10.e(!this.f1406c.a());
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set");
        }

        private final void i() {
            this.f1405b = a.Unknown;
            this.f1406c.d(false);
        }

        public boolean c() {
            return true;
        }

        public void d() {
            if (this.f1405b == a.Dispatching) {
                M.a(SystemClock.uptimeMillis(), new c(this.f1406c));
                i();
            }
        }

        public void e(C1124o oVar, C1126q qVar, long j10) {
            boolean z10;
            List c10 = oVar.c();
            int i10 = 0;
            if (!this.f1406c.a()) {
                int size = c10.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    A a10 = (A) c10.get(i11);
                    if (C1125p.b(a10) || C1125p.d(a10)) {
                        break;
                    }
                    i11++;
                }
            }
            z10 = true;
            if (this.f1405b != a.NotDispatching) {
                if (qVar == C1126q.Initial && z10) {
                    h(oVar);
                }
                if (qVar == C1126q.Final && !z10) {
                    h(oVar);
                }
            }
            if (qVar == C1126q.Final) {
                int size2 = c10.size();
                while (i10 < size2) {
                    if (C1125p.d((A) c10.get(i10))) {
                        i10++;
                    } else {
                        return;
                    }
                }
                i();
            }
        }
    }

    public final boolean a() {
        return this.f1399d;
    }

    public final C6798l b() {
        C6798l lVar = this.f1397b;
        if (lVar != null) {
            return lVar;
        }
        C6496s.v("onTouchEvent");
        return null;
    }

    public final void d(boolean z10) {
        this.f1399d = z10;
    }

    public final void e(C6798l lVar) {
        this.f1397b = lVar;
    }

    public final void i(S s10) {
        S s11 = this.f1398c;
        if (s11 != null) {
            s11.b((K) null);
        }
        this.f1398c = s10;
        if (s10 != null) {
            s10.b(this);
        }
    }

    public G r() {
        return this.f1400e;
    }
}

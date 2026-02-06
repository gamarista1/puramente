package b1;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import r0.C2514n0;
import r0.C2544x0;
import r0.c2;
import r0.h2;
import yf.C6787a;

public interface n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19132a = a.f19133a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f19133a = new a();

        private a() {
        }

        public final n a(C2514n0 n0Var, float f10) {
            if (n0Var == null) {
                return b.f19134b;
            }
            if (n0Var instanceof h2) {
                return b(m.c(((h2) n0Var).b(), f10));
            }
            if (n0Var instanceof c2) {
                return new C1871c((c2) n0Var, f10);
            }
            throw new C6535s();
        }

        public final n b(long j10) {
            if (j10 != 16) {
                return new C1872d(j10, (DefaultConstructorMarker) null);
            }
            return b.f19134b;
        }
    }

    public static final class b implements n {

        /* renamed from: b  reason: collision with root package name */
        public static final b f19134b = new b();

        private b() {
        }

        public float a() {
            return Float.NaN;
        }

        public long d() {
            return C2544x0.f25560b.h();
        }

        public C2514n0 f() {
            return null;
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f19135a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f19135a = nVar;
        }

        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(this.f19135a.a());
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f19136a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(0);
            this.f19136a = nVar;
        }

        /* renamed from: a */
        public final n invoke() {
            return this.f19136a;
        }
    }

    float a();

    long d();

    n e(n nVar) {
        boolean z10 = nVar instanceof C1871c;
        if (z10 && (this instanceof C1871c)) {
            return new C1871c(((C1871c) nVar).b(), m.d(nVar.a(), new c(this)));
        }
        if (z10 && !(this instanceof C1871c)) {
            return nVar;
        }
        if (z10 || !(this instanceof C1871c)) {
            return nVar.g(new d(this));
        }
        return this;
    }

    C2514n0 f();

    n g(C6787a aVar) {
        if (!C6496s.c(this, b.f19134b)) {
            return this;
        }
        return (n) aVar.invoke();
    }
}

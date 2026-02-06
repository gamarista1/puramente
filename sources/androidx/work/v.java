package androidx.work;

import androidx.work.F;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class v extends F {

    /* renamed from: e  reason: collision with root package name */
    public static final b f19040e = new b((DefaultConstructorMarker) null);

    public static final class a extends F.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(cls);
            C6496s.h(cls, "workerClass");
        }

        /* renamed from: k */
        public v b() {
            if (!c() || !g().f5100j.h()) {
                return new v(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: l */
        public a f() {
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(Class cls) {
            C6496s.h(cls, "workerClass");
            return (v) new a(cls).a();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(a aVar) {
        super(aVar.d(), aVar.g(), aVar.e());
        C6496s.h(aVar, "builder");
    }

    public static final v e(Class cls) {
        return f19040e.a(cls);
    }
}

package kc;

import kc.C5063a;
import kc.C5065c;

/* renamed from: kc.d  reason: case insensitive filesystem */
public abstract class C5066d {

    /* renamed from: a  reason: collision with root package name */
    public static C5066d f60945a = a().a();

    /* renamed from: kc.d$a */
    public static abstract class a {
        public abstract C5066d a();

        public abstract a b(String str);

        public abstract a c(long j10);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C5065c.a aVar);

        public abstract a h(long j10);
    }

    public static a a() {
        return new C5063a.b().h(0).g(C5065c.a.ATTEMPT_MIGRATION).c(0);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C5065c.a g();

    public abstract long h();

    public boolean i() {
        if (g() == C5065c.a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (g() == C5065c.a.NOT_GENERATED || g() == C5065c.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (g() == C5065c.a.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (g() == C5065c.a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (g() == C5065c.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    public abstract a n();

    public C5066d o(String str, long j10, long j11) {
        return n().b(str).c(j10).h(j11).a();
    }

    public C5066d p() {
        return n().b((String) null).a();
    }

    public C5066d q(String str) {
        return n().e(str).g(C5065c.a.REGISTER_ERROR).a();
    }

    public C5066d r() {
        return n().g(C5065c.a.NOT_GENERATED).a();
    }

    public C5066d s(String str, String str2, long j10, String str3, long j11) {
        return n().d(str).g(C5065c.a.REGISTERED).b(str3).f(str2).c(j11).h(j10).a();
    }

    public C5066d t(String str) {
        return n().d(str).g(C5065c.a.UNREGISTERED).a();
    }
}

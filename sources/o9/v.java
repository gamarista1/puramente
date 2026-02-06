package o9;

import android.os.Looper;
import k9.C3717q0;
import l9.s0;
import o9.n;
import o9.u;

public interface v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f47547a;

    /* renamed from: b  reason: collision with root package name */
    public static final v f47548b;

    static {
        a aVar = new a();
        f47547a = aVar;
        f47548b = aVar;
    }

    n a(u.a aVar, C3717q0 q0Var);

    void b(Looper looper, s0 s0Var);

    b c(u.a aVar, C3717q0 q0Var) {
        return b.f47549a;
    }

    int d(C3717q0 q0Var);

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47549a = new w();

        void release();

        /* access modifiers changed from: private */
        static /* synthetic */ void a() {
        }
    }

    void j() {
    }

    void release() {
    }

    class a implements v {
        a() {
        }

        public n a(u.a aVar, C3717q0 q0Var) {
            if (q0Var.f45773o == null) {
                return null;
            }
            return new C3911A(new n.a(new K(1), 6001));
        }

        public int d(C3717q0 q0Var) {
            if (q0Var.f45773o != null) {
                return 1;
            }
            return 0;
        }

        public void b(Looper looper, s0 s0Var) {
        }
    }
}

package p2;

import android.os.Looper;
import f2.s;
import n2.u1;
import p2.C2409m;
import p2.t;

public interface u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f25307a = new a();

    b a(t.a aVar, s sVar) {
        return b.f25308a;
    }

    void b(Looper looper, u1 u1Var);

    C2409m c(t.a aVar, s sVar);

    int d(s sVar);

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25308a = new v();

        void release();

        /* access modifiers changed from: private */
        static /* synthetic */ void a() {
        }
    }

    void j() {
    }

    void release() {
    }

    class a implements u {
        a() {
        }

        public C2409m c(t.a aVar, s sVar) {
            if (sVar.f20087r == null) {
                return null;
            }
            return new z(new C2409m.a(new N(1), 6001));
        }

        public int d(s sVar) {
            if (sVar.f20087r != null) {
                return 1;
            }
            return 0;
        }

        public void b(Looper looper, u1 u1Var) {
        }
    }
}

package P3;

import androidx.work.C1840g;
import java.util.Collections;
import java.util.List;
import u3.C2706A;
import u3.i;
import u3.u;
import y3.k;

public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    private final u f5081a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5082b;

    /* renamed from: c  reason: collision with root package name */
    private final C2706A f5083c;

    /* renamed from: d  reason: collision with root package name */
    private final C2706A f5084d;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, q qVar) {
            if (qVar.b() == null) {
                kVar.i1(1);
            } else {
                kVar.C0(1, qVar.b());
            }
            byte[] k10 = C1840g.k(qVar.a());
            if (k10 == null) {
                kVar.i1(2);
            } else {
                kVar.U0(2, k10);
            }
        }
    }

    class b extends C2706A {
        b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends C2706A {
        c(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(u uVar) {
        this.f5081a = uVar;
        this.f5082b = new a(uVar);
        this.f5083c = new b(uVar);
        this.f5084d = new c(uVar);
    }

    public static List d() {
        return Collections.emptyList();
    }

    public void a(String str) {
        this.f5081a.d();
        k b10 = this.f5083c.b();
        if (str == null) {
            b10.i1(1);
        } else {
            b10.C0(1, str);
        }
        this.f5081a.e();
        try {
            b10.C();
            this.f5081a.A();
        } finally {
            this.f5081a.i();
            this.f5083c.h(b10);
        }
    }

    public void b(q qVar) {
        this.f5081a.d();
        this.f5081a.e();
        try {
            this.f5082b.j(qVar);
            this.f5081a.A();
        } finally {
            this.f5081a.i();
        }
    }

    public void c() {
        this.f5081a.d();
        k b10 = this.f5084d.b();
        this.f5081a.e();
        try {
            b10.C();
            this.f5081a.A();
        } finally {
            this.f5081a.i();
            this.f5084d.h(b10);
        }
    }
}

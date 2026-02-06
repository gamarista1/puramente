package P3;

import P3.z;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import u3.C2706A;
import u3.i;
import u3.u;
import u3.x;
import w3.C2833b;
import y3.k;

public final class A implements z {

    /* renamed from: a  reason: collision with root package name */
    private final u f5042a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5043b;

    /* renamed from: c  reason: collision with root package name */
    private final C2706A f5044c;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, y yVar) {
            if (yVar.a() == null) {
                kVar.i1(1);
            } else {
                kVar.C0(1, yVar.a());
            }
            if (yVar.b() == null) {
                kVar.i1(2);
            } else {
                kVar.C0(2, yVar.b());
            }
        }
    }

    class b extends C2706A {
        b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public A(u uVar) {
        this.f5042a = uVar;
        this.f5043b = new a(uVar);
        this.f5044c = new b(uVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    public List a(String str) {
        String str2;
        x f10 = x.f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5042a.d();
        Cursor b10 = C2833b.b(this.f5042a, f10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                if (b10.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = b10.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            b10.close();
            f10.q();
        }
    }

    public void c(y yVar) {
        this.f5042a.d();
        this.f5042a.e();
        try {
            this.f5043b.j(yVar);
            this.f5042a.A();
        } finally {
            this.f5042a.i();
        }
    }

    public void d(String str, Set set) {
        z.a.a(this, str, set);
    }
}

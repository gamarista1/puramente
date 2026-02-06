package P3;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u3.i;
import u3.u;
import u3.x;
import w3.C2833b;
import y3.k;

public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final u f5076a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5077b;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.i1(1);
            } else {
                kVar.C0(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.i1(2);
            } else {
                kVar.C0(2, nVar.b());
            }
        }
    }

    public p(u uVar) {
        this.f5076a = uVar;
        this.f5077b = new a(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public List a(String str) {
        String str2;
        x f10 = x.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5076a.d();
        Cursor b10 = C2833b.b(this.f5076a, f10, false, (CancellationSignal) null);
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

    public void b(n nVar) {
        this.f5076a.d();
        this.f5076a.e();
        try {
            this.f5077b.j(nVar);
            this.f5076a.A();
        } finally {
            this.f5076a.i();
        }
    }
}

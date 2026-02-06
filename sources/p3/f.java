package P3;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.Collections;
import java.util.List;
import u3.i;
import u3.u;
import u3.x;
import w3.C2833b;
import y3.k;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final u f5059a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5060b;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.i1(1);
            } else {
                kVar.C0(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.i1(2);
            } else {
                kVar.Q0(2, dVar.b().longValue());
            }
        }
    }

    public f(u uVar) {
        this.f5059a = uVar;
        this.f5060b = new a(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public Long a(String str) {
        x f10 = x.f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5059a.d();
        Long l10 = null;
        Cursor b10 = C2833b.b(this.f5059a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (!b10.isNull(0)) {
                    l10 = Long.valueOf(b10.getLong(0));
                }
            }
            return l10;
        } finally {
            b10.close();
            f10.q();
        }
    }

    public void b(d dVar) {
        this.f5059a.d();
        this.f5059a.e();
        try {
            this.f5060b.j(dVar);
            this.f5059a.A();
        } finally {
            this.f5059a.i();
        }
    }
}

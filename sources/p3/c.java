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

public final class c implements C1299b {

    /* renamed from: a  reason: collision with root package name */
    private final u f5054a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5055b;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, C1298a aVar) {
            if (aVar.b() == null) {
                kVar.i1(1);
            } else {
                kVar.C0(1, aVar.b());
            }
            if (aVar.a() == null) {
                kVar.i1(2);
            } else {
                kVar.C0(2, aVar.a());
            }
        }
    }

    public c(u uVar) {
        this.f5054a = uVar;
        this.f5055b = new a(uVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    public void a(C1298a aVar) {
        this.f5054a.d();
        this.f5054a.e();
        try {
            this.f5055b.j(aVar);
            this.f5054a.A();
        } finally {
            this.f5054a.i();
        }
    }

    public List b(String str) {
        String str2;
        x f10 = x.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5054a.d();
        Cursor b10 = C2833b.b(this.f5054a, f10, false, (CancellationSignal) null);
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

    public boolean c(String str) {
        boolean z10 = true;
        x f10 = x.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5054a.d();
        boolean z11 = false;
        Cursor b10 = C2833b.b(this.f5054a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            f10.q();
        }
    }

    public boolean d(String str) {
        boolean z10 = true;
        x f10 = x.f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5054a.d();
        boolean z11 = false;
        Cursor b10 = C2833b.b(this.f5054a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            f10.q();
        }
    }
}

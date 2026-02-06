package P3;

import P3.j;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u3.C2706A;
import u3.i;
import u3.u;
import u3.x;
import w3.C2833b;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final u f5065a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5066b;

    /* renamed from: c  reason: collision with root package name */
    private final C2706A f5067c;

    /* renamed from: d  reason: collision with root package name */
    private final C2706A f5068d;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* renamed from: k */
        public void i(y3.k kVar, i iVar) {
            String str = iVar.f5062a;
            if (str == null) {
                kVar.i1(1);
            } else {
                kVar.C0(1, str);
            }
            kVar.Q0(2, (long) iVar.a());
            kVar.Q0(3, (long) iVar.f5064c);
        }
    }

    class b extends C2706A {
        b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends C2706A {
        c(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(u uVar) {
        this.f5065a = uVar;
        this.f5066b = new a(uVar);
        this.f5067c = new b(uVar);
        this.f5068d = new c(uVar);
    }

    public static List j() {
        return Collections.emptyList();
    }

    public i a(m mVar) {
        return j.a.a(this, mVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: P3.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public P3.i b(java.lang.String r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r1 = 2
            u3.x r0 = u3.x.f(r0, r1)
            r2 = 1
            if (r6 != 0) goto L_0x000e
            r0.i1(r2)
            goto L_0x0011
        L_0x000e:
            r0.C0(r2, r6)
        L_0x0011:
            long r6 = (long) r7
            r0.Q0(r1, r6)
            u3.u r6 = r5.f5065a
            r6.d()
            u3.u r6 = r5.f5065a
            r7 = 0
            r1 = 0
            android.database.Cursor r6 = w3.C2833b.b(r6, r0, r7, r1)
            java.lang.String r7 = "work_spec_id"
            int r7 = w3.C2832a.e(r6, r7)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "generation"
            int r2 = w3.C2832a.e(r6, r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "system_id"
            int r3 = w3.C2832a.e(r6, r3)     // Catch:{ all -> 0x0054 }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0056
            boolean r4 = r6.isNull(r7)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            java.lang.String r1 = r6.getString(r7)     // Catch:{ all -> 0x0054 }
        L_0x0045:
            int r7 = r6.getInt(r2)     // Catch:{ all -> 0x0054 }
            int r2 = r6.getInt(r3)     // Catch:{ all -> 0x0054 }
            P3.i r3 = new P3.i     // Catch:{ all -> 0x0054 }
            r3.<init>(r1, r7, r2)     // Catch:{ all -> 0x0054 }
            r1 = r3
            goto L_0x0056
        L_0x0054:
            r7 = move-exception
            goto L_0x005d
        L_0x0056:
            r6.close()
            r0.q()
            return r1
        L_0x005d:
            r6.close()
            r0.q()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.k.b(java.lang.String, int):P3.i");
    }

    public void c(i iVar) {
        this.f5065a.d();
        this.f5065a.e();
        try {
            this.f5066b.j(iVar);
            this.f5065a.A();
        } finally {
            this.f5065a.i();
        }
    }

    public List d() {
        String str;
        x f10 = x.f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f5065a.d();
        Cursor b10 = C2833b.b(this.f5065a, f10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                if (b10.isNull(0)) {
                    str = null;
                } else {
                    str = b10.getString(0);
                }
                arrayList.add(str);
            }
            return arrayList;
        } finally {
            b10.close();
            f10.q();
        }
    }

    public void f(m mVar) {
        j.a.b(this, mVar);
    }

    public void h(String str, int i10) {
        this.f5065a.d();
        y3.k b10 = this.f5067c.b();
        if (str == null) {
            b10.i1(1);
        } else {
            b10.C0(1, str);
        }
        b10.Q0(2, (long) i10);
        this.f5065a.e();
        try {
            b10.C();
            this.f5065a.A();
        } finally {
            this.f5065a.i();
            this.f5067c.h(b10);
        }
    }

    public void i(String str) {
        this.f5065a.d();
        y3.k b10 = this.f5068d.b();
        if (str == null) {
            b10.i1(1);
        } else {
            b10.C0(1, str);
        }
        this.f5065a.e();
        try {
            b10.C();
            this.f5065a.A();
        } finally {
            this.f5065a.i();
            this.f5068d.h(b10);
        }
    }
}

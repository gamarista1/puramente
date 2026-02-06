package P3;

import P3.u;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.C1834a;
import androidx.work.C1838e;
import androidx.work.C1840g;
import androidx.work.D;
import androidx.work.t;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u3.C2706A;
import u3.C2716h;
import u3.u;
import u3.x;
import w3.C2832a;
import w3.C2833b;

public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    private final u f5116a;

    /* renamed from: b  reason: collision with root package name */
    private final u3.i f5117b;

    /* renamed from: c  reason: collision with root package name */
    private final C2716h f5118c;

    /* renamed from: d  reason: collision with root package name */
    private final C2706A f5119d;

    /* renamed from: e  reason: collision with root package name */
    private final C2706A f5120e;

    /* renamed from: f  reason: collision with root package name */
    private final C2706A f5121f;

    /* renamed from: g  reason: collision with root package name */
    private final C2706A f5122g;

    /* renamed from: h  reason: collision with root package name */
    private final C2706A f5123h;

    /* renamed from: i  reason: collision with root package name */
    private final C2706A f5124i;

    /* renamed from: j  reason: collision with root package name */
    private final C2706A f5125j;

    /* renamed from: k  reason: collision with root package name */
    private final C2706A f5126k;

    /* renamed from: l  reason: collision with root package name */
    private final C2706A f5127l;

    /* renamed from: m  reason: collision with root package name */
    private final C2706A f5128m;

    /* renamed from: n  reason: collision with root package name */
    private final C2706A f5129n;

    /* renamed from: o  reason: collision with root package name */
    private final C2706A f5130o;

    /* renamed from: p  reason: collision with root package name */
    private final C2706A f5131p;

    /* renamed from: q  reason: collision with root package name */
    private final C2706A f5132q;

    /* renamed from: r  reason: collision with root package name */
    private final C2706A f5133r;

    class a extends C2706A {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class b extends C2706A {
        b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    class c extends C2706A {
        c(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    class d extends C2706A {
        d(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class e extends C2706A {
        e(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class f extends C2706A {
        f(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class g extends C2706A {
        g(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class h extends C2706A {
        h(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    class i extends u3.i {
        i(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: k */
        public void i(y3.k kVar, u uVar) {
            String str = uVar.f5091a;
            if (str == null) {
                kVar.i1(1);
            } else {
                kVar.C0(1, str);
            }
            B b10 = B.f5047a;
            kVar.Q0(2, (long) B.j(uVar.f5092b));
            String str2 = uVar.f5093c;
            if (str2 == null) {
                kVar.i1(3);
            } else {
                kVar.C0(3, str2);
            }
            String str3 = uVar.f5094d;
            if (str3 == null) {
                kVar.i1(4);
            } else {
                kVar.C0(4, str3);
            }
            byte[] k10 = C1840g.k(uVar.f5095e);
            if (k10 == null) {
                kVar.i1(5);
            } else {
                kVar.U0(5, k10);
            }
            byte[] k11 = C1840g.k(uVar.f5096f);
            if (k11 == null) {
                kVar.i1(6);
            } else {
                kVar.U0(6, k11);
            }
            kVar.Q0(7, uVar.f5097g);
            kVar.Q0(8, uVar.f5098h);
            kVar.Q0(9, uVar.f5099i);
            kVar.Q0(10, (long) uVar.f5101k);
            kVar.Q0(11, (long) B.a(uVar.f5102l));
            kVar.Q0(12, uVar.f5103m);
            kVar.Q0(13, uVar.f5104n);
            kVar.Q0(14, uVar.f5105o);
            kVar.Q0(15, uVar.f5106p);
            kVar.Q0(16, uVar.f5107q ? 1 : 0);
            kVar.Q0(17, (long) B.h(uVar.f5108r));
            kVar.Q0(18, (long) uVar.i());
            kVar.Q0(19, (long) uVar.f());
            kVar.Q0(20, uVar.g());
            kVar.Q0(21, (long) uVar.h());
            kVar.Q0(22, (long) uVar.j());
            C1838e eVar = uVar.f5100j;
            if (eVar != null) {
                kVar.Q0(23, (long) B.g(eVar.d()));
                kVar.Q0(24, eVar.g() ? 1 : 0);
                kVar.Q0(25, eVar.h() ? 1 : 0);
                kVar.Q0(26, eVar.f() ? 1 : 0);
                kVar.Q0(27, eVar.i() ? 1 : 0);
                kVar.Q0(28, eVar.b());
                kVar.Q0(29, eVar.a());
                byte[] i10 = B.i(eVar.c());
                if (i10 == null) {
                    kVar.i1(30);
                } else {
                    kVar.U0(30, i10);
                }
            } else {
                kVar.i1(23);
                kVar.i1(24);
                kVar.i1(25);
                kVar.i1(26);
                kVar.i1(27);
                kVar.i1(28);
                kVar.i1(29);
                kVar.i1(30);
            }
        }
    }

    class j extends C2716h {
        j(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    class k extends C2706A {
        k(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class l extends C2706A {
        l(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class m extends C2706A {
        m(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    class n extends C2706A {
        n(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class o extends C2706A {
        o(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class p extends C2706A {
        p(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class q extends C2706A {
        q(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public w(u uVar) {
        this.f5116a = uVar;
        this.f5117b = new i(uVar);
        this.f5118c = new j(uVar);
        this.f5119d = new k(uVar);
        this.f5120e = new l(uVar);
        this.f5121f = new m(uVar);
        this.f5122g = new n(uVar);
        this.f5123h = new o(uVar);
        this.f5124i = new p(uVar);
        this.f5125j = new q(uVar);
        this.f5126k = new a(uVar);
        this.f5127l = new b(uVar);
        this.f5128m = new c(uVar);
        this.f5129n = new d(uVar);
        this.f5130o = new e(uVar);
        this.f5131p = new f(uVar);
        this.f5132q = new g(uVar);
        this.f5133r = new h(uVar);
    }

    public static List A() {
        return Collections.emptyList();
    }

    public void a(String str) {
        this.f5116a.d();
        y3.k b10 = this.f5119d.b();
        if (str == null) {
            b10.i1(1);
        } else {
            b10.C0(1, str);
        }
        this.f5116a.e();
        try {
            b10.C();
            this.f5116a.A();
        } finally {
            this.f5116a.i();
            this.f5119d.h(b10);
        }
    }

    public void b(String str) {
        this.f5116a.d();
        y3.k b10 = this.f5122g.b();
        if (str == null) {
            b10.i1(1);
        } else {
            b10.C0(1, str);
        }
        this.f5116a.e();
        try {
            b10.C();
            this.f5116a.A();
        } finally {
            this.f5116a.i();
            this.f5122g.h(b10);
        }
    }

    public List c(long j10) {
        x xVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        byte[] bArr3;
        x f10 = x.f("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        f10.Q0(1, j10);
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            int e10 = C2832a.e(b10, "id");
            int e11 = C2832a.e(b10, "state");
            int e12 = C2832a.e(b10, "worker_class_name");
            int e13 = C2832a.e(b10, "input_merger_class_name");
            int e14 = C2832a.e(b10, MetricTracker.Object.INPUT);
            int e15 = C2832a.e(b10, "output");
            int e16 = C2832a.e(b10, "initial_delay");
            int e17 = C2832a.e(b10, "interval_duration");
            int e18 = C2832a.e(b10, "flex_duration");
            int e19 = C2832a.e(b10, "run_attempt_count");
            int e20 = C2832a.e(b10, "backoff_policy");
            int e21 = C2832a.e(b10, "backoff_delay_duration");
            int e22 = C2832a.e(b10, "last_enqueue_time");
            int e23 = C2832a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = C2832a.e(b10, "schedule_requested_at");
                int e25 = C2832a.e(b10, "run_in_foreground");
                int e26 = C2832a.e(b10, "out_of_quota_policy");
                int e27 = C2832a.e(b10, "period_count");
                int e28 = C2832a.e(b10, "generation");
                int e29 = C2832a.e(b10, "next_schedule_time_override");
                int e30 = C2832a.e(b10, "next_schedule_time_override_generation");
                int e31 = C2832a.e(b10, "stop_reason");
                int e32 = C2832a.e(b10, "required_network_type");
                int e33 = C2832a.e(b10, "requires_charging");
                int e34 = C2832a.e(b10, "requires_device_idle");
                int e35 = C2832a.e(b10, "requires_battery_not_low");
                int e36 = C2832a.e(b10, "requires_storage_not_low");
                int e37 = C2832a.e(b10, "trigger_content_update_delay");
                int e38 = C2832a.e(b10, "trigger_max_content_delay");
                int e39 = C2832a.e(b10, "content_uri_triggers");
                int i15 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    if (b10.isNull(e10)) {
                        str = null;
                    } else {
                        str = b10.getString(e10);
                    }
                    D f11 = B.f(b10.getInt(e11));
                    if (b10.isNull(e12)) {
                        str2 = null;
                    } else {
                        str2 = b10.getString(e12);
                    }
                    if (b10.isNull(e13)) {
                        str3 = null;
                    } else {
                        str3 = b10.getString(e13);
                    }
                    if (b10.isNull(e14)) {
                        bArr = null;
                    } else {
                        bArr = b10.getBlob(e14);
                    }
                    C1840g g10 = C1840g.g(bArr);
                    if (b10.isNull(e15)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b10.getBlob(e15);
                    }
                    C1840g g11 = C1840g.g(bArr2);
                    long j11 = b10.getLong(e16);
                    long j12 = b10.getLong(e17);
                    long j13 = b10.getLong(e18);
                    int i16 = b10.getInt(e19);
                    C1834a c10 = B.c(b10.getInt(e20));
                    long j14 = b10.getLong(e21);
                    long j15 = b10.getLong(e22);
                    int i17 = i15;
                    long j16 = b10.getLong(i17);
                    int i18 = e10;
                    int i19 = e24;
                    long j17 = b10.getLong(i19);
                    e24 = i19;
                    int i20 = e25;
                    if (b10.getInt(i20) != 0) {
                        e25 = i20;
                        i10 = e26;
                        z10 = true;
                    } else {
                        e25 = i20;
                        i10 = e26;
                        z10 = false;
                    }
                    androidx.work.x e40 = B.e(b10.getInt(i10));
                    e26 = i10;
                    int i21 = e27;
                    int i22 = b10.getInt(i21);
                    e27 = i21;
                    int i23 = e28;
                    int i24 = b10.getInt(i23);
                    e28 = i23;
                    int i25 = e29;
                    long j18 = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    int i27 = b10.getInt(i26);
                    e30 = i26;
                    int i28 = e31;
                    int i29 = b10.getInt(i28);
                    e31 = i28;
                    int i30 = e32;
                    t d10 = B.d(b10.getInt(i30));
                    e32 = i30;
                    int i31 = e33;
                    if (b10.getInt(i31) != 0) {
                        e33 = i31;
                        i11 = e34;
                        z11 = true;
                    } else {
                        e33 = i31;
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        e34 = i11;
                        i12 = e35;
                        z12 = true;
                    } else {
                        e34 = i11;
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e35 = i12;
                        i13 = e36;
                        z13 = true;
                    } else {
                        e35 = i12;
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e36 = i13;
                        i14 = e37;
                        z14 = true;
                    } else {
                        e36 = i13;
                        i14 = e37;
                        z14 = false;
                    }
                    long j19 = b10.getLong(i14);
                    e37 = i14;
                    int i32 = e38;
                    long j20 = b10.getLong(i32);
                    e38 = i32;
                    int i33 = e39;
                    if (b10.isNull(i33)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b10.getBlob(i33);
                    }
                    e39 = i33;
                    arrayList.add(new u(str, f11, str2, str3, g10, g11, j11, j12, j13, new C1838e(d10, z11, z12, z13, z14, j19, j20, B.b(bArr3)), i16, c10, j14, j15, j16, j17, z10, e40, i22, i24, j18, i27, i29));
                    e10 = i18;
                    i15 = i17;
                }
                b10.close();
                xVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.q();
            throw th;
        }
    }

    public void d(String str, int i10) {
        this.f5116a.d();
        y3.k b10 = this.f5133r.b();
        b10.Q0(1, (long) i10);
        if (str == null) {
            b10.i1(2);
        } else {
            b10.C0(2, str);
        }
        this.f5116a.e();
        try {
            b10.C();
            this.f5116a.A();
        } finally {
            this.f5116a.i();
            this.f5133r.h(b10);
        }
    }

    public List e() {
        x xVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        byte[] bArr3;
        x f10 = x.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            int e10 = C2832a.e(b10, "id");
            int e11 = C2832a.e(b10, "state");
            int e12 = C2832a.e(b10, "worker_class_name");
            int e13 = C2832a.e(b10, "input_merger_class_name");
            int e14 = C2832a.e(b10, MetricTracker.Object.INPUT);
            int e15 = C2832a.e(b10, "output");
            int e16 = C2832a.e(b10, "initial_delay");
            int e17 = C2832a.e(b10, "interval_duration");
            int e18 = C2832a.e(b10, "flex_duration");
            int e19 = C2832a.e(b10, "run_attempt_count");
            int e20 = C2832a.e(b10, "backoff_policy");
            int e21 = C2832a.e(b10, "backoff_delay_duration");
            int e22 = C2832a.e(b10, "last_enqueue_time");
            int e23 = C2832a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = C2832a.e(b10, "schedule_requested_at");
                int e25 = C2832a.e(b10, "run_in_foreground");
                int e26 = C2832a.e(b10, "out_of_quota_policy");
                int e27 = C2832a.e(b10, "period_count");
                int e28 = C2832a.e(b10, "generation");
                int e29 = C2832a.e(b10, "next_schedule_time_override");
                int e30 = C2832a.e(b10, "next_schedule_time_override_generation");
                int e31 = C2832a.e(b10, "stop_reason");
                int e32 = C2832a.e(b10, "required_network_type");
                int e33 = C2832a.e(b10, "requires_charging");
                int e34 = C2832a.e(b10, "requires_device_idle");
                int e35 = C2832a.e(b10, "requires_battery_not_low");
                int e36 = C2832a.e(b10, "requires_storage_not_low");
                int e37 = C2832a.e(b10, "trigger_content_update_delay");
                int e38 = C2832a.e(b10, "trigger_max_content_delay");
                int e39 = C2832a.e(b10, "content_uri_triggers");
                int i15 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    if (b10.isNull(e10)) {
                        str = null;
                    } else {
                        str = b10.getString(e10);
                    }
                    D f11 = B.f(b10.getInt(e11));
                    if (b10.isNull(e12)) {
                        str2 = null;
                    } else {
                        str2 = b10.getString(e12);
                    }
                    if (b10.isNull(e13)) {
                        str3 = null;
                    } else {
                        str3 = b10.getString(e13);
                    }
                    if (b10.isNull(e14)) {
                        bArr = null;
                    } else {
                        bArr = b10.getBlob(e14);
                    }
                    C1840g g10 = C1840g.g(bArr);
                    if (b10.isNull(e15)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b10.getBlob(e15);
                    }
                    C1840g g11 = C1840g.g(bArr2);
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i16 = b10.getInt(e19);
                    C1834a c10 = B.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i17 = i15;
                    long j15 = b10.getLong(i17);
                    int i18 = e10;
                    int i19 = e24;
                    long j16 = b10.getLong(i19);
                    e24 = i19;
                    int i20 = e25;
                    if (b10.getInt(i20) != 0) {
                        e25 = i20;
                        i10 = e26;
                        z10 = true;
                    } else {
                        e25 = i20;
                        i10 = e26;
                        z10 = false;
                    }
                    androidx.work.x e40 = B.e(b10.getInt(i10));
                    e26 = i10;
                    int i21 = e27;
                    int i22 = b10.getInt(i21);
                    e27 = i21;
                    int i23 = e28;
                    int i24 = b10.getInt(i23);
                    e28 = i23;
                    int i25 = e29;
                    long j17 = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    int i27 = b10.getInt(i26);
                    e30 = i26;
                    int i28 = e31;
                    int i29 = b10.getInt(i28);
                    e31 = i28;
                    int i30 = e32;
                    t d10 = B.d(b10.getInt(i30));
                    e32 = i30;
                    int i31 = e33;
                    if (b10.getInt(i31) != 0) {
                        e33 = i31;
                        i11 = e34;
                        z11 = true;
                    } else {
                        e33 = i31;
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        e34 = i11;
                        i12 = e35;
                        z12 = true;
                    } else {
                        e34 = i11;
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e35 = i12;
                        i13 = e36;
                        z13 = true;
                    } else {
                        e35 = i12;
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e36 = i13;
                        i14 = e37;
                        z14 = true;
                    } else {
                        e36 = i13;
                        i14 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i14);
                    e37 = i14;
                    int i32 = e38;
                    long j19 = b10.getLong(i32);
                    e38 = i32;
                    int i33 = e39;
                    if (b10.isNull(i33)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b10.getBlob(i33);
                    }
                    e39 = i33;
                    arrayList.add(new u(str, f11, str2, str3, g10, g11, j10, j11, j12, new C1838e(d10, z11, z12, z13, z14, j18, j19, B.b(bArr3)), i16, c10, j13, j14, j15, j16, z10, e40, i22, i24, j17, i27, i29));
                    e10 = i18;
                    i15 = i17;
                }
                b10.close();
                xVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.q();
            throw th;
        }
    }

    public List f(String str) {
        String str2;
        x f10 = x.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
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

    public D g(String str) {
        Integer num;
        x f10 = x.f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5116a.d();
        D d10 = null;
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (b10.isNull(0)) {
                    num = null;
                } else {
                    num = Integer.valueOf(b10.getInt(0));
                }
                if (num != null) {
                    B b11 = B.f5047a;
                    d10 = B.f(num.intValue());
                }
            }
            return d10;
        } finally {
            b10.close();
            f10.q();
        }
    }

    public u h(String str) {
        x xVar;
        u uVar;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        byte[] bArr3;
        String str5 = str;
        x f10 = x.f("SELECT * FROM workspec WHERE id=?", 1);
        if (str5 == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str5);
        }
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            int e10 = C2832a.e(b10, "id");
            int e11 = C2832a.e(b10, "state");
            int e12 = C2832a.e(b10, "worker_class_name");
            int e13 = C2832a.e(b10, "input_merger_class_name");
            int e14 = C2832a.e(b10, MetricTracker.Object.INPUT);
            int e15 = C2832a.e(b10, "output");
            int e16 = C2832a.e(b10, "initial_delay");
            int e17 = C2832a.e(b10, "interval_duration");
            int e18 = C2832a.e(b10, "flex_duration");
            int e19 = C2832a.e(b10, "run_attempt_count");
            int e20 = C2832a.e(b10, "backoff_policy");
            int e21 = C2832a.e(b10, "backoff_delay_duration");
            int e22 = C2832a.e(b10, "last_enqueue_time");
            int e23 = C2832a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = C2832a.e(b10, "schedule_requested_at");
                int e25 = C2832a.e(b10, "run_in_foreground");
                int e26 = C2832a.e(b10, "out_of_quota_policy");
                int e27 = C2832a.e(b10, "period_count");
                int e28 = C2832a.e(b10, "generation");
                int e29 = C2832a.e(b10, "next_schedule_time_override");
                int e30 = C2832a.e(b10, "next_schedule_time_override_generation");
                int e31 = C2832a.e(b10, "stop_reason");
                int e32 = C2832a.e(b10, "required_network_type");
                int e33 = C2832a.e(b10, "requires_charging");
                int e34 = C2832a.e(b10, "requires_device_idle");
                int e35 = C2832a.e(b10, "requires_battery_not_low");
                int e36 = C2832a.e(b10, "requires_storage_not_low");
                int e37 = C2832a.e(b10, "trigger_content_update_delay");
                int e38 = C2832a.e(b10, "trigger_max_content_delay");
                int e39 = C2832a.e(b10, "content_uri_triggers");
                if (b10.moveToFirst()) {
                    if (b10.isNull(e10)) {
                        str2 = null;
                    } else {
                        str2 = b10.getString(e10);
                    }
                    D f11 = B.f(b10.getInt(e11));
                    if (b10.isNull(e12)) {
                        str3 = null;
                    } else {
                        str3 = b10.getString(e12);
                    }
                    if (b10.isNull(e13)) {
                        str4 = null;
                    } else {
                        str4 = b10.getString(e13);
                    }
                    if (b10.isNull(e14)) {
                        bArr = null;
                    } else {
                        bArr = b10.getBlob(e14);
                    }
                    C1840g g10 = C1840g.g(bArr);
                    if (b10.isNull(e15)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b10.getBlob(e15);
                    }
                    C1840g g11 = C1840g.g(bArr2);
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i15 = b10.getInt(e19);
                    C1834a c10 = B.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    long j15 = b10.getLong(e23);
                    long j16 = b10.getLong(e24);
                    if (b10.getInt(e25) != 0) {
                        i10 = e26;
                        z10 = true;
                    } else {
                        i10 = e26;
                        z10 = false;
                    }
                    androidx.work.x e40 = B.e(b10.getInt(i10));
                    int i16 = b10.getInt(e27);
                    int i17 = b10.getInt(e28);
                    long j17 = b10.getLong(e29);
                    int i18 = b10.getInt(e30);
                    int i19 = b10.getInt(e31);
                    t d10 = B.d(b10.getInt(e32));
                    if (b10.getInt(e33) != 0) {
                        i11 = e34;
                        z11 = true;
                    } else {
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        i12 = e35;
                        z12 = true;
                    } else {
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        i13 = e36;
                        z13 = true;
                    } else {
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        i14 = e37;
                        z14 = true;
                    } else {
                        i14 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i14);
                    long j19 = b10.getLong(e38);
                    if (b10.isNull(e39)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b10.getBlob(e39);
                    }
                    uVar = new u(str2, f11, str3, str4, g10, g11, j10, j11, j12, new C1838e(d10, z11, z12, z13, z14, j18, j19, B.b(bArr3)), i15, c10, j13, j14, j15, j16, z10, e40, i16, i17, j17, i18, i19);
                } else {
                    uVar = null;
                }
                b10.close();
                xVar.q();
                return uVar;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.q();
            throw th;
        }
    }

    public int i(String str) {
        this.f5116a.d();
        y3.k b10 = this.f5121f.b();
        if (str == null) {
            b10.i1(1);
        } else {
            b10.C0(1, str);
        }
        this.f5116a.e();
        try {
            int C10 = b10.C();
            this.f5116a.A();
            return C10;
        } finally {
            this.f5116a.i();
            this.f5121f.h(b10);
        }
    }

    public List j(String str) {
        byte[] bArr;
        x f10 = x.f("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                if (b10.isNull(0)) {
                    bArr = null;
                } else {
                    bArr = b10.getBlob(0);
                }
                arrayList.add(C1840g.g(bArr));
            }
            return arrayList;
        } finally {
            b10.close();
            f10.q();
        }
    }

    public List k(int i10) {
        x xVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        byte[] bArr3;
        x f10 = x.f("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        f10.Q0(1, (long) i10);
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            int e10 = C2832a.e(b10, "id");
            int e11 = C2832a.e(b10, "state");
            int e12 = C2832a.e(b10, "worker_class_name");
            int e13 = C2832a.e(b10, "input_merger_class_name");
            int e14 = C2832a.e(b10, MetricTracker.Object.INPUT);
            int e15 = C2832a.e(b10, "output");
            int e16 = C2832a.e(b10, "initial_delay");
            int e17 = C2832a.e(b10, "interval_duration");
            int e18 = C2832a.e(b10, "flex_duration");
            int e19 = C2832a.e(b10, "run_attempt_count");
            int e20 = C2832a.e(b10, "backoff_policy");
            int e21 = C2832a.e(b10, "backoff_delay_duration");
            int e22 = C2832a.e(b10, "last_enqueue_time");
            int e23 = C2832a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = C2832a.e(b10, "schedule_requested_at");
                int e25 = C2832a.e(b10, "run_in_foreground");
                int e26 = C2832a.e(b10, "out_of_quota_policy");
                int e27 = C2832a.e(b10, "period_count");
                int e28 = C2832a.e(b10, "generation");
                int e29 = C2832a.e(b10, "next_schedule_time_override");
                int e30 = C2832a.e(b10, "next_schedule_time_override_generation");
                int e31 = C2832a.e(b10, "stop_reason");
                int e32 = C2832a.e(b10, "required_network_type");
                int e33 = C2832a.e(b10, "requires_charging");
                int e34 = C2832a.e(b10, "requires_device_idle");
                int e35 = C2832a.e(b10, "requires_battery_not_low");
                int e36 = C2832a.e(b10, "requires_storage_not_low");
                int e37 = C2832a.e(b10, "trigger_content_update_delay");
                int e38 = C2832a.e(b10, "trigger_max_content_delay");
                int e39 = C2832a.e(b10, "content_uri_triggers");
                int i16 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    if (b10.isNull(e10)) {
                        str = null;
                    } else {
                        str = b10.getString(e10);
                    }
                    D f11 = B.f(b10.getInt(e11));
                    if (b10.isNull(e12)) {
                        str2 = null;
                    } else {
                        str2 = b10.getString(e12);
                    }
                    if (b10.isNull(e13)) {
                        str3 = null;
                    } else {
                        str3 = b10.getString(e13);
                    }
                    if (b10.isNull(e14)) {
                        bArr = null;
                    } else {
                        bArr = b10.getBlob(e14);
                    }
                    C1840g g10 = C1840g.g(bArr);
                    if (b10.isNull(e15)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b10.getBlob(e15);
                    }
                    C1840g g11 = C1840g.g(bArr2);
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i17 = b10.getInt(e19);
                    C1834a c10 = B.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i18 = i16;
                    long j15 = b10.getLong(i18);
                    int i19 = e10;
                    int i20 = e24;
                    long j16 = b10.getLong(i20);
                    e24 = i20;
                    int i21 = e25;
                    if (b10.getInt(i21) != 0) {
                        e25 = i21;
                        i11 = e26;
                        z10 = true;
                    } else {
                        e25 = i21;
                        i11 = e26;
                        z10 = false;
                    }
                    androidx.work.x e40 = B.e(b10.getInt(i11));
                    e26 = i11;
                    int i22 = e27;
                    int i23 = b10.getInt(i22);
                    e27 = i22;
                    int i24 = e28;
                    int i25 = b10.getInt(i24);
                    e28 = i24;
                    int i26 = e29;
                    long j17 = b10.getLong(i26);
                    e29 = i26;
                    int i27 = e30;
                    int i28 = b10.getInt(i27);
                    e30 = i27;
                    int i29 = e31;
                    int i30 = b10.getInt(i29);
                    e31 = i29;
                    int i31 = e32;
                    t d10 = B.d(b10.getInt(i31));
                    e32 = i31;
                    int i32 = e33;
                    if (b10.getInt(i32) != 0) {
                        e33 = i32;
                        i12 = e34;
                        z11 = true;
                    } else {
                        e33 = i32;
                        i12 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e34 = i12;
                        i13 = e35;
                        z12 = true;
                    } else {
                        e34 = i12;
                        i13 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e35 = i13;
                        i14 = e36;
                        z13 = true;
                    } else {
                        e35 = i13;
                        i14 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i14) != 0) {
                        e36 = i14;
                        i15 = e37;
                        z14 = true;
                    } else {
                        e36 = i14;
                        i15 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i15);
                    e37 = i15;
                    int i33 = e38;
                    long j19 = b10.getLong(i33);
                    e38 = i33;
                    int i34 = e39;
                    if (b10.isNull(i34)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b10.getBlob(i34);
                    }
                    e39 = i34;
                    arrayList.add(new u(str, f11, str2, str3, g10, g11, j10, j11, j12, new C1838e(d10, z11, z12, z13, z14, j18, j19, B.b(bArr3)), i17, c10, j13, j14, j15, j16, z10, e40, i23, i25, j17, i28, i30));
                    e10 = i19;
                    i16 = i18;
                }
                b10.close();
                xVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.q();
            throw th;
        }
    }

    public int l() {
        this.f5116a.d();
        y3.k b10 = this.f5130o.b();
        this.f5116a.e();
        try {
            int C10 = b10.C();
            this.f5116a.A();
            return C10;
        } finally {
            this.f5116a.i();
            this.f5130o.h(b10);
        }
    }

    public void m(u uVar) {
        this.f5116a.d();
        this.f5116a.e();
        try {
            this.f5117b.j(uVar);
            this.f5116a.A();
        } finally {
            this.f5116a.i();
        }
    }

    public int n(String str, long j10) {
        this.f5116a.d();
        y3.k b10 = this.f5129n.b();
        b10.Q0(1, j10);
        if (str == null) {
            b10.i1(2);
        } else {
            b10.C0(2, str);
        }
        this.f5116a.e();
        try {
            int C10 = b10.C();
            this.f5116a.A();
            return C10;
        } finally {
            this.f5116a.i();
            this.f5129n.h(b10);
        }
    }

    public List o(String str) {
        String str2;
        x f10 = x.f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f10.i1(1);
        } else {
            f10.C0(1, str);
        }
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                if (b10.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = b10.getString(0);
                }
                arrayList.add(new u.b(str2, B.f(b10.getInt(1))));
            }
            return arrayList;
        } finally {
            b10.close();
            f10.q();
        }
    }

    public List p(int i10) {
        x xVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        byte[] bArr3;
        x f10 = x.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        f10.Q0(1, (long) i10);
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            int e10 = C2832a.e(b10, "id");
            int e11 = C2832a.e(b10, "state");
            int e12 = C2832a.e(b10, "worker_class_name");
            int e13 = C2832a.e(b10, "input_merger_class_name");
            int e14 = C2832a.e(b10, MetricTracker.Object.INPUT);
            int e15 = C2832a.e(b10, "output");
            int e16 = C2832a.e(b10, "initial_delay");
            int e17 = C2832a.e(b10, "interval_duration");
            int e18 = C2832a.e(b10, "flex_duration");
            int e19 = C2832a.e(b10, "run_attempt_count");
            int e20 = C2832a.e(b10, "backoff_policy");
            int e21 = C2832a.e(b10, "backoff_delay_duration");
            int e22 = C2832a.e(b10, "last_enqueue_time");
            int e23 = C2832a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = C2832a.e(b10, "schedule_requested_at");
                int e25 = C2832a.e(b10, "run_in_foreground");
                int e26 = C2832a.e(b10, "out_of_quota_policy");
                int e27 = C2832a.e(b10, "period_count");
                int e28 = C2832a.e(b10, "generation");
                int e29 = C2832a.e(b10, "next_schedule_time_override");
                int e30 = C2832a.e(b10, "next_schedule_time_override_generation");
                int e31 = C2832a.e(b10, "stop_reason");
                int e32 = C2832a.e(b10, "required_network_type");
                int e33 = C2832a.e(b10, "requires_charging");
                int e34 = C2832a.e(b10, "requires_device_idle");
                int e35 = C2832a.e(b10, "requires_battery_not_low");
                int e36 = C2832a.e(b10, "requires_storage_not_low");
                int e37 = C2832a.e(b10, "trigger_content_update_delay");
                int e38 = C2832a.e(b10, "trigger_max_content_delay");
                int e39 = C2832a.e(b10, "content_uri_triggers");
                int i16 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    if (b10.isNull(e10)) {
                        str = null;
                    } else {
                        str = b10.getString(e10);
                    }
                    D f11 = B.f(b10.getInt(e11));
                    if (b10.isNull(e12)) {
                        str2 = null;
                    } else {
                        str2 = b10.getString(e12);
                    }
                    if (b10.isNull(e13)) {
                        str3 = null;
                    } else {
                        str3 = b10.getString(e13);
                    }
                    if (b10.isNull(e14)) {
                        bArr = null;
                    } else {
                        bArr = b10.getBlob(e14);
                    }
                    C1840g g10 = C1840g.g(bArr);
                    if (b10.isNull(e15)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b10.getBlob(e15);
                    }
                    C1840g g11 = C1840g.g(bArr2);
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i17 = b10.getInt(e19);
                    C1834a c10 = B.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i18 = i16;
                    long j15 = b10.getLong(i18);
                    int i19 = e10;
                    int i20 = e24;
                    long j16 = b10.getLong(i20);
                    e24 = i20;
                    int i21 = e25;
                    if (b10.getInt(i21) != 0) {
                        e25 = i21;
                        i11 = e26;
                        z10 = true;
                    } else {
                        e25 = i21;
                        i11 = e26;
                        z10 = false;
                    }
                    androidx.work.x e40 = B.e(b10.getInt(i11));
                    e26 = i11;
                    int i22 = e27;
                    int i23 = b10.getInt(i22);
                    e27 = i22;
                    int i24 = e28;
                    int i25 = b10.getInt(i24);
                    e28 = i24;
                    int i26 = e29;
                    long j17 = b10.getLong(i26);
                    e29 = i26;
                    int i27 = e30;
                    int i28 = b10.getInt(i27);
                    e30 = i27;
                    int i29 = e31;
                    int i30 = b10.getInt(i29);
                    e31 = i29;
                    int i31 = e32;
                    t d10 = B.d(b10.getInt(i31));
                    e32 = i31;
                    int i32 = e33;
                    if (b10.getInt(i32) != 0) {
                        e33 = i32;
                        i12 = e34;
                        z11 = true;
                    } else {
                        e33 = i32;
                        i12 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e34 = i12;
                        i13 = e35;
                        z12 = true;
                    } else {
                        e34 = i12;
                        i13 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e35 = i13;
                        i14 = e36;
                        z13 = true;
                    } else {
                        e35 = i13;
                        i14 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i14) != 0) {
                        e36 = i14;
                        i15 = e37;
                        z14 = true;
                    } else {
                        e36 = i14;
                        i15 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i15);
                    e37 = i15;
                    int i33 = e38;
                    long j19 = b10.getLong(i33);
                    e38 = i33;
                    int i34 = e39;
                    if (b10.isNull(i34)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b10.getBlob(i34);
                    }
                    e39 = i34;
                    arrayList.add(new u(str, f11, str2, str3, g10, g11, j10, j11, j12, new C1838e(d10, z11, z12, z13, z14, j18, j19, B.b(bArr3)), i17, c10, j13, j14, j15, j16, z10, e40, i23, i25, j17, i28, i30));
                    e10 = i19;
                    i16 = i18;
                }
                b10.close();
                xVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.q();
            throw th;
        }
    }

    public int q(D d10, String str) {
        this.f5116a.d();
        y3.k b10 = this.f5120e.b();
        b10.Q0(1, (long) B.j(d10));
        if (str == null) {
            b10.i1(2);
        } else {
            b10.C0(2, str);
        }
        this.f5116a.e();
        try {
            int C10 = b10.C();
            this.f5116a.A();
            return C10;
        } finally {
            this.f5116a.i();
            this.f5120e.h(b10);
        }
    }

    public void r(String str, C1840g gVar) {
        this.f5116a.d();
        y3.k b10 = this.f5123h.b();
        byte[] k10 = C1840g.k(gVar);
        if (k10 == null) {
            b10.i1(1);
        } else {
            b10.U0(1, k10);
        }
        if (str == null) {
            b10.i1(2);
        } else {
            b10.C0(2, str);
        }
        this.f5116a.e();
        try {
            b10.C();
            this.f5116a.A();
        } finally {
            this.f5116a.i();
            this.f5123h.h(b10);
        }
    }

    public void s(String str, long j10) {
        this.f5116a.d();
        y3.k b10 = this.f5124i.b();
        b10.Q0(1, j10);
        if (str == null) {
            b10.i1(2);
        } else {
            b10.C0(2, str);
        }
        this.f5116a.e();
        try {
            b10.C();
            this.f5116a.A();
        } finally {
            this.f5116a.i();
            this.f5124i.h(b10);
        }
    }

    public List t() {
        x xVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        byte[] bArr3;
        x f10 = x.f("SELECT * FROM workspec WHERE state=1", 0);
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            int e10 = C2832a.e(b10, "id");
            int e11 = C2832a.e(b10, "state");
            int e12 = C2832a.e(b10, "worker_class_name");
            int e13 = C2832a.e(b10, "input_merger_class_name");
            int e14 = C2832a.e(b10, MetricTracker.Object.INPUT);
            int e15 = C2832a.e(b10, "output");
            int e16 = C2832a.e(b10, "initial_delay");
            int e17 = C2832a.e(b10, "interval_duration");
            int e18 = C2832a.e(b10, "flex_duration");
            int e19 = C2832a.e(b10, "run_attempt_count");
            int e20 = C2832a.e(b10, "backoff_policy");
            int e21 = C2832a.e(b10, "backoff_delay_duration");
            int e22 = C2832a.e(b10, "last_enqueue_time");
            int e23 = C2832a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = C2832a.e(b10, "schedule_requested_at");
                int e25 = C2832a.e(b10, "run_in_foreground");
                int e26 = C2832a.e(b10, "out_of_quota_policy");
                int e27 = C2832a.e(b10, "period_count");
                int e28 = C2832a.e(b10, "generation");
                int e29 = C2832a.e(b10, "next_schedule_time_override");
                int e30 = C2832a.e(b10, "next_schedule_time_override_generation");
                int e31 = C2832a.e(b10, "stop_reason");
                int e32 = C2832a.e(b10, "required_network_type");
                int e33 = C2832a.e(b10, "requires_charging");
                int e34 = C2832a.e(b10, "requires_device_idle");
                int e35 = C2832a.e(b10, "requires_battery_not_low");
                int e36 = C2832a.e(b10, "requires_storage_not_low");
                int e37 = C2832a.e(b10, "trigger_content_update_delay");
                int e38 = C2832a.e(b10, "trigger_max_content_delay");
                int e39 = C2832a.e(b10, "content_uri_triggers");
                int i15 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    if (b10.isNull(e10)) {
                        str = null;
                    } else {
                        str = b10.getString(e10);
                    }
                    D f11 = B.f(b10.getInt(e11));
                    if (b10.isNull(e12)) {
                        str2 = null;
                    } else {
                        str2 = b10.getString(e12);
                    }
                    if (b10.isNull(e13)) {
                        str3 = null;
                    } else {
                        str3 = b10.getString(e13);
                    }
                    if (b10.isNull(e14)) {
                        bArr = null;
                    } else {
                        bArr = b10.getBlob(e14);
                    }
                    C1840g g10 = C1840g.g(bArr);
                    if (b10.isNull(e15)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b10.getBlob(e15);
                    }
                    C1840g g11 = C1840g.g(bArr2);
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i16 = b10.getInt(e19);
                    C1834a c10 = B.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i17 = i15;
                    long j15 = b10.getLong(i17);
                    int i18 = e10;
                    int i19 = e24;
                    long j16 = b10.getLong(i19);
                    e24 = i19;
                    int i20 = e25;
                    if (b10.getInt(i20) != 0) {
                        e25 = i20;
                        i10 = e26;
                        z10 = true;
                    } else {
                        e25 = i20;
                        i10 = e26;
                        z10 = false;
                    }
                    androidx.work.x e40 = B.e(b10.getInt(i10));
                    e26 = i10;
                    int i21 = e27;
                    int i22 = b10.getInt(i21);
                    e27 = i21;
                    int i23 = e28;
                    int i24 = b10.getInt(i23);
                    e28 = i23;
                    int i25 = e29;
                    long j17 = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    int i27 = b10.getInt(i26);
                    e30 = i26;
                    int i28 = e31;
                    int i29 = b10.getInt(i28);
                    e31 = i28;
                    int i30 = e32;
                    t d10 = B.d(b10.getInt(i30));
                    e32 = i30;
                    int i31 = e33;
                    if (b10.getInt(i31) != 0) {
                        e33 = i31;
                        i11 = e34;
                        z11 = true;
                    } else {
                        e33 = i31;
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        e34 = i11;
                        i12 = e35;
                        z12 = true;
                    } else {
                        e34 = i11;
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e35 = i12;
                        i13 = e36;
                        z13 = true;
                    } else {
                        e35 = i12;
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e36 = i13;
                        i14 = e37;
                        z14 = true;
                    } else {
                        e36 = i13;
                        i14 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i14);
                    e37 = i14;
                    int i32 = e38;
                    long j19 = b10.getLong(i32);
                    e38 = i32;
                    int i33 = e39;
                    if (b10.isNull(i33)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b10.getBlob(i33);
                    }
                    e39 = i33;
                    arrayList.add(new u(str, f11, str2, str3, g10, g11, j10, j11, j12, new C1838e(d10, z11, z12, z13, z14, j18, j19, B.b(bArr3)), i16, c10, j13, j14, j15, j16, z10, e40, i22, i24, j17, i27, i29));
                    e10 = i18;
                    i15 = i17;
                }
                b10.close();
                xVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.q();
            throw th;
        }
    }

    public boolean u() {
        boolean z10 = false;
        x f10 = x.f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst() && b10.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            b10.close();
            f10.q();
        }
    }

    public List v() {
        x xVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        byte[] bArr3;
        x f10 = x.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            int e10 = C2832a.e(b10, "id");
            int e11 = C2832a.e(b10, "state");
            int e12 = C2832a.e(b10, "worker_class_name");
            int e13 = C2832a.e(b10, "input_merger_class_name");
            int e14 = C2832a.e(b10, MetricTracker.Object.INPUT);
            int e15 = C2832a.e(b10, "output");
            int e16 = C2832a.e(b10, "initial_delay");
            int e17 = C2832a.e(b10, "interval_duration");
            int e18 = C2832a.e(b10, "flex_duration");
            int e19 = C2832a.e(b10, "run_attempt_count");
            int e20 = C2832a.e(b10, "backoff_policy");
            int e21 = C2832a.e(b10, "backoff_delay_duration");
            int e22 = C2832a.e(b10, "last_enqueue_time");
            int e23 = C2832a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = C2832a.e(b10, "schedule_requested_at");
                int e25 = C2832a.e(b10, "run_in_foreground");
                int e26 = C2832a.e(b10, "out_of_quota_policy");
                int e27 = C2832a.e(b10, "period_count");
                int e28 = C2832a.e(b10, "generation");
                int e29 = C2832a.e(b10, "next_schedule_time_override");
                int e30 = C2832a.e(b10, "next_schedule_time_override_generation");
                int e31 = C2832a.e(b10, "stop_reason");
                int e32 = C2832a.e(b10, "required_network_type");
                int e33 = C2832a.e(b10, "requires_charging");
                int e34 = C2832a.e(b10, "requires_device_idle");
                int e35 = C2832a.e(b10, "requires_battery_not_low");
                int e36 = C2832a.e(b10, "requires_storage_not_low");
                int e37 = C2832a.e(b10, "trigger_content_update_delay");
                int e38 = C2832a.e(b10, "trigger_max_content_delay");
                int e39 = C2832a.e(b10, "content_uri_triggers");
                int i15 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    if (b10.isNull(e10)) {
                        str = null;
                    } else {
                        str = b10.getString(e10);
                    }
                    D f11 = B.f(b10.getInt(e11));
                    if (b10.isNull(e12)) {
                        str2 = null;
                    } else {
                        str2 = b10.getString(e12);
                    }
                    if (b10.isNull(e13)) {
                        str3 = null;
                    } else {
                        str3 = b10.getString(e13);
                    }
                    if (b10.isNull(e14)) {
                        bArr = null;
                    } else {
                        bArr = b10.getBlob(e14);
                    }
                    C1840g g10 = C1840g.g(bArr);
                    if (b10.isNull(e15)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b10.getBlob(e15);
                    }
                    C1840g g11 = C1840g.g(bArr2);
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i16 = b10.getInt(e19);
                    C1834a c10 = B.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i17 = i15;
                    long j15 = b10.getLong(i17);
                    int i18 = e10;
                    int i19 = e24;
                    long j16 = b10.getLong(i19);
                    e24 = i19;
                    int i20 = e25;
                    if (b10.getInt(i20) != 0) {
                        e25 = i20;
                        i10 = e26;
                        z10 = true;
                    } else {
                        e25 = i20;
                        i10 = e26;
                        z10 = false;
                    }
                    androidx.work.x e40 = B.e(b10.getInt(i10));
                    e26 = i10;
                    int i21 = e27;
                    int i22 = b10.getInt(i21);
                    e27 = i21;
                    int i23 = e28;
                    int i24 = b10.getInt(i23);
                    e28 = i23;
                    int i25 = e29;
                    long j17 = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    int i27 = b10.getInt(i26);
                    e30 = i26;
                    int i28 = e31;
                    int i29 = b10.getInt(i28);
                    e31 = i28;
                    int i30 = e32;
                    t d10 = B.d(b10.getInt(i30));
                    e32 = i30;
                    int i31 = e33;
                    if (b10.getInt(i31) != 0) {
                        e33 = i31;
                        i11 = e34;
                        z11 = true;
                    } else {
                        e33 = i31;
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        e34 = i11;
                        i12 = e35;
                        z12 = true;
                    } else {
                        e34 = i11;
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e35 = i12;
                        i13 = e36;
                        z13 = true;
                    } else {
                        e35 = i12;
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e36 = i13;
                        i14 = e37;
                        z14 = true;
                    } else {
                        e36 = i13;
                        i14 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i14);
                    e37 = i14;
                    int i32 = e38;
                    long j19 = b10.getLong(i32);
                    e38 = i32;
                    int i33 = e39;
                    if (b10.isNull(i33)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b10.getBlob(i33);
                    }
                    e39 = i33;
                    arrayList.add(new u(str, f11, str2, str3, g10, g11, j10, j11, j12, new C1838e(d10, z11, z12, z13, z14, j18, j19, B.b(bArr3)), i16, c10, j13, j14, j15, j16, z10, e40, i22, i24, j17, i27, i29));
                    e10 = i18;
                    i15 = i17;
                }
                b10.close();
                xVar.q();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.q();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.q();
            throw th;
        }
    }

    public int w(String str) {
        this.f5116a.d();
        y3.k b10 = this.f5126k.b();
        if (str == null) {
            b10.i1(1);
        } else {
            b10.C0(1, str);
        }
        this.f5116a.e();
        try {
            int C10 = b10.C();
            this.f5116a.A();
            return C10;
        } finally {
            this.f5116a.i();
            this.f5126k.h(b10);
        }
    }

    public int x(String str) {
        this.f5116a.d();
        y3.k b10 = this.f5125j.b();
        if (str == null) {
            b10.i1(1);
        } else {
            b10.C0(1, str);
        }
        this.f5116a.e();
        try {
            int C10 = b10.C();
            this.f5116a.A();
            return C10;
        } finally {
            this.f5116a.i();
            this.f5125j.h(b10);
        }
    }

    public int y() {
        int i10 = 0;
        x f10 = x.f("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f5116a.d();
        Cursor b10 = C2833b.b(this.f5116a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                i10 = b10.getInt(0);
            }
            return i10;
        } finally {
            b10.close();
            f10.q();
        }
    }

    public void z(String str, int i10) {
        this.f5116a.d();
        y3.k b10 = this.f5128m.b();
        if (str == null) {
            b10.i1(1);
        } else {
            b10.C0(1, str);
        }
        b10.Q0(2, (long) i10);
        this.f5116a.e();
        try {
            b10.C();
            this.f5116a.A();
        } finally {
            this.f5116a.i();
            this.f5128m.h(b10);
        }
    }
}

package androidx.work.impl.background.systemalarm;

import P3.m;
import P3.u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.C1835b;
import androidx.work.impl.A;
import androidx.work.impl.B;
import androidx.work.impl.C1846f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b implements C1846f {

    /* renamed from: f  reason: collision with root package name */
    private static final String f18840f = s.i("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f18841a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f18842b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f18843c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final C1835b f18844d;

    /* renamed from: e  reason: collision with root package name */
    private final B f18845e;

    b(Context context, C1835b bVar, B b10) {
        this.f18841a = context;
        this.f18844d = bVar;
        this.f18845e = b10;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    static Intent d(Context context, m mVar, boolean z10) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return q(intent, mVar);
    }

    static Intent e(Context context, m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    private void g(Intent intent, int i10, g gVar) {
        s e10 = s.e();
        String str = f18840f;
        e10.a(str, "Handling constraints changed " + intent);
        new c(this.f18841a, this.f18844d, i10, gVar).a();
    }

    private void h(Intent intent, int i10, g gVar) {
        synchronized (this.f18843c) {
            try {
                m p10 = p(intent);
                s e10 = s.e();
                String str = f18840f;
                e10.a(str, "Handing delay met for " + p10);
                if (!this.f18842b.containsKey(p10)) {
                    f fVar = new f(this.f18841a, i10, gVar, this.f18845e.d(p10));
                    this.f18842b.put(p10, fVar);
                    fVar.f();
                } else {
                    s e11 = s.e();
                    e11.a(str, "WorkSpec " + p10 + " is is already being handled for ACTION_DELAY_MET");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void i(Intent intent, int i10) {
        m p10 = p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        s e10 = s.e();
        String str = f18840f;
        e10.a(str, "Handling onExecutionCompleted " + intent + ", " + i10);
        b(p10, z10);
    }

    private void j(Intent intent, int i10, g gVar) {
        s e10 = s.e();
        String str = f18840f;
        e10.a(str, "Handling reschedule " + intent + ", " + i10);
        gVar.g().q();
    }

    private void k(Intent intent, int i10, g gVar) {
        m p10 = p(intent);
        s e10 = s.e();
        String str = f18840f;
        e10.a(str, "Handling schedule work for " + p10);
        WorkDatabase n10 = gVar.g().n();
        n10.e();
        try {
            u h10 = n10.H().h(p10.b());
            if (h10 == null) {
                s e11 = s.e();
                e11.k(str, "Skipping scheduling " + p10 + " because it's no longer in the DB");
            } else if (h10.f5092b.b()) {
                s e12 = s.e();
                e12.k(str, "Skipping scheduling " + p10 + "because it is finished.");
                n10.i();
            } else {
                long c10 = h10.c();
                if (!h10.k()) {
                    s e13 = s.e();
                    e13.a(str, "Setting up Alarms for " + p10 + "at " + c10);
                    a.c(this.f18841a, n10, p10, c10);
                } else {
                    s e14 = s.e();
                    e14.a(str, "Opportunistically setting an alarm for " + p10 + "at " + c10);
                    a.c(this.f18841a, n10, p10, c10);
                    gVar.f().a().execute(new g.b(gVar, a(this.f18841a), i10));
                }
                n10.A();
                n10.i();
            }
        } finally {
            n10.i();
        }
    }

    private void l(Intent intent, g gVar) {
        List<A> list;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            list = new ArrayList<>(1);
            A b10 = this.f18845e.b(new m(string, i10));
            if (b10 != null) {
                list.add(b10);
            }
        } else {
            list = this.f18845e.c(string);
        }
        for (A a10 : list) {
            s e10 = s.e();
            String str = f18840f;
            e10.a(str, "Handing stopWork work for " + string);
            gVar.i().e(a10);
            a.a(this.f18841a, gVar.g().n(), a10.a());
            gVar.b(a10.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static m p(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    public void b(m mVar, boolean z10) {
        synchronized (this.f18843c) {
            try {
                f fVar = (f) this.f18842b.remove(mVar);
                this.f18845e.b(mVar);
                if (fVar != null) {
                    fVar.g(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        boolean z10;
        synchronized (this.f18843c) {
            z10 = !this.f18842b.isEmpty();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void o(Intent intent, int i10, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, gVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, gVar);
        } else if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            s e10 = s.e();
            String str = f18840f;
            e10.c(str, "Invalid request for " + action + " , requires " + "KEY_WORKSPEC_ID" + " .");
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, gVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, gVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
        } else {
            s e11 = s.e();
            String str2 = f18840f;
            e11.k(str2, "Ignoring intent " + intent);
        }
    }
}

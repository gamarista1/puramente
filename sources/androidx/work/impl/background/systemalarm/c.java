package androidx.work.impl.background.systemalarm;

import M3.e;
import P3.u;
import P3.x;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1835b;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.s;
import java.util.ArrayList;
import java.util.List;

class c {

    /* renamed from: f  reason: collision with root package name */
    private static final String f18846f = s.i("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f18847a;

    /* renamed from: b  reason: collision with root package name */
    private final C1835b f18848b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18849c;

    /* renamed from: d  reason: collision with root package name */
    private final g f18850d;

    /* renamed from: e  reason: collision with root package name */
    private final e f18851e;

    c(Context context, C1835b bVar, int i10, g gVar) {
        this.f18847a = context;
        this.f18848b = bVar;
        this.f18849c = i10;
        this.f18850d = gVar;
        this.f18851e = new e(gVar.g().m());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<u> e10 = this.f18850d.g().n().H().e();
        ConstraintProxy.a(this.f18847a, e10);
        ArrayList<u> arrayList = new ArrayList<>(e10.size());
        long currentTimeMillis = this.f18848b.currentTimeMillis();
        for (u uVar : e10) {
            if (currentTimeMillis >= uVar.c() && (!uVar.k() || this.f18851e.a(uVar))) {
                arrayList.add(uVar);
            }
        }
        for (u uVar2 : arrayList) {
            String str = uVar2.f5091a;
            Intent c10 = b.c(this.f18847a, x.a(uVar2));
            s e11 = s.e();
            String str2 = f18846f;
            e11.a(str2, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f18850d.f().a().execute(new g.b(this.f18850d, c10, this.f18849c));
        }
    }
}

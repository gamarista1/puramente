package Db;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.H;
import com.google.firebase.auth.I;
import java.util.List;

/* renamed from: Db.j  reason: case insensitive filesystem */
public final class C4262j extends H {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C4258f f50519a;

    public C4262j(C4258f fVar) {
        C4536s.l(fVar);
        this.f50519a = fVar;
    }

    public final Task a(I i10, String str) {
        C4536s.l(i10);
        C4258f fVar = this.f50519a;
        return FirebaseAuth.getInstance(fVar.K0()).Q(fVar, i10, str);
    }

    public final List b() {
        return this.f50519a.W0();
    }

    public final Task c() {
        return this.f50519a.p0(false).continueWithTask(new C4261i(this));
    }
}

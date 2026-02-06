package Db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzym;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.A;
import com.google.firebase.auth.C0;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.I;
import com.google.firebase.auth.J;
import com.google.firebase.auth.K;
import com.google.firebase.auth.L;
import com.google.firebase.auth.U;
import com.google.firebase.auth.Y;
import java.util.ArrayList;
import java.util.List;
import ub.C5230g;
import za.c;

/* renamed from: Db.l  reason: case insensitive filesystem */
public final class C4264l extends K {
    public static final Parcelable.Creator<C4264l> CREATOR = new C4266n();

    /* renamed from: a  reason: collision with root package name */
    private final List f50521a;

    /* renamed from: b  reason: collision with root package name */
    private final C4265m f50522b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50523c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C0 f50524d;

    /* renamed from: e  reason: collision with root package name */
    private final C4258f f50525e;

    /* renamed from: f  reason: collision with root package name */
    private final List f50526f;

    public C4264l(List list, C4265m mVar, String str, C0 c02, C4258f fVar, List list2) {
        this.f50521a = (List) C4536s.l(list);
        this.f50522b = (C4265m) C4536s.l(mVar);
        this.f50523c = C4536s.f(str);
        this.f50524d = c02;
        this.f50525e = fVar;
        this.f50526f = (List) C4536s.l(list2);
    }

    public static C4264l s0(zzym zzym, FirebaseAuth firebaseAuth, A a10) {
        List<J> zzc = zzym.zzc();
        ArrayList arrayList = new ArrayList();
        for (J next : zzc) {
            if (next instanceof U) {
                arrayList.add((U) next);
            }
        }
        List<J> zzc2 = zzym.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (J next2 : zzc2) {
            if (next2 instanceof Y) {
                arrayList2.add((Y) next2);
            }
        }
        return new C4264l(arrayList, C4265m.p0(zzym.zzc(), zzym.zzb()), firebaseAuth.j().q(), zzym.zza(), (C4258f) a10, arrayList2);
    }

    public final FirebaseAuth o0() {
        return FirebaseAuth.getInstance(C5230g.p(this.f50523c));
    }

    public final List p0() {
        ArrayList arrayList = new ArrayList();
        for (U add : this.f50521a) {
            arrayList.add(add);
        }
        for (Y add2 : this.f50526f) {
            arrayList.add(add2);
        }
        return arrayList;
    }

    public final L q0() {
        return this.f50522b;
    }

    public final Task r0(I i10) {
        return o0().U(i10, this.f50522b, this.f50525e).continueWithTask(new C4263k(this));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, this.f50521a, false);
        c.B(parcel, 2, q0(), i10, false);
        c.D(parcel, 3, this.f50523c, false);
        c.B(parcel, 4, this.f50524d, i10, false);
        c.B(parcel, 5, this.f50525e, i10, false);
        c.H(parcel, 6, this.f50526f, false);
        c.b(parcel, a10);
    }
}

package Db;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.firebase.auth.A;
import com.google.firebase.auth.B;
import com.google.firebase.auth.C;
import com.google.firebase.auth.C0;
import com.google.firebase.auth.C4778b0;
import com.google.firebase.auth.H;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ub.C5230g;
import za.c;

/* renamed from: Db.f  reason: case insensitive filesystem */
public class C4258f extends A {
    public static final Parcelable.Creator<C4258f> CREATOR = new C4257e();

    /* renamed from: a  reason: collision with root package name */
    private zzafm f50501a;

    /* renamed from: b  reason: collision with root package name */
    private A0 f50502b;

    /* renamed from: c  reason: collision with root package name */
    private String f50503c;

    /* renamed from: d  reason: collision with root package name */
    private String f50504d;

    /* renamed from: e  reason: collision with root package name */
    private List f50505e;

    /* renamed from: f  reason: collision with root package name */
    private List f50506f;

    /* renamed from: g  reason: collision with root package name */
    private String f50507g;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f50508h;

    /* renamed from: i  reason: collision with root package name */
    private C4260h f50509i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f50510j;

    /* renamed from: k  reason: collision with root package name */
    private C0 f50511k;

    /* renamed from: l  reason: collision with root package name */
    private J f50512l;

    /* renamed from: m  reason: collision with root package name */
    private List f50513m;

    public C4258f(C5230g gVar, List list) {
        C4536s.l(gVar);
        this.f50503c = gVar.q();
        this.f50504d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f50507g = "2";
        J0(list);
    }

    public final synchronized A J0(List list) {
        try {
            C4536s.l(list);
            this.f50505e = new ArrayList(list.size());
            this.f50506f = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                C4778b0 b0Var = (C4778b0) list.get(i10);
                if (b0Var.r().equals("firebase")) {
                    this.f50502b = (A0) b0Var;
                } else {
                    this.f50506f.add(b0Var.r());
                }
                this.f50505e.add((A0) b0Var);
            }
            if (this.f50502b == null) {
                this.f50502b = (A0) this.f50505e.get(0);
            }
        } finally {
            while (true) {
            }
        }
        return this;
    }

    public final C5230g K0() {
        return C5230g.p(this.f50503c);
    }

    public final void L0(zzafm zzafm) {
        this.f50501a = (zzafm) C4536s.l(zzafm);
    }

    public final /* synthetic */ A M0() {
        this.f50508h = Boolean.FALSE;
        return this;
    }

    public final void N0(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f50513m = list;
    }

    public final zzafm O0() {
        return this.f50501a;
    }

    public final void P0(List list) {
        this.f50512l = J.o0(list);
    }

    public final List Q0() {
        return this.f50513m;
    }

    public final C4258f R0(String str) {
        this.f50507g = str;
        return this;
    }

    public final void S0(C4260h hVar) {
        this.f50509i = hVar;
    }

    public final void T0(C0 c02) {
        this.f50511k = c02;
    }

    public final void U0(boolean z10) {
        this.f50510j = z10;
    }

    public final C0 V0() {
        return this.f50511k;
    }

    public final List W0() {
        J j10 = this.f50512l;
        if (j10 != null) {
            return j10.zza();
        }
        return new ArrayList();
    }

    public final List X0() {
        return this.f50505e;
    }

    public final boolean Y0() {
        return this.f50510j;
    }

    public String a() {
        return this.f50502b.a();
    }

    public String d() {
        return this.f50502b.d();
    }

    public String g() {
        return this.f50502b.g();
    }

    public Uri h() {
        return this.f50502b.h();
    }

    public String j0() {
        return this.f50502b.j0();
    }

    public boolean k() {
        return this.f50502b.k();
    }

    public B q0() {
        return this.f50509i;
    }

    public String r() {
        return this.f50502b.r();
    }

    public /* synthetic */ H r0() {
        return new C4262j(this);
    }

    public List s0() {
        return this.f50505e;
    }

    public String t0() {
        Map map;
        zzafm zzafm = this.f50501a;
        if (zzafm == null || zzafm.zzc() == null || (map = (Map) I.a(this.f50501a.zzc()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    public boolean u0() {
        C a10;
        Boolean bool = this.f50508h;
        if (bool == null || bool.booleanValue()) {
            zzafm zzafm = this.f50501a;
            String str = "";
            if (!(zzafm == null || (a10 = I.a(zzafm.zzc())) == null)) {
                str = a10.e();
            }
            boolean z10 = true;
            if (s0().size() > 1 || (str != null && str.equals("custom"))) {
                z10 = false;
            }
            this.f50508h = Boolean.valueOf(z10);
        }
        return this.f50508h.booleanValue();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, O0(), i10, false);
        c.B(parcel, 2, this.f50502b, i10, false);
        c.D(parcel, 3, this.f50503c, false);
        c.D(parcel, 4, this.f50504d, false);
        c.H(parcel, 5, this.f50505e, false);
        c.F(parcel, 6, zzg(), false);
        c.D(parcel, 7, this.f50507g, false);
        c.i(parcel, 8, Boolean.valueOf(u0()), false);
        c.B(parcel, 9, q0(), i10, false);
        c.g(parcel, 10, this.f50510j);
        c.B(parcel, 11, this.f50511k, i10, false);
        c.B(parcel, 12, this.f50512l, i10, false);
        c.H(parcel, 13, Q0(), false);
        c.b(parcel, a10);
    }

    public final String zzd() {
        return O0().zzc();
    }

    public final String zze() {
        return this.f50501a.zzf();
    }

    public final List zzg() {
        return this.f50506f;
    }

    C4258f(zzafm zzafm, A0 a02, String str, String str2, List list, List list2, String str3, Boolean bool, C4260h hVar, boolean z10, C0 c02, J j10, List list3) {
        this.f50501a = zzafm;
        this.f50502b = a02;
        this.f50503c = str;
        this.f50504d = str2;
        this.f50505e = list;
        this.f50506f = list2;
        this.f50507g = str3;
        this.f50508h = bool;
        this.f50509i = hVar;
        this.f50510j = z10;
        this.f50511k = c02;
        this.f50512l = j10;
        this.f50513m = list3;
    }
}

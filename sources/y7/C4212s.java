package y7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1773v;
import com.facebook.I;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C3891g;
import o7.M;
import y7.C4214u;

/* renamed from: y7.s  reason: case insensitive filesystem */
public final class C4212s extends I {
    public static final Parcelable.Creator<C4212s> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final b f49791f = new b((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final String f49792e = "katana_proxy_auth";

    /* renamed from: y7.s$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C4212s createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new C4212s(parcel);
        }

        /* renamed from: b */
        public C4212s[] newArray(int i10) {
            return new C4212s[i10];
        }
    }

    /* renamed from: y7.s$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4212s(C4214u uVar) {
        super(uVar);
        C6496s.h(uVar, "loginClient");
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f49792e;
    }

    public boolean o() {
        return true;
    }

    public int p(C4214u.e eVar) {
        boolean z10;
        String str;
        C6496s.h(eVar, "request");
        C4213t j10 = eVar.j();
        if (!I.f39300r || C3891g.a() == null || !j10.b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        String a10 = C4214u.f49807m.a();
        C1773v i10 = d().i();
        String a11 = eVar.a();
        Collection o10 = eVar.o();
        boolean v10 = eVar.v();
        boolean q10 = eVar.q();
        C4199e g10 = eVar.g();
        if (g10 == null) {
            g10 = C4199e.NONE;
        }
        C4199e eVar2 = g10;
        String c10 = c(eVar.b());
        String c11 = eVar.c();
        String l10 = eVar.l();
        boolean p10 = eVar.p();
        boolean s10 = eVar.s();
        boolean L10 = eVar.L();
        String n10 = eVar.n();
        String d10 = eVar.d();
        C4195a e10 = eVar.e();
        if (e10 != null) {
            str = e10.name();
        } else {
            str = null;
        }
        List<Intent> o11 = M.o(i10, a11, o10, a10, v10, q10, eVar2, c10, c11, z10, l10, p10, s10, L10, n10, d10, str);
        a("e2e", a10);
        int i11 = 0;
        for (Intent L11 : o11) {
            i11++;
            if (L(L11, C4214u.f49807m.b())) {
                return i11;
            }
        }
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4212s(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "source");
    }
}

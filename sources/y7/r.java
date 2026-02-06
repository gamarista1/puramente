package y7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C3293h;
import com.facebook.I;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.M;
import y7.C4214u;

public final class r extends I {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f49788g = new b((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final String f49789e = "instagram_login";

    /* renamed from: f  reason: collision with root package name */
    private final C3293h f49790f = C3293h.INSTAGRAM_APPLICATION_WEB;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public r createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new r(parcel);
        }

        /* renamed from: b */
        public r[] newArray(int i10) {
            return new r[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(C4214u uVar) {
        super(uVar);
        C6496s.h(uVar, "loginClient");
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f49789e;
    }

    public int p(C4214u.e eVar) {
        C6496s.h(eVar, "request");
        C4214u.c cVar = C4214u.f49807m;
        String a10 = cVar.a();
        Context i10 = d().i();
        if (i10 == null) {
            i10 = I.l();
        }
        String a11 = eVar.a();
        Collection o10 = eVar.o();
        boolean v10 = eVar.v();
        boolean q10 = eVar.q();
        C4199e g10 = eVar.g();
        if (g10 == null) {
            g10 = C4199e.NONE;
        }
        Intent j10 = M.j(i10, a11, o10, a10, v10, q10, g10, c(eVar.b()), eVar.c(), eVar.l(), eVar.p(), eVar.s(), eVar.L());
        a("e2e", a10);
        return L(j10, cVar.b()) ? 1 : 0;
    }

    public C3293h w() {
        return this.f49790f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        super.writeToParcel(parcel, i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "source");
    }
}

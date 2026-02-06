package y7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1773v;
import com.facebook.C3293h;
import com.facebook.C3459v;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C3898n;
import o7.W;
import o7.b0;
import y7.C4214u;

public class U extends T {
    public static final Parcelable.Creator<U> CREATOR = new b();

    /* renamed from: j  reason: collision with root package name */
    public static final c f49699j = new c((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private b0 f49700f;

    /* renamed from: g  reason: collision with root package name */
    private String f49701g;

    /* renamed from: h  reason: collision with root package name */
    private final String f49702h = "web_view";

    /* renamed from: i  reason: collision with root package name */
    private final C3293h f49703i = C3293h.WEB_VIEW;

    public final class a extends b0.a {

        /* renamed from: h  reason: collision with root package name */
        private String f49704h = "fbconnect://success";

        /* renamed from: i  reason: collision with root package name */
        private C4213t f49705i = C4213t.NATIVE_WITH_FALLBACK;

        /* renamed from: j  reason: collision with root package name */
        private G f49706j = G.FACEBOOK;

        /* renamed from: k  reason: collision with root package name */
        private boolean f49707k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f49708l;

        /* renamed from: m  reason: collision with root package name */
        public String f49709m;

        /* renamed from: n  reason: collision with root package name */
        public String f49710n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ U f49711o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(U u10, Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            C6496s.h(context, "context");
            C6496s.h(str, "applicationId");
            C6496s.h(bundle, "parameters");
            this.f49711o = u10;
        }

        public b0 a() {
            String str;
            Bundle f10 = f();
            C6496s.f(f10, "null cannot be cast to non-null type android.os.Bundle");
            f10.putString("redirect_uri", this.f49704h);
            f10.putString("client_id", c());
            f10.putString("e2e", j());
            if (this.f49706j == G.INSTAGRAM) {
                str = "token,signed_request,graph_domain,granted_scopes";
            } else {
                str = "token,signed_request,graph_domain";
            }
            f10.putString("response_type", str);
            f10.putString("return_scopes", com.amazon.a.a.o.b.f37475af);
            f10.putString("auth_type", i());
            f10.putString("login_behavior", this.f49705i.name());
            if (this.f49707k) {
                f10.putString("fx_app", this.f49706j.toString());
            }
            if (this.f49708l) {
                f10.putString("skip_dedupe", com.amazon.a.a.o.b.f37475af);
            }
            b0.b bVar = b0.f47194m;
            Context d10 = d();
            C6496s.f(d10, "null cannot be cast to non-null type android.content.Context");
            return bVar.d(d10, "oauth", f10, g(), this.f49706j, e());
        }

        public final String i() {
            String str = this.f49710n;
            if (str != null) {
                return str;
            }
            C6496s.v("authType");
            return null;
        }

        public final String j() {
            String str = this.f49709m;
            if (str != null) {
                return str;
            }
            C6496s.v("e2e");
            return null;
        }

        public final a k(String str) {
            C6496s.h(str, "authType");
            l(str);
            return this;
        }

        public final void l(String str) {
            C6496s.h(str, "<set-?>");
            this.f49710n = str;
        }

        public final a m(String str) {
            C6496s.h(str, "e2e");
            n(str);
            return this;
        }

        public final void n(String str) {
            C6496s.h(str, "<set-?>");
            this.f49709m = str;
        }

        public final a o(boolean z10) {
            this.f49707k = z10;
            return this;
        }

        public final a p(boolean z10) {
            String str;
            if (z10) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            this.f49704h = str;
            return this;
        }

        public final a q(C4213t tVar) {
            C6496s.h(tVar, "loginBehavior");
            this.f49705i = tVar;
            return this;
        }

        public final a r(G g10) {
            C6496s.h(g10, "targetApp");
            this.f49706j = g10;
            return this;
        }

        public final a s(boolean z10) {
            this.f49708l = z10;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public U createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new U(parcel);
        }

        /* renamed from: b */
        public U[] newArray(int i10) {
            return new U[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d implements b0.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f49712a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4214u.e f49713b;

        d(U u10, C4214u.e eVar) {
            this.f49712a = u10;
            this.f49713b = eVar;
        }

        public void a(Bundle bundle, C3459v vVar) {
            this.f49712a.F(this.f49713b, bundle, vVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U(C4214u uVar) {
        super(uVar);
        C6496s.h(uVar, "loginClient");
    }

    public final void F(C4214u.e eVar, Bundle bundle, C3459v vVar) {
        C6496s.h(eVar, "request");
        super.y(eVar, bundle, vVar);
    }

    public void b() {
        b0 b0Var = this.f49700f;
        if (b0Var != null) {
            if (b0Var != null) {
                b0Var.cancel();
            }
            this.f49700f = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f49702h;
    }

    public boolean i() {
        return true;
    }

    public int p(C4214u.e eVar) {
        C6496s.h(eVar, "request");
        Bundle s10 = s(eVar);
        d dVar = new d(this, eVar);
        String a10 = C4214u.f49807m.a();
        this.f49701g = a10;
        a("e2e", a10);
        C1773v i10 = d().i();
        if (i10 == null) {
            return 0;
        }
        boolean Y10 = W.Y(i10);
        a aVar = new a(this, i10, eVar.a(), s10);
        String str = this.f49701g;
        C6496s.f(str, "null cannot be cast to non-null type kotlin.String");
        this.f49700f = aVar.m(str).p(Y10).k(eVar.c()).q(eVar.j()).r(eVar.k()).o(eVar.s()).s(eVar.L()).h(dVar).a();
        C3898n nVar = new C3898n();
        nVar.setRetainInstance(true);
        nVar.b0(this.f49700f);
        nVar.T(i10.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    public C3293h v() {
        return this.f49703i;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f49701g);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "source");
        this.f49701g = parcel.readString();
    }
}

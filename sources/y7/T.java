package y7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.C1773v;
import com.amazon.a.a.o.b;
import com.amazon.a.a.o.b.f;
import com.facebook.C3286a;
import com.facebook.C3293h;
import com.facebook.C3459v;
import com.facebook.C3461x;
import com.facebook.C3462y;
import com.facebook.I;
import com.facebook.K;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.W;
import y7.C4214u;
import y7.E;

public abstract class T extends E {

    /* renamed from: e  reason: collision with root package name */
    public static final a f49697e = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private String f49698d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(C4214u uVar) {
        super(uVar);
        C6496s.h(uVar, "loginClient");
    }

    private final void B(String str) {
        Context i10 = d().i();
        if (i10 == null) {
            i10 = I.l();
        }
        i10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    private final String w() {
        Context i10 = d().i();
        if (i10 == null) {
            i10 = I.l();
        }
        return i10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* access modifiers changed from: protected */
    public Bundle q(Bundle bundle, C4214u.e eVar) {
        String str;
        String str2;
        C6496s.h(bundle, "parameters");
        C6496s.h(eVar, "request");
        bundle.putString("redirect_uri", g());
        if (eVar.u()) {
            bundle.putString("app_id", eVar.a());
        } else {
            bundle.putString("client_id", eVar.a());
        }
        bundle.putString("e2e", C4214u.f49807m.a());
        if (eVar.u()) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (eVar.o().contains("openid")) {
                bundle.putString("nonce", eVar.n());
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", eVar.d());
        C4195a e10 = eVar.e();
        if (e10 != null) {
            str = e10.name();
        } else {
            str = null;
        }
        bundle.putString("code_challenge_method", str);
        bundle.putString("return_scopes", b.f37475af);
        bundle.putString("auth_type", eVar.c());
        bundle.putString("login_behavior", eVar.j().name());
        bundle.putString("sdk", "android-" + I.B());
        if (u() != null) {
            bundle.putString("sso", u());
        }
        String str3 = "0";
        if (I.f39299q) {
            str2 = "1";
        } else {
            str2 = str3;
        }
        bundle.putString("cct_prefetching", str2);
        if (eVar.s()) {
            bundle.putString("fx_app", eVar.k().toString());
        }
        if (eVar.L()) {
            bundle.putString("skip_dedupe", b.f37475af);
        }
        if (eVar.l() != null) {
            bundle.putString("messenger_page_id", eVar.l());
            if (eVar.p()) {
                str3 = "1";
            }
            bundle.putString("reset_messenger_state", str3);
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public Bundle s(C4214u.e eVar) {
        String str;
        C6496s.h(eVar, "request");
        Bundle bundle = new Bundle();
        if (!W.f0(eVar.o())) {
            String join = TextUtils.join(f.f37529a, eVar.o());
            bundle.putString("scope", join);
            a("scope", join);
        }
        C4199e g10 = eVar.g();
        if (g10 == null) {
            g10 = C4199e.NONE;
        }
        bundle.putString("default_audience", g10.b());
        bundle.putString("state", c(eVar.b()));
        C3286a e10 = C3286a.f39402l.e();
        if (e10 != null) {
            str = e10.n();
        } else {
            str = null;
        }
        String str2 = "0";
        if (str == null || !C6496s.c(str, w())) {
            C1773v i10 = d().i();
            if (i10 != null) {
                W.i(i10);
            }
            a("access_token", str2);
        } else {
            bundle.putString("access_token", str);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (I.p()) {
            str2 = "1";
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public String u() {
        return null;
    }

    public abstract C3293h v();

    public void y(C4214u.e eVar, Bundle bundle, C3459v vVar) {
        C4214u.f fVar;
        String str;
        String str2;
        C6496s.h(eVar, "request");
        C4214u d10 = d();
        this.f49698d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f49698d = bundle.getString("e2e");
            }
            try {
                E.a aVar = E.f49600c;
                C3286a b10 = aVar.b(eVar.o(), bundle, v(), eVar.a());
                fVar = C4214u.f.f49839i.b(d10.p(), b10, aVar.d(bundle, eVar.n()));
                if (d10.i() != null) {
                    try {
                        CookieSyncManager.createInstance(d10.i()).sync();
                    } catch (Exception unused) {
                    }
                    if (b10 != null) {
                        B(b10.n());
                    }
                }
            } catch (C3459v e10) {
                fVar = C4214u.f.c.d(C4214u.f.f49839i, d10.p(), (String) null, e10.getMessage(), (String) null, 8, (Object) null);
            }
        } else if (vVar instanceof C3461x) {
            fVar = C4214u.f.f49839i.a(d10.p(), "User canceled log in.");
        } else {
            this.f49698d = null;
            if (vVar != null) {
                str = vVar.getMessage();
            } else {
                str = null;
            }
            if (vVar instanceof K) {
                C3462y c10 = ((K) vVar).c();
                str2 = String.valueOf(c10.c());
                str = c10.toString();
            } else {
                str2 = null;
            }
            fVar = C4214u.f.f49839i.c(d10.p(), (String) null, str, str2);
        }
        if (!W.e0(this.f49698d)) {
            h(this.f49698d);
        }
        d10.g(fVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "source");
    }
}

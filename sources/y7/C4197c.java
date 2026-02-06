package y7;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import com.facebook.C3293h;
import com.facebook.C3459v;
import com.facebook.C3461x;
import com.facebook.CustomTabMainActivity;
import com.facebook.I;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C3890f;
import o7.C3891g;
import o7.E;
import o7.W;
import org.json.JSONException;
import org.json.JSONObject;
import y7.C4214u;

/* renamed from: y7.c  reason: case insensitive filesystem */
public final class C4197c extends T {
    public static final Parcelable.Creator<C4197c> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public static final b f49720k = new b((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static boolean f49721l;

    /* renamed from: f  reason: collision with root package name */
    private String f49722f;

    /* renamed from: g  reason: collision with root package name */
    private String f49723g;

    /* renamed from: h  reason: collision with root package name */
    private String f49724h;

    /* renamed from: i  reason: collision with root package name */
    private final String f49725i;

    /* renamed from: j  reason: collision with root package name */
    private final C3293h f49726j;

    /* renamed from: y7.c$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C4197c createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new C4197c(parcel);
        }

        /* renamed from: b */
        public C4197c[] newArray(int i10) {
            return new C4197c[i10];
        }
    }

    /* renamed from: y7.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4197c(C4214u uVar) {
        super(uVar);
        C6496s.h(uVar, "loginClient");
        this.f49725i = "custom_tab";
        this.f49726j = C3293h.CHROME_CUSTOM_TAB;
        this.f49723g = W.t(20);
        f49721l = false;
        this.f49724h = C3891g.c(J());
    }

    private final String G() {
        String str = this.f49722f;
        if (str != null) {
            return str;
        }
        String a10 = C3891g.a();
        this.f49722f = a10;
        return a10;
    }

    private final String J() {
        return super.g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void K(java.lang.String r7, y7.C4214u.e r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00ce
            java.lang.String r0 = "fbconnect://cct."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = Sg.p.J(r7, r0, r1, r2, r3)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = super.g()
            boolean r0 = Sg.p.J(r7, r0, r1, r2, r3)
            if (r0 == 0) goto L_0x00ce
        L_0x0017:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = o7.W.q0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = o7.W.q0(r7)
            r0.putAll(r7)
            boolean r7 = r6.M(r0)
            if (r7 != 0) goto L_0x003f
            com.facebook.v r7 = new com.facebook.v
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>((java.lang.String) r0)
            super.y(r8, r3, r7)
            return
        L_0x003f:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x004d
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x004d:
            java.lang.String r1 = "error_msg"
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto L_0x005b
            java.lang.String r1 = "error_message"
            java.lang.String r1 = r0.getString(r1)
        L_0x005b:
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r0.getString(r1)
        L_0x0063:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = r0.getString(r2)
            r4 = -1
            if (r2 == 0) goto L_0x0071
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0071 }
            goto L_0x0072
        L_0x0071:
            r2 = r4
        L_0x0072:
            boolean r5 = o7.W.e0(r7)
            if (r5 == 0) goto L_0x0099
            boolean r5 = o7.W.e0(r1)
            if (r5 == 0) goto L_0x0099
            if (r2 != r4) goto L_0x0099
            java.lang.String r7 = "access_token"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L_0x008c
            super.y(r8, r0, r3)
            return
        L_0x008c:
            java.util.concurrent.Executor r7 = com.facebook.I.t()
            y7.b r1 = new y7.b
            r1.<init>(r6, r8, r0)
            r7.execute(r1)
            goto L_0x00ce
        L_0x0099:
            if (r7 == 0) goto L_0x00b4
            java.lang.String r0 = "access_denied"
            boolean r0 = kotlin.jvm.internal.C6496s.c(r7, r0)
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = kotlin.jvm.internal.C6496s.c(r7, r0)
            if (r0 == 0) goto L_0x00b4
        L_0x00ab:
            com.facebook.x r7 = new com.facebook.x
            r7.<init>()
            super.y(r8, r3, r7)
            goto L_0x00ce
        L_0x00b4:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r2 != r0) goto L_0x00c1
            com.facebook.x r7 = new com.facebook.x
            r7.<init>()
            super.y(r8, r3, r7)
            goto L_0x00ce
        L_0x00c1:
            com.facebook.y r0 = new com.facebook.y
            r0.<init>(r2, r7, r1)
            com.facebook.K r7 = new com.facebook.K
            r7.<init>(r0, r1)
            super.y(r8, r3, r7)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.C4197c.K(java.lang.String, y7.u$e):void");
    }

    /* access modifiers changed from: private */
    public static final void L(C4197c cVar, C4214u.e eVar, Bundle bundle) {
        C6496s.h(cVar, "this$0");
        C6496s.h(eVar, "$request");
        C6496s.h(bundle, "$values");
        try {
            cVar.y(eVar, cVar.k(eVar, bundle), (C3459v) null);
        } catch (C3459v e10) {
            cVar.y(eVar, (Bundle) null, e10);
        }
    }

    private final boolean M(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return C6496s.c(new JSONObject(string).getString("7_challenge"), this.f49723g);
        } catch (JSONException unused) {
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f49725i;
    }

    /* access modifiers changed from: protected */
    public String g() {
        return this.f49724h;
    }

    public boolean j(int i10, int i11, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f39273j, false)) {
            return super.j(i10, i11, intent);
        }
        if (i10 != 1) {
            return super.j(i10, i11, intent);
        }
        C4214u.e p10 = d().p();
        if (p10 == null) {
            return false;
        }
        String str = null;
        if (i11 == -1) {
            if (intent != null) {
                str = intent.getStringExtra(CustomTabMainActivity.f39270g);
            }
            K(str, p10);
            return true;
        }
        super.y(p10, (Bundle) null, new C3461x());
        return false;
    }

    public void l(JSONObject jSONObject) {
        C6496s.h(jSONObject, "param");
        jSONObject.put("7_challenge", this.f49723g);
    }

    public int p(C4214u.e eVar) {
        C6496s.h(eVar, "request");
        C4214u d10 = d();
        if (g().length() == 0) {
            return 0;
        }
        Bundle q10 = q(s(eVar), eVar);
        if (f49721l) {
            q10.putString("cct_over_app_switch", "1");
        }
        if (I.f39299q) {
            if (eVar.u()) {
                C4198d.f49727b.c(E.f47102c.a("oauth", q10));
            } else {
                C4198d.f49727b.c(C3890f.f47254b.a("oauth", q10));
            }
        }
        C1773v i10 = d10.i();
        if (i10 == null) {
            return 0;
        }
        Intent intent = new Intent(i10, CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f39267d, "oauth");
        intent.putExtra(CustomTabMainActivity.f39268e, q10);
        intent.putExtra(CustomTabMainActivity.f39269f, G());
        intent.putExtra(CustomTabMainActivity.f39271h, eVar.k().toString());
        C1769q k10 = d10.k();
        if (k10 != null) {
            k10.startActivityForResult(intent, 1);
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    public String u() {
        return "chrome_custom_tab";
    }

    public C3293h v() {
        return this.f49726j;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f49723g);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4197c(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "source");
        this.f49725i = "custom_tab";
        this.f49726j = C3293h.CHROME_CUSTOM_TAB;
        this.f49723g = parcel.readString();
        this.f49724h = C3891g.c(J());
    }
}

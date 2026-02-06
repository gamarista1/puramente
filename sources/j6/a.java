package J6;

import K6.c;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.facebook.C3286a;
import com.facebook.C3459v;
import com.facebook.I;
import com.facebook.S;
import com.facebook.r;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import o7.C3885a;
import o7.C3889e;
import o7.C3891g;
import o7.C3894j;
import o7.C3895k;
import o7.M;
import o7.X;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u8.C4101c;
import u8.m;
import u8.o;
import v8.C4113c;

public class a extends C3895k {

    /* renamed from: i  reason: collision with root package name */
    private static final int f32200i = C3889e.c.GameRequest.b();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public r f32201h;

    /* renamed from: J6.a$a  reason: collision with other inner class name */
    class C0525a extends u8.g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f32202b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0525a(r rVar, r rVar2) {
            super(rVar);
            this.f32202b = rVar2;
        }

        public void c(C3885a aVar, Bundle bundle) {
            if (bundle != null) {
                this.f32202b.onSuccess(new f(bundle, (C0525a) null));
            } else {
                a(aVar);
            }
        }
    }

    class b implements C3889e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u8.g f32204a;

        b(u8.g gVar) {
            this.f32204a = gVar;
        }

        public boolean a(int i10, Intent intent) {
            return m.p(a.this.h(), i10, intent, this.f32204a);
        }
    }

    class c implements c.C0530c {
        c() {
        }

        public void a(S s10) {
            if (a.this.f32201h == null) {
                return;
            }
            if (s10.b() != null) {
                a.this.f32201h.a(new C3459v(s10.b().d()));
            } else {
                a.this.f32201h.onSuccess(new f(s10, (C0525a) null));
            }
        }
    }

    private class d extends C3895k.b {
        private d() {
            super();
        }

        /* renamed from: d */
        public boolean a(C4113c cVar, boolean z10) {
            if (C3891g.a() == null || !X.e(a.this.f(), C3891g.b())) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public C3885a b(C4113c cVar) {
            C4101c.a(cVar);
            C3885a e10 = a.this.e();
            Bundle a10 = o.a(cVar);
            C3286a d10 = C3286a.d();
            if (d10 != null) {
                a10.putString("app_id", d10.c());
            } else {
                a10.putString("app_id", I.m());
            }
            a10.putString("redirect_uri", C3891g.b());
            C3894j.i(e10, "apprequests", a10);
            return e10;
        }

        /* synthetic */ d(a aVar, C0525a aVar2) {
            this();
        }
    }

    private class e extends C3895k.b {
        private e() {
            super();
        }

        /* renamed from: d */
        public boolean a(C4113c cVar, boolean z10) {
            boolean z11;
            boolean z12;
            PackageManager packageManager = a.this.f().getPackageManager();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            if (intent.resolveActivity(packageManager) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            C3286a d10 = C3286a.d();
            if (d10 == null || d10.i() == null || !"gaming".equals(d10.i())) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z11 || !z12) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public C3885a b(C4113c cVar) {
            String str;
            C3885a e10 = a.this.e();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            C3286a d10 = C3286a.d();
            Bundle bundle = new Bundle();
            bundle.putString(Constants.DEEPLINK, "GAME_REQUESTS");
            if (d10 != null) {
                bundle.putString("app_id", d10.c());
            } else {
                bundle.putString("app_id", I.m());
            }
            if (cVar.a() != null) {
                str = cVar.a().name();
            } else {
                str = null;
            }
            bundle.putString("actionType", str);
            bundle.putString(MetricTracker.Object.MESSAGE, cVar.e());
            bundle.putString(com.amazon.a.a.o.b.f37461S, cVar.i());
            bundle.putString("data", cVar.c());
            bundle.putString("cta", cVar.b());
            cVar.g();
            JSONArray jSONArray = new JSONArray();
            if (cVar.g() != null) {
                for (String put : cVar.g()) {
                    jSONArray.put(put);
                }
            }
            bundle.putString("to", jSONArray.toString());
            M.D(intent, e10.c().toString(), "", M.x(), bundle);
            e10.g(intent);
            return e10;
        }

        /* synthetic */ e(a aVar, C0525a aVar2) {
            this();
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        String f32209a;

        /* renamed from: b  reason: collision with root package name */
        List f32210b;

        /* synthetic */ f(Bundle bundle, C0525a aVar) {
            this(bundle);
        }

        public String a() {
            return this.f32209a;
        }

        public List b() {
            return this.f32210b;
        }

        /* synthetic */ f(S s10, C0525a aVar) {
            this(s10);
        }

        private f(Bundle bundle) {
            this.f32209a = bundle.getString("request");
            this.f32210b = new ArrayList();
            while (bundle.containsKey(String.format("to[%d]", new Object[]{Integer.valueOf(this.f32210b.size())}))) {
                List list = this.f32210b;
                list.add(bundle.getString(String.format("to[%d]", new Object[]{Integer.valueOf(list.size())})));
            }
        }

        private f(S s10) {
            try {
                JSONObject c10 = s10.c();
                JSONObject optJSONObject = c10.optJSONObject("data");
                c10 = optJSONObject != null ? optJSONObject : c10;
                this.f32209a = c10.getString(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID);
                this.f32210b = new ArrayList();
                JSONArray jSONArray = c10.getJSONArray("to");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this.f32210b.add(jSONArray.getString(i10));
                }
            } catch (JSONException unused) {
                this.f32209a = null;
                this.f32210b = new ArrayList();
            }
        }
    }

    private class g extends C3895k.b {
        private g() {
            super();
        }

        /* renamed from: d */
        public boolean a(C4113c cVar, boolean z10) {
            return true;
        }

        /* renamed from: e */
        public C3885a b(C4113c cVar) {
            C4101c.a(cVar);
            C3885a e10 = a.this.e();
            C3894j.m(e10, "apprequests", o.a(cVar));
            return e10;
        }

        /* synthetic */ g(a aVar, C0525a aVar2) {
            this();
        }
    }

    public a(Activity activity) {
        super(activity, f32200i);
    }

    public static boolean r() {
        return true;
    }

    private void s(C4113c cVar, Object obj) {
        String str;
        Activity f10 = f();
        C3286a d10 = C3286a.d();
        if (d10 == null || d10.p()) {
            throw new C3459v("Attempted to open GameRequestDialog with an invalid access token");
        }
        c cVar2 = new c();
        String c10 = d10.c();
        if (cVar.a() != null) {
            str = cVar.a().name();
        } else {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("appID", c10);
            jSONObject.put("actionType", str);
            jSONObject.put(MetricTracker.Object.MESSAGE, cVar.e());
            jSONObject.put("cta", cVar.b());
            jSONObject.put(com.amazon.a.a.o.b.f37461S, cVar.i());
            jSONObject.put("data", cVar.c());
            jSONObject.put("options", cVar.d());
            if (cVar.g() != null) {
                for (String put : cVar.g()) {
                    jSONArray.put(put);
                }
            }
            jSONObject.put("to", jSONArray);
            K6.c.h(f10, jSONObject, cVar2, L6.b.OPEN_GAME_REQUESTS_DIALOG);
        } catch (JSONException unused) {
            r rVar = this.f32201h;
            if (rVar != null) {
                rVar.a(new C3459v("Couldn't prepare Game Request Dialog"));
            }
        }
    }

    /* access modifiers changed from: protected */
    public C3885a e() {
        return new C3885a(h());
    }

    /* access modifiers changed from: protected */
    public List g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e(this, (C0525a) null));
        arrayList.add(new d(this, (C0525a) null));
        arrayList.add(new g(this, (C0525a) null));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void k(C3889e eVar, r rVar) {
        C0525a aVar;
        this.f32201h = rVar;
        if (rVar == null) {
            aVar = null;
        } else {
            aVar = new C0525a(rVar, rVar);
        }
        eVar.c(h(), new b(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void n(C4113c cVar, Object obj) {
        if (K6.a.a()) {
            s(cVar, obj);
        } else {
            super.n(cVar, obj);
        }
    }
}

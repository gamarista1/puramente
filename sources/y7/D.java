package y7;

import Sg.p;
import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.C1769q;
import com.facebook.C3286a;
import com.facebook.C3320j;
import com.facebook.C3324n;
import com.facebook.C3325o;
import com.facebook.C3459v;
import com.facebook.FacebookActivity;
import com.facebook.I;
import com.facebook.W;
import com.facebook.r;
import g.C2003f;
import h.C2012a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import mf.Y;
import o7.B;
import o7.C3889e;
import o7.C3891g;
import o7.X;
import s.C2575c;
import y7.C4214u;

public class D {

    /* renamed from: j  reason: collision with root package name */
    public static final b f49579j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Set f49580k;

    /* renamed from: l  reason: collision with root package name */
    private static final String f49581l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static volatile D f49582m;

    /* renamed from: a  reason: collision with root package name */
    private C4213t f49583a = C4213t.NATIVE_WITH_FALLBACK;

    /* renamed from: b  reason: collision with root package name */
    private C4199e f49584b = C4199e.FRIENDS;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f49585c;

    /* renamed from: d  reason: collision with root package name */
    private String f49586d = "rerequest";

    /* renamed from: e  reason: collision with root package name */
    private String f49587e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f49588f;

    /* renamed from: g  reason: collision with root package name */
    private G f49589g = G.FACEBOOK;

    /* renamed from: h  reason: collision with root package name */
    private boolean f49590h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f49591i;

    private static final class a implements S {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f49592a;

        public a(Activity activity) {
            C6496s.h(activity, "activity");
            this.f49592a = activity;
        }

        public Activity a() {
            return this.f49592a;
        }

        public void startActivityForResult(Intent intent, int i10) {
            C6496s.h(intent, "intent");
            a().startActivityForResult(intent, i10);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Set d() {
            return Y.j("ads_management", "create_event", "rsvp_event");
        }

        public final F b(C4214u.e eVar, C3286a aVar, C3320j jVar) {
            C6496s.h(eVar, "request");
            C6496s.h(aVar, "newToken");
            Set o10 = eVar.o();
            Set i12 = C6565s.i1(C6565s.l0(aVar.k()));
            if (eVar.v()) {
                i12.retainAll(o10);
            }
            Set i13 = C6565s.i1(C6565s.l0(o10));
            i13.removeAll(i12);
            return new F(aVar, jVar, i12, i13);
        }

        public D c() {
            if (D.f49582m == null) {
                synchronized (this) {
                    D.f49582m = new D();
                    C6514M m10 = C6514M.f71813a;
                }
            }
            D c10 = D.f49582m;
            if (c10 != null) {
                return c10;
            }
            C6496s.v("instance");
            return null;
        }

        public final boolean e(String str) {
            if (str == null) {
                return false;
            }
            if (p.J(str, "publish", false, 2, (Object) null) || p.J(str, "manage", false, 2, (Object) null) || D.f49580k.contains(str)) {
                return true;
            }
            return false;
        }

        private b() {
        }
    }

    public final class c extends C2012a {

        /* renamed from: a  reason: collision with root package name */
        private C3324n f49593a;

        /* renamed from: b  reason: collision with root package name */
        private String f49594b;

        public c(C3324n nVar, String str) {
            this.f49593a = nVar;
            this.f49594b = str;
        }

        /* renamed from: a */
        public Intent createIntent(Context context, Collection collection) {
            C6496s.h(context, "context");
            C6496s.h(collection, "permissions");
            C4214u.e j10 = D.this.j(new v(collection, (String) null, 2, (DefaultConstructorMarker) null));
            String str = this.f49594b;
            if (str != null) {
                j10.w(str);
            }
            D.this.y(context, j10);
            Intent n10 = D.this.n(j10);
            if (D.this.E(n10)) {
                return n10;
            }
            C3459v vVar = new C3459v("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            D.this.q(context, C4214u.f.a.ERROR, (Map) null, vVar, false, j10);
            throw vVar;
        }

        /* renamed from: b */
        public C3324n.a parseResult(int i10, Intent intent) {
            D.A(D.this, i10, intent, (r) null, 4, (Object) null);
            int b10 = C3889e.c.Login.b();
            C3324n nVar = this.f49593a;
            if (nVar != null) {
                nVar.a(b10, i10, intent);
            }
            return new C3324n.a(b10, i10, intent);
        }

        public final void c(C3324n nVar) {
            this.f49593a = nVar;
        }
    }

    private static final class d implements S {

        /* renamed from: a  reason: collision with root package name */
        private final B f49596a;

        /* renamed from: b  reason: collision with root package name */
        private final Activity f49597b;

        public d(B b10) {
            C6496s.h(b10, "fragment");
            this.f49596a = b10;
            this.f49597b = b10.a();
        }

        public Activity a() {
            return this.f49597b;
        }

        public void startActivityForResult(Intent intent, int i10) {
            C6496s.h(intent, "intent");
            this.f49596a.d(intent, i10);
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f49598a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static C4192A f49599b;

        private e() {
        }

        public final synchronized C4192A a(Context context) {
            if (context == null) {
                context = I.l();
            }
            if (context == null) {
                return null;
            }
            if (f49599b == null) {
                f49599b = new C4192A(context, I.m());
            }
            return f49599b;
        }
    }

    static {
        b bVar = new b((DefaultConstructorMarker) null);
        f49579j = bVar;
        f49580k = bVar.d();
        String cls = D.class.toString();
        C6496s.g(cls, "LoginManager::class.java.toString()");
        f49581l = cls;
    }

    public D() {
        X.o();
        SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.loginManager", 0);
        C6496s.g(sharedPreferences, "getApplicationContext().…ER, Context.MODE_PRIVATE)");
        this.f49585c = sharedPreferences;
        if (I.f39299q && C3891g.a() != null) {
            C2575c.a(I.l(), "com.android.chrome", new C4198d());
            C2575c.b(I.l(), I.l().getPackageName());
        }
    }

    public static /* synthetic */ boolean A(D d10, int i10, Intent intent, r rVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                rVar = null;
            }
            return d10.z(i10, intent, rVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
    }

    /* access modifiers changed from: private */
    public static final boolean D(D d10, r rVar, int i10, Intent intent) {
        C6496s.h(d10, "this$0");
        return d10.z(i10, intent, rVar);
    }

    /* access modifiers changed from: private */
    public final boolean E(Intent intent) {
        if (I.l().getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    private final void H(boolean z10) {
        SharedPreferences.Editor edit = this.f49585c.edit();
        edit.putBoolean("express_login_allowed", z10);
        edit.apply();
    }

    private final void O(S s10, C4214u.e eVar) {
        y(s10.a(), eVar);
        C3889e.f47232b.c(C3889e.c.Login.b(), new C4194C(this));
        if (!Q(s10, eVar)) {
            C3459v vVar = new C3459v("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            q(s10.a(), C4214u.f.a.ERROR, (Map) null, vVar, false, eVar);
            throw vVar;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean P(D d10, int i10, Intent intent) {
        C6496s.h(d10, "this$0");
        return A(d10, i10, intent, (r) null, 4, (Object) null);
    }

    private final boolean Q(S s10, C4214u.e eVar) {
        Intent n10 = n(eVar);
        if (!E(n10)) {
            return false;
        }
        try {
            s10.startActivityForResult(n10, C4214u.f49807m.b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void l(C3286a aVar, C3320j jVar, C4214u.e eVar, C3459v vVar, boolean z10, r rVar) {
        F f10;
        if (aVar != null) {
            C3286a.f39402l.i(aVar);
            W.f39382h.a();
        }
        if (jVar != null) {
            C3320j.f40102f.a(jVar);
        }
        if (rVar != null) {
            if (aVar == null || eVar == null) {
                f10 = null;
            } else {
                f10 = f49579j.b(eVar, aVar, jVar);
            }
            if (z10 || (f10 != null && f10.c().isEmpty())) {
                rVar.onCancel();
            } else if (vVar != null) {
                rVar.a(vVar);
            } else if (aVar != null && f10 != null) {
                H(true);
                rVar.onSuccess(f10);
            }
        }
    }

    public static D o() {
        return f49579j.c();
    }

    /* access modifiers changed from: private */
    public final void q(Context context, C4214u.f.a aVar, Map map, Exception exc, boolean z10, C4214u.e eVar) {
        String str;
        String str2;
        C4192A a10 = e.f49598a.a(context);
        if (a10 != null) {
            if (eVar == null) {
                C4192A.k(a10, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", (String) null, 4, (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            if (z10) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("try_login_activity", str);
            String b10 = eVar.b();
            if (eVar.s()) {
                str2 = "foa_mobile_login_complete";
            } else {
                str2 = "fb_mobile_login_complete";
            }
            a10.f(b10, hashMap, aVar, map, exc, str2);
        }
    }

    /* access modifiers changed from: private */
    public final void y(Context context, C4214u.e eVar) {
        String str;
        C4192A a10 = e.f49598a.a(context);
        if (a10 != null && eVar != null) {
            if (eVar.s()) {
                str = "foa_mobile_login_start";
            } else {
                str = "fb_mobile_login_start";
            }
            a10.i(eVar, str);
        }
    }

    public final void B(Activity activity) {
        C6496s.h(activity, "activity");
        O(new a(activity), k());
    }

    public final void C(C3324n nVar, r rVar) {
        if (nVar instanceof C3889e) {
            ((C3889e) nVar).c(C3889e.c.Login.b(), new C4193B(this, rVar));
            return;
        }
        throw new C3459v("Unexpected CallbackManager, please use the provided Factory.");
    }

    public final D F(String str) {
        C6496s.h(str, "authType");
        this.f49586d = str;
        return this;
    }

    public final D G(C4199e eVar) {
        C6496s.h(eVar, "defaultAudience");
        this.f49584b = eVar;
        return this;
    }

    public final D I(boolean z10) {
        this.f49590h = z10;
        return this;
    }

    public final D J(C4213t tVar) {
        C6496s.h(tVar, "loginBehavior");
        this.f49583a = tVar;
        return this;
    }

    public final D K(G g10) {
        C6496s.h(g10, "targetApp");
        this.f49589g = g10;
        return this;
    }

    public final D L(String str) {
        this.f49587e = str;
        return this;
    }

    public final D M(boolean z10) {
        this.f49588f = z10;
        return this;
    }

    public final D N(boolean z10) {
        this.f49591i = z10;
        return this;
    }

    public final c i(C3324n nVar, String str) {
        return new c(nVar, str);
    }

    /* access modifiers changed from: protected */
    public C4214u.e j(v vVar) {
        String a10;
        C6496s.h(vVar, "loginConfig");
        C4195a aVar = C4195a.S256;
        try {
            a10 = K.b(vVar.a(), aVar);
        } catch (C3459v unused) {
            aVar = C4195a.PLAIN;
            a10 = vVar.a();
        }
        C4195a aVar2 = aVar;
        String str = a10;
        C4213t tVar = this.f49583a;
        Set j12 = C6565s.j1(vVar.c());
        C4199e eVar = this.f49584b;
        String str2 = this.f49586d;
        String m10 = I.m();
        String uuid = UUID.randomUUID().toString();
        C6496s.g(uuid, "randomUUID().toString()");
        C4214u.e eVar2 = new C4214u.e(tVar, j12, eVar, str2, m10, uuid, this.f49589g, vVar.b(), vVar.a(), str, aVar2);
        eVar2.G(C3286a.f39402l.g());
        eVar2.B(this.f49587e);
        eVar2.J(this.f49588f);
        eVar2.y(this.f49590h);
        eVar2.K(this.f49591i);
        return eVar2;
    }

    /* access modifiers changed from: protected */
    public C4214u.e k() {
        C4213t tVar = C4213t.DIALOG_ONLY;
        HashSet hashSet = new HashSet();
        C4199e eVar = this.f49584b;
        String m10 = I.m();
        String uuid = UUID.randomUUID().toString();
        C6496s.g(uuid, "randomUUID().toString()");
        C4214u.e eVar2 = new C4214u.e(tVar, hashSet, eVar, "reauthorize", m10, uuid, this.f49589g, (String) null, (String) null, (String) null, (C4195a) null, 1920, (DefaultConstructorMarker) null);
        eVar2.y(this.f49590h);
        eVar2.K(this.f49591i);
        return eVar2;
    }

    public final C4199e m() {
        return this.f49584b;
    }

    /* access modifiers changed from: protected */
    public Intent n(C4214u.e eVar) {
        C6496s.h(eVar, "request");
        Intent intent = new Intent();
        intent.setClass(I.l(), FacebookActivity.class);
        intent.setAction(eVar.j().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", eVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public final C4213t p() {
        return this.f49583a;
    }

    public final void r(Activity activity, Collection collection) {
        C6496s.h(activity, "activity");
        t(activity, new v(collection, (String) null, 2, (DefaultConstructorMarker) null));
    }

    public final void s(Activity activity, Collection collection, String str) {
        C6496s.h(activity, "activity");
        C4214u.e j10 = j(new v(collection, (String) null, 2, (DefaultConstructorMarker) null));
        if (str != null) {
            j10.w(str);
        }
        O(new a(activity), j10);
    }

    public final void t(Activity activity, v vVar) {
        C6496s.h(activity, "activity");
        C6496s.h(vVar, "loginConfig");
        if (activity instanceof C2003f) {
            Log.w(f49581l, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        O(new a(activity), j(vVar));
    }

    public final void u(Fragment fragment, Collection collection, String str) {
        C6496s.h(fragment, "fragment");
        w(new B(fragment), collection, str);
    }

    public final void v(C1769q qVar, Collection collection, String str) {
        C6496s.h(qVar, "fragment");
        w(new B(qVar), collection, str);
    }

    public final void w(B b10, Collection collection, String str) {
        C6496s.h(b10, "fragment");
        C4214u.e j10 = j(new v(collection, (String) null, 2, (DefaultConstructorMarker) null));
        if (str != null) {
            j10.w(str);
        }
        O(new d(b10), j10);
    }

    public void x() {
        C3286a.f39402l.i((C3286a) null);
        C3320j.f40102f.a((C3320j) null);
        W.f39382h.c((W) null);
        H(false);
    }

    public boolean z(int i10, Intent intent, r rVar) {
        boolean z10;
        Map map;
        C4214u.f.a aVar;
        C4214u.e eVar;
        C3320j jVar;
        C3286a aVar2;
        C3320j jVar2;
        int i11 = i10;
        Intent intent2 = intent;
        C4214u.f.a aVar3 = C4214u.f.a.ERROR;
        C3459v vVar = null;
        boolean z11 = false;
        if (intent2 != null) {
            intent2.setExtrasClassLoader(C4214u.f.class.getClassLoader());
            C4214u.f fVar = (C4214u.f) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (fVar != null) {
                eVar = fVar.f49845f;
                C4214u.f.a aVar4 = fVar.f49840a;
                if (i11 != -1) {
                    if (i11 == 0) {
                        z11 = true;
                    }
                    aVar2 = null;
                    jVar2 = null;
                } else if (aVar4 == C4214u.f.a.SUCCESS) {
                    aVar2 = fVar.f49841b;
                    jVar2 = fVar.f49842c;
                } else {
                    jVar2 = null;
                    vVar = new C3325o(fVar.f49843d);
                    aVar2 = null;
                }
                map = fVar.f49846g;
                z10 = z11;
                jVar = jVar2;
                aVar = aVar4;
                if (vVar == null && aVar2 == null && !z10) {
                    vVar = new C3459v("Unexpected call to LoginManager.onActivityResult");
                }
                C3459v vVar2 = vVar;
                C4214u.e eVar2 = eVar;
                q((Context) null, aVar, map, vVar2, true, eVar2);
                l(aVar2, jVar, eVar2, vVar2, z10, rVar);
                return true;
            }
        } else if (i11 == 0) {
            aVar = C4214u.f.a.CANCEL;
            z10 = true;
            aVar2 = null;
            jVar = null;
            eVar = null;
            map = null;
            vVar = new C3459v("Unexpected call to LoginManager.onActivityResult");
            C3459v vVar22 = vVar;
            C4214u.e eVar22 = eVar;
            q((Context) null, aVar, map, vVar22, true, eVar22);
            l(aVar2, jVar, eVar22, vVar22, z10, rVar);
            return true;
        }
        aVar = aVar3;
        aVar2 = null;
        jVar = null;
        eVar = null;
        map = null;
        z10 = false;
        vVar = new C3459v("Unexpected call to LoginManager.onActivityResult");
        C3459v vVar222 = vVar;
        C4214u.e eVar222 = eVar;
        q((Context) null, aVar, map, vVar222, true, eVar222);
        l(aVar2, jVar, eVar222, vVar222, z10, rVar);
        return true;
    }
}

package y7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import com.facebook.C3293h;
import com.facebook.C3459v;
import com.facebook.I;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.Y;
import o7.N;
import o7.W;
import org.json.JSONException;
import org.json.JSONObject;
import y7.C4214u;
import y7.E;

/* renamed from: y7.q  reason: case insensitive filesystem */
public final class C4211q extends E {
    public static final Parcelable.Creator<C4211q> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final b f49782f = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private C4209o f49783d;

    /* renamed from: e  reason: collision with root package name */
    private final String f49784e = "get_token";

    /* renamed from: y7.q$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C4211q createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new C4211q(parcel);
        }

        /* renamed from: b */
        public C4211q[] newArray(int i10) {
            return new C4211q[i10];
        }
    }

    /* renamed from: y7.q$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: y7.q$c */
    public static final class c implements W.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f49785a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4211q f49786b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4214u.e f49787c;

        c(Bundle bundle, C4211q qVar, C4214u.e eVar) {
            this.f49785a = bundle;
            this.f49786b = qVar;
            this.f49787c = eVar;
        }

        public void a(JSONObject jSONObject) {
            String str;
            try {
                Bundle bundle = this.f49785a;
                if (jSONObject != null) {
                    str = jSONObject.getString("id");
                } else {
                    str = null;
                }
                bundle.putString("com.facebook.platform.extra.USER_ID", str);
                this.f49786b.v(this.f49787c, this.f49785a);
            } catch (JSONException e10) {
                this.f49786b.d().f(C4214u.f.c.d(C4214u.f.f49839i, this.f49786b.d().p(), "Caught exception", e10.getMessage(), (String) null, 8, (Object) null));
            }
        }

        public void b(C3459v vVar) {
            String str;
            C4214u d10 = this.f49786b.d();
            C4214u.f.c cVar = C4214u.f.f49839i;
            C4214u.e p10 = this.f49786b.d().p();
            if (vVar != null) {
                str = vVar.getMessage();
            } else {
                str = null;
            }
            d10.f(C4214u.f.c.d(cVar, p10, "Caught exception", str, (String) null, 8, (Object) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4211q(C4214u uVar) {
        super(uVar);
        C6496s.h(uVar, "loginClient");
    }

    /* access modifiers changed from: private */
    public static final void w(C4211q qVar, C4214u.e eVar, Bundle bundle) {
        C6496s.h(qVar, "this$0");
        C6496s.h(eVar, "$request");
        qVar.u(eVar, bundle);
    }

    public void b() {
        C4209o oVar = this.f49783d;
        if (oVar != null) {
            oVar.b();
            oVar.f((N.b) null);
            this.f49783d = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f49784e;
    }

    public int p(C4214u.e eVar) {
        C6496s.h(eVar, "request");
        Context i10 = d().i();
        if (i10 == null) {
            i10 = I.l();
        }
        C4209o oVar = new C4209o(i10, eVar);
        this.f49783d = oVar;
        if (!oVar.g()) {
            return 0;
        }
        d().u();
        C4210p pVar = new C4210p(this, eVar);
        C4209o oVar2 = this.f49783d;
        if (oVar2 == null) {
            return 1;
        }
        oVar2.f(pVar);
        return 1;
    }

    public final void s(C4214u.e eVar, Bundle bundle) {
        C6496s.h(eVar, "request");
        C6496s.h(bundle, "result");
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.length() == 0) {
            d().u();
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            if (string2 != null) {
                C6496s.g(string2, "checkNotNull(result.getS…ocol.EXTRA_ACCESS_TOKEN))");
                W.H(string2, new c(bundle, this, eVar));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        v(eVar, bundle);
    }

    public final void u(C4214u.e eVar, Bundle bundle) {
        C6496s.h(eVar, "request");
        C4209o oVar = this.f49783d;
        if (oVar != null) {
            oVar.f((N.b) null);
        }
        this.f49783d = null;
        d().v();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = C6565s.n();
            }
            Set<String> o10 = eVar.o();
            if (o10 == null) {
                o10 = Y.e();
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (o10.contains("openid") && (string == null || string.length() == 0)) {
                d().L();
                return;
            } else if (stringArrayList.containsAll(o10)) {
                s(eVar, bundle);
                return;
            } else {
                HashSet hashSet = new HashSet();
                for (String str : o10) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    a("new_permissions", TextUtils.join(f.f37529a, hashSet));
                }
                eVar.F(hashSet);
            }
        }
        d().L();
    }

    public final void v(C4214u.e eVar, Bundle bundle) {
        C4214u.f fVar;
        C6496s.h(eVar, "request");
        C6496s.h(bundle, "result");
        try {
            E.a aVar = E.f49600c;
            fVar = C4214u.f.f49839i.b(eVar, aVar.a(bundle, C3293h.FACEBOOK_APPLICATION_SERVICE, eVar.a()), aVar.c(bundle, eVar.n()));
        } catch (C3459v e10) {
            fVar = C4214u.f.c.d(C4214u.f.f49839i, d().p(), (String) null, e10.getMessage(), (String) null, 8, (Object) null);
        }
        d().g(fVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4211q(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "source");
    }
}

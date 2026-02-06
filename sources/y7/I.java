package y7;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.C1769q;
import com.facebook.C3293h;
import com.facebook.C3459v;
import com.facebook.C3462y;
import com.facebook.K;
import g.C2000c;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import o7.P;
import o7.W;
import y7.C4214u;
import y7.E;

public abstract class I extends E {

    /* renamed from: d  reason: collision with root package name */
    private final C3293h f49615d = C3293h.FACEBOOK_APPLICATION_WEB;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(C4214u uVar) {
        super(uVar);
        C6496s.h(uVar, "loginClient");
    }

    private final boolean G(Intent intent) {
        List<ResolveInfo> queryIntentActivities = com.facebook.I.l().getPackageManager().queryIntentActivities(intent, 65536);
        C6496s.g(queryIntentActivities, "getApplicationContext()\n…nager.MATCH_DEFAULT_ONLY)");
        return !queryIntentActivities.isEmpty();
    }

    private final void J(C4214u.e eVar, Bundle bundle) {
        if (!bundle.containsKey("code") || W.e0(bundle.getString("code"))) {
            F(eVar, bundle);
        } else {
            com.facebook.I.t().execute(new H(this, eVar, bundle));
        }
    }

    /* access modifiers changed from: private */
    public static final void K(I i10, C4214u.e eVar, Bundle bundle) {
        C6496s.h(i10, "this$0");
        C6496s.h(eVar, "$request");
        C6496s.h(bundle, "$extras");
        try {
            i10.F(eVar, i10.k(eVar, bundle));
        } catch (K e10) {
            C3462y c10 = e10.c();
            i10.B(eVar, c10.e(), c10.d(), String.valueOf(c10.c()));
        } catch (C3459v e11) {
            i10.B(eVar, (String) null, e11.getMessage(), (String) null);
        }
    }

    private final void s(C4214u.f fVar) {
        if (fVar != null) {
            d().g(fVar);
        } else {
            d().L();
        }
    }

    /* access modifiers changed from: protected */
    public void B(C4214u.e eVar, String str, String str2, String str3) {
        if (str != null && C6496s.c(str, "logged_out")) {
            C4197c.f49721l = true;
            s((C4214u.f) null);
        } else if (C6565s.e0(P.d(), str)) {
            s((C4214u.f) null);
        } else if (C6565s.e0(P.e(), str)) {
            s(C4214u.f.f49839i.a(eVar, (String) null));
        } else {
            s(C4214u.f.f49839i.c(eVar, str, str2, str3));
        }
    }

    /* access modifiers changed from: protected */
    public void F(C4214u.e eVar, Bundle bundle) {
        C6496s.h(eVar, "request");
        C6496s.h(bundle, "extras");
        try {
            E.a aVar = E.f49600c;
            s(C4214u.f.f49839i.b(eVar, aVar.b(eVar.o(), bundle, w(), eVar.a()), aVar.d(bundle, eVar.n())));
        } catch (C3459v e10) {
            s(C4214u.f.c.d(C4214u.f.f49839i, eVar, (String) null, e10.getMessage(), (String) null, 8, (Object) null));
        }
    }

    /* access modifiers changed from: protected */
    public boolean L(Intent intent, int i10) {
        y yVar;
        C2000c H10;
        if (intent == null || !G(intent)) {
            return false;
        }
        C1769q k10 = d().k();
        C6514M m10 = null;
        if (k10 instanceof y) {
            yVar = (y) k10;
        } else {
            yVar = null;
        }
        if (!(yVar == null || (H10 = yVar.H()) == null)) {
            H10.b(intent);
            m10 = C6514M.f71813a;
        }
        if (m10 == null) {
            return false;
        }
        return true;
    }

    public boolean j(int i10, int i11, Intent intent) {
        String str;
        C4214u.e p10 = d().p();
        if (intent == null) {
            s(C4214u.f.f49839i.a(p10, "Operation canceled"));
        } else if (i11 == 0) {
            y(p10, intent);
        } else if (i11 != -1) {
            s(C4214u.f.c.d(C4214u.f.f49839i, p10, "Unexpected resultCode from authorization.", (String) null, (String) null, 8, (Object) null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                s(C4214u.f.c.d(C4214u.f.f49839i, p10, "Unexpected null from returned authorization data.", (String) null, (String) null, 8, (Object) null));
                return true;
            }
            String u10 = u(extras);
            Object obj = extras.get("error_code");
            if (obj != null) {
                str = obj.toString();
            } else {
                str = null;
            }
            String v10 = v(extras);
            String string = extras.getString("e2e");
            if (!W.e0(string)) {
                h(string);
            }
            if (u10 == null && str == null && v10 == null && p10 != null) {
                J(p10, extras);
            } else {
                B(p10, u10, v10, str);
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public String u(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR)) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString("error_type");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String v(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("error_message")) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString("error_description");
        }
        return null;
    }

    public C3293h w() {
        return this.f49615d;
    }

    /* access modifiers changed from: protected */
    public void y(C4214u.e eVar, Intent intent) {
        String str;
        Object obj;
        C6496s.h(intent, "data");
        Bundle extras = intent.getExtras();
        String u10 = u(extras);
        if (extras == null || (obj = extras.get("error_code")) == null) {
            str = null;
        } else {
            str = obj.toString();
        }
        if (C6496s.c(P.c(), str)) {
            s(C4214u.f.f49839i.c(eVar, u10, v(extras), str));
            return;
        }
        s(C4214u.f.f49839i.a(eVar, u10));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(Parcel parcel) {
        super(parcel);
        C6496s.h(parcel, "source");
    }
}

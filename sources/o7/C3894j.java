package o7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.C3324n;
import com.facebook.C3459v;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.I;
import g.C2000c;
import g.C2002e;
import h.C2012a;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;
import lf.C6514M;
import o7.C3906w;
import o7.M;

/* renamed from: o7.j  reason: case insensitive filesystem */
public final class C3894j {

    /* renamed from: a  reason: collision with root package name */
    public static final C3894j f47261a = new C3894j();

    /* renamed from: o7.j$a */
    public interface a {
        Bundle a();

        Bundle getParameters();
    }

    /* renamed from: o7.j$b */
    public static final class b extends C2012a {
        b() {
        }

        /* renamed from: a */
        public Intent createIntent(Context context, Intent intent) {
            C6496s.h(context, "context");
            C6496s.h(intent, MetricTracker.Object.INPUT);
            return intent;
        }

        /* renamed from: b */
        public Pair parseResult(int i10, Intent intent) {
            Pair create = Pair.create(Integer.valueOf(i10), intent);
            C6496s.g(create, "create(resultCode, intent)");
            return create;
        }
    }

    private C3894j() {
    }

    public static final boolean b(C3892h hVar) {
        C6496s.h(hVar, "feature");
        if (c(hVar).d() != -1) {
            return true;
        }
        return false;
    }

    public static final M.f c(C3892h hVar) {
        C6496s.h(hVar, "feature");
        String m10 = I.m();
        String b10 = hVar.b();
        return M.u(b10, f47261a.d(m10, b10, hVar));
    }

    private final int[] d(String str, String str2, C3892h hVar) {
        int[] c10;
        C3906w.b a10 = C3906w.f47355G.a(str, str2, hVar.name());
        if (a10 != null && (c10 = a10.c()) != null) {
            return c10;
        }
        return new int[]{hVar.a()};
    }

    public static final void e(C3885a aVar, Activity activity) {
        C6496s.h(aVar, "appCall");
        C6496s.h(activity, "activity");
        activity.startActivityForResult(aVar.e(), aVar.d());
        aVar.f();
    }

    public static final void f(C3885a aVar, C2002e eVar, C3324n nVar) {
        C6496s.h(aVar, "appCall");
        C6496s.h(eVar, "registry");
        Intent e10 = aVar.e();
        if (e10 != null) {
            n(eVar, nVar, e10, aVar.d());
            aVar.f();
        }
    }

    public static final void g(C3885a aVar, B b10) {
        C6496s.h(aVar, "appCall");
        C6496s.h(b10, "fragmentWrapper");
        b10.d(aVar.e(), aVar.d());
        aVar.f();
    }

    public static final void h(C3885a aVar) {
        C6496s.h(aVar, "appCall");
        l(aVar, new C3459v("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void i(C3885a aVar, String str, Bundle bundle) {
        C6496s.h(aVar, "appCall");
        X.e(I.l(), C3891g.b());
        X.h(I.l());
        Intent intent = new Intent(I.l(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f39267d, str);
        intent.putExtra(CustomTabMainActivity.f39268e, bundle);
        intent.putExtra(CustomTabMainActivity.f39269f, C3891g.a());
        M.D(intent, aVar.c().toString(), str, M.x(), (Bundle) null);
        aVar.g(intent);
    }

    public static final void j(C3885a aVar, C3459v vVar) {
        C6496s.h(aVar, "appCall");
        if (vVar != null) {
            X.f(I.l());
            Intent intent = new Intent();
            intent.setClass(I.l(), FacebookActivity.class);
            intent.setAction("PassThrough");
            M.D(intent, aVar.c().toString(), (String) null, M.x(), M.i(vVar));
            aVar.g(intent);
        }
    }

    public static final void k(C3885a aVar, a aVar2, C3892h hVar) {
        Bundle bundle;
        C6496s.h(aVar, "appCall");
        C6496s.h(aVar2, "parameterProvider");
        C6496s.h(hVar, "feature");
        Context l10 = I.l();
        String b10 = hVar.b();
        M.f c10 = c(hVar);
        int d10 = c10.d();
        if (d10 != -1) {
            if (M.C(d10)) {
                bundle = aVar2.getParameters();
            } else {
                bundle = aVar2.a();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Intent l11 = M.l(l10, aVar.c().toString(), b10, c10, bundle);
            if (l11 != null) {
                aVar.g(l11);
                return;
            }
            throw new C3459v("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new C3459v("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    public static final void l(C3885a aVar, C3459v vVar) {
        C6496s.h(aVar, "appCall");
        j(aVar, vVar);
    }

    public static final void m(C3885a aVar, String str, Bundle bundle) {
        C6496s.h(aVar, "appCall");
        X.f(I.l());
        X.h(I.l());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, bundle);
        Intent intent = new Intent();
        M.D(intent, aVar.c().toString(), str, M.x(), bundle2);
        intent.setClass(I.l(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.g(intent);
    }

    public static final void n(C2002e eVar, C3324n nVar, Intent intent, int i10) {
        C6496s.h(eVar, "registry");
        C6496s.h(intent, "intent");
        N n10 = new N();
        C2000c m10 = eVar.m("facebook-dialog-request-" + i10, new b(), new C3893i(nVar, i10, n10));
        n10.f71759a = m10;
        if (m10 != null) {
            m10.b(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void o(C3324n nVar, int i10, N n10, Pair pair) {
        C6496s.h(n10, "$launcher");
        if (nVar == null) {
            nVar = new C3889e();
        }
        Object obj = pair.first;
        C6496s.g(obj, "result.first");
        nVar.a(i10, ((Number) obj).intValue(), (Intent) pair.second);
        C2000c cVar = (C2000c) n10.f71759a;
        if (cVar != null) {
            synchronized (cVar) {
                cVar.d();
                n10.f71759a = null;
                C6514M m10 = C6514M.f71813a;
            }
        }
    }
}

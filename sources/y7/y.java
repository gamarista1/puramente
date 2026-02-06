package y7;

import P5.d;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import g.C1998a;
import g.C2000c;
import h.C2015d;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import y7.C4214u;
import yf.C6798l;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 I2\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0003J)\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010\u0017J\u000f\u0010.\u001a\u00020\bH\u0014¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\bH\u0014¢\u0006\u0004\b/\u0010\u0003R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010<\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00188\u0006@BX.¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001aR0\u0010B\u001a\b\u0012\u0004\u0012\u00020(0=2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(0=8\u0006@BX.¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020 8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020%8UX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Ly7/y;", "Landroidx/fragment/app/q;", "<init>", "()V", "Landroidx/fragment/app/v;", "activity", "Lkotlin/Function1;", "Lg/a;", "Llf/M;", "K", "(Landroidx/fragment/app/v;)Lyf/l;", "Ly7/u$f;", "outcome", "P", "(Ly7/u$f;)V", "S", "L", "Landroid/app/Activity;", "M", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Ly7/u;", "G", "()Ly7/u;", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "outState", "onSaveInstanceState", "R", "Q", "", "a", "Ljava/lang/String;", "callingPackage", "Ly7/u$e;", "b", "Ly7/u$e;", "request", "<set-?>", "c", "Ly7/u;", "J", "loginClient", "Lg/c;", "d", "Lg/c;", "H", "()Lg/c;", "launcher", "e", "Landroid/view/View;", "progressBar", "I", "()I", "layoutResId", "f", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class y extends C1769q {

    /* renamed from: f  reason: collision with root package name */
    public static final a f49859f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private String f49860a;

    /* renamed from: b  reason: collision with root package name */
    private C4214u.e f49861b;

    /* renamed from: c  reason: collision with root package name */
    private C4214u f49862c;

    /* renamed from: d  reason: collision with root package name */
    private C2000c f49863d;

    /* renamed from: e  reason: collision with root package name */
    private View f49864e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f49865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1773v f49866b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(y yVar, C1773v vVar) {
            super(1);
            this.f49865a = yVar;
            this.f49866b = vVar;
        }

        public final void a(C1998a aVar) {
            C6496s.h(aVar, "result");
            if (aVar.b() == -1) {
                this.f49865a.J().y(C4214u.f49807m.b(), aVar.b(), aVar.a());
            } else {
                this.f49866b.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1998a) obj);
            return C6514M.f71813a;
        }
    }

    public static final class c implements C4214u.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f49867a;

        c(y yVar) {
            this.f49867a = yVar;
        }

        public void a() {
            this.f49867a.S();
        }

        public void b() {
            this.f49867a.L();
        }
    }

    private final C6798l K(C1773v vVar) {
        return new b(this, vVar);
    }

    /* access modifiers changed from: private */
    public final void L() {
        View view = this.f49864e;
        if (view == null) {
            C6496s.v("progressBar");
            view = null;
        }
        view.setVisibility(8);
        Q();
    }

    private final void M(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f49860a = callingActivity.getPackageName();
        }
    }

    /* access modifiers changed from: private */
    public static final void N(y yVar, C4214u.f fVar) {
        C6496s.h(yVar, "this$0");
        C6496s.h(fVar, "outcome");
        yVar.P(fVar);
    }

    /* access modifiers changed from: private */
    public static final void O(C6798l lVar, C1998a aVar) {
        C6496s.h(lVar, "$tmp0");
        lVar.invoke(aVar);
    }

    private final void P(C4214u.f fVar) {
        int i10;
        this.f49861b = null;
        if (fVar.f49840a == C4214u.f.a.CANCEL) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", fVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        C1773v activity = getActivity();
        if (isAdded() && activity != null) {
            activity.setResult(i10, intent);
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    public final void S() {
        View view = this.f49864e;
        if (view == null) {
            C6496s.v("progressBar");
            view = null;
        }
        view.setVisibility(0);
        R();
    }

    /* access modifiers changed from: protected */
    public C4214u G() {
        return new C4214u((C1769q) this);
    }

    public final C2000c H() {
        C2000c cVar = this.f49863d;
        if (cVar != null) {
            return cVar;
        }
        C6496s.v(MetricTracker.Object.LAUNCHER);
        return null;
    }

    /* access modifiers changed from: protected */
    public int I() {
        return d.f33475c;
    }

    public final C4214u J() {
        C4214u uVar = this.f49862c;
        if (uVar != null) {
            return uVar;
        }
        C6496s.v("loginClient");
        return null;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        J().y(i10, i11, intent);
    }

    public void onCreate(Bundle bundle) {
        C4214u uVar;
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            uVar = (C4214u) bundle.getParcelable("loginClient");
        } else {
            uVar = null;
        }
        if (uVar != null) {
            uVar.F(this);
        } else {
            uVar = G();
        }
        this.f49862c = uVar;
        J().G(new w(this));
        C1773v activity = getActivity();
        if (activity != null) {
            M(activity);
            Intent intent = activity.getIntent();
            if (!(intent == null || (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) == null)) {
                this.f49861b = (C4214u.e) bundleExtra.getParcelable("request");
            }
            C2000c registerForActivityResult = registerForActivityResult(new C2015d(), new x(K(activity)));
            C6496s.g(registerForActivityResult, "registerForActivityResul…andlerCallback(activity))");
            this.f49863d = registerForActivityResult;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C6496s.h(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(I(), viewGroup, false);
        View findViewById = inflate.findViewById(P5.c.f33470d);
        C6496s.g(findViewById, "view.findViewById<View>(…in_fragment_progress_bar)");
        this.f49864e = findViewById;
        J().B(new c(this));
        return inflate;
    }

    public void onDestroy() {
        J().c();
        super.onDestroy();
    }

    public void onPause() {
        View view;
        super.onPause();
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(P5.c.f33470d);
        } else {
            view = null;
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f49860a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            C1773v activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        J().J(this.f49861b);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C6496s.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", J());
    }

    /* access modifiers changed from: protected */
    public void Q() {
    }

    /* access modifiers changed from: protected */
    public void R() {
    }
}

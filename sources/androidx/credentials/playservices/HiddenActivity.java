package androidx.credentials.playservices;

import B1.f;
import B1.h;
import Ja.C4315a;
import La.C4361u;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import ra.C5184b;
import ra.C5185c;
import ra.C5188f;
import ra.g;
import ra.i;
import ra.j;
import yf.C6798l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 $2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\bJ)\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Llf/M;", "x", "(Landroid/os/Bundle;)V", "r", "Landroid/os/ResultReceiver;", "resultReceiver", "", "errName", "errMsg", "y", "(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V", "u", "l", "o", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "a", "Landroid/os/ResultReceiver;", "", "b", "Z", "mWaitingForActivityResult", "c", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class HiddenActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16236c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f16237a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f16238b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HiddenActivity f16239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16240b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(HiddenActivity hiddenActivity, int i10) {
            super(1);
            this.f16239a = hiddenActivity;
            this.f16240b = i10;
        }

        public final void a(C5185c cVar) {
            try {
                this.f16239a.f16238b = true;
                this.f16239a.startIntentSenderForResult(cVar.o0().getIntentSender(), this.f16240b, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (IntentSender.SendIntentException e10) {
                HiddenActivity hiddenActivity = this.f16239a;
                ResultReceiver i10 = hiddenActivity.f16237a;
                C6496s.e(i10);
                hiddenActivity.y(i10, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e10.getMessage());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5185c) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HiddenActivity f16241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16242b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(HiddenActivity hiddenActivity, int i10) {
            super(1);
            this.f16241a = hiddenActivity;
            this.f16242b = i10;
        }

        public final void a(j jVar) {
            try {
                this.f16241a.f16238b = true;
                this.f16241a.startIntentSenderForResult(jVar.o0().getIntentSender(), this.f16242b, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (IntentSender.SendIntentException e10) {
                HiddenActivity hiddenActivity = this.f16241a;
                ResultReceiver i10 = hiddenActivity.f16237a;
                C6496s.e(i10);
                hiddenActivity.y(i10, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e10.getMessage());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((j) obj);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HiddenActivity f16243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16244b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(HiddenActivity hiddenActivity, int i10) {
            super(1);
            this.f16243a = hiddenActivity;
            this.f16244b = i10;
        }

        public final void a(PendingIntent pendingIntent) {
            C6496s.h(pendingIntent, "result");
            try {
                this.f16243a.f16238b = true;
                this.f16243a.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f16244b, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (IntentSender.SendIntentException e10) {
                HiddenActivity hiddenActivity = this.f16243a;
                ResultReceiver i10 = hiddenActivity.f16237a;
                C6496s.e(i10);
                hiddenActivity.y(i10, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e10.getMessage());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingIntent) obj);
            return C6514M.f71813a;
        }
    }

    static final class e extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HiddenActivity f16245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16246b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(HiddenActivity hiddenActivity, int i10) {
            super(1);
            this.f16245a = hiddenActivity;
            this.f16246b = i10;
        }

        public final void a(PendingIntent pendingIntent) {
            try {
                this.f16245a.f16238b = true;
                this.f16245a.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f16246b, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (IntentSender.SendIntentException e10) {
                HiddenActivity hiddenActivity = this.f16245a;
                ResultReceiver i10 = hiddenActivity.f16237a;
                C6496s.e(i10);
                hiddenActivity.y(i10, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e10.getMessage());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingIntent) obj);
            return C6514M.f71813a;
        }
    }

    private final void l() {
        Task task;
        C5184b bVar = (C5184b) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (bVar != null) {
            task = g.b(this).beginSignIn(bVar).addOnSuccessListener(new B1.g(new b(this, intExtra))).addOnFailureListener(new h(this));
        } else {
            task = null;
        }
        if (task == null) {
            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void m(C6798l lVar, Object obj) {
        C6496s.h(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void n(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C6496s.h(hiddenActivity, "this$0");
        C6496s.h(exc, "e");
        if (!(exc instanceof com.google.android.gms.common.api.b) || !C1.a.f1138a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) {
            str = "GET_NO_CREDENTIALS";
        } else {
            str = "GET_INTERRUPTED";
        }
        ResultReceiver resultReceiver = hiddenActivity.f16237a;
        C6496s.e(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During begin sign in, failure response from one tap: " + exc.getMessage());
    }

    private final void o() {
        Task task;
        i iVar = (i) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (iVar != null) {
            task = g.a(this).savePassword(iVar).addOnSuccessListener(new B1.c(new c(this, intExtra))).addOnFailureListener(new B1.d(this));
        } else {
            task = null;
        }
        if (task == null) {
            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void p(C6798l lVar, Object obj) {
        C6496s.h(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void q(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C6496s.h(hiddenActivity, "this$0");
        C6496s.h(exc, "e");
        if (!(exc instanceof com.google.android.gms.common.api.b) || !C1.a.f1138a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) {
            str = "CREATE_UNKNOWN";
        } else {
            str = "CREATE_INTERRUPTED";
        }
        ResultReceiver resultReceiver = hiddenActivity.f16237a;
        C6496s.e(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During save password, found password failure response from one tap " + exc.getMessage());
    }

    private final void r() {
        Task task;
        C4361u uVar = (C4361u) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (uVar != null) {
            task = C4315a.a(this).d(uVar).addOnSuccessListener(new B1.a(new d(this, intExtra))).addOnFailureListener(new B1.b(this));
        } else {
            task = null;
        }
        if (task == null) {
            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void s(C6798l lVar, Object obj) {
        C6496s.h(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void t(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C6496s.h(hiddenActivity, "this$0");
        C6496s.h(exc, "e");
        if (!(exc instanceof com.google.android.gms.common.api.b) || !C1.a.f1138a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) {
            str = "CREATE_UNKNOWN";
        } else {
            str = "CREATE_INTERRUPTED";
        }
        ResultReceiver resultReceiver = hiddenActivity.f16237a;
        C6496s.e(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During create public key credential, fido registration failure: " + exc.getMessage());
    }

    private final void u() {
        Task task;
        C5188f fVar = (C5188f) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (fVar != null) {
            task = g.b(this).getSignInIntent(fVar).addOnSuccessListener(new B1.e(new e(this, intExtra))).addOnFailureListener(new f(this));
        } else {
            task = null;
        }
        if (task == null) {
            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void v(C6798l lVar, Object obj) {
        C6496s.h(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void w(HiddenActivity hiddenActivity, Exception exc) {
        String str;
        C6496s.h(hiddenActivity, "this$0");
        C6496s.h(exc, "e");
        if (!(exc instanceof com.google.android.gms.common.api.b) || !C1.a.f1138a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) {
            str = "GET_NO_CREDENTIALS";
        } else {
            str = "GET_INTERRUPTED";
        }
        ResultReceiver resultReceiver = hiddenActivity.f16237a;
        C6496s.e(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
    }

    private final void x(Bundle bundle) {
        if (bundle != null) {
            this.f16238b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    /* access modifiers changed from: private */
    public final void y(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(a.e.API_PRIORITY_OTHER, bundle);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i10);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f16237a;
        if (resultReceiver != null) {
            resultReceiver.send(i11, bundle);
        }
        this.f16238b = false;
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f16237a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        x(bundle);
        if (!this.f16238b) {
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals("BEGIN_SIGN_IN")) {
                            l();
                            return;
                        }
                        break;
                    case 15545322:
                        if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                            r();
                            return;
                        }
                        break;
                    case 1246634622:
                        if (stringExtra.equals("CREATE_PASSWORD")) {
                            o();
                            return;
                        }
                        break;
                    case 1980564212:
                        if (stringExtra.equals("SIGN_IN_INTENT")) {
                            u();
                            return;
                        }
                        break;
                }
            }
            Log.w("HiddenActivity", "Activity handed an unsupported type");
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C6496s.h(bundle, "outState");
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f16238b);
        super.onSaveInstanceState(bundle);
    }
}

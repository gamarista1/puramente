package o7;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.C1767o;
import androidx.fragment.app.C1773v;
import com.facebook.C3459v;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0003R$\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lo7/n;", "Landroidx/fragment/app/o;", "<init>", "()V", "Landroid/os/Bundle;", "values", "Lcom/facebook/v;", "error", "Llf/M;", "Z", "(Landroid/os/Bundle;Lcom/facebook/v;)V", "a0", "(Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "W", "Landroid/app/Dialog;", "K", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onDestroyView", "q", "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "b0", "(Landroid/app/Dialog;)V", "innerDialog", "r", "a", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o7.n  reason: case insensitive filesystem */
public final class C3898n extends C1767o {

    /* renamed from: r  reason: collision with root package name */
    public static final a f47273r = new a((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    private Dialog f47274q;

    /* renamed from: o7.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final void X(C3898n nVar, Bundle bundle, C3459v vVar) {
        C6496s.h(nVar, "this$0");
        nVar.Z(bundle, vVar);
    }

    /* access modifiers changed from: private */
    public static final void Y(C3898n nVar, Bundle bundle, C3459v vVar) {
        C6496s.h(nVar, "this$0");
        nVar.a0(bundle);
    }

    private final void Z(Bundle bundle, C3459v vVar) {
        int i10;
        C1773v activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            C6496s.g(intent, "fragmentActivity.intent");
            Intent n10 = M.n(intent, bundle, vVar);
            if (vVar == null) {
                i10 = -1;
            } else {
                i10 = 0;
            }
            activity.setResult(i10, n10);
            activity.finish();
        }
    }

    private final void a0(Bundle bundle) {
        C1773v activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtras(bundle);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public Dialog K(Bundle bundle) {
        Dialog dialog = this.f47274q;
        if (dialog == null) {
            Z((Bundle) null, (C3459v) null);
            Q(false);
            Dialog K10 = super.K(bundle);
            C6496s.g(K10, "super.onCreateDialog(savedInstanceState)");
            return K10;
        }
        C6496s.f(dialog, "null cannot be cast to non-null type android.app.Dialog");
        return dialog;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W() {
        /*
            r6 = this;
            android.app.Dialog r0 = r6.f47274q
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            androidx.fragment.app.v r0 = r6.getActivity()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = "intent"
            kotlin.jvm.internal.C6496s.g(r1, r2)
            android.os.Bundle r1 = o7.M.y(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.String r3 = "is_fallback"
            boolean r2 = r1.getBoolean(r3, r2)
        L_0x0022:
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r4 = "FacebookDialogFragment"
            r5 = 0
            if (r2 != 0) goto L_0x0060
            if (r1 == 0) goto L_0x0032
            java.lang.String r2 = "action"
            java.lang.String r2 = r1.getString(r2)
            goto L_0x0033
        L_0x0032:
            r2 = r5
        L_0x0033:
            if (r1 == 0) goto L_0x003b
            java.lang.String r5 = "params"
            android.os.Bundle r5 = r1.getBundle(r5)
        L_0x003b:
            boolean r1 = o7.W.e0(r2)
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = "Cannot start a WebDialog with an empty/missing 'actionName'"
            o7.W.l0(r4, r1)
            r0.finish()
            return
        L_0x004a:
            o7.b0$a r1 = new o7.b0$a
            kotlin.jvm.internal.C6496s.f(r2, r3)
            r1.<init>(r0, r2, r5)
            o7.l r0 = new o7.l
            r0.<init>(r6)
            o7.b0$a r0 = r1.h(r0)
            o7.b0 r0 = r0.a()
            goto L_0x00a2
        L_0x0060:
            if (r1 == 0) goto L_0x0068
            java.lang.String r2 = "url"
            java.lang.String r5 = r1.getString(r2)
        L_0x0068:
            boolean r1 = o7.W.e0(r5)
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = "Cannot start a fallback WebDialog with an empty/missing 'url'"
            o7.W.l0(r4, r1)
            r0.finish()
            return
        L_0x0077:
            kotlin.jvm.internal.U r1 = kotlin.jvm.internal.U.f71764a
            java.lang.String r1 = com.facebook.I.m()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "fb%s://bridge/"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(format, *args)"
            kotlin.jvm.internal.C6496s.g(r1, r2)
            o7.r$a r2 = o7.r.f47287q
            kotlin.jvm.internal.C6496s.f(r5, r3)
            o7.r r0 = r2.a(r0, r5, r1)
            o7.m r1 = new o7.m
            r1.<init>(r6)
            r0.B(r1)
        L_0x00a2:
            r6.f47274q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C3898n.W():void");
    }

    public final void b0(Dialog dialog) {
        this.f47274q = dialog;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C6496s.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if ((this.f47274q instanceof b0) && isResumed()) {
            Dialog dialog = this.f47274q;
            C6496s.f(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((b0) dialog).x();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        W();
    }

    public void onDestroyView() {
        Dialog H10 = H();
        if (H10 != null && getRetainInstance()) {
            H10.setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = this.f47274q;
        if (dialog instanceof b0) {
            C6496s.f(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((b0) dialog).x();
        }
    }
}

package com.facebook;

import P5.d;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.M;
import o7.W;
import t7.C4049a;
import w7.C4144a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\b\u0016\u0018\u0000  2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\f¨\u0006!"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/v;", "<init>", "()V", "Llf/M;", "E", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/fragment/app/q;", "D", "()Landroidx/fragment/app/q;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "dump", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "<set-?>", "a", "Landroidx/fragment/app/q;", "C", "currentFragment", "b", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FacebookActivity extends C1773v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39278b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f39279c = FacebookActivity.class.getName();

    /* renamed from: a  reason: collision with root package name */
    private C1769q f39280a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void E() {
        Intent intent = getIntent();
        C6496s.g(intent, "requestIntent");
        C3459v t10 = M.t(M.y(intent));
        Intent intent2 = getIntent();
        C6496s.g(intent2, "intent");
        setResult(0, M.n(intent2, (Bundle) null, t10));
        finish();
    }

    public final C1769q C() {
        return this.f39280a;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.fragment.app.q, androidx.fragment.app.o, o7.n] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.fragment.app.C1769q D() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            androidx.fragment.app.J r1 = r4.getSupportFragmentManager()
            java.lang.String r2 = "supportFragmentManager"
            kotlin.jvm.internal.C6496s.g(r1, r2)
            java.lang.String r2 = "SingleFragment"
            androidx.fragment.app.q r3 = r1.l0(r2)
            if (r3 != 0) goto L_0x0045
            java.lang.String r3 = "FacebookDialogFragment"
            java.lang.String r0 = r0.getAction()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r3, r0)
            r3 = 1
            if (r0 == 0) goto L_0x002f
            o7.n r0 = new o7.n
            r0.<init>()
            r0.setRetainInstance(r3)
            r0.T(r1, r2)
        L_0x002d:
            r3 = r0
            goto L_0x0045
        L_0x002f:
            y7.y r0 = new y7.y
            r0.<init>()
            r0.setRetainInstance(r3)
            androidx.fragment.app.T r1 = r1.p()
            int r3 = P5.c.f33469c
            androidx.fragment.app.T r1 = r1.c(r3, r0, r2)
            r1.h()
            goto L_0x002d
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookActivity.D():androidx.fragment.app.q");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!C4049a.d(this)) {
            try {
                C6496s.h(str, "prefix");
                C6496s.h(printWriter, "writer");
                C4144a.f49226a.a();
                super.dump(str, fileDescriptor, printWriter, strArr);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C6496s.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C1769q qVar = this.f39280a;
        if (qVar != null) {
            qVar.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!I.G()) {
            W.l0(f39279c, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            C6496s.g(applicationContext, "applicationContext");
            I.N(applicationContext);
        }
        setContentView(d.f33473a);
        if (C6496s.c("PassThrough", intent.getAction())) {
            E();
        } else {
            this.f39280a = D();
        }
    }
}

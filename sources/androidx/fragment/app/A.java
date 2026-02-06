package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.app.b;
import androidx.core.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.C6496s;

public abstract class A extends C1775x {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f16682a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f16683b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f16684c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16685d;

    /* renamed from: e  reason: collision with root package name */
    private final J f16686e;

    public A(Activity activity, Context context, Handler handler, int i10) {
        C6496s.h(context, "context");
        C6496s.h(handler, "handler");
        this.f16682a = activity;
        this.f16683b = context;
        this.f16684c = handler;
        this.f16685d = i10;
        this.f16686e = new K();
    }

    public final Activity e() {
        return this.f16682a;
    }

    public final Context f() {
        return this.f16683b;
    }

    public final J g() {
        return this.f16686e;
    }

    public final Handler h() {
        return this.f16684c;
    }

    public abstract void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object j();

    public abstract LayoutInflater k();

    public void l(C1769q qVar, String[] strArr, int i10) {
        C6496s.h(qVar, "fragment");
        C6496s.h(strArr, "permissions");
    }

    public abstract boolean m(String str);

    public void n(C1769q qVar, Intent intent, int i10, Bundle bundle) {
        C6496s.h(qVar, "fragment");
        C6496s.h(intent, "intent");
        if (i10 == -1) {
            c.startActivity(this.f16683b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void o(C1769q qVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        C1769q qVar2 = qVar;
        C6496s.h(qVar, "fragment");
        IntentSender intentSender2 = intentSender;
        C6496s.h(intentSender, "intent");
        if (i10 == -1) {
            Activity activity = this.f16682a;
            if (activity != null) {
                b.m(activity, intentSender, i10, intent, i11, i12, i13, bundle);
                return;
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public abstract void p();

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public A(C1773v vVar) {
        this(vVar, vVar, new Handler(), 0);
        C6496s.h(vVar, "activity");
    }
}

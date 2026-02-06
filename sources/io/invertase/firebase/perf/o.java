package io.invertase.firebase.perf;

import android.app.Activity;
import java.util.concurrent.Callable;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f71464a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71465b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f71466c;

    public /* synthetic */ o(Activity activity, String str, int i10) {
        this.f71464a = activity;
        this.f71465b = str;
        this.f71466c = i10;
    }

    public final Object call() {
        return q.p(this.f71464a, this.f71465b, this.f71466c);
    }
}

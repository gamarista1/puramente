package xa;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: xa.A  reason: case insensitive filesystem */
abstract class C5267A {

    /* renamed from: a  reason: collision with root package name */
    final int f62137a;

    /* renamed from: b  reason: collision with root package name */
    final TaskCompletionSource f62138b = new TaskCompletionSource();

    /* renamed from: c  reason: collision with root package name */
    final int f62139c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f62140d;

    C5267A(int i10, int i11, Bundle bundle) {
        this.f62137a = i10;
        this.f62139c = i11;
        this.f62140d = bundle;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public final void c(B b10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String obj2 = b10.toString();
            Log.d("MessengerIpcClient", "Failing " + obj + " with " + obj2);
        }
        this.f62138b.setException(b10);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj2 = toString();
            String valueOf = String.valueOf(obj);
            Log.d("MessengerIpcClient", "Finishing " + obj2 + " with " + valueOf);
        }
        this.f62138b.setResult(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f62139c + " id=" + this.f62137a + " oneWay=" + b() + "}";
    }
}

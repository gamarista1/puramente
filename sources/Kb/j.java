package kb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import lb.C5077j;

final class j extends C5077j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f60908b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m f60909c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(m mVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f60909c = mVar;
        this.f60908b = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, lb.f] */
    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ? e10 = this.f60909c.f60915a.e();
            String c10 = this.f60909c.f60916b;
            Bundle a10 = n.a();
            m mVar = this.f60909c;
            e10.C0(c10, a10, new l(mVar, this.f60908b, mVar.f60916b));
        } catch (RemoteException e11) {
            m.f60914c.c(e11, "error requesting in-app review for %s", this.f60909c.f60916b);
            this.f60908b.trySetException(new RuntimeException(e11));
        }
    }
}

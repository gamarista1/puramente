package xa;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

final class i extends zzf {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C5270c f62173a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(C5270c cVar, Looper looper) {
        super(looper);
        this.f62173a = cVar;
    }

    public final void handleMessage(Message message) {
        C5270c.g(this.f62173a, message);
    }
}

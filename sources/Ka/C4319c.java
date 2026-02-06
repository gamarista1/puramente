package Ka;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4511x;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Ka.c  reason: case insensitive filesystem */
final class C4319c extends zzq {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f51430a;

    C4319c(C4317a aVar, TaskCompletionSource taskCompletionSource) {
        this.f51430a = taskCompletionSource;
    }

    public final void zzb(Status status, PendingIntent pendingIntent) {
        C4511x.b(status, pendingIntent, this.f51430a);
    }
}

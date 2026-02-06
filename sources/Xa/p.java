package xa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5269b f62180a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f62181b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f62182c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f62183d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f62184e;

    public /* synthetic */ p(C5269b bVar, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f62180a = bVar;
        this.f62181b = intent;
        this.f62182c = context;
        this.f62183d = z10;
        this.f62184e = pendingResult;
    }

    public final void run() {
        this.f62180a.d(this.f62181b, this.f62182c, this.f62183d, this.f62184e);
    }
}

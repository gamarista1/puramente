package yc;

import android.content.Context;
import com.google.firebase.perf.session.SessionManager;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionManager f62318a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f62319b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C5293a f62320c;

    public /* synthetic */ c(SessionManager sessionManager, Context context, C5293a aVar) {
        this.f62318a = sessionManager;
        this.f62319b = context;
        this.f62320c = aVar;
    }

    public final void run() {
        this.f62318a.lambda$setApplicationContext$0(this.f62319b, this.f62320c);
    }
}

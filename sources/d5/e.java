package D5;

import D5.u;
import android.content.Context;
import kotlin.jvm.internal.N;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N f30410a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u.a f30411b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f30412c;

    public /* synthetic */ e(N n10, u.a aVar, Context context) {
        this.f30410a = n10;
        this.f30411b = aVar;
        this.f30412c = context;
    }

    public final void run() {
        h.f(this.f30410a, this.f30411b, this.f30412c);
    }
}

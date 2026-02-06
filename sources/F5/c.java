package F5;

import android.content.Context;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f30742a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f30743b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f30744c;

    public /* synthetic */ c(long j10, String str, Context context) {
        this.f30742a = j10;
        this.f30743b = str;
        this.f30744c = context;
    }

    public final void run() {
        g.y(this.f30742a, this.f30743b, this.f30744c);
    }
}

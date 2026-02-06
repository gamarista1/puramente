package H5;

import android.content.Context;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f31689a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f31690b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f31691c;

    public /* synthetic */ b(Context context, String str, String str2) {
        this.f31689a = context;
        this.f31690b = str;
        this.f31691c = str2;
    }

    public final void run() {
        c.h(this.f31689a, this.f31690b, this.f31691c);
    }
}

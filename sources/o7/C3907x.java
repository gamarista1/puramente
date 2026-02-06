package o7;

import android.content.Context;

/* renamed from: o7.x  reason: case insensitive filesystem */
public final /* synthetic */ class C3907x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f47393a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f47394b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f47395c;

    public /* synthetic */ C3907x(Context context, String str, String str2) {
        this.f47393a = context;
        this.f47394b = str;
        this.f47395c = str2;
    }

    public final void run() {
        C3884A.i(this.f47393a, this.f47394b, this.f47395c);
    }
}

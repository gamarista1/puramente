package o7;

import android.content.Context;

/* renamed from: o7.t  reason: case insensitive filesystem */
public final /* synthetic */ class C3903t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f47344a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f47345b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f47346c;

    public /* synthetic */ C3903t(String str, Context context, String str2) {
        this.f47344a = str;
        this.f47345b = context;
        this.f47346c = str2;
    }

    public final void run() {
        C3905v.i(this.f47344a, this.f47345b, this.f47346c);
    }
}

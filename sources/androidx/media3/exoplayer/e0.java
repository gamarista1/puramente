package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.m0;
import t2.C2613A;

public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0.a f17665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f17666b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2613A f17667c;

    public /* synthetic */ e0(m0.a aVar, Pair pair, C2613A a10) {
        this.f17665a = aVar;
        this.f17666b = pair;
        this.f17667c = a10;
    }

    public final void run() {
        this.f17665a.E(this.f17666b, this.f17667c);
    }
}

package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.m0;
import t2.C2613A;
import t2.C2658x;

public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0.a f17681a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f17682b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2658x f17683c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C2613A f17684d;

    public /* synthetic */ f0(m0.a aVar, Pair pair, C2658x xVar, C2613A a10) {
        this.f17681a = aVar;
        this.f17682b = pair;
        this.f17683c = xVar;
        this.f17684d = a10;
    }

    public final void run() {
        this.f17681a.Q(this.f17682b, this.f17683c, this.f17684d);
    }
}

package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.m0;
import t2.C2613A;
import t2.C2658x;

public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0.a f17601a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f17602b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2658x f17603c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C2613A f17604d;

    public /* synthetic */ b0(m0.a aVar, Pair pair, C2658x xVar, C2613A a10) {
        this.f17601a = aVar;
        this.f17602b = pair;
        this.f17603c = xVar;
        this.f17604d = a10;
    }

    public final void run() {
        this.f17601a.P(this.f17602b, this.f17603c, this.f17604d);
    }
}

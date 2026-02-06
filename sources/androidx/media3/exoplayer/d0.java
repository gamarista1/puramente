package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.m0;
import t2.C2613A;
import t2.C2658x;

public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0.a f17635a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f17636b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2658x f17637c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C2613A f17638d;

    public /* synthetic */ d0(m0.a aVar, Pair pair, C2658x xVar, C2613A a10) {
        this.f17635a = aVar;
        this.f17636b = pair;
        this.f17637c = xVar;
        this.f17638d = a10;
    }

    public final void run() {
        this.f17635a.U(this.f17636b, this.f17637c, this.f17638d);
    }
}

package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.m0;
import java.io.IOException;
import t2.C2613A;
import t2.C2658x;

public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0.a f17691a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f17692b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2658x f17693c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C2613A f17694d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ IOException f17695e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f17696f;

    public /* synthetic */ g0(m0.a aVar, Pair pair, C2658x xVar, C2613A a10, IOException iOException, boolean z10) {
        this.f17691a = aVar;
        this.f17692b = pair;
        this.f17693c = xVar;
        this.f17694d = a10;
        this.f17695e = iOException;
        this.f17696f = z10;
    }

    public final void run() {
        this.f17691a.R(this.f17692b, this.f17693c, this.f17694d, this.f17695e, this.f17696f);
    }
}

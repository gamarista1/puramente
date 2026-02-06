package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.m0;

public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0.a f17710a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f17711b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f17712c;

    public /* synthetic */ h0(m0.a aVar, Pair pair, Exception exc) {
        this.f17710a = aVar;
        this.f17711b = pair;
        this.f17712c = exc;
    }

    public final void run() {
        this.f17710a.L(this.f17711b, this.f17712c);
    }
}

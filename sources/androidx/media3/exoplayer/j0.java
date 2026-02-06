package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.m0;

public final /* synthetic */ class j0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0.a f17719a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f17720b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17721c;

    public /* synthetic */ j0(m0.a aVar, Pair pair, int i10) {
        this.f17719a = aVar;
        this.f17720b = pair;
        this.f17721c = i10;
    }

    public final void run() {
        this.f17719a.K(this.f17720b, this.f17721c);
    }
}

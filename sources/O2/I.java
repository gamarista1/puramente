package o2;

import android.media.AudioTrack;
import android.os.Handler;
import i2.C2081f;
import o2.C2378y;

public final /* synthetic */ class I implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AudioTrack f24810a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2378y.d f24811b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Handler f24812c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C2378y.a f24813d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C2081f f24814e;

    public /* synthetic */ I(AudioTrack audioTrack, C2378y.d dVar, Handler handler, C2378y.a aVar, C2081f fVar) {
        this.f24810a = audioTrack;
        this.f24811b = dVar;
        this.f24812c = handler;
        this.f24813d = aVar;
        this.f24814e = fVar;
    }

    public final void run() {
        M.b0(this.f24810a, this.f24811b, this.f24812c, this.f24813d, this.f24814e);
    }
}

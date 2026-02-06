package o2;

import android.media.AudioRouting;
import o2.M;

public final /* synthetic */ class Q implements AudioRouting.OnRoutingChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M.k f24928a;

    public /* synthetic */ Q(M.k kVar) {
        this.f24928a = kVar;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        this.f24928a.b(audioRouting);
    }
}

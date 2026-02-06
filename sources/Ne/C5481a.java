package Ne;

import android.media.SoundPool;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;

/* renamed from: Ne.a  reason: case insensitive filesystem */
public final /* synthetic */ class C5481a implements SoundPool.OnLoadCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SoundPlayer f64250a;

    public /* synthetic */ C5481a(SoundPlayer soundPlayer) {
        this.f64250a = soundPlayer;
    }

    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        SoundPlayer.loadSounds$lambda$0(this.f64250a, soundPool, i10, i11);
    }
}

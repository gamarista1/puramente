package expo.modules.av.player;

import Md.d;
import android.os.Bundle;
import android.widget.MediaController;

public class g implements MediaController.MediaPlayerControl {

    /* renamed from: a  reason: collision with root package name */
    private final PlayerData f60285a;

    public g(PlayerData playerData) {
        this.f60285a = playerData;
    }

    public boolean a() {
        return this.f60285a.G0();
    }

    public void b() {
        this.f60285a.W0();
    }

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return true;
    }

    public boolean canSeekForward() {
        return true;
    }

    public int getAudioSessionId() {
        return this.f60285a.x0();
    }

    public int getBufferPercentage() {
        Bundle C02 = this.f60285a.C0();
        if (!C02.getBoolean("isLoaded") || !C02.containsKey("durationMillis") || !C02.containsKey("playableDurationMillis")) {
            return 0;
        }
        return (int) ((((double) C02.getInt("playableDurationMillis")) / ((double) C02.getInt("durationMillis"))) * 100.0d);
    }

    public int getCurrentPosition() {
        Bundle C02 = this.f60285a.C0();
        if (C02.getBoolean("isLoaded")) {
            return C02.getInt("positionMillis");
        }
        return 0;
    }

    public int getDuration() {
        Bundle C02 = this.f60285a.C0();
        if (!C02.getBoolean("isLoaded") || !C02.containsKey("durationMillis")) {
            return 0;
        }
        return C02.getInt("durationMillis");
    }

    public boolean isPlaying() {
        Bundle C02 = this.f60285a.C0();
        if (!C02.getBoolean("isLoaded") || !C02.getBoolean("isPlaying")) {
            return false;
        }
        return true;
    }

    public void pause() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("shouldPlay", false);
        this.f60285a.P0(bundle, (d) null);
    }

    public void seekTo(int i10) {
        Bundle bundle = new Bundle();
        bundle.putDouble("positionMillis", (double) i10);
        this.f60285a.P0(bundle, (d) null);
    }

    public void start() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("shouldPlay", true);
        this.f60285a.P0(bundle, (d) null);
    }
}

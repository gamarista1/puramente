package expo.modules.av.player;

import Hd.o;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.Surface;
import com.amazon.a.a.o.b.f;
import expo.modules.av.player.PlayerData;
import java.io.IOException;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class b extends PlayerData implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public MediaPlayer f60266r = null;

    /* renamed from: s  reason: collision with root package name */
    private Md.b f60267s = null;

    /* renamed from: t  reason: collision with root package name */
    private boolean f60268t = false;

    /* renamed from: u  reason: collision with root package name */
    private Integer f60269u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f60270v = false;

    /* renamed from: w  reason: collision with root package name */
    private o f60271w;

    class a implements MediaPlayer.OnErrorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayerData.e f60272a;

        a(PlayerData.e eVar) {
            this.f60272a = eVar;
        }

        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            PlayerData.e eVar = this.f60272a;
            eVar.a("Load encountered an error: the OnErrorListener was called with 'what' code " + i10 + " and 'extra' code " + i11 + ".");
            return true;
        }
    }

    /* renamed from: expo.modules.av.player.b$b  reason: collision with other inner class name */
    class C0883b implements MediaPlayer.OnPreparedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f60274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PlayerData.e f60275b;

        /* renamed from: expo.modules.av.player.b$b$a */
        class a implements PlayerData.f {
            a() {
            }

            public void a() {
                C0883b bVar = C0883b.this;
                bVar.f60275b.b(b.this.C0());
            }

            public void b(String str) {
                C0883b bVar = C0883b.this;
                bVar.f60275b.b(b.this.C0());
            }
        }

        C0883b(Bundle bundle, PlayerData.e eVar) {
            this.f60274a = bundle;
            this.f60275b = eVar;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            b.this.f60266r = mediaPlayer;
            b.this.f60266r.setOnBufferingUpdateListener(b.this);
            b.this.f60266r.setOnCompletionListener(b.this);
            b.this.f60266r.setOnErrorListener(b.this);
            b.this.f60266r.setOnInfoListener(b.this);
            b.this.R0(this.f60274a, new a());
        }
    }

    b(expo.modules.av.a aVar, Context context, Uri uri, Map map) {
        super(aVar, uri, map);
        this.f60267s = aVar.m();
        this.f60271w = aVar.a();
    }

    private List a1() {
        try {
            List<String> list = (List) this.f60271w.get(URI.create(this.f60247b.toString()), (Map) null).get("Cookie");
            if (list == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String parse : list) {
                arrayList.addAll(HttpCookie.parse(parse));
            }
            return arrayList;
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }

    private void b1(float f10) {
        float f11;
        PlaybackParams playbackParams = this.f60266r.getPlaybackParams();
        if (this.f60259n) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        playbackParams.setPitch(f11);
        playbackParams.setSpeed(f10);
        playbackParams.setAudioFallbackMode(0);
        this.f60266r.setPlaybackParams(playbackParams);
        this.f60266r.start();
    }

    /* access modifiers changed from: package-private */
    public void A0(Bundle bundle) {
        int duration = this.f60266r.getDuration();
        Integer valueOf = Integer.valueOf(duration);
        if (duration < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            bundle.putInt("durationMillis", valueOf.intValue());
        }
        bundle.putInt("positionMillis", y0(Integer.valueOf(this.f60266r.getCurrentPosition()), 0, valueOf));
        Integer num = this.f60269u;
        if (num != null) {
            bundle.putInt("playableDurationMillis", y0(num, 0, valueOf));
        }
        bundle.putBoolean("isPlaying", this.f60266r.isPlaying());
        bundle.putBoolean("isBuffering", this.f60270v);
        bundle.putBoolean("isLooping", this.f60266r.isLooping());
    }

    /* access modifiers changed from: package-private */
    public String B0() {
        return "MediaPlayer";
    }

    public Pair E0() {
        if (this.f60266r == null) {
            return new Pair(0, 0);
        }
        return new Pair(Integer.valueOf(this.f60266r.getVideoWidth()), Integer.valueOf(this.f60266r.getVideoHeight()));
    }

    /* access modifiers changed from: package-private */
    public boolean F0() {
        if (this.f60266r != null) {
            return true;
        }
        return false;
    }

    public void L0(Bundle bundle, PlayerData.e eVar) {
        if (this.f60266r != null) {
            eVar.a("Load encountered an error: MediaPlayerData cannot be loaded twice.");
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            Uri uri = this.f60247b;
            if (uri.getScheme() == null) {
                int identifier = this.f60246a.getContext().getResources().getIdentifier(uri.toString(), "raw", this.f60246a.getContext().getPackageName());
                uri = Uri.parse("android.resource://" + this.f60246a.getContext().getPackageName() + "/" + identifier);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                mediaPlayer.setDataSource(this.f60246a.getContext(), uri, (Map) null, a1());
            } else {
                HashMap hashMap = new HashMap(1);
                StringBuilder sb2 = new StringBuilder();
                for (HttpCookie httpCookie : a1()) {
                    sb2.append(httpCookie.getName());
                    sb2.append(f.f37530b);
                    sb2.append(httpCookie.getValue());
                    sb2.append("; ");
                }
                sb2.append("\r\n");
                hashMap.put("Cookie", sb2.toString());
                Map map = this.f60248c;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getValue() instanceof String) {
                            hashMap.put((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                }
                mediaPlayer.setDataSource(this.f60246a.getContext(), uri, hashMap);
            }
            mediaPlayer.setOnErrorListener(new a(eVar));
            mediaPlayer.setOnPreparedListener(new C0883b(bundle, eVar));
            try {
                mediaPlayer.prepareAsync();
            } catch (Throwable th2) {
                eVar.a("Load encountered an error: an exception was thrown from prepareAsync() with message: " + th2.toString());
            }
        } catch (Throwable th3) {
            eVar.a("Load encountered an error: setDataSource() threw an exception was thrown with message: " + th3.toString());
        }
    }

    public void M() {
        float f10;
        if (this.f60266r != null) {
            float E10 = this.f60246a.E(this.f60262q, this.f60260o);
            float f11 = this.f60261p;
            if (f11 > 0.0f) {
                f10 = E10;
                E10 = (1.0f - f11) * E10;
            } else if (f11 < 0.0f) {
                f10 = (f11 + 1.0f) * E10;
            } else {
                f10 = E10;
            }
            this.f60266r.setVolume(E10, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void M0() {
        boolean z10;
        if (this.f60266r != null && U0()) {
            if (!this.f60262q) {
                this.f60246a.x();
            }
            M();
            boolean z11 = false;
            try {
                PlaybackParams playbackParams = this.f60266r.getPlaybackParams();
                float speed = playbackParams.getSpeed();
                if (playbackParams.getPitch() == 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (speed == this.f60258m && z10 == this.f60259n) {
                    z11 = true;
                }
            } catch (Throwable unused) {
            }
            if (this.f60258m != 0.0f && (!this.f60266r.isPlaying() || !z11)) {
                b1(this.f60258m);
                this.f60268t = true;
            }
            r0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean T0() {
        if (this.f60266r == null || this.f60270v) {
            return false;
        }
        return true;
    }

    public void X0(Surface surface) {
        MediaPlayer mediaPlayer = this.f60266r;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
            if (!this.f60268t && !this.f60257l) {
                this.f60266r.start();
                this.f60266r.pause();
                this.f60268t = true;
            }
        }
    }

    public void b0() {
        MediaPlayer mediaPlayer = this.f60266r;
        if (mediaPlayer != null && this.f60268t) {
            mediaPlayer.pause();
        }
        V0();
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        if (mediaPlayer.getDuration() >= 0) {
            this.f60269u = Integer.valueOf((int) (((double) mediaPlayer.getDuration()) * (((double) i10) / 100.0d)));
        } else {
            this.f60269u = null;
        }
        s0();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        t0();
        if (!mediaPlayer.isLooping()) {
            this.f60246a.v();
            V0();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        release();
        PlayerData.c cVar = this.f60254i;
        if (cVar == null) {
            return true;
        }
        cVar.a("MediaPlayer failed with 'what' code " + i10 + " and 'extra' code " + i11 + ".");
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        if (i10 == 3) {
            PlayerData.h hVar = this.f60255j;
            if (hVar != null) {
                hVar.a(new Pair(Integer.valueOf(mediaPlayer.getVideoWidth()), Integer.valueOf(mediaPlayer.getVideoHeight())));
            }
        } else if (i10 == 701) {
            this.f60270v = true;
        } else if (i10 == 702) {
            this.f60270v = false;
            r0();
        }
        s0();
        return true;
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        s0();
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        PlayerData.h hVar = this.f60255j;
        if (hVar != null) {
            hVar.a(new Pair(Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    /* access modifiers changed from: package-private */
    public void q0(Integer num, Boolean bool) {
        MediaPlayer mediaPlayer = this.f60266r;
        if (mediaPlayer != null) {
            if (bool != null) {
                mediaPlayer.setLooping(bool.booleanValue());
            }
            if (!U0()) {
                if (this.f60268t) {
                    this.f60266r.pause();
                }
                V0();
            }
            M();
            if (!(num == null || num.intValue() == this.f60266r.getCurrentPosition())) {
                this.f60266r.seekTo(num.intValue());
            }
            M0();
            return;
        }
        throw new IllegalStateException("mMediaPlayer is null!");
    }

    public synchronized void release() {
        super.release();
        V0();
        MediaPlayer mediaPlayer = this.f60266r;
        if (mediaPlayer != null) {
            mediaPlayer.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener) null);
            this.f60266r.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
            this.f60266r.setOnErrorListener((MediaPlayer.OnErrorListener) null);
            this.f60266r.setOnInfoListener((MediaPlayer.OnInfoListener) null);
            this.f60266r.stop();
            this.f60266r.release();
            this.f60266r = null;
        }
    }

    public boolean w() {
        MediaPlayer mediaPlayer = this.f60266r;
        if (mediaPlayer == null || ((!mediaPlayer.isPlaying() && !U0()) || this.f60262q)) {
            return false;
        }
        return true;
    }

    public int x0() {
        MediaPlayer mediaPlayer = this.f60266r;
        if (mediaPlayer != null) {
            return mediaPlayer.getAudioSessionId();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public double z0() {
        return ((double) this.f60266r.getCurrentPosition()) / 1000.0d;
    }
}

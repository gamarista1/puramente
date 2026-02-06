package com.tanguyantoine.react;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;
import m2.C2193b;

public class c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final d f59988a;

    /* renamed from: b  reason: collision with root package name */
    private final k f59989b;

    /* renamed from: c  reason: collision with root package name */
    private AudioManager f59990c;

    /* renamed from: d  reason: collision with root package name */
    private AudioFocusRequest f59991d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f59992e = false;

    c(ReactApplicationContext reactApplicationContext, d dVar, k kVar) {
        this.f59988a = dVar;
        this.f59989b = kVar;
        this.f59990c = (AudioManager) reactApplicationContext.getSystemService("audio");
    }

    public void a() {
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest;
        if (Build.VERSION.SDK_INT < 26 || (audioManager = this.f59990c) == null || (audioFocusRequest = this.f59991d) == null) {
            AudioManager audioManager2 = this.f59990c;
            if (audioManager2 != null) {
                audioManager2.abandonAudioFocus(this);
                return;
            }
            return;
        }
        int unused = audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public void b() {
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest a10 = C2193b.a(1).setOnAudioFocusChangeListener(this).build();
            this.f59991d = a10;
            int unused = this.f59990c.requestAudioFocus(a10);
            return;
        }
        this.f59990c.requestAudioFocus(this, 3, 1);
    }

    public void onAudioFocusChange(int i10) {
        if (i10 == -1) {
            a();
            this.f59992e = false;
            this.f59988a.j();
        } else if (i10 == -2) {
            if (MusicControlModule.INSTANCE.isPlaying()) {
                this.f59992e = true;
                this.f59988a.b();
            }
        } else if (i10 == -3) {
            this.f59989b.g(40);
        } else if (i10 == 1) {
            if (this.f59989b.a() != 100) {
                this.f59989b.g(100);
            }
            if (this.f59992e) {
                this.f59988a.c();
            }
            this.f59992e = false;
        }
    }
}

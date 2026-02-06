package com.tanguyantoine.react;

import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;

public class a extends MediaSessionCompat.b {

    /* renamed from: f  reason: collision with root package name */
    private final d f59987f;

    a(d dVar) {
        this.f59987f = dVar;
    }

    public void A() {
        this.f59987f.i();
    }

    public void C() {
        this.f59987f.j();
    }

    public void f() {
        this.f59987f.a();
    }

    public void h() {
        this.f59987f.b();
    }

    public void i() {
        this.f59987f.c();
    }

    public void r() {
        this.f59987f.d();
    }

    public void s(long j10) {
        this.f59987f.e(j10);
    }

    public void v(RatingCompat ratingCompat) {
        MusicControlModule musicControlModule = MusicControlModule.INSTANCE;
        if (musicControlModule != null) {
            int i10 = musicControlModule.ratingType;
            if (i10 == 6) {
                this.f59987f.f(ratingCompat.b());
            } else if (i10 == 1) {
                this.f59987f.g(ratingCompat.e());
            } else if (i10 == 2) {
                this.f59987f.g(ratingCompat.g());
            } else {
                this.f59987f.f(ratingCompat.d());
            }
        }
    }

    public void z() {
        this.f59987f.h();
    }
}

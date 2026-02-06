package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import f2.C1968c;
import i2.C2076a;
import i2.L;
import i2.p;
import m2.C2193b;
import m2.C2194c;
import m2.C2195d;

/* renamed from: androidx.media3.exoplayer.c  reason: case insensitive filesystem */
final class C1805c {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f17605a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17606b;

    /* renamed from: c  reason: collision with root package name */
    private b f17607c;

    /* renamed from: d  reason: collision with root package name */
    private C1968c f17608d;

    /* renamed from: e  reason: collision with root package name */
    private int f17609e;

    /* renamed from: f  reason: collision with root package name */
    private int f17610f;

    /* renamed from: g  reason: collision with root package name */
    private float f17611g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f17612h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17613i;

    /* renamed from: androidx.media3.exoplayer.c$a */
    private class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f17614a;

        public a(Handler handler) {
            this.f17614a = handler;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            C1805c.this.h(i10);
        }

        public void onAudioFocusChange(int i10) {
            this.f17614a.post(new C1804b(this, i10));
        }
    }

    /* renamed from: androidx.media3.exoplayer.c$b */
    public interface b {
        void x(float f10);

        void y(int i10);
    }

    public C1805c(Context context, Handler handler, b bVar) {
        this.f17605a = (AudioManager) C2076a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f17607c = bVar;
        this.f17606b = new a(handler);
        this.f17609e = 0;
    }

    private void a() {
        this.f17605a.abandonAudioFocus(this.f17606b);
    }

    private void b() {
        int i10 = this.f17609e;
        if (i10 != 1 && i10 != 0) {
            if (L.f22072a >= 26) {
                c();
            } else {
                a();
            }
        }
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f17612h;
        if (audioFocusRequest != null) {
            int unused = this.f17605a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(C1968c cVar) {
        if (cVar == null) {
            return 0;
        }
        switch (cVar.f19959c) {
            case 0:
                p.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case StdKeyDeserializer.TYPE_URL /*14*/:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (cVar.f19957a == 1) {
                    return 2;
                }
                break;
            case 16:
                return 4;
            default:
                p.h("AudioFocusManager", "Unidentified audio usage: " + cVar.f19959c);
                return 0;
        }
        return 3;
    }

    private void f(int i10) {
        b bVar = this.f17607c;
        if (bVar != null) {
            bVar.y(i10);
        }
    }

    /* access modifiers changed from: private */
    public void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || q()) {
                f(0);
                n(3);
                return;
            }
            n(4);
        } else if (i10 == -1) {
            f(-1);
            b();
            n(1);
        } else if (i10 != 1) {
            p.h("AudioFocusManager", "Unknown focus change type: " + i10);
        } else {
            n(2);
            f(1);
        }
    }

    private int j() {
        int i10;
        if (this.f17609e == 2) {
            return 1;
        }
        if (L.f22072a >= 26) {
            i10 = l();
        } else {
            i10 = k();
        }
        if (i10 == 1) {
            n(2);
            return 1;
        }
        n(1);
        return -1;
    }

    private int k() {
        return this.f17605a.requestAudioFocus(this.f17606b, L.j0(((C1968c) C2076a.e(this.f17608d)).f19959c), this.f17610f);
    }

    private int l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f17612h;
        if (audioFocusRequest == null || this.f17613i) {
            if (audioFocusRequest == null) {
                C2195d.a();
                builder = C2193b.a(this.f17610f);
            } else {
                C2195d.a();
                builder = C2194c.a(this.f17612h);
            }
            this.f17612h = builder.setAudioAttributes(((C1968c) C2076a.e(this.f17608d)).a().f19963a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f17606b).build();
            this.f17613i = false;
        }
        return this.f17605a.requestAudioFocus(this.f17612h);
    }

    private void n(int i10) {
        float f10;
        if (this.f17609e != i10) {
            this.f17609e = i10;
            if (i10 == 4) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.f17611g != f10) {
                this.f17611g = f10;
                b bVar = this.f17607c;
                if (bVar != null) {
                    bVar.x(f10);
                }
            }
        }
    }

    private boolean o(int i10) {
        if (i10 == 1 || this.f17610f != 1) {
            return false;
        }
        return true;
    }

    private boolean q() {
        C1968c cVar = this.f17608d;
        if (cVar == null || cVar.f19957a != 1) {
            return false;
        }
        return true;
    }

    public float g() {
        return this.f17611g;
    }

    public void i() {
        this.f17607c = null;
        b();
        n(0);
    }

    public void m(C1968c cVar) {
        if (!L.c(this.f17608d, cVar)) {
            this.f17608d = cVar;
            int e10 = e(cVar);
            this.f17610f = e10;
            boolean z10 = true;
            if (!(e10 == 1 || e10 == 0)) {
                z10 = false;
            }
            C2076a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public int p(boolean z10, int i10) {
        if (!o(i10)) {
            b();
            n(0);
            return 1;
        } else if (z10) {
            return j();
        } else {
            int i11 = this.f17609e;
            if (i11 == 1) {
                return -1;
            }
            if (i11 != 3) {
                return 1;
            }
            return 0;
        }
    }
}

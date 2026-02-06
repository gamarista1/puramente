package k9;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import ja.C3645a;
import ja.M;
import ja.s;
import m2.C2193b;
import m2.C2194c;
import m2.C2195d;
import m9.C3847e;

/* renamed from: k9.d  reason: case insensitive filesystem */
final class C3690d {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f45521a;

    /* renamed from: b  reason: collision with root package name */
    private final a f45522b;

    /* renamed from: c  reason: collision with root package name */
    private b f45523c;

    /* renamed from: d  reason: collision with root package name */
    private C3847e f45524d;

    /* renamed from: e  reason: collision with root package name */
    private int f45525e;

    /* renamed from: f  reason: collision with root package name */
    private int f45526f;

    /* renamed from: g  reason: collision with root package name */
    private float f45527g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f45528h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f45529i;

    /* renamed from: k9.d$a */
    private class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f45530a;

        public a(Handler handler) {
            this.f45530a = handler;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            C3690d.this.h(i10);
        }

        public void onAudioFocusChange(int i10) {
            this.f45530a.post(new C3688c(this, i10));
        }
    }

    /* renamed from: k9.d$b */
    public interface b {
        void x(float f10);

        void y(int i10);
    }

    public C3690d(Context context, Handler handler, b bVar) {
        this.f45521a = (AudioManager) C3645a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f45523c = bVar;
        this.f45522b = new a(handler);
        this.f45525e = 0;
    }

    private void a() {
        this.f45521a.abandonAudioFocus(this.f45522b);
    }

    private void b() {
        if (this.f45525e != 0) {
            if (M.f44981a >= 26) {
                c();
            } else {
                a();
            }
            n(0);
        }
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f45528h;
        if (audioFocusRequest != null) {
            int unused = this.f45521a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(C3847e eVar) {
        if (eVar == null) {
            return 0;
        }
        switch (eVar.f46635c) {
            case 0:
                s.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case StdKeyDeserializer.TYPE_URL:
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
                if (eVar.f46633a == 1) {
                    return 2;
                }
                break;
            case 16:
                if (M.f44981a >= 19) {
                    return 4;
                }
                return 2;
            default:
                s.i("AudioFocusManager", "Unidentified audio usage: " + eVar.f46635c);
                return 0;
        }
        return 3;
    }

    private void f(int i10) {
        b bVar = this.f45523c;
        if (bVar != null) {
            bVar.y(i10);
        }
    }

    /* access modifiers changed from: private */
    public void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || q()) {
                f(0);
                n(2);
                return;
            }
            n(3);
        } else if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 != 1) {
            s.i("AudioFocusManager", "Unknown focus change type: " + i10);
        } else {
            n(1);
            f(1);
        }
    }

    private int j() {
        int i10;
        if (this.f45525e == 1) {
            return 1;
        }
        if (M.f44981a >= 26) {
            i10 = l();
        } else {
            i10 = k();
        }
        if (i10 == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f45521a.requestAudioFocus(this.f45522b, M.g0(((C3847e) C3645a.e(this.f45524d)).f46635c), this.f45526f);
    }

    private int l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f45528h;
        if (audioFocusRequest == null || this.f45529i) {
            if (audioFocusRequest == null) {
                C2195d.a();
                builder = C2193b.a(this.f45526f);
            } else {
                C2195d.a();
                builder = C2194c.a(this.f45528h);
            }
            this.f45528h = builder.setAudioAttributes(((C3847e) C3645a.e(this.f45524d)).b().f46639a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f45522b).build();
            this.f45529i = false;
        }
        return this.f45521a.requestAudioFocus(this.f45528h);
    }

    private void n(int i10) {
        float f10;
        if (this.f45525e != i10) {
            this.f45525e = i10;
            if (i10 == 3) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.f45527g != f10) {
                this.f45527g = f10;
                b bVar = this.f45523c;
                if (bVar != null) {
                    bVar.x(f10);
                }
            }
        }
    }

    private boolean o(int i10) {
        if (i10 == 1 || this.f45526f != 1) {
            return true;
        }
        return false;
    }

    private boolean q() {
        C3847e eVar = this.f45524d;
        if (eVar == null || eVar.f46633a != 1) {
            return false;
        }
        return true;
    }

    public float g() {
        return this.f45527g;
    }

    public void i() {
        this.f45523c = null;
        b();
    }

    public void m(C3847e eVar) {
        if (!M.c(this.f45524d, eVar)) {
            this.f45524d = eVar;
            int e10 = e(eVar);
            this.f45526f = e10;
            boolean z10 = true;
            if (!(e10 == 1 || e10 == 0)) {
                z10 = false;
            }
            C3645a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            if (z10) {
                return 1;
            }
            return -1;
        } else if (z10) {
            return j();
        } else {
            return -1;
        }
    }
}

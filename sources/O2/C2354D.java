package o2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import f2.C1960A;
import f2.C1968c;
import f2.s;
import i2.C2076a;
import i2.L;
import o2.C2365k;
import o2.M;

/* renamed from: o2.D  reason: case insensitive filesystem */
public final class C2354D implements M.d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f24808a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f24809b;

    /* renamed from: o2.D$a */
    private static final class a {
        public static C2365k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return C2365k.f25012d;
            }
            return new C2365k.b().e(true).g(z10).d();
        }
    }

    /* renamed from: o2.D$b */
    private static final class b {
        public static C2365k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            boolean z11;
            int a10 = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (a10 == 0) {
                return C2365k.f25012d;
            }
            C2365k.b bVar = new C2365k.b();
            if (L.f22072a <= 32 || a10 != 2) {
                z11 = false;
            } else {
                z11 = true;
            }
            return bVar.e(true).f(z11).g(z10).d();
        }
    }

    public C2354D(Context context) {
        this.f24808a = context;
    }

    private boolean b(Context context) {
        boolean z10;
        Boolean bool = this.f24809b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                if (parameters == null || !parameters.equals("offloadVariableRateSupported=1")) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f24809b = Boolean.valueOf(z10);
            } else {
                this.f24809b = Boolean.FALSE;
            }
        } else {
            this.f24809b = Boolean.FALSE;
        }
        return this.f24809b.booleanValue();
    }

    public C2365k a(s sVar, C1968c cVar) {
        C2076a.e(sVar);
        C2076a.e(cVar);
        int i10 = L.f22072a;
        if (i10 < 29 || sVar.f20060C == -1) {
            return C2365k.f25012d;
        }
        boolean b10 = b(this.f24808a);
        int d10 = C1960A.d((String) C2076a.e(sVar.f20083n), sVar.f20079j);
        if (d10 == 0 || i10 < L.J(d10)) {
            return C2365k.f25012d;
        }
        int L10 = L.L(sVar.f20059B);
        if (L10 == 0) {
            return C2365k.f25012d;
        }
        try {
            AudioFormat K10 = L.K(sVar.f20060C, L10, d10);
            if (i10 >= 31) {
                return b.a(K10, cVar.a().f19963a, b10);
            }
            return a.a(K10, cVar.a().f19963a, b10);
        } catch (IllegalArgumentException unused) {
            return C2365k.f25012d;
        }
    }
}

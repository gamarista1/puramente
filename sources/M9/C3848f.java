package m9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4771w;
import com.google.common.collect.g0;
import com.google.common.primitives.f;
import ja.C3645a;
import ja.M;
import ja.w;
import java.util.Arrays;
import k9.C3717q0;

/* renamed from: m9.f  reason: case insensitive filesystem */
public final class C3848f {

    /* renamed from: c  reason: collision with root package name */
    public static final C3848f f46645c = new C3848f(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    private static final C3848f f46646d = new C3848f(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C4771w f46647e = new C4771w.a().f(5, 6).f(17, 6).f(7, 6).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f46648a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46649b;

    /* renamed from: m9.f$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final AudioAttributes f46650a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static int[] a() {
            C4770v.a t10 = C4770v.t();
            g0 m10 = C3848f.f46647e.keySet().m();
            while (m10.hasNext()) {
                Integer num = (Integer) m10.next();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f46650a)) {
                    t10.a(num);
                }
            }
            t10.a(2);
            return f.n(t10.k());
        }

        public static int b(int i10, int i11) {
            for (int i12 = 8; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(M.G(i12)).build(), f46650a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public C3848f(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f46648a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f46648a = new int[0];
        }
        this.f46649b = i10;
    }

    private static boolean b() {
        if (M.f44981a >= 17) {
            String str = M.f44983c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static C3848f c(Context context) {
        return d(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static C3848f d(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f46646d;
        }
        if (M.f44981a >= 29 && (M.y0(context) || M.t0(context))) {
            return new C3848f(a.a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f46645c;
        }
        return new C3848f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    private static int e(int i10) {
        int i11 = M.f44981a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(M.f44982b) && i10 == 1) {
            i10 = 2;
        }
        return M.G(i10);
    }

    private static int g(int i10, int i11) {
        if (M.f44981a >= 29) {
            return a.b(i10, i11);
        }
        return ((Integer) C3645a.e((Integer) f46647e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3848f)) {
            return false;
        }
        C3848f fVar = (C3848f) obj;
        if (!Arrays.equals(this.f46648a, fVar.f46648a) || this.f46649b != fVar.f46649b) {
            return false;
        }
        return true;
    }

    public Pair f(C3717q0 q0Var) {
        int f10 = w.f((String) C3645a.e(q0Var.f45770l), q0Var.f45767i);
        if (!f46647e.containsKey(Integer.valueOf(f10))) {
            return null;
        }
        if (f10 == 18 && !i(18)) {
            f10 = 6;
        } else if (f10 == 8 && !i(8)) {
            f10 = 7;
        }
        if (!i(f10)) {
            return null;
        }
        int i10 = q0Var.f45783y;
        if (i10 == -1 || f10 == 18) {
            int i11 = q0Var.f45784z;
            if (i11 == -1) {
                i11 = 48000;
            }
            i10 = g(f10, i11);
        } else if (i10 > this.f46649b) {
            return null;
        }
        int e10 = e(i10);
        if (e10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f10), Integer.valueOf(e10));
    }

    public boolean h(C3717q0 q0Var) {
        if (f(q0Var) != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f46649b + (Arrays.hashCode(this.f46648a) * 31);
    }

    public boolean i(int i10) {
        if (Arrays.binarySearch(this.f46648a, i10) >= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f46649b + ", supportedEncodings=" + Arrays.toString(this.f46648a) + "]";
    }
}

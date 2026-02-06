package o2;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.C4770v;
import com.google.common.collect.C4771w;
import com.google.common.collect.C4773y;
import com.google.common.collect.g0;
import com.google.common.primitives.f;
import f2.C1960A;
import f2.C1968c;
import f2.s;
import i2.C2076a;
import i2.L;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o2.e  reason: case insensitive filesystem */
public final class C2359e {

    /* renamed from: c  reason: collision with root package name */
    public static final C2359e f24987c = new C2359e(C4770v.H(C0420e.f24992d));

    /* renamed from: d  reason: collision with root package name */
    private static final C4770v f24988d = C4770v.N(2, 5, 6);

    /* renamed from: e  reason: collision with root package name */
    static final C4771w f24989e = new C4771w.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray f24990a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24991b;

    /* renamed from: o2.e$b */
    private static final class b {
        private static C4773y a() {
            C4773y.a i10 = new C4773y.a().i(8, 7);
            int i11 = L.f22072a;
            if (i11 >= 31) {
                i10.i(26, 27);
            }
            if (i11 >= 33) {
                i10.a(30);
            }
            return i10.l();
        }

        public static boolean b(AudioManager audioManager, C2364j jVar) {
            AudioDeviceInfo[] devices = jVar == null ? ((AudioManager) C2076a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{jVar.f25011a};
            C4773y a10 = a();
            for (AudioDeviceInfo type : devices) {
                if (a10.contains(Integer.valueOf(type.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: o2.e$c */
    private static final class c {
        public static C4770v a(C1968c cVar) {
            C4770v.a t10 = C4770v.t();
            g0 m10 = C2359e.f24989e.keySet().m();
            while (m10.hasNext()) {
                Integer num = (Integer) m10.next();
                int intValue = num.intValue();
                if (L.f22072a >= L.J(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), cVar.a().f19963a)) {
                    t10.a(num);
                }
            }
            t10.a(2);
            return t10.k();
        }

        public static int b(int i10, int i11, C1968c cVar) {
            for (int i12 = 10; i12 > 0; i12--) {
                int L10 = L.L(i12);
                if (L10 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(L10).build(), cVar.a().f19963a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    /* renamed from: o2.e$d */
    private static final class d {
        public static C2359e a(AudioManager audioManager, C1968c cVar) {
            return new C2359e(C2359e.c(audioManager.getDirectProfilesForAttributes(cVar.a().f19963a)));
        }

        public static C2364j b(AudioManager audioManager, C1968c cVar) {
            try {
                List a10 = ((AudioManager) C2076a.e(audioManager)).getAudioDevicesForAttributes(cVar.a().f19963a);
                if (a10.isEmpty()) {
                    return null;
                }
                return new C2364j((AudioDeviceInfo) a10.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static boolean b() {
        String str = L.f22074c;
        if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static C4770v c(List list) {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(f.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile a10 = C2355a.a(list.get(i10));
            if (a10.getEncapsulationType() != 1) {
                int a11 = a10.getFormat();
                if (L.C0(a11) || f24989e.containsKey(Integer.valueOf(a11))) {
                    if (hashMap.containsKey(Integer.valueOf(a11))) {
                        ((Set) C2076a.e((Set) hashMap.get(Integer.valueOf(a11)))).addAll(f.c(a10.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(a11), new HashSet(f.c(a10.getChannelMasks())));
                    }
                }
            }
        }
        C4770v.a t10 = C4770v.t();
        for (Map.Entry entry : hashMap.entrySet()) {
            t10.a(new C0420e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return t10.k();
    }

    private static C4770v d(int[] iArr, int i10) {
        C4770v.a t10 = C4770v.t();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int eVar : iArr) {
            t10.a(new C0420e(eVar, i10));
        }
        return t10.k();
    }

    public static C2359e e(Context context, C1968c cVar, AudioDeviceInfo audioDeviceInfo) {
        C2364j jVar;
        if (L.f22072a < 23 || audioDeviceInfo == null) {
            jVar = null;
        } else {
            jVar = new C2364j(audioDeviceInfo);
        }
        return g(context, cVar, jVar);
    }

    static C2359e f(Context context, Intent intent, C1968c cVar, C2364j jVar) {
        boolean z10;
        AudioManager audioManager = (AudioManager) C2076a.e(context.getSystemService("audio"));
        if (jVar == null) {
            if (L.f22072a >= 33) {
                jVar = d.b(audioManager, cVar);
            } else {
                jVar = null;
            }
        }
        int i10 = L.f22072a;
        if (i10 >= 33 && (L.G0(context) || L.z0(context))) {
            return d.a(audioManager, cVar);
        }
        if (i10 >= 23 && b.b(audioManager, jVar)) {
            return f24987c;
        }
        C4773y.a aVar = new C4773y.a();
        aVar.a(2);
        if (i10 < 29 || (!L.G0(context) && !L.z0(context))) {
            ContentResolver contentResolver = context.getContentResolver();
            if (Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                aVar.j(f24988d);
            }
            if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                return new C2359e(d(f.n(aVar.l()), 10));
            }
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                aVar.j(f.c(intArrayExtra));
            }
            return new C2359e(d(f.n(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        aVar.j(c.a(cVar));
        return new C2359e(d(f.n(aVar.l()), 10));
    }

    static C2359e g(Context context, C1968c cVar, C2364j jVar) {
        return f(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), cVar, jVar);
    }

    private static int h(int i10) {
        int i11 = L.f22072a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(L.f22073b) && i10 == 1) {
            i10 = 2;
        }
        return L.L(i10);
    }

    static Uri j() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2359e)) {
            return false;
        }
        C2359e eVar = (C2359e) obj;
        if (!L.s(this.f24990a, eVar.f24990a) || this.f24991b != eVar.f24991b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f24991b + (L.t(this.f24990a) * 31);
    }

    public Pair i(s sVar, C1968c cVar) {
        int d10 = C1960A.d((String) C2076a.e(sVar.f20083n), sVar.f20079j);
        if (!f24989e.containsKey(Integer.valueOf(d10))) {
            return null;
        }
        if (d10 == 18 && !l(18)) {
            d10 = 6;
        } else if ((d10 == 8 && !l(8)) || (d10 == 30 && !l(30))) {
            d10 = 7;
        }
        if (!l(d10)) {
            return null;
        }
        C0420e eVar = (C0420e) C2076a.e((C0420e) this.f24990a.get(d10));
        int i10 = sVar.f20059B;
        if (i10 == -1 || d10 == 18) {
            int i11 = sVar.f20060C;
            if (i11 == -1) {
                i11 = 48000;
            }
            i10 = eVar.b(i11, cVar);
        } else if (!sVar.f20083n.equals("audio/vnd.dts.uhd;profile=p2") || L.f22072a >= 33) {
            if (!eVar.c(i10)) {
                return null;
            }
        } else if (i10 > 10) {
            return null;
        }
        int h10 = h(i10);
        if (h10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(d10), Integer.valueOf(h10));
    }

    public boolean k(s sVar, C1968c cVar) {
        if (i(sVar, cVar) != null) {
            return true;
        }
        return false;
    }

    public boolean l(int i10) {
        return L.q(this.f24990a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f24991b + ", audioProfiles=" + this.f24990a + "]";
    }

    private C2359e(List list) {
        this.f24990a = new SparseArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0420e eVar = (C0420e) list.get(i10);
            this.f24990a.put(eVar.f24993a, eVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f24990a.size(); i12++) {
            i11 = Math.max(i11, ((C0420e) this.f24990a.valueAt(i12)).f24994b);
        }
        this.f24991b = i11;
    }

    /* renamed from: o2.e$e  reason: collision with other inner class name */
    private static final class C0420e {

        /* renamed from: d  reason: collision with root package name */
        public static final C0420e f24992d;

        /* renamed from: a  reason: collision with root package name */
        public final int f24993a;

        /* renamed from: b  reason: collision with root package name */
        public final int f24994b;

        /* renamed from: c  reason: collision with root package name */
        private final C4773y f24995c;

        static {
            C0420e eVar;
            if (L.f22072a >= 33) {
                eVar = new C0420e(2, (Set) a(10));
            } else {
                eVar = new C0420e(2, 10);
            }
            f24992d = eVar;
        }

        public C0420e(int i10, Set set) {
            this.f24993a = i10;
            C4773y x10 = C4773y.x(set);
            this.f24995c = x10;
            g0 m10 = x10.m();
            int i11 = 0;
            while (m10.hasNext()) {
                i11 = Math.max(i11, Integer.bitCount(((Integer) m10.next()).intValue()));
            }
            this.f24994b = i11;
        }

        private static C4773y a(int i10) {
            C4773y.a aVar = new C4773y.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(L.L(i11)));
            }
            return aVar.l();
        }

        public int b(int i10, C1968c cVar) {
            if (this.f24995c != null) {
                return this.f24994b;
            }
            if (L.f22072a >= 29) {
                return c.b(this.f24993a, i10, cVar);
            }
            return ((Integer) C2076a.e((Integer) C2359e.f24989e.getOrDefault(Integer.valueOf(this.f24993a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f24995c != null) {
                int L10 = L.L(i10);
                if (L10 == 0) {
                    return false;
                }
                return this.f24995c.contains(Integer.valueOf(L10));
            } else if (i10 <= this.f24994b) {
                return true;
            } else {
                return false;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0420e)) {
                return false;
            }
            C0420e eVar = (C0420e) obj;
            if (this.f24993a == eVar.f24993a && this.f24994b == eVar.f24994b && L.c(this.f24995c, eVar.f24995c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int i11 = ((this.f24993a * 31) + this.f24994b) * 31;
            C4773y yVar = this.f24995c;
            if (yVar == null) {
                i10 = 0;
            } else {
                i10 = yVar.hashCode();
            }
            return i11 + i10;
        }

        public String toString() {
            return "AudioProfile[format=" + this.f24993a + ", maxChannelCount=" + this.f24994b + ", channelMasks=" + this.f24995c + "]";
        }

        public C0420e(int i10, int i11) {
            this.f24993a = i10;
            this.f24994b = i11;
            this.f24995c = null;
        }
    }
}

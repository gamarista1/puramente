package We;

import ff.C5862p;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class O0 {

    /* renamed from: a  reason: collision with root package name */
    private Set f65711a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private Set f65712b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    private String f65713c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f65714d = null;

    /* renamed from: e  reason: collision with root package name */
    private a f65715e = a.MEDIUM;

    /* renamed from: f  reason: collision with root package name */
    private int f65716f = 1;

    /* renamed from: g  reason: collision with root package name */
    private long f65717g = 30000;

    /* renamed from: h  reason: collision with root package name */
    private long f65718h = 5000;

    /* renamed from: i  reason: collision with root package name */
    private long f65719i = 3600000;

    /* renamed from: j  reason: collision with root package name */
    private boolean f65720j = true;

    /* renamed from: k  reason: collision with root package name */
    private C5862p f65721k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f65722l = false;

    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);
        

        /* renamed from: a  reason: collision with root package name */
        public final float f65727a;

        /* renamed from: b  reason: collision with root package name */
        public final int f65728b;

        /* renamed from: c  reason: collision with root package name */
        public final int f65729c;

        private a(float f10, int i10, int i11) {
            this.f65727a = f10;
            this.f65728b = i10;
            this.f65729c = i11;
        }
    }

    public O0(boolean z10, C5862p pVar) {
        if (!z10) {
            e(true);
            d(true);
            this.f65711a.add("android.webkit.WebView");
            this.f65711a.add("android.widget.VideoView");
            this.f65711a.add("androidx.media3.ui.PlayerView");
            this.f65711a.add("com.google.android.exoplayer2.ui.PlayerView");
            this.f65711a.add("com.google.android.exoplayer2.ui.StyledPlayerView");
            this.f65721k = pVar;
        }
    }

    public void a(String str) {
        this.f65711a.add(str);
    }

    public void b(String str) {
        this.f65712b.add(str);
    }

    public C5862p c() {
        return this.f65721k;
    }

    public void d(boolean z10) {
        if (z10) {
            a("android.widget.ImageView");
            this.f65712b.remove("android.widget.ImageView");
            return;
        }
        b("android.widget.ImageView");
        this.f65711a.remove("android.widget.ImageView");
    }

    public void e(boolean z10) {
        if (z10) {
            a("android.widget.TextView");
            this.f65712b.remove("android.widget.TextView");
            return;
        }
        b("android.widget.TextView");
        this.f65711a.remove("android.widget.TextView");
    }

    public void f(C5862p pVar) {
        this.f65721k = pVar;
    }
}

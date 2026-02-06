package c5;

import T4.h;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f36471a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final o f36472b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final o f36473c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final o f36474d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final o f36475e;

    /* renamed from: f  reason: collision with root package name */
    public static final o f36476f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final o f36477g;

    /* renamed from: h  reason: collision with root package name */
    public static final h f36478h;

    /* renamed from: i  reason: collision with root package name */
    static final boolean f36479i = true;

    private static class a extends o {
        a() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    private static class b extends o {
        b() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i11) / ((float) i13), ((float) i10) / ((float) i12)));
            int i14 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i14 = 0;
            }
            return 1.0f / ((float) (max << i14));
        }
    }

    private static class c extends o {
        c() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            if (b(i10, i11, i12, i13) == 1.0f) {
                return g.QUALITY;
            }
            return o.f36473c.a(i10, i11, i12, i13);
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, o.f36473c.b(i10, i11, i12, i13));
        }
    }

    private static class d extends o {
        d() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
        }
    }

    private static class e extends o {
        e() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            if (o.f36479i) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            if (o.f36479i) {
                return Math.min(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    private static class f extends o {
        f() {
        }

        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f36475e = dVar;
        f36477g = dVar;
        f36478h = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}

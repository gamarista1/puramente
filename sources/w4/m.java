package W4;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import o5.l;

public class m implements k {

    /* renamed from: d  reason: collision with root package name */
    private static final Bitmap.Config[] f34840d;

    /* renamed from: e  reason: collision with root package name */
    private static final Bitmap.Config[] f34841e;

    /* renamed from: f  reason: collision with root package name */
    private static final Bitmap.Config[] f34842f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    private static final Bitmap.Config[] f34843g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    private static final Bitmap.Config[] f34844h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    private final c f34845a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final g f34846b = new g();

    /* renamed from: c  reason: collision with root package name */
    private final Map f34847c = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34848a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34848a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34848a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34848a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34848a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: W4.m.a.<clinit>():void");
        }
    }

    static final class b implements l {

        /* renamed from: a  reason: collision with root package name */
        private final c f34849a;

        /* renamed from: b  reason: collision with root package name */
        int f34850b;

        /* renamed from: c  reason: collision with root package name */
        private Bitmap.Config f34851c;

        public b(c cVar) {
            this.f34849a = cVar;
        }

        public void a() {
            this.f34849a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f34850b = i10;
            this.f34851c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f34850b != bVar.f34850b || !l.e(this.f34851c, bVar.f34851c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10;
            int i11 = this.f34850b * 31;
            Bitmap.Config config = this.f34851c;
            if (config != null) {
                i10 = config.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public String toString() {
            return m.h(this.f34850b, this.f34851c);
        }
    }

    static class c extends c {
        c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f34840d = configArr;
        f34841e = configArr;
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap j10 = j(bitmap.getConfig());
        Integer num2 = (Integer) j10.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            j10.remove(num);
        } else {
            j10.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private b g(int i10, Bitmap.Config config) {
        b e10 = this.f34845a.e(i10, config);
        Bitmap.Config[] i11 = i(config);
        int length = i11.length;
        int i12 = 0;
        while (i12 < length) {
            Bitmap.Config config2 = i11[i12];
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i10));
            if (num == null || num.intValue() > i10 * 8) {
                i12++;
            } else {
                if (num.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return e10;
                        }
                    } else if (config2.equals(config)) {
                        return e10;
                    }
                }
                this.f34845a.c(e10);
                return this.f34845a.e(num.intValue(), config2);
            }
        }
        return e10;
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f34841e;
        }
        int i10 = a.f34848a[config.ordinal()];
        if (i10 == 1) {
            return f34840d;
        }
        if (i10 == 2) {
            return f34842f;
        }
        if (i10 == 3) {
            return f34843g;
        }
        if (i10 != 4) {
            return new Bitmap.Config[]{config};
        }
        return f34844h;
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f34847c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f34847c.put(config, treeMap);
        return treeMap;
    }

    public String a(Bitmap bitmap) {
        return h(l.i(bitmap), bitmap.getConfig());
    }

    public String b(int i10, int i11, Bitmap.Config config) {
        return h(l.h(i10, i11, config), config);
    }

    public void c(Bitmap bitmap) {
        b e10 = this.f34845a.e(l.i(bitmap), bitmap.getConfig());
        this.f34846b.d(e10, bitmap);
        NavigableMap j10 = j(bitmap.getConfig());
        Integer num = (Integer) j10.get(Integer.valueOf(e10.f34850b));
        Integer valueOf = Integer.valueOf(e10.f34850b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        j10.put(valueOf, Integer.valueOf(i10));
    }

    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b g10 = g(l.h(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f34846b.a(g10);
        if (bitmap != null) {
            f(Integer.valueOf(g10.f34850b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    public int e(Bitmap bitmap) {
        return l.i(bitmap);
    }

    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f34846b.f();
        if (bitmap != null) {
            f(Integer.valueOf(l.i(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f34846b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f34847c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f34847c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}

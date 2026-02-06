package L0;

import lf.C6535s;

public enum b {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f4116a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4117b;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4118a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                L0.b[] r0 = L0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                L0.b r1 = L0.b.Copy     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                L0.b r1 = L0.b.Paste     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                L0.b r1 = L0.b.Cut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                L0.b r1 = L0.b.SelectAll     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f4118a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: L0.b.a.<clinit>():void");
        }
    }

    private b(int i10) {
        this.f4116a = i10;
        this.f4117b = i10;
    }

    public final int b() {
        return this.f4116a;
    }

    public final int c() {
        return this.f4117b;
    }

    public final int e() {
        int i10 = a.f4118a[ordinal()];
        if (i10 == 1) {
            return 17039361;
        }
        if (i10 == 2) {
            return 17039371;
        }
        if (i10 == 3) {
            return 17039363;
        }
        if (i10 == 4) {
            return 17039373;
        }
        throw new C6535s();
    }
}

package androidx.datastore.preferences.protobuf;

final class c0 implements M {

    /* renamed from: a  reason: collision with root package name */
    private final O f16318a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16319b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f16320c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16321d;

    c0(O o10, String str, Object[] objArr) {
        this.f16318a = o10;
        this.f16319b = str;
        this.f16320c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16321d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f16321d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public boolean a() {
        if ((this.f16321d & 2) == 2) {
            return true;
        }
        return false;
    }

    public O b() {
        return this.f16318a;
    }

    public Z c() {
        if ((this.f16321d & 1) == 1) {
            return Z.PROTO2;
        }
        return Z.PROTO3;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f16320c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f16319b;
    }
}

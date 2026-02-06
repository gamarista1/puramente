package c7;

import com.google.android.gms.common.api.a;

public class m implements n {

    /* renamed from: d  reason: collision with root package name */
    public static final n f36558d = d(a.e.API_PRIORITY_OTHER, true, true);

    /* renamed from: a  reason: collision with root package name */
    int f36559a;

    /* renamed from: b  reason: collision with root package name */
    boolean f36560b;

    /* renamed from: c  reason: collision with root package name */
    boolean f36561c;

    private m(int i10, boolean z10, boolean z11) {
        this.f36559a = i10;
        this.f36560b = z10;
        this.f36561c = z11;
    }

    public static n d(int i10, boolean z10, boolean z11) {
        return new m(i10, z10, z11);
    }

    public boolean a() {
        return this.f36561c;
    }

    public boolean b() {
        return this.f36560b;
    }

    public int c() {
        return this.f36559a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f36559a == mVar.f36559a && this.f36560b == mVar.f36560b && this.f36561c == mVar.f36561c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = this.f36559a;
        int i12 = 0;
        if (this.f36560b) {
            i10 = 4194304;
        } else {
            i10 = 0;
        }
        int i13 = i11 ^ i10;
        if (this.f36561c) {
            i12 = 8388608;
        }
        return i13 ^ i12;
    }
}

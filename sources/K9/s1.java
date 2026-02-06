package k9;

import N9.T;
import android.os.Bundle;
import com.google.common.collect.C4770v;
import ja.C3645a;
import ja.C3647c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k9.C3700i;
import nb.C5114i;

public final class s1 implements C3700i {

    /* renamed from: b  reason: collision with root package name */
    public static final s1 f45825b = new s1(C4770v.E());

    /* renamed from: c  reason: collision with root package name */
    public static final C3700i.a f45826c = new q1();

    /* renamed from: a  reason: collision with root package name */
    private final C4770v f45827a;

    public static final class a implements C3700i {

        /* renamed from: f  reason: collision with root package name */
        public static final C3700i.a f45828f = new r1();

        /* renamed from: a  reason: collision with root package name */
        public final int f45829a;

        /* renamed from: b  reason: collision with root package name */
        private final T f45830b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f45831c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f45832d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean[] f45833e;

        public a(T t10, boolean z10, int[] iArr, boolean[] zArr) {
            boolean z11;
            int i10 = t10.f33189a;
            this.f45829a = i10;
            boolean z12 = false;
            if (i10 == iArr.length && i10 == zArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            C3645a.a(z11);
            this.f45830b = t10;
            if (z10 && i10 > 1) {
                z12 = true;
            }
            this.f45831c = z12;
            this.f45832d = (int[]) iArr.clone();
            this.f45833e = (boolean[]) zArr.clone();
        }

        private static String j(int i10) {
            return Integer.toString(i10, 36);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ a k(Bundle bundle) {
            T t10 = (T) T.f33188f.a((Bundle) C3645a.e(bundle.getBundle(j(0))));
            return new a(t10, bundle.getBoolean(j(4), false), (int[]) C5114i.a(bundle.getIntArray(j(1)), new int[t10.f33189a]), (boolean[]) C5114i.a(bundle.getBooleanArray(j(3)), new boolean[t10.f33189a]));
        }

        public T b() {
            return this.f45830b;
        }

        public C3717q0 c(int i10) {
            return this.f45830b.b(i10);
        }

        public int d() {
            return this.f45830b.f33191c;
        }

        public boolean e() {
            return this.f45831c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f45831c != aVar.f45831c || !this.f45830b.equals(aVar.f45830b) || !Arrays.equals(this.f45832d, aVar.f45832d) || !Arrays.equals(this.f45833e, aVar.f45833e)) {
                return false;
            }
            return true;
        }

        public boolean f() {
            return com.google.common.primitives.a.b(this.f45833e, true);
        }

        public boolean g(int i10) {
            return this.f45833e[i10];
        }

        public boolean h(int i10) {
            return i(i10, false);
        }

        public int hashCode() {
            return (((((this.f45830b.hashCode() * 31) + (this.f45831c ? 1 : 0)) * 31) + Arrays.hashCode(this.f45832d)) * 31) + Arrays.hashCode(this.f45833e);
        }

        public boolean i(int i10, boolean z10) {
            int i11 = this.f45832d[i10];
            if (i11 == 4 || (z10 && i11 == 3)) {
                return true;
            }
            return false;
        }
    }

    public s1(List list) {
        this.f45827a = C4770v.z(list);
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ s1 e(Bundle bundle) {
        C4770v vVar;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        if (parcelableArrayList == null) {
            vVar = C4770v.E();
        } else {
            vVar = C3647c.b(a.f45828f, parcelableArrayList);
        }
        return new s1(vVar);
    }

    public C4770v b() {
        return this.f45827a;
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f45827a.size(); i11++) {
            a aVar = (a) this.f45827a.get(i11);
            if (aVar.f() && aVar.d() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        return this.f45827a.equals(((s1) obj).f45827a);
    }

    public int hashCode() {
        return this.f45827a.hashCode();
    }
}

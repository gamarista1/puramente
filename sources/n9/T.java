package N9;

import android.os.Bundle;
import com.google.common.collect.C4770v;
import ja.C3645a;
import ja.C3647c;
import ja.s;
import ja.w;
import java.util.ArrayList;
import java.util.Arrays;
import k9.C3700i;
import k9.C3717q0;

public final class T implements C3700i {

    /* renamed from: f  reason: collision with root package name */
    public static final C3700i.a f33188f = new S();

    /* renamed from: a  reason: collision with root package name */
    public final int f33189a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33190b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33191c;

    /* renamed from: d  reason: collision with root package name */
    private final C3717q0[] f33192d;

    /* renamed from: e  reason: collision with root package name */
    private int f33193e;

    public T(C3717q0... q0VarArr) {
        this("", q0VarArr);
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ T e(Bundle bundle) {
        C4770v vVar;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        if (parcelableArrayList == null) {
            vVar = C4770v.E();
        } else {
            vVar = C3647c.b(C3717q0.f45752H, parcelableArrayList);
        }
        return new T(bundle.getString(d(1), ""), (C3717q0[]) vVar.toArray(new C3717q0[0]));
    }

    private static void f(String str, String str2, String str3, int i10) {
        s.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String g(String str) {
        if (str == null || str.equals("und")) {
            return "";
        }
        return str;
    }

    private static int h(int i10) {
        return i10 | 16384;
    }

    private void i() {
        String g10 = g(this.f33192d[0].f45761c);
        int h10 = h(this.f33192d[0].f45763e);
        int i10 = 1;
        while (true) {
            C3717q0[] q0VarArr = this.f33192d;
            if (i10 >= q0VarArr.length) {
                return;
            }
            if (!g10.equals(g(q0VarArr[i10].f45761c))) {
                C3717q0[] q0VarArr2 = this.f33192d;
                f("languages", q0VarArr2[0].f45761c, q0VarArr2[i10].f45761c, i10);
                return;
            } else if (h10 != h(this.f33192d[i10].f45763e)) {
                f("role flags", Integer.toBinaryString(this.f33192d[0].f45763e), Integer.toBinaryString(this.f33192d[i10].f45763e), i10);
                return;
            } else {
                i10++;
            }
        }
    }

    public C3717q0 b(int i10) {
        return this.f33192d[i10];
    }

    public int c(C3717q0 q0Var) {
        int i10 = 0;
        while (true) {
            C3717q0[] q0VarArr = this.f33192d;
            if (i10 >= q0VarArr.length) {
                return -1;
            }
            if (q0Var == q0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t10 = (T) obj;
        if (!this.f33190b.equals(t10.f33190b) || !Arrays.equals(this.f33192d, t10.f33192d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f33193e == 0) {
            this.f33193e = ((527 + this.f33190b.hashCode()) * 31) + Arrays.hashCode(this.f33192d);
        }
        return this.f33193e;
    }

    public T(String str, C3717q0... q0VarArr) {
        C3645a.a(q0VarArr.length > 0);
        this.f33190b = str;
        this.f33192d = q0VarArr;
        this.f33189a = q0VarArr.length;
        int k10 = w.k(q0VarArr[0].f45770l);
        this.f33191c = k10 == -1 ? w.k(q0VarArr[0].f45769k) : k10;
        i();
    }
}

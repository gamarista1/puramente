package fa;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import nb.C5108c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f43553a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f43554b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set f43555c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f43556d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f43557e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f43558f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f43559g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f43560h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f43561i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f43562j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f43563k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f43564l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f43565m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f43566n = -1;

    /* renamed from: o  reason: collision with root package name */
    private float f43567o;

    /* renamed from: p  reason: collision with root package name */
    private int f43568p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f43569q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f43563k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f43561i) {
            return this.f43560h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f43569q;
    }

    public int c() {
        if (this.f43559g) {
            return this.f43558f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f43557e;
    }

    public float e() {
        return this.f43567o;
    }

    public int f() {
        return this.f43566n;
    }

    public int g() {
        return this.f43568p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f43553a.isEmpty() && this.f43554b.isEmpty() && this.f43555c.isEmpty() && this.f43556d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B10 = B(B(B(0, this.f43553a, str, 1073741824), this.f43554b, str2, 2), this.f43556d, str3, 4);
        if (B10 == -1 || !set.containsAll(this.f43555c)) {
            return 0;
        }
        return B10 + (this.f43555c.size() * 4);
    }

    public int i() {
        int i10;
        int i11 = this.f43564l;
        if (i11 == -1 && this.f43565m == -1) {
            return -1;
        }
        int i12 = 0;
        if (i11 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.f43565m == 1) {
            i12 = 2;
        }
        return i10 | i12;
    }

    public boolean j() {
        return this.f43561i;
    }

    public boolean k() {
        return this.f43559g;
    }

    public boolean l() {
        if (this.f43562j == 1) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.f43563k == 1) {
            return true;
        }
        return false;
    }

    public d n(int i10) {
        this.f43560h = i10;
        this.f43561i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f43564l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f43569q = z10;
        return this;
    }

    public d q(int i10) {
        this.f43558f = i10;
        this.f43559g = true;
        return this;
    }

    public d r(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = C5108c.e(str);
        }
        this.f43557e = str2;
        return this;
    }

    public d s(float f10) {
        this.f43567o = f10;
        return this;
    }

    public d t(int i10) {
        this.f43566n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f43565m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f43568p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f43555c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f43553a = str;
    }

    public void y(String str) {
        this.f43554b = str;
    }

    public void z(String str) {
        this.f43556d = str;
    }
}

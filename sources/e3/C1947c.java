package e3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import nb.C5108c;

/* renamed from: e3.c  reason: case insensitive filesystem */
public final class C1947c {

    /* renamed from: a  reason: collision with root package name */
    private String f19539a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f19540b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set f19541c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f19542d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f19543e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f19544f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19545g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f19546h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19547i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f19548j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f19549k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f19550l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f19551m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f19552n = -1;

    /* renamed from: o  reason: collision with root package name */
    private float f19553o;

    /* renamed from: p  reason: collision with root package name */
    private int f19554p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f19555q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public C1947c A(boolean z10) {
        this.f19549k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f19547i) {
            return this.f19546h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f19555q;
    }

    public int c() {
        if (this.f19545g) {
            return this.f19544f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f19543e;
    }

    public float e() {
        return this.f19553o;
    }

    public int f() {
        return this.f19552n;
    }

    public int g() {
        return this.f19554p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f19539a.isEmpty() && this.f19540b.isEmpty() && this.f19541c.isEmpty() && this.f19542d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B10 = B(B(B(0, this.f19539a, str, 1073741824), this.f19540b, str2, 2), this.f19542d, str3, 4);
        if (B10 == -1 || !set.containsAll(this.f19541c)) {
            return 0;
        }
        return B10 + (this.f19541c.size() * 4);
    }

    public int i() {
        int i10;
        int i11 = this.f19550l;
        if (i11 == -1 && this.f19551m == -1) {
            return -1;
        }
        int i12 = 0;
        if (i11 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.f19551m == 1) {
            i12 = 2;
        }
        return i10 | i12;
    }

    public boolean j() {
        return this.f19547i;
    }

    public boolean k() {
        return this.f19545g;
    }

    public boolean l() {
        if (this.f19548j == 1) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.f19549k == 1) {
            return true;
        }
        return false;
    }

    public C1947c n(int i10) {
        this.f19546h = i10;
        this.f19547i = true;
        return this;
    }

    public C1947c o(boolean z10) {
        this.f19550l = z10 ? 1 : 0;
        return this;
    }

    public C1947c p(boolean z10) {
        this.f19555q = z10;
        return this;
    }

    public C1947c q(int i10) {
        this.f19544f = i10;
        this.f19545g = true;
        return this;
    }

    public C1947c r(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = C5108c.e(str);
        }
        this.f19543e = str2;
        return this;
    }

    public C1947c s(float f10) {
        this.f19553o = f10;
        return this;
    }

    public C1947c t(int i10) {
        this.f19552n = i10;
        return this;
    }

    public C1947c u(boolean z10) {
        this.f19551m = z10 ? 1 : 0;
        return this;
    }

    public C1947c v(int i10) {
        this.f19554p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f19541c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f19539a = str;
    }

    public void y(String str) {
        this.f19540b = str;
    }

    public void z(String str) {
        this.f19542d = str;
    }
}

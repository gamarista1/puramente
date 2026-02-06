package com.google.common.primitives;

import java.io.Serializable;
import java.util.Arrays;
import nb.o;

public final class e implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    private static final e f56791d = new e(new int[0]);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f56792a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f56793b;

    /* renamed from: c  reason: collision with root package name */
    private final int f56794c;

    private e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e a(int[] iArr) {
        if (iArr.length == 0) {
            return f56791d;
        }
        return new e(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean d() {
        if (this.f56793b > 0 || this.f56794c < this.f56792a.length) {
            return true;
        }
        return false;
    }

    public static e f() {
        return f56791d;
    }

    public int b(int i10) {
        o.h(i10, e());
        return this.f56792a[this.f56793b + i10];
    }

    public boolean c() {
        if (this.f56794c == this.f56793b) {
            return true;
        }
        return false;
    }

    public int e() {
        return this.f56794c - this.f56793b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (e() != eVar.e()) {
            return false;
        }
        for (int i10 = 0; i10 < e(); i10++) {
            if (b(i10) != eVar.b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int[] g() {
        return Arrays.copyOfRange(this.f56792a, this.f56793b, this.f56794c);
    }

    public e h() {
        if (d()) {
            return new e(g());
        }
        return this;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = this.f56793b; i11 < this.f56794c; i11++) {
            i10 = (i10 * 31) + f.i(this.f56792a[i11]);
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        if (c()) {
            return f56791d;
        }
        return this;
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(e() * 5);
        sb2.append('[');
        sb2.append(this.f56792a[this.f56793b]);
        int i10 = this.f56793b;
        while (true) {
            i10++;
            if (i10 < this.f56794c) {
                sb2.append(", ");
                sb2.append(this.f56792a[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return h();
    }

    private e(int[] iArr, int i10, int i11) {
        this.f56792a = iArr;
        this.f56793b = i10;
        this.f56794c = i11;
    }
}

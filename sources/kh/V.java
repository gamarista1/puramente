package kh;

import Sg.p;
import ih.f;
import ih.j;
import ih.k;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public abstract class V implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f71634a;

    /* renamed from: b  reason: collision with root package name */
    private final f f71635b;

    /* renamed from: c  reason: collision with root package name */
    private final f f71636c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71637d;

    public /* synthetic */ V(String str, f fVar, f fVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, fVar2);
    }

    public boolean b() {
        return f.a.c(this);
    }

    public int c(String str) {
        C6496s.h(str, "name");
        Integer m10 = p.m(str);
        if (m10 != null) {
            return m10.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    public int d() {
        return this.f71637d;
    }

    public String e(int i10) {
        return String.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        if (C6496s.c(i(), v10.i()) && C6496s.c(this.f71635b, v10.f71635b) && C6496s.c(this.f71636c, v10.f71636c)) {
            return true;
        }
        return false;
    }

    public List f(int i10) {
        if (i10 >= 0) {
            return C6565s.n();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public f g(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f71635b;
            }
            if (i11 == 1) {
                return this.f71636c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public List getAnnotations() {
        return f.a.a(this);
    }

    public j h() {
        return k.c.f68508a;
    }

    public int hashCode() {
        return (((i().hashCode() * 31) + this.f71635b.hashCode()) * 31) + this.f71636c.hashCode();
    }

    public String i() {
        return this.f71634a;
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return i() + '(' + this.f71635b + ", " + this.f71636c + ')';
    }

    private V(String str, f fVar, f fVar2) {
        this.f71634a = str;
        this.f71635b = fVar;
        this.f71636c = fVar2;
        this.f71637d = 2;
    }
}

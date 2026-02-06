package lf;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lf.m  reason: case insensitive filesystem */
public final class C6529m implements Comparable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f71828e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final C6529m f71829f = C6530n.a();

    /* renamed from: a  reason: collision with root package name */
    private final int f71830a;

    /* renamed from: b  reason: collision with root package name */
    private final int f71831b;

    /* renamed from: c  reason: collision with root package name */
    private final int f71832c;

    /* renamed from: d  reason: collision with root package name */
    private final int f71833d;

    /* renamed from: lf.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6529m(int i10, int i11, int i12) {
        this.f71830a = i10;
        this.f71831b = i11;
        this.f71832c = i12;
        this.f71833d = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    /* renamed from: a */
    public int compareTo(C6529m mVar) {
        C6496s.h(mVar, "other");
        return this.f71833d - mVar.f71833d;
    }

    public boolean equals(Object obj) {
        C6529m mVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6529m) {
            mVar = (C6529m) obj;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return false;
        }
        if (this.f71833d == mVar.f71833d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f71833d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f71830a);
        sb2.append('.');
        sb2.append(this.f71831b);
        sb2.append('.');
        sb2.append(this.f71832c);
        return sb2.toString();
    }

    public C6529m(int i10, int i11) {
        this(i10, i11, 0);
    }
}

package O6;

import O6.c;
import T5.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f33390d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Lazy f33391e = C6531o.a(C6534r.SYNCHRONIZED, new d());

    /* renamed from: a  reason: collision with root package name */
    private int f33392a;

    /* renamed from: b  reason: collision with root package name */
    private List f33393b;

    /* renamed from: c  reason: collision with root package name */
    private final a f33394c = new a();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int e(int i10, InputStream inputStream, byte[] bArr) {
            if (bArr.length < i10) {
                throw new IllegalStateException("Check failed.");
            } else if (!inputStream.markSupported()) {
                return T5.a.b(inputStream, bArr, 0, i10);
            } else {
                try {
                    inputStream.mark(i10);
                    return T5.a.b(inputStream, bArr, 0, i10);
                } finally {
                    inputStream.reset();
                }
            }
        }

        public final c b(InputStream inputStream) {
            C6496s.h(inputStream, "is");
            return d().c(inputStream);
        }

        public final c c(InputStream inputStream) {
            C6496s.h(inputStream, "is");
            try {
                return b(inputStream);
            } catch (IOException e10) {
                throw p.a(e10);
            }
        }

        public final e d() {
            return (e) e.f33391e.getValue();
        }

        private a() {
        }
    }

    private e() {
        h();
    }

    public static final c d(InputStream inputStream) {
        return f33390d.c(inputStream);
    }

    public static final e e() {
        return f33390d.d();
    }

    /* access modifiers changed from: private */
    public static final e f() {
        return new e();
    }

    private final void h() {
        this.f33392a = this.f33394c.b();
        List<c.b> list = this.f33393b;
        if (list != null) {
            C6496s.e(list);
            for (c.b b10 : list) {
                this.f33392a = Math.max(this.f33392a, b10.b());
            }
        }
    }

    public final c c(InputStream inputStream) {
        C6496s.h(inputStream, "is");
        int i10 = this.f33392a;
        byte[] bArr = new byte[i10];
        int a10 = f33390d.e(i10, inputStream, bArr);
        c a11 = this.f33394c.a(bArr, a10);
        if (a11 != c.f33387d) {
            return a11;
        }
        List<c.b> list = this.f33393b;
        if (list != null) {
            for (c.b a12 : list) {
                c a13 = a12.a(bArr, a10);
                if (a13 != c.f33387d) {
                    return a13;
                }
            }
        }
        return c.f33387d;
    }

    public final void g(List list) {
        this.f33393b = list;
        h();
    }
}

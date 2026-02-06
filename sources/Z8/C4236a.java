package z8;

import D3.a;
import com.amazon.a.a.o.b.f;
import com.facebook.systrace.TraceListener;
import kotlin.jvm.internal.C6496s;
import sf.C6714a;

/* renamed from: z8.a  reason: case insensitive filesystem */
public final class C4236a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4236a f50084a = new C4236a();

    /* renamed from: z8.a$a  reason: collision with other inner class name */
    public enum C0758a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');
        

        /* renamed from: a  reason: collision with root package name */
        private final char f50090a;

        static {
            C0758a[] a10;
            f50089f = C6714a.a(a10);
        }

        private C0758a(char c10) {
            this.f50090a = c10;
        }
    }

    private C4236a() {
    }

    public static final void a(long j10, String str, int i10) {
        C6496s.h(str, "sectionName");
        a.a(str, i10);
    }

    public static final void b(long j10, String str, int i10, long j11) {
        C6496s.h(str, "sectionName");
        a(j10, str, i10);
    }

    public static final void c(long j10, String str) {
        C6496s.h(str, "sectionName");
        a.c(str);
    }

    public static final void d(long j10, String str, String[] strArr, int i10) {
        C6496s.h(str, "sectionName");
        C6496s.h(strArr, "args");
        String e10 = f50084a.e(strArr, i10);
        a.c(str + f.f37531c + e10);
    }

    private final String e(String[] strArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 < i10; i11 += 2) {
            String str = strArr[i11 - 1];
            String str2 = strArr[i11];
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
            if (i11 < i10 - 1) {
                sb2.append(';');
            }
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public static final void f(long j10, String str, int i10) {
        C6496s.h(str, "sectionName");
        g(j10, str, i10);
    }

    public static final void g(long j10, String str, int i10) {
        C6496s.h(str, "sectionName");
        a.d(str, i10);
    }

    public static final void h(long j10, String str, int i10, long j11) {
        C6496s.h(str, "sectionName");
        g(j10, str, i10);
    }

    public static final void i(long j10) {
        a.f();
    }

    public static final boolean j(long j10) {
        return false;
    }

    public static final void l(long j10, String str, int i10) {
        C6496s.h(str, "sectionName");
        a(j10, str, i10);
    }

    public static final void m(long j10, String str, int i10) {
        C6496s.h(str, "counterName");
        a.j(str, i10);
    }

    public static final void o(long j10, String str, Runnable runnable) {
        C6496s.h(str, "sectionName");
        C6496s.h(runnable, "block");
        c(j10, str);
        try {
            runnable.run();
        } finally {
            i(j10);
        }
    }

    public static final void k(TraceListener traceListener) {
    }

    public static final void p(TraceListener traceListener) {
    }

    public static final void n(long j10, String str, C0758a aVar) {
    }
}

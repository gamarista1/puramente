package sh;

import Ef.i;
import Gh.C5404e;
import Gh.C5405f;
import Gh.C5406g;
import Gh.C5407h;
import Gh.K;
import Gh.W;
import Sg.C5541d;
import Sg.m;
import Sg.p;
import com.google.android.gms.common.api.a;
import com.revenuecat.purchases.common.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import lf.C6523g;
import mf.C6559l;
import mf.C6565s;
import mf.L;
import mf.O;
import rh.C6703A;
import rh.C6708e;
import rh.D;
import rh.E;
import rh.F;
import rh.r;
import rh.u;
import rh.v;
import rh.y;
import zh.C6845c;

/* renamed from: sh.e  reason: case insensitive filesystem */
public abstract class C6726e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f73540a;

    /* renamed from: b  reason: collision with root package name */
    public static final u f73541b = u.f73474b.h(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final F f73542c;

    /* renamed from: d  reason: collision with root package name */
    public static final D f73543d;

    /* renamed from: e  reason: collision with root package name */
    private static final K f73544e;

    /* renamed from: f  reason: collision with root package name */
    public static final TimeZone f73545f;

    /* renamed from: g  reason: collision with root package name */
    private static final m f73546g = new m("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f73547h = false;

    /* renamed from: i  reason: collision with root package name */
    public static final String f73548i;

    static {
        byte[] bArr = new byte[0];
        f73540a = bArr;
        f73542c = F.b.g(F.f73180b, bArr, (y) null, 1, (Object) null);
        f73543d = D.a.p(D.Companion, bArr, (y) null, 0, 0, 7, (Object) null);
        K.a aVar = K.f63218d;
        C5407h.a aVar2 = C5407h.f63295d;
        f73544e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C6496s.e(timeZone);
        f73545f = timeZone;
        String name = C6703A.class.getName();
        C6496s.g(name, "OkHttpClient::class.java.name");
        f73548i = p.w0(p.v0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        C6496s.h(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char charAt = str.charAt(i12);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i12 == i10) {
                        break;
                    }
                    i12--;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        C6496s.h(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != 9) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] strArr2, Comparator comparator) {
        C6496s.h(strArr, "<this>");
        C6496s.h(strArr2, "other");
        C6496s.h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        wf.C6763c.a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = lf.C6514M.f71813a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        wf.C6763c.a(r0, (java.lang.Throwable) null);
        r3.h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean F(Ah.a r3, java.io.File r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            Gh.U r0 = r3.f(r4)
            r1 = 0
            r3.h(r4)     // Catch:{ IOException -> 0x0019 }
            wf.C6763c.a(r0, r1)
            r3 = 1
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            lf.M r2 = lf.C6514M.f71813a     // Catch:{ all -> 0x0017 }
            wf.C6763c.a(r0, r1)
            r3.h(r4)
            r3 = 0
            return r3
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            wf.C6763c.a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.C6726e.F(Ah.a, java.io.File):boolean");
    }

    public static final boolean G(Socket socket, C5406g gVar) {
        int soTimeout;
        C6496s.h(socket, "<this>");
        C6496s.h(gVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z10 = !gVar.J0();
            socket.setSoTimeout(soTimeout);
            return z10;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th2) {
            socket.setSoTimeout(soTimeout);
            throw th2;
        }
    }

    public static final boolean H(String str) {
        C6496s.h(str, "name");
        if (p.v(str, "Authorization", true) || p.v(str, "Cookie", true) || p.v(str, "Proxy-Authorization", true) || p.v(str, "Set-Cookie", true)) {
            return true;
        }
        return false;
    }

    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset J(C5406g gVar, Charset charset) {
        C6496s.h(gVar, "<this>");
        C6496s.h(charset, "default");
        int r12 = gVar.r1(f73544e);
        if (r12 == -1) {
            return charset;
        }
        if (r12 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            C6496s.g(charset2, "UTF_8");
            return charset2;
        } else if (r12 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            C6496s.g(charset3, "UTF_16BE");
            return charset3;
        } else if (r12 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            C6496s.g(charset4, "UTF_16LE");
            return charset4;
        } else if (r12 == 3) {
            return C5541d.f65028a.a();
        } else {
            if (r12 == 4) {
                return C5541d.f65028a.b();
            }
            throw new AssertionError();
        }
    }

    public static final int K(C5406g gVar) {
        C6496s.h(gVar, "<this>");
        return d(gVar.readByte(), 255) | (d(gVar.readByte(), 255) << 16) | (d(gVar.readByte(), 255) << 8);
    }

    public static final int L(C5404e eVar, byte b10) {
        C6496s.h(eVar, "<this>");
        int i10 = 0;
        while (!eVar.J0() && eVar.I(0) == b10) {
            i10++;
            eVar.readByte();
        }
        return i10;
    }

    public static final boolean M(W w10, int i10, TimeUnit timeUnit) {
        long j10;
        C6496s.h(w10, "<this>");
        C6496s.h(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (w10.timeout().e()) {
            j10 = w10.timeout().c() - nanoTime;
        } else {
            j10 = Long.MAX_VALUE;
        }
        w10.timeout().d(Math.min(j10, timeUnit.toNanos((long) i10)) + nanoTime);
        try {
            C5404e eVar = new C5404e();
            while (w10.y1(eVar, 8192) != -1) {
                eVar.a();
            }
            if (j10 == Long.MAX_VALUE) {
                w10.timeout().a();
            } else {
                w10.timeout().d(nanoTime + j10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j10 == Long.MAX_VALUE) {
                w10.timeout().a();
            } else {
                w10.timeout().d(nanoTime + j10);
            }
            return false;
        } catch (Throwable th2) {
            if (j10 == Long.MAX_VALUE) {
                w10.timeout().a();
            } else {
                w10.timeout().d(nanoTime + j10);
            }
            throw th2;
        }
    }

    public static final ThreadFactory N(String str, boolean z10) {
        C6496s.h(str, "name");
        return new C6725d(str, z10);
    }

    /* access modifiers changed from: private */
    public static final Thread O(String str, boolean z10, Runnable runnable) {
        C6496s.h(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List P(u uVar) {
        C6496s.h(uVar, "<this>");
        i u10 = Ef.m.u(0, uVar.size());
        ArrayList arrayList = new ArrayList(C6565s.y(u10, 10));
        Iterator it = u10.iterator();
        while (it.hasNext()) {
            int a10 = ((L) it).a();
            arrayList.add(new C6845c(uVar.g(a10), uVar.x(a10)));
        }
        return arrayList;
    }

    public static final u Q(List list) {
        C6496s.h(list, "<this>");
        u.a aVar = new u.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6845c cVar = (C6845c) it.next();
            aVar.d(cVar.a().W(), cVar.b().W());
        }
        return aVar.f();
    }

    public static final String R(int i10) {
        String hexString = Integer.toHexString(i10);
        C6496s.g(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(long j10) {
        String hexString = Long.toHexString(j10);
        C6496s.g(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String T(v vVar, boolean z10) {
        String str;
        C6496s.h(vVar, "<this>");
        if (p.O(vVar.i(), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, (Object) null)) {
            str = '[' + vVar.i() + ']';
        } else {
            str = vVar.i();
        }
        if (!z10 && vVar.o() == v.f73477k.c(vVar.s())) {
            return str;
        }
        return str + ':' + vVar.o();
    }

    public static /* synthetic */ String U(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return T(vVar, z10);
    }

    public static final List V(List list) {
        C6496s.h(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(C6565s.h1(list));
        C6496s.g(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final Map W(Map map) {
        C6496s.h(map, "<this>");
        if (map.isEmpty()) {
            return O.i();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C6496s.g(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long X(String str, long j10) {
        C6496s.h(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int Y(String str, int i10) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return a.e.API_PRIORITY_OTHER;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String Z(String str, int i10, int i11) {
        C6496s.h(str, "<this>");
        int z10 = z(str, i10, i11);
        String substring = str.substring(z10, B(str, z10, i11));
        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String a0(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return Z(str, i10, i11);
    }

    public static final Throwable b0(Exception exc, List list) {
        C6496s.h(exc, "<this>");
        C6496s.h(list, "suppressed");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6523g.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void c(List list, Object obj) {
        C6496s.h(list, "<this>");
        if (!list.contains(obj)) {
            list.add(obj);
        }
    }

    public static final void c0(C5405f fVar, int i10) {
        C6496s.h(fVar, "<this>");
        fVar.K0((i10 >>> 16) & 255);
        fVar.K0((i10 >>> 8) & 255);
        fVar.K0(i10 & 255);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final r.c g(r rVar) {
        C6496s.h(rVar, "<this>");
        return new C6724c(rVar);
    }

    /* access modifiers changed from: private */
    public static final r h(r rVar, C6708e eVar) {
        C6496s.h(rVar, "$this_asFactory");
        C6496s.h(eVar, "it");
        return rVar;
    }

    public static final boolean i(String str) {
        C6496s.h(str, "<this>");
        return f73546g.d(str);
    }

    public static final boolean j(v vVar, v vVar2) {
        C6496s.h(vVar, "<this>");
        C6496s.h(vVar2, "other");
        if (!C6496s.c(vVar.i(), vVar2.i()) || vVar.o() != vVar2.o() || !C6496s.c(vVar.s(), vVar2.s())) {
            return false;
        }
        return true;
    }

    public static final int k(String str, long j10, TimeUnit timeUnit) {
        C6496s.h(str, "name");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j10);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException((str + " too large.").toString());
            } else if (millis != 0 || i10 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException((str + " too small.").toString());
            }
        } else {
            throw new IllegalStateException("unit == null");
        }
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        C6496s.h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        C6496s.h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!C6496s.c(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String str) {
        C6496s.h(strArr, "<this>");
        C6496s.h(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C6559l.j0(strArr2)] = str;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        C6496s.h(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int q(String str, String str2, int i10, int i11) {
        C6496s.h(str, "<this>");
        C6496s.h(str2, "delimiters");
        while (i10 < i11) {
            if (p.N(str2, str.charAt(i10), false, 2, (Object) null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(W w10, int i10, TimeUnit timeUnit) {
        C6496s.h(w10, "<this>");
        C6496s.h(timeUnit, "timeUnit");
        try {
            return M(w10, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String str, Object... objArr) {
        C6496s.h(str, "format");
        C6496s.h(objArr, "args");
        U u10 = U.f71764a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C6496s.g(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        C6496s.h(strArr, "<this>");
        C6496s.h(comparator, "comparator");
        if (!(strArr.length == 0 || strArr2 == null || strArr2.length == 0)) {
            for (String str : strArr) {
                Iterator a10 = C6481c.a(strArr2);
                while (a10.hasNext()) {
                    if (comparator.compare(str, (String) a10.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(E e10) {
        C6496s.h(e10, "<this>");
        String a10 = e10.F().a("Content-Length");
        if (a10 != null) {
            return X(a10, -1);
        }
        return -1;
    }

    public static final List w(Object... objArr) {
        C6496s.h(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(C6565s.q(Arrays.copyOf(objArr2, objArr2.length)));
        C6496s.g(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int x(String[] strArr, String str, Comparator comparator) {
        C6496s.h(strArr, "<this>");
        C6496s.h(str, "value");
        C6496s.h(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        C6496s.h(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (C6496s.i(charAt, 31) <= 0 || C6496s.i(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        C6496s.h(str, "<this>");
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}

package okhttp3.internal.publicsuffix;

import Rg.k;
import Sg.p;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import sh.C6726e;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "", "f", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "b", "(Ljava/util/List;)Ljava/util/List;", "Llf/M;", "e", "d", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final a f72439e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f72440f = {42};

    /* renamed from: g  reason: collision with root package name */
    private static final List f72441g = C6565s.e("*");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f72442h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f72443a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f72444b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private byte[] f72445c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f72446d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int i12;
            boolean z10;
            int d10;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr3[i14] != 10) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i11 = i15 + i16;
                    if (bArr3[i11] == 10) {
                        break;
                    }
                    i16++;
                }
                int i17 = i11 - i15;
                int i18 = i10;
                boolean z11 = false;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        i12 = C6726e.d(bArr4[i18][i19], 255);
                        z10 = z12;
                    }
                    d10 = i12 - C6726e.d(bArr3[i15 + i20], 255);
                    if (d10 != 0) {
                        break;
                    }
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    } else if (bArr4[i18].length != i19) {
                        z11 = z10;
                    } else if (i18 == bArr4.length - 1) {
                        break;
                    } else {
                        i18++;
                        z11 = true;
                        i19 = -1;
                    }
                }
                if (d10 >= 0) {
                    if (d10 <= 0) {
                        int i21 = i17 - i20;
                        int length2 = bArr4[i18].length - i19;
                        int length3 = bArr4.length;
                        for (int i22 = i18 + 1; i22 < length3; i22++) {
                            length2 += bArr4[i22].length;
                        }
                        if (length2 >= i21) {
                            if (length2 <= i21) {
                                Charset charset = StandardCharsets.UTF_8;
                                C6496s.g(charset, "UTF_8");
                                return new String(bArr3, i15, i17, charset);
                            }
                        }
                    }
                    i13 = i11 + 1;
                }
                length = i14;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f72442h;
        }

        private a() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List b(java.util.List r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f72443a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f72443a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0018
            r17.e()
            goto L_0x0025
        L_0x0018:
            java.util.concurrent.CountDownLatch r1 = r0.f72444b     // Catch:{ InterruptedException -> 0x001e }
            r1.await()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0025
        L_0x001e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0025:
            byte[] r1 = r0.f72445c
            if (r1 == 0) goto L_0x010c
            int r1 = r18.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x0030:
            if (r5 >= r1) goto L_0x004e
            r6 = r18
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            kotlin.jvm.internal.C6496s.g(r8, r9)
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C6496s.g(r7, r8)
            r4[r5] = r7
            int r5 = r5 + r3
            goto L_0x0030
        L_0x004e:
            r5 = r2
        L_0x004f:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x0067
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = f72439e
            byte[] r9 = r0.f72445c
            if (r9 != 0) goto L_0x005e
            kotlin.jvm.internal.C6496s.v(r6)
            r9 = r7
        L_0x005e:
            java.lang.String r8 = r8.b(r9, r4, r5)
            if (r8 == 0) goto L_0x0065
            goto L_0x0068
        L_0x0065:
            int r5 = r5 + r3
            goto L_0x004f
        L_0x0067:
            r8 = r7
        L_0x0068:
            if (r1 <= r3) goto L_0x008d
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r2
        L_0x0073:
            if (r10 >= r9) goto L_0x008d
            byte[] r11 = f72440f
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r11 = f72439e
            byte[] r12 = r0.f72445c
            if (r12 != 0) goto L_0x0083
            kotlin.jvm.internal.C6496s.v(r6)
            r12 = r7
        L_0x0083:
            java.lang.String r11 = r11.b(r12, r5, r10)
            if (r11 == 0) goto L_0x008b
            r5 = r11
            goto L_0x008e
        L_0x008b:
            int r10 = r10 + r3
            goto L_0x0073
        L_0x008d:
            r5 = r7
        L_0x008e:
            if (r5 == 0) goto L_0x00aa
            int r1 = r1 - r3
            r6 = r2
        L_0x0092:
            if (r6 >= r1) goto L_0x00aa
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r9 = f72439e
            byte[] r10 = r0.f72446d
            if (r10 != 0) goto L_0x00a0
            java.lang.String r10 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.C6496s.v(r10)
            r10 = r7
        L_0x00a0:
            java.lang.String r9 = r9.b(r10, r4, r6)
            if (r9 == 0) goto L_0x00a8
            r7 = r9
            goto L_0x00aa
        L_0x00a8:
            int r6 = r6 + r3
            goto L_0x0092
        L_0x00aa:
            r1 = 46
            if (r7 == 0) goto L_0x00cc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 33
            r4.append(r5)
            r4.append(r7)
            java.lang.String r8 = r4.toString()
            char[] r9 = new char[r3]
            r9[r2] = r1
            r12 = 6
            r13 = 0
            r10 = 0
            r11 = 0
            java.util.List r1 = Sg.p.E0(r8, r9, r10, r11, r12, r13)
            return r1
        L_0x00cc:
            if (r8 != 0) goto L_0x00d3
            if (r5 != 0) goto L_0x00d3
            java.util.List r1 = f72441g
            return r1
        L_0x00d3:
            if (r8 == 0) goto L_0x00e5
            char[] r7 = new char[r3]
            r7[r2] = r1
            r10 = 6
            r11 = 0
            r4 = 0
            r9 = 0
            r6 = r8
            r8 = r4
            java.util.List r4 = Sg.p.E0(r6, r7, r8, r9, r10, r11)
            if (r4 != 0) goto L_0x00e9
        L_0x00e5:
            java.util.List r4 = mf.C6565s.n()
        L_0x00e9:
            if (r5 == 0) goto L_0x00fb
            char[] r12 = new char[r3]
            r12[r2] = r1
            r15 = 6
            r16 = 0
            r13 = 0
            r14 = 0
            r11 = r5
            java.util.List r1 = Sg.p.E0(r11, r12, r13, r14, r15, r16)
            if (r1 != 0) goto L_0x00ff
        L_0x00fb:
            java.util.List r1 = mf.C6565s.n()
        L_0x00ff:
            int r2 = r4.size()
            int r3 = r1.size()
            if (r2 <= r3) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r4 = r1
        L_0x010b:
            return r4
        L_0x010c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        wf.C6763c.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r5 = this;
            kotlin.jvm.internal.N r0 = new kotlin.jvm.internal.N     // Catch:{ all -> 0x005d }
            r0.<init>()     // Catch:{ all -> 0x005d }
            kotlin.jvm.internal.N r1 = new kotlin.jvm.internal.N     // Catch:{ all -> 0x005d }
            r1.<init>()     // Catch:{ all -> 0x005d }
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r3 = "publicsuffixes.gz"
            java.io.InputStream r2 = r2.getResourceAsStream(r3)     // Catch:{ all -> 0x005d }
            if (r2 != 0) goto L_0x001a
            java.util.concurrent.CountDownLatch r0 = r5.f72444b
            r0.countDown()
            return
        L_0x001a:
            Gh.q r3 = new Gh.q     // Catch:{ all -> 0x005d }
            Gh.W r2 = Gh.H.l(r2)     // Catch:{ all -> 0x005d }
            r3.<init>(r2)     // Catch:{ all -> 0x005d }
            Gh.g r2 = Gh.H.d(r3)     // Catch:{ all -> 0x005d }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0062 }
            long r3 = (long) r3     // Catch:{ all -> 0x0062 }
            byte[] r3 = r2.l0(r3)     // Catch:{ all -> 0x0062 }
            r0.f71759a = r3     // Catch:{ all -> 0x0062 }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0062 }
            long r3 = (long) r3     // Catch:{ all -> 0x0062 }
            byte[] r3 = r2.l0(r3)     // Catch:{ all -> 0x0062 }
            r1.f71759a = r3     // Catch:{ all -> 0x0062 }
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x0062 }
            r3 = 0
            wf.C6763c.a(r2, r3)     // Catch:{ all -> 0x005d }
            monitor-enter(r5)     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.f71759a     // Catch:{ all -> 0x005f }
            kotlin.jvm.internal.C6496s.e(r0)     // Catch:{ all -> 0x005f }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x005f }
            r5.f72445c = r0     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r1.f71759a     // Catch:{ all -> 0x005f }
            kotlin.jvm.internal.C6496s.e(r0)     // Catch:{ all -> 0x005f }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x005f }
            r5.f72446d = r0     // Catch:{ all -> 0x005f }
            monitor-exit(r5)     // Catch:{ all -> 0x005d }
            java.util.concurrent.CountDownLatch r0 = r5.f72444b
            r0.countDown()
            return
        L_0x005d:
            r0 = move-exception
            goto L_0x0069
        L_0x005f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x0062:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            wf.C6763c.a(r2, r0)     // Catch:{ all -> 0x005d }
            throw r1     // Catch:{ all -> 0x005d }
        L_0x0069:
            java.util.concurrent.CountDownLatch r1 = r5.f72444b
            r1.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.d():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.d()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            Bh.j$a r2 = Bh.j.f62626a     // Catch:{ all -> 0x000e }
            Bh.j r2 = r2.g()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.k(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.e():void");
    }

    private final List f(String str) {
        List E02 = p.E0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (C6496s.c(C6565s.z0(E02), "")) {
            return C6565s.h0(E02, 1);
        }
        return E02;
    }

    public final String c(String str) {
        int size;
        int size2;
        C6496s.h(str, "domain");
        String unicode = IDN.toUnicode(str);
        C6496s.g(unicode, "unicodeDomain");
        List f10 = f(unicode);
        List b10 = b(f10);
        if (f10.size() == b10.size() && ((String) b10.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) b10.get(0)).charAt(0) == '!') {
            size = f10.size();
            size2 = b10.size();
        } else {
            size = f10.size();
            size2 = b10.size() + 1;
        }
        return k.v(k.n(C6565s.b0(f(str)), size - size2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
    }
}

package wf;

import Sg.C5541d;
import io.intercom.android.sdk.models.AttributeType;
import java.io.File;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.C6496s;

abstract class m extends l {
    public static final ByteBuffer d(int i10, CharsetEncoder charsetEncoder) {
        C6496s.h(charsetEncoder, "encoder");
        ByteBuffer allocate = ByteBuffer.allocate(i10 * ((int) ((float) Math.ceil((double) charsetEncoder.maxBytesPerChar()))));
        C6496s.g(allocate, "allocate(...)");
        return allocate;
    }

    public static final CharsetEncoder e(Charset charset) {
        C6496s.h(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        wf.C6763c.a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] f(java.io.File r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch:{ all -> 0x0028 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r4 = "File "
            if (r3 > 0) goto L_0x0086
            int r1 = (int) r1
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x0028 }
            r3 = 0
            r5 = r1
            r6 = r3
        L_0x001d:
            if (r5 <= 0) goto L_0x002b
            int r7 = r0.read(r2, r6, r5)     // Catch:{ all -> 0x0028 }
            if (r7 < 0) goto L_0x002b
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0028:
            r10 = move-exception
            goto L_0x00a8
        L_0x002b:
            java.lang.String r7 = "copyOf(...)"
            r8 = 0
            if (r5 <= 0) goto L_0x0038
            byte[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch:{ all -> 0x0028 }
            kotlin.jvm.internal.C6496s.g(r2, r7)     // Catch:{ all -> 0x0028 }
            goto L_0x0068
        L_0x0038:
            int r5 = r0.read()     // Catch:{ all -> 0x0028 }
            r6 = -1
            if (r5 != r6) goto L_0x0040
            goto L_0x0068
        L_0x0040:
            wf.e r6 = new wf.e     // Catch:{ all -> 0x0028 }
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x0028 }
            r6.write(r5)     // Catch:{ all -> 0x0028 }
            r5 = 2
            wf.C6762b.b(r0, r6, r3, r5, r8)     // Catch:{ all -> 0x0028 }
            int r5 = r6.size()     // Catch:{ all -> 0x0028 }
            int r5 = r5 + r1
            if (r5 < 0) goto L_0x006c
            byte[] r10 = r6.a()     // Catch:{ all -> 0x0028 }
            byte[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x0028 }
            kotlin.jvm.internal.C6496s.g(r2, r7)     // Catch:{ all -> 0x0028 }
            int r4 = r6.size()     // Catch:{ all -> 0x0028 }
            byte[] r2 = mf.C6559l.h(r10, r2, r1, r3, r4)     // Catch:{ all -> 0x0028 }
        L_0x0068:
            wf.C6763c.a(r0, r8)
            return r2
        L_0x006c:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r2.<init>()     // Catch:{ all -> 0x0028 }
            r2.append(r4)     // Catch:{ all -> 0x0028 }
            r2.append(r10)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r10)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0086:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r5.<init>()     // Catch:{ all -> 0x0028 }
            r5.append(r4)     // Catch:{ all -> 0x0028 }
            r5.append(r10)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = " is too big ("
            r5.append(r10)     // Catch:{ all -> 0x0028 }
            r5.append(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = " bytes) to fit in memory."
            r5.append(r10)     // Catch:{ all -> 0x0028 }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x0028 }
            r3.<init>(r10)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x00a8:
            throw r10     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            wf.C6763c.a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.m.f(java.io.File):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        wf.C6763c.a(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String g(java.io.File r2, java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = wf.t.d(r0)     // Catch:{ all -> 0x001d }
            r3 = 0
            wf.C6763c.a(r0, r3)
            return r2
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            wf.C6763c.a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.m.g(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    public static /* synthetic */ String h(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5541d.f65029b;
        }
        return g(file, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        wf.C6763c.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(java.io.File r1, byte[] r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0019 }
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x0019 }
            r1 = 0
            wf.C6763c.a(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            wf.C6763c.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.m.i(java.io.File, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        wf.C6763c.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(java.io.File r1, java.lang.String r2, java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            l(r0, r2, r3)     // Catch:{ all -> 0x001e }
            lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x001e }
            r1 = 0
            wf.C6763c.a(r0, r1)
            return
        L_0x001e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2 = move-exception
            wf.C6763c.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.m.j(java.io.File, java.lang.String, java.nio.charset.Charset):void");
    }

    public static /* synthetic */ void k(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = C5541d.f65029b;
        }
        j(file, str, charset);
    }

    public static final void l(OutputStream outputStream, String str, Charset charset) {
        boolean z10;
        C6496s.h(outputStream, "<this>");
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            C6496s.g(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder e10 = e(charset);
        CharBuffer allocate = CharBuffer.allocate(8192);
        C6496s.e(e10);
        ByteBuffer d10 = d(8192, e10);
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int min = Math.min(8192 - i11, str.length() - i10);
            int i12 = i10 + min;
            char[] array = allocate.array();
            C6496s.g(array, "array(...)");
            str.getChars(i10, i12, array, i11);
            allocate.limit(min + i11);
            i11 = 1;
            if (i12 == str.length()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.encode(allocate, d10, z10).isUnderflow()) {
                outputStream.write(d10.array(), 0, d10.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i11 = 0;
                }
                allocate.clear();
                d10.clear();
                i10 = i12;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }
}

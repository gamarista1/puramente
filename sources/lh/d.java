package Lh;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final char f64094a = File.separatorChar;

    /* renamed from: b  reason: collision with root package name */
    public static final String f64095b;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
        throw r2;
     */
    static {
        /*
            char r0 = java.io.File.separatorChar
            f64094a = r0
            Mh.a r0 = new Mh.a
            r1 = 4
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x001f }
            r1.<init>(r0)     // Catch:{ all -> 0x001f }
            r1.println()     // Catch:{ all -> 0x0021 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0021 }
            f64095b = r2     // Catch:{ all -> 0x0021 }
            r1.close()     // Catch:{ all -> 0x001f }
            r0.close()
            return
        L_0x001f:
            r1 = move-exception
            goto L_0x002d
        L_0x0021:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x001f }
        L_0x002c:
            throw r3     // Catch:{ all -> 0x001f }
        L_0x002d:
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0037:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.d.<clinit>():void");
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long e10 = e(inputStream, outputStream);
        if (e10 > 2147483647L) {
            return -1;
        }
        return (int) e10;
    }

    public static int b(Reader reader, Writer writer) {
        long g10 = g(reader, writer);
        if (g10 > 2147483647L) {
            return -1;
        }
        return (int) g10;
    }

    public static long c(InputStream inputStream, OutputStream outputStream, int i10) {
        return f(inputStream, outputStream, new byte[i10]);
    }

    public static void d(InputStream inputStream, Writer writer, Charset charset) {
        b(new InputStreamReader(inputStream, a.a(charset)), writer);
    }

    public static long e(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, 4096);
    }

    public static long f(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
        }
    }

    public static long g(Reader reader, Writer writer) {
        return h(reader, writer, new char[4096]);
    }

    public static long h(Reader reader, Writer writer, char[] cArr) {
        long j10 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j10;
            }
            writer.write(cArr, 0, read);
            j10 += (long) read;
        }
    }

    public static String i(InputStream inputStream) {
        return j(inputStream, Charset.defaultCharset());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String j(java.io.InputStream r1, java.nio.charset.Charset r2) {
        /*
            Mh.a r0 = new Mh.a
            r0.<init>()
            d(r1, r0, r2)     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0010 }
            r0.close()
            return r1
        L_0x0010:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x001b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.d.j(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}

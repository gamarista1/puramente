package androidx.profileinstaller;

import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

abstract class g {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f17857a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f17858b = {112, 114, 109, 0};

    private static void A(byte[] bArr, int i10, int i11, c cVar) {
        int m10 = m(i10, i11, cVar.f17845g);
        int i12 = m10 / 8;
        bArr[i12] = (byte) ((1 << (m10 % 8)) | bArr[i12]);
    }

    private static void B(InputStream inputStream) {
        d.h(inputStream);
        int j10 = d.j(inputStream);
        if (j10 != 6 && j10 != 7) {
            while (j10 > 0) {
                d.j(inputStream);
                for (int j11 = d.j(inputStream); j11 > 0; j11--) {
                    d.h(inputStream);
                }
                j10--;
            }
        }
    }

    static boolean C(OutputStream outputStream, byte[] bArr, c[] cVarArr) {
        if (Arrays.equals(bArr, i.f17870a)) {
            P(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, i.f17871b)) {
            O(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, i.f17873d)) {
            M(outputStream, cVarArr);
            return true;
        } else if (Arrays.equals(bArr, i.f17872c)) {
            N(outputStream, cVarArr);
            return true;
        } else if (!Arrays.equals(bArr, i.f17874e)) {
            return false;
        } else {
            L(outputStream, cVarArr);
            return true;
        }
    }

    private static void D(OutputStream outputStream, c cVar) {
        int[] iArr = cVar.f17846h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            d.p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    private static j E(c[] cVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i10 = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.f17841c);
                d.q(byteArrayOutputStream, cVar.f17842d);
                d.q(byteArrayOutputStream, (long) cVar.f17845g);
                String j10 = j(cVar.f17839a, cVar.f17840b, i.f17870a);
                int k10 = d.k(j10);
                d.p(byteArrayOutputStream, k10);
                i10 = i10 + 14 + k10;
                d.n(byteArrayOutputStream, j10);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                j jVar = new j(e.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return jVar;
            }
            throw d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    static void F(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f17857a);
        outputStream.write(bArr);
    }

    private static void G(OutputStream outputStream, c cVar) {
        K(outputStream, cVar);
        D(outputStream, cVar);
        I(outputStream, cVar);
    }

    private static void H(OutputStream outputStream, c cVar, String str) {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.f17843e);
        d.q(outputStream, (long) cVar.f17844f);
        d.q(outputStream, cVar.f17841c);
        d.q(outputStream, (long) cVar.f17845g);
        d.n(outputStream, str);
    }

    private static void I(OutputStream outputStream, c cVar) {
        byte[] bArr = new byte[k(cVar.f17845g)];
        for (Map.Entry entry : cVar.f17847i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                A(bArr, 2, intValue, cVar);
            }
            if ((intValue2 & 4) != 0) {
                A(bArr, 4, intValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void J(OutputStream outputStream, int i10, c cVar) {
        byte[] bArr = new byte[l(i10, cVar.f17845g)];
        for (Map.Entry entry : cVar.f17847i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (!(i12 == 1 || (i12 & i10) == 0)) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (cVar.f17845g * i11) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void K(OutputStream outputStream, c cVar) {
        int i10 = 0;
        for (Map.Entry entry : cVar.f17847i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                d.p(outputStream, intValue - i10);
                d.p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    private static void L(OutputStream outputStream, c[] cVarArr) {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String j10 = j(cVar.f17839a, cVar.f17840b, i.f17874e);
            d.p(outputStream, d.k(j10));
            d.p(outputStream, cVar.f17847i.size());
            d.p(outputStream, cVar.f17846h.length);
            d.q(outputStream, cVar.f17841c);
            d.n(outputStream, j10);
            for (Integer intValue : cVar.f17847i.keySet()) {
                d.p(outputStream, intValue.intValue());
            }
            for (int p10 : cVar.f17846h) {
                d.p(outputStream, p10);
            }
        }
    }

    private static void M(OutputStream outputStream, c[] cVarArr) {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String j10 = j(cVar.f17839a, cVar.f17840b, i.f17873d);
            d.p(outputStream, d.k(j10));
            d.p(outputStream, cVar.f17846h.length);
            d.q(outputStream, (long) (cVar.f17847i.size() * 4));
            d.q(outputStream, cVar.f17841c);
            d.n(outputStream, j10);
            for (Integer intValue : cVar.f17847i.keySet()) {
                d.p(outputStream, intValue.intValue());
                d.p(outputStream, 0);
            }
            for (int p10 : cVar.f17846h) {
                d.p(outputStream, p10);
            }
        }
    }

    private static void N(OutputStream outputStream, c[] cVarArr) {
        byte[] b10 = b(cVarArr, i.f17872c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b10);
    }

    private static void O(OutputStream outputStream, c[] cVarArr) {
        byte[] b10 = b(cVarArr, i.f17871b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b10);
    }

    private static void P(OutputStream outputStream, c[] cVarArr) {
        Q(outputStream, cVarArr);
    }

    private static void Q(OutputStream outputStream, c[] cVarArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = ((long) i.f17870a.length) + ((long) f17857a.length) + 4 + ((long) (arrayList.size() * 16));
        d.q(outputStream, (long) arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j jVar = (j) arrayList.get(i10);
            d.q(outputStream, jVar.f17877a.b());
            d.q(outputStream, length2);
            if (jVar.f17880d) {
                byte[] bArr = jVar.f17879c;
                byte[] b10 = d.b(bArr);
                arrayList2.add(b10);
                d.q(outputStream, (long) b10.length);
                d.q(outputStream, (long) bArr.length);
                length = b10.length;
            } else {
                arrayList2.add(jVar.f17879c);
                d.q(outputStream, (long) jVar.f17879c.length);
                d.q(outputStream, 0);
                length = jVar.f17879c.length;
            }
            length2 += (long) length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    private static int a(c cVar) {
        int i10 = 0;
        for (Map.Entry value : cVar.f17847i.entrySet()) {
            i10 |= ((Integer) value.getValue()).intValue();
        }
        return i10;
    }

    private static byte[] b(c[] cVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (c cVar : cVarArr) {
            i11 += d.k(j(cVar.f17839a, cVar.f17840b, bArr)) + 16 + (cVar.f17843e * 2) + cVar.f17844f + k(cVar.f17845g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, i.f17872c)) {
            int length = cVarArr.length;
            while (i10 < length) {
                c cVar2 = cVarArr[i10];
                H(byteArrayOutputStream, cVar2, j(cVar2.f17839a, cVar2.f17840b, bArr));
                G(byteArrayOutputStream, cVar2);
                i10++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                H(byteArrayOutputStream, cVar3, j(cVar3.f17839a, cVar3.f17840b, bArr));
            }
            int length2 = cVarArr.length;
            while (i10 < length2) {
                G(byteArrayOutputStream, cVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    private static j c(c[] cVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = 0;
        while (i10 < cVarArr.length) {
            try {
                c cVar = cVarArr[i10];
                d.p(byteArrayOutputStream, i10);
                d.p(byteArrayOutputStream, cVar.f17843e);
                i11 = i11 + 4 + (cVar.f17843e * 2);
                D(byteArrayOutputStream, cVar);
                i10++;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            j jVar = new j(e.CLASSES, i11, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static j d(c[] cVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = 0;
        while (i10 < cVarArr.length) {
            try {
                c cVar = cVarArr[i10];
                int a10 = a(cVar);
                byte[] e10 = e(a10, cVar);
                byte[] f10 = f(cVar);
                d.p(byteArrayOutputStream, i10);
                int length = e10.length + 2 + f10.length;
                d.q(byteArrayOutputStream, (long) length);
                d.p(byteArrayOutputStream, a10);
                byteArrayOutputStream.write(e10);
                byteArrayOutputStream.write(f10);
                i11 = i11 + 6 + length;
                i10++;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            j jVar = new j(e.METHODS, i11, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static byte[] e(int i10, c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i10, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static byte[] f(c cVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static String g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "!");
        }
        if (Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(str2)) {
            return str.replace("!", Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        }
        return str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    private static c i(c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String h10 = h(str);
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10].f17840b.equals(h10)) {
                return cVarArr[i10];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a10 = i.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a10);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            return g(str2, a10);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + i.a(bArr) + str2;
    }

    private static int k(int i10) {
        return z(i10 * 2) / 8;
    }

    private static int l(int i10, int i11) {
        return z(Integer.bitCount(i10 & -2) * i11) / 8;
    }

    private static int m(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw d.c("HOT methods are not stored in the bitmap");
        } else if (i10 == 2) {
            return i11;
        } else {
            if (i10 == 4) {
                return i11 + i12;
            }
            throw d.c("Unexpected flag: " + i10);
        }
    }

    private static int[] n(InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += d.h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    private static int o(BitSet bitSet, int i10, int i11) {
        int i12 = 2;
        if (!bitSet.get(m(2, i10, i11))) {
            i12 = 0;
        }
        if (bitSet.get(m(4, i10, i11))) {
            return i12 | 4;
        }
        return i12;
    }

    static byte[] p(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, i.f17871b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void q(InputStream inputStream, c cVar) {
        int available = inputStream.available() - cVar.f17844f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += d.h(inputStream);
            cVar.f17847i.put(Integer.valueOf(i10), 1);
            for (int h10 = d.h(inputStream); h10 > 0; h10--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw d.c("Read too much data during profile line parse");
        }
    }

    static c[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        if (Arrays.equals(bArr, i.f17875f)) {
            if (!Arrays.equals(i.f17870a, bArr2)) {
                return s(inputStream, bArr, cVarArr);
            }
            throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, i.f17876g)) {
            return u(inputStream, bArr2, cVarArr);
        } else {
            throw d.c("Unsupported meta version");
        }
    }

    static c[] s(InputStream inputStream, byte[] bArr, c[] cVarArr) {
        if (Arrays.equals(bArr, i.f17875f)) {
            int j10 = d.j(inputStream);
            byte[] e10 = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    c[] t10 = t(byteArrayInputStream, j10, cVarArr);
                    byteArrayInputStream.close();
                    return t10;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw d.c("Content found after the end of file");
            }
        } else {
            throw d.c("Unsupported meta version");
        }
        throw th;
    }

    private static c[] t(InputStream inputStream, int i10, c[] cVarArr) {
        int i11 = 0;
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i10 == cVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                int h10 = d.h(inputStream);
                iArr[i12] = d.h(inputStream);
                strArr[i12] = d.f(inputStream, h10);
            }
            while (i11 < i10) {
                c cVar = cVarArr[i11];
                if (cVar.f17840b.equals(strArr[i11])) {
                    int i13 = iArr[i11];
                    cVar.f17843e = i13;
                    cVar.f17846h = n(inputStream, i13);
                    i11++;
                } else {
                    throw d.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }

    static c[] u(InputStream inputStream, byte[] bArr, c[] cVarArr) {
        int h10 = d.h(inputStream);
        byte[] e10 = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
            try {
                c[] v10 = v(byteArrayInputStream, bArr, h10, cVarArr);
                byteArrayInputStream.close();
                return v10;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw d.c("Content found after the end of file");
        }
        throw th;
    }

    private static c[] v(InputStream inputStream, byte[] bArr, int i10, c[] cVarArr) {
        int i11 = 0;
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i10 == cVarArr.length) {
            while (i11 < i10) {
                d.h(inputStream);
                String f10 = d.f(inputStream, d.h(inputStream));
                long i12 = d.i(inputStream);
                int h10 = d.h(inputStream);
                c i13 = i(cVarArr, f10);
                if (i13 != null) {
                    i13.f17842d = i12;
                    int[] n10 = n(inputStream, h10);
                    if (Arrays.equals(bArr, i.f17874e)) {
                        i13.f17843e = h10;
                        i13.f17846h = n10;
                    }
                    i11++;
                } else {
                    throw d.c("Missing profile key: " + f10);
                }
            }
            return cVarArr;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }

    private static void w(InputStream inputStream, c cVar) {
        BitSet valueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.f17845g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = cVar.f17845g;
            if (i10 < i11) {
                int o10 = o(valueOf, i10, i11);
                if (o10 != 0) {
                    Integer num = (Integer) cVar.f17847i.get(Integer.valueOf(i10));
                    if (num == null) {
                        num = 0;
                    }
                    cVar.f17847i.put(Integer.valueOf(i10), Integer.valueOf(o10 | num.intValue()));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    static c[] x(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, i.f17871b)) {
            int j10 = d.j(inputStream);
            byte[] e10 = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    c[] y10 = y(byteArrayInputStream, str, j10);
                    byteArrayInputStream.close();
                    return y10;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw d.c("Content found after the end of file");
            }
        } else {
            throw d.c("Unsupported version");
        }
        throw th;
    }

    private static c[] y(InputStream inputStream, String str, int i10) {
        InputStream inputStream2 = inputStream;
        int i11 = i10;
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = d.h(inputStream);
            int h11 = d.h(inputStream);
            String str2 = str;
            int[] iArr = new int[h11];
            cVarArr[i12] = new c(str2, d.f(inputStream2, h10), d.i(inputStream), 0, h11, (int) d.i(inputStream), (int) d.i(inputStream), iArr, new TreeMap());
        }
        for (int i13 = 0; i13 < i11; i13++) {
            c cVar = cVarArr[i13];
            q(inputStream2, cVar);
            cVar.f17846h = n(inputStream2, cVar.f17843e);
            w(inputStream2, cVar);
        }
        return cVarArr;
    }

    private static int z(int i10) {
        return (i10 + 7) & -8;
    }
}

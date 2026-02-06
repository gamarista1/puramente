package O6;

import Ef.i;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.L;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f33395a = new f();

    private f() {
    }

    public static final byte[] a(String str) {
        C6496s.h(str, "value");
        try {
            Charset forName = Charset.forName("ASCII");
            C6496s.g(forName, "forName(...)");
            byte[] bytes = str.getBytes(forName);
            C6496s.g(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static final boolean b(byte[] bArr, byte[] bArr2, int i10) {
        C6496s.h(bArr, "byteArray");
        C6496s.h(bArr2, "pattern");
        if (bArr2.length + i10 > bArr.length) {
            return false;
        }
        i d02 = C6559l.d0(bArr2);
        if (!(d02 instanceof Collection) || !((Collection) d02).isEmpty()) {
            Iterator it = d02.iterator();
            while (it.hasNext()) {
                int a10 = ((L) it).a();
                if (bArr[i10 + a10] != bArr2[a10]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean c(byte[] bArr, byte[] bArr2) {
        C6496s.h(bArr, "byteArray");
        C6496s.h(bArr2, "pattern");
        return b(bArr, bArr2, 0);
    }
}

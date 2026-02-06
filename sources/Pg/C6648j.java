package pg;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: pg.j  reason: case insensitive filesystem */
public abstract class C6648j {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f72547a;

    /* renamed from: b  reason: collision with root package name */
    public static final ByteBuffer f72548b;

    /* renamed from: pg.j$a */
    public interface a {
        int d();
    }

    /* renamed from: pg.j$b */
    public interface b {
        a a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f72547a = bArr;
        f72548b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return x.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }
}

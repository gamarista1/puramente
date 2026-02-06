package bi;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;

public abstract class f {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new Error(e10);
        }
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new Error(e10);
        }
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes(Constants.ENCODING).length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }
}

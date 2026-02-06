package p003if;

import We.C5654u;
import We.E0;
import com.adjust.sdk.Constants;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* renamed from: if.m  reason: invalid package */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f67899a = Charset.forName(Constants.ENCODING);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f67900b = Pattern.compile("[\\W_]+");

    public static String a(String str, C5654u uVar) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(f67899a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e10) {
                uVar.a(E0.INFO, "SHA-1 isn't available to calculate the hash.", e10);
            } catch (Throwable th2) {
                uVar.b(E0.INFO, "string: %s could not calculate its hash", th2, str);
            }
        }
        return null;
    }

    public static String b(String str) {
        if (str.equals("0000-0000")) {
            return "00000000-0000-0000-0000-000000000000";
        }
        return str;
    }
}

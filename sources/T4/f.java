package T4;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f34158a = Charset.forName(Constants.ENCODING);

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}

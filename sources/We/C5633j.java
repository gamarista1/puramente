package We;

import com.adjust.sdk.Constants;
import java.net.URI;
import p003if.h;

/* renamed from: We.j  reason: case insensitive filesystem */
final class C5633j {

    /* renamed from: a  reason: collision with root package name */
    private final String f65902a;

    /* renamed from: b  reason: collision with root package name */
    private final String f65903b;

    /* renamed from: c  reason: collision with root package name */
    private final String f65904c;

    /* renamed from: d  reason: collision with root package name */
    private final String f65905d;

    /* renamed from: e  reason: collision with root package name */
    private final URI f65906e;

    C5633j(String str) {
        String str2;
        try {
            h.c(str, "The DSN is required.");
            URI normalize = new URI(str).normalize();
            String scheme = normalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme)) {
                if (!Constants.SCHEME.equalsIgnoreCase(scheme)) {
                    throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
                }
            }
            String userInfo = normalize.getUserInfo();
            if (userInfo != null) {
                if (!userInfo.isEmpty()) {
                    String[] split = userInfo.split(com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1);
                    String str3 = split[0];
                    this.f65905d = str3;
                    if (str3 == null || str3.isEmpty()) {
                        throw new IllegalArgumentException("Invalid DSN: No public key provided.");
                    }
                    if (split.length > 1) {
                        str2 = split[1];
                    } else {
                        str2 = null;
                    }
                    this.f65904c = str2;
                    String path = normalize.getPath();
                    path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
                    int lastIndexOf = path.lastIndexOf("/") + 1;
                    String substring = path.substring(0, lastIndexOf);
                    if (!substring.endsWith("/")) {
                        substring = substring + "/";
                    }
                    this.f65903b = substring;
                    String substring2 = path.substring(lastIndexOf);
                    this.f65902a = substring2;
                    if (!substring2.isEmpty()) {
                        this.f65906e = new URI(scheme, (String) null, normalize.getHost(), normalize.getPort(), substring + "api/" + substring2, (String) null, (String) null);
                        return;
                    }
                    throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
                }
            }
            throw new IllegalArgumentException("Invalid DSN: No public key provided.");
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }
}

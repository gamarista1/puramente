package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import rh.E;
import rh.w;

class UserIdentityInterceptor implements w {
    private static final String NO_USER_IDENTITY = "A network request was made with no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).";
    private static final String USER_IDENTITY_CHANGED = "registered user changed while this request was in flight";
    private final Twig twig = LumberMill.getLogger();
    private final UserIdentity userIdentity;

    public UserIdentityInterceptor(UserIdentity userIdentity2) {
        this.userIdentity = userIdentity2;
    }

    public E intercept(w.a aVar) {
        if (this.userIdentity.identityExists()) {
            String fingerprint = this.userIdentity.getFingerprint();
            E a10 = aVar.a(aVar.request());
            if (fingerprint.equals(this.userIdentity.getFingerprint())) {
                this.twig.internal("interceptor", "proceeding");
                return a10;
            }
            this.twig.internal("interceptor", "halting: user identity changed");
            if (a10 != null) {
                a10.a().close();
            }
            throw new IOException(USER_IDENTITY_CHANGED);
        } else if (!this.userIdentity.isSoftReset() || !aVar.request().l().toString().contains("device_tokens") || !aVar.request().h().equals("PUT")) {
            throw new IOException(NO_USER_IDENTITY);
        } else {
            this.twig.internal("interceptor", "removing device token - proceeding");
            return aVar.a(aVar.request());
        }
    }
}

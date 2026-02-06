package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public abstract class MacProvider extends SignatureProvider {

    /* renamed from: io.jsonwebtoken.impl.crypto.MacProvider$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.jsonwebtoken.SignatureAlgorithm[] r0 = io.jsonwebtoken.SignatureAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = r0
                io.jsonwebtoken.SignatureAlgorithm r1 = io.jsonwebtoken.SignatureAlgorithm.HS256     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$jsonwebtoken$SignatureAlgorithm     // Catch:{ NoSuchFieldError -> 0x001d }
                io.jsonwebtoken.SignatureAlgorithm r1 = io.jsonwebtoken.SignatureAlgorithm.HS384     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.jsonwebtoken.impl.crypto.MacProvider.AnonymousClass1.<clinit>():void");
        }
    }

    protected MacProvider(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isHmac(), "SignatureAlgorithm must be a HMAC SHA algorithm.");
    }

    public static SecretKey generateKey() {
        return generateKey(SignatureAlgorithm.HS512);
    }

    public static SecretKey generateKey(SignatureAlgorithm signatureAlgorithm) {
        return generateKey(signatureAlgorithm, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    public static SecretKey generateKey(SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        byte[] bArr;
        Assert.isTrue(signatureAlgorithm.isHmac(), "SignatureAlgorithm argument must represent an HMAC algorithm.");
        int i10 = AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()];
        if (i10 == 1) {
            bArr = new byte[32];
        } else if (i10 != 2) {
            bArr = new byte[64];
        } else {
            bArr = new byte[48];
        }
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, signatureAlgorithm.getJcaName());
    }
}

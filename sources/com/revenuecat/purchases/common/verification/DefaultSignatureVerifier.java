package com.revenuecat.purchases.common.verification;

import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sb.C5198c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/verification/DefaultSignatureVerifier;", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "", "publicKeyBytes", "<init>", "([B)V", "", "publicKey", "(Ljava/lang/String;)V", "signatureToVerify", "messageToVerify", "", "verify", "([B[B)Z", "Lsb/c;", "verifier", "Lsb/c;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSignatureVerifier implements SignatureVerifier {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String DEFAULT_PUBLIC_KEY = "UC1upXWg5QVmyOSwozp755xLqquBKjjU+di6U8QhMlM=";
    private final C5198c verifier;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/verification/DefaultSignatureVerifier$Companion;", "", "()V", "DEFAULT_PUBLIC_KEY", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultSignatureVerifier(byte[] bArr) {
        C6496s.h(bArr, "publicKeyBytes");
        this.verifier = new C5198c(bArr);
    }

    public boolean verify(byte[] bArr, byte[] bArr2) {
        C6496s.h(bArr, "signatureToVerify");
        C6496s.h(bArr2, "messageToVerify");
        try {
            this.verifier.a(bArr, bArr2);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DefaultSignatureVerifier(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "publicKey"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = 0
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.lang.String r0 = "decode(publicKey, Base64.DEFAULT)"
            kotlin.jvm.internal.C6496s.g(r2, r0)
            r1.<init>((byte[]) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.verification.DefaultSignatureVerifier.<init>(java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultSignatureVerifier(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DEFAULT_PUBLIC_KEY : str);
    }
}

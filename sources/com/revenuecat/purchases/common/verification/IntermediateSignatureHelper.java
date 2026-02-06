package com.revenuecat.purchases.common.verification;

import Tg.a;
import Tg.c;
import Tg.d;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.IntExtensionsKt;
import com.revenuecat.purchases.utils.Result;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.r;
import mf.C6559l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "", "rootSignatureVerifier", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "(Lcom/revenuecat/purchases/common/verification/SignatureVerifier;)V", "createIntermediateKeyVerifierIfVerified", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/PurchasesError;", "signature", "Lcom/revenuecat/purchases/common/verification/Signature;", "getIntermediateKeyExpirationDate", "Ljava/util/Date;", "intermediateKeyExpirationBytes", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntermediateSignatureHelper {
    private final SignatureVerifier rootSignatureVerifier;

    public IntermediateSignatureHelper(SignatureVerifier signatureVerifier) {
        C6496s.h(signatureVerifier, "rootSignatureVerifier");
        this.rootSignatureVerifier = signatureVerifier;
    }

    private final Date getIntermediateKeyExpirationDate(byte[] bArr) {
        a.C0955a aVar = a.f65168b;
        return new Date(a.t(c.s(IntExtensionsKt.fromLittleEndianBytes(r.f71790a, bArr), d.DAYS)));
    }

    public final Result<SignatureVerifier, PurchasesError> createIntermediateKeyVerifierIfVerified(Signature signature) {
        C6496s.h(signature, "signature");
        if (!this.rootSignatureVerifier.verify(signature.getIntermediateKeySignature(), C6559l.B(signature.getIntermediateKeyExpiration(), signature.getIntermediateKey()))) {
            return new Result.Error(new PurchasesError(PurchasesErrorCode.SignatureVerificationError, "Error verifying intermediate key."));
        }
        Date intermediateKeyExpirationDate = getIntermediateKeyExpirationDate(signature.getIntermediateKeyExpiration());
        if (!intermediateKeyExpirationDate.before(new Date())) {
            return new Result.Success(new DefaultSignatureVerifier(signature.getIntermediateKey()));
        }
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.SignatureVerificationError;
        return new Result.Error(new PurchasesError(purchasesErrorCode, "Intermediate key expired at " + intermediateKeyExpirationDate));
    }
}

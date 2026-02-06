package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.ECKey;

public class EllipticCurveSigner extends EllipticCurveProvider implements Signer {
    public EllipticCurveSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if (!(key instanceof PrivateKey) || !(key instanceof ECKey)) {
            throw new IllegalArgumentException("Elliptic Curve signatures must be computed using an EC PrivateKey.  The specified key of type " + key.getClass().getName() + " is not an EC PrivateKey.");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] doSign(byte[] bArr) {
        Signature createSignatureInstance = createSignatureInstance();
        createSignatureInstance.initSign((PrivateKey) this.key);
        createSignatureInstance.update(bArr);
        return EllipticCurveProvider.transcodeSignatureToConcat(createSignatureInstance.sign(), EllipticCurveProvider.getSignatureByteArrayLength(this.alg));
    }

    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (InvalidKeyException e10) {
            throw new SignatureException("Invalid Elliptic Curve PrivateKey. " + e10.getMessage(), e10);
        } catch (java.security.SignatureException e11) {
            throw new SignatureException("Unable to calculate signature using Elliptic Curve PrivateKey. " + e11.getMessage(), e11);
        } catch (JwtException e12) {
            throw new SignatureException("Unable to convert signature to JOSE format. " + e12.getMessage(), e12);
        }
    }
}

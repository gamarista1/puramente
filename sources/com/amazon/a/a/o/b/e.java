package com.amazon.a.a.o.b;

import com.amazon.a.a.o.c;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f37527a = "SHA384withRSA";

    /* renamed from: b  reason: collision with root package name */
    private static final c f37528b = new c("SignatureVerifier");

    public static boolean a(String str, String str2, PublicKey publicKey) {
        if (c.f37534a) {
            c cVar = f37528b;
            cVar.a("Verifying signature of data: '" + str + "', signature: '" + str2 + "', with key: '" + publicKey.toString());
        }
        try {
            byte[] c10 = com.amazon.c.a.a.c.c(str2.getBytes());
            Signature instance = Signature.getInstance(f37527a);
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            return instance.verify(c10);
        } catch (IOException | GeneralSecurityException unused) {
            return false;
        }
    }
}

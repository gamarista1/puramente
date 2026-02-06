package com.amazon.a.a.o.b;

import com.amazon.a.a.o.a.a;
import com.amazon.a.a.o.b.a.b;
import com.amazon.a.a.o.c;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.IOException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f37529a = ",";

    /* renamed from: b  reason: collision with root package name */
    public static final String f37530b = "=";

    /* renamed from: c  reason: collision with root package name */
    public static final String f37531c = "|";

    /* renamed from: d  reason: collision with root package name */
    private static final c f37532d = new c("SignedToken");

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f37533e = new HashMap();

    public f(String str, PublicKey publicKey) {
        String b10 = b(str);
        int lastIndexOf = b10.lastIndexOf(f37531c);
        if (lastIndexOf != -1) {
            String substring = b10.substring(0, lastIndexOf);
            String substring2 = b10.substring(lastIndexOf + 1);
            if (c.f37534a) {
                c cVar = f37532d;
                cVar.a("Token data: " + substring);
                cVar.a("Signature: " + substring2);
            }
            a(substring, substring2, publicKey);
            c(substring);
            return;
        }
        throw b.d();
    }

    private void a(String str, String str2, PublicKey publicKey) {
        if (!e.a(str, str2, publicKey)) {
            throw new com.amazon.a.a.o.b.a.c();
        }
    }

    private String b(String str) {
        try {
            return new String(com.amazon.c.a.a.c.c(str.getBytes()));
        } catch (IOException e10) {
            throw b.a((Throwable) e10);
        }
    }

    private void c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, f37529a);
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            c cVar = f37532d;
            cVar.a("Field: " + nextToken);
            int indexOf = nextToken.indexOf(f37530b);
            if (indexOf != -1) {
                String substring = nextToken.substring(0, indexOf);
                String substring2 = nextToken.substring(indexOf + 1);
                cVar.a("FieldName: " + substring);
                cVar.a("FieldValue: " + substring2);
                this.f37533e.put(substring, substring2);
            } else {
                throw b.d();
            }
        }
    }

    public String toString() {
        return "Signed Token: " + this.f37533e;
    }

    public String a(String str) {
        a.a((Object) str, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f37533e.get(str);
    }
}

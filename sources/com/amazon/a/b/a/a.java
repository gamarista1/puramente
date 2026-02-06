package com.amazon.a.b.a;

import com.amazon.a.a.d.b;
import com.amazon.a.a.o.b.f;
import com.amazon.a.a.o.d.c;
import java.util.Iterator;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private static final long f37580a = 1;

    /* renamed from: b  reason: collision with root package name */
    private final c f37581b;

    public a(c cVar) {
        super("LICENSE_VERIFICATION_FAILURE", "VERIFICATION_ERRORS", a(cVar));
        com.amazon.a.a.o.a.a.a(cVar.a(), "Created a verification exception with a Verifier that has no errors");
        this.f37581b = cVar;
    }

    private static String a(c cVar) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<com.amazon.a.a.o.d.a> it = cVar.iterator();
        while (it.hasNext()) {
            com.amazon.a.a.o.d.a next = it.next();
            if (sb2.length() != 0) {
                sb2.append(f.f37529a);
            }
            sb2.append(next.a().a());
        }
        return sb2.toString();
    }

    public c d() {
        return this.f37581b;
    }

    public String toString() {
        return this.f37581b.toString();
    }
}

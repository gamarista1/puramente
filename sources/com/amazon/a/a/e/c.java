package com.amazon.a.a.e;

import com.amazon.a.a.e.a;
import java.util.Date;

public abstract class c<T extends a<T>> extends a<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final com.amazon.a.a.o.c f37164b = new com.amazon.a.a.o.c("RelativeExpirable");

    /* renamed from: c  reason: collision with root package name */
    private static final long f37165c = 1000;

    /* renamed from: d  reason: collision with root package name */
    private final Date f37166d = new Date();

    public final Date a() {
        com.amazon.a.a.o.c cVar = f37164b;
        cVar.a("RelativeExpiration duration: " + h() + ", expirable: " + this);
        Date date = new Date(this.f37166d.getTime() + (h() * f37165c));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expiration should occur at time: ");
        sb2.append(date);
        cVar.a(sb2.toString());
        return date;
    }

    /* access modifiers changed from: protected */
    public abstract long h();
}

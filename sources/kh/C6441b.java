package kh;

import Ff.d;
import gh.C5977a;
import gh.C5978b;
import gh.C5982f;
import gh.C5986j;
import gh.C5987k;
import jh.c;
import jh.e;
import jh.f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.N;

/* renamed from: kh.b  reason: case insensitive filesystem */
public abstract class C6441b implements C5978b {
    /* access modifiers changed from: private */
    public final Object b(c cVar) {
        return c.a.c(cVar, getDescriptor(), 1, C5982f.a(this, cVar, cVar.A(getDescriptor(), 0)), (Object) null, 8, (Object) null);
    }

    public C5977a c(c cVar, String str) {
        C6496s.h(cVar, "decoder");
        return cVar.a().d(e(), str);
    }

    public C5987k d(f fVar, Object obj) {
        C6496s.h(fVar, "encoder");
        C6496s.h(obj, "value");
        return fVar.a().e(e(), obj);
    }

    public final Object deserialize(e eVar) {
        Object obj;
        C6496s.h(eVar, "decoder");
        ih.f descriptor = getDescriptor();
        c b10 = eVar.b(descriptor);
        N n10 = new N();
        if (b10.p()) {
            obj = b(b10);
        } else {
            obj = null;
            while (true) {
                int o10 = b10.o(getDescriptor());
                if (o10 != -1) {
                    if (o10 == 0) {
                        n10.f71759a = b10.A(getDescriptor(), o10);
                    } else if (o10 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) n10.f71759a;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(o10);
                        throw new C5986j(sb2.toString());
                    } else {
                        Object obj2 = n10.f71759a;
                        if (obj2 != null) {
                            n10.f71759a = obj2;
                            C5977a a10 = C5982f.a(this, b10, (String) obj2);
                            obj = c.a.c(b10, getDescriptor(), o10, a10, (Object) null, 8, (Object) null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                    }
                } else if (obj != null) {
                    C6496s.f(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) n10.f71759a)).toString());
                }
            }
        }
        b10.c(descriptor);
        return obj;
    }

    public abstract d e();

    public final void serialize(f fVar, Object obj) {
        C6496s.h(fVar, "encoder");
        C6496s.h(obj, "value");
        C5987k b10 = C5982f.b(this, fVar, obj);
        ih.f descriptor = getDescriptor();
        jh.d b11 = fVar.b(descriptor);
        b11.t(getDescriptor(), 0, b10.getDescriptor().i());
        ih.f descriptor2 = getDescriptor();
        C6496s.f(b10, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        b11.B(descriptor2, 1, b10, obj);
        b11.c(descriptor);
    }
}

package mh;

import gh.C5977a;
import gh.C5982f;
import gh.C5983g;
import gh.C5986j;
import gh.C5987k;
import ih.d;
import ih.e;
import ih.f;
import ih.j;
import java.lang.annotation.Annotation;
import kh.C6441b;
import kh.J;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lh.C6538b;
import lh.h;
import lh.i;
import lh.v;
import lh.x;

public abstract class U {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f72158a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                lh.a[] r0 = lh.C6537a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                lh.a r1 = lh.C6537a.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                lh.a r1 = lh.C6537a.POLYMORPHIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                lh.a r1 = lh.C6537a.ALL_JSON_OBJECTS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f72158a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mh.U.a.<clinit>():void");
        }
    }

    public static final void b(j jVar) {
        C6496s.h(jVar, "kind");
        if (jVar instanceof j.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (jVar instanceof e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (jVar instanceof d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(f fVar, C6538b bVar) {
        C6496s.h(fVar, "<this>");
        C6496s.h(bVar, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof lh.f) {
                return ((lh.f) annotation).discriminator();
            }
        }
        return bVar.f().d();
    }

    public static final Object d(h hVar, C5977a aVar) {
        String str;
        x o10;
        C6496s.h(hVar, "<this>");
        C6496s.h(aVar, "deserializer");
        if (!(aVar instanceof C6441b) || hVar.d().f().o()) {
            return aVar.deserialize(hVar);
        }
        String c10 = c(aVar.getDescriptor(), hVar.d());
        i g10 = hVar.g();
        f descriptor = aVar.getDescriptor();
        if (g10 instanceof v) {
            v vVar = (v) g10;
            i iVar = (i) vVar.get(c10);
            if (iVar == null || (o10 = lh.j.o(iVar)) == null) {
                str = null;
            } else {
                str = lh.j.f(o10);
            }
            try {
                C5977a a10 = C5982f.a((C6441b) aVar, hVar, str);
                C6496s.f(a10, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return b0.b(hVar.d(), c10, vVar, a10);
            } catch (C5986j e10) {
                String message = e10.getMessage();
                C6496s.e(message);
                throw F.f(-1, message, vVar.toString());
            }
        } else {
            throw F.e(-1, "Expected " + O.b(v.class) + " as the serialized body of " + descriptor.i() + ", but had " + O.b(g10.getClass()));
        }
    }

    /* access modifiers changed from: private */
    public static final void e(C5987k kVar, C5987k kVar2, String str) {
        if ((kVar instanceof C5983g) && J.a(kVar2.getDescriptor()).contains(str)) {
            String i10 = kVar.getDescriptor().i();
            String i11 = kVar2.getDescriptor().i();
            throw new IllegalStateException(("Sealed class '" + i11 + "' cannot be serialized as base class '" + i10 + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}

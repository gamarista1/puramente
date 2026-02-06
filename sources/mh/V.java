package mh;

import Ff.d;
import gh.C5978b;
import ih.e;
import ih.f;
import ih.j;
import ih.k;
import kotlin.jvm.internal.C6496s;
import nh.h;
import yf.C6798l;

public final class V implements h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f72159a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72160b;

    public V(boolean z10, String str) {
        C6496s.h(str, "discriminator");
        this.f72159a = z10;
        this.f72160b = str;
    }

    private final void f(f fVar, d dVar) {
        int d10 = fVar.d();
        int i10 = 0;
        while (i10 < d10) {
            String e10 = fVar.e(i10);
            if (!C6496s.c(e10, this.f72160b)) {
                i10++;
            } else {
                throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + e10 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(f fVar, d dVar) {
        j h10 = fVar.h();
        if ((h10 instanceof ih.d) || C6496s.c(h10, j.a.f68504a)) {
            throw new IllegalArgumentException("Serializer for " + dVar.w() + " can't be registered as a subclass for polymorphic serialization because its kind " + h10 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        } else if (!this.f72159a) {
            if (C6496s.c(h10, k.b.f68507a) || C6496s.c(h10, k.c.f68508a) || (h10 instanceof e) || (h10 instanceof j.b)) {
                throw new IllegalArgumentException("Serializer for " + dVar.w() + " of kind " + h10 + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    public void a(d dVar, C5978b bVar) {
        h.a.a(this, dVar, bVar);
    }

    public void b(d dVar, C6798l lVar) {
        C6496s.h(dVar, "kClass");
        C6496s.h(lVar, "provider");
    }

    public void c(d dVar, d dVar2, C5978b bVar) {
        C6496s.h(dVar, "baseClass");
        C6496s.h(dVar2, "actualClass");
        C6496s.h(bVar, "actualSerializer");
        f descriptor = bVar.getDescriptor();
        g(descriptor, dVar2);
        if (!this.f72159a) {
            f(descriptor, dVar2);
        }
    }

    public void d(d dVar, C6798l lVar) {
        C6496s.h(dVar, "baseClass");
        C6496s.h(lVar, "defaultSerializerProvider");
    }

    public void e(d dVar, C6798l lVar) {
        C6496s.h(dVar, "baseClass");
        C6496s.h(lVar, "defaultDeserializerProvider");
    }
}

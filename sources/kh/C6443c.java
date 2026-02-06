package kh;

import Ff.d;
import gh.C5986j;
import kotlin.jvm.internal.C6496s;
import lf.C6527k;

/* renamed from: kh.c  reason: case insensitive filesystem */
public abstract class C6443c {
    public static final Void a(d dVar, d dVar2) {
        C6496s.h(dVar, "subClass");
        C6496s.h(dVar2, "baseClass");
        String w10 = dVar.w();
        if (w10 == null) {
            w10 = String.valueOf(dVar);
        }
        b(w10, dVar2);
        throw new C6527k();
    }

    public static final Void b(String str, d dVar) {
        String str2;
        C6496s.h(dVar, "baseClass");
        String str3 = "in the polymorphic scope of '" + dVar.w() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + dVar.w() + "' has to be sealed and '@Serializable'.";
        }
        throw new C5986j(str2);
    }
}

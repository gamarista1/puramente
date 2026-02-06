package nh;

import Ff.d;
import kotlin.jvm.internal.C6496s;

/* renamed from: nh.d  reason: case insensitive filesystem */
final class C6623d extends IllegalArgumentException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6623d(String str) {
        super(str);
        C6496s.h(str, "msg");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6623d(d dVar, d dVar2) {
        this("Serializer for " + dVar2 + " already registered in the scope of " + dVar);
        C6496s.h(dVar, "baseClass");
        C6496s.h(dVar2, "concreteClass");
    }
}

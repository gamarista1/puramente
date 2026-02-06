package com.facebook.imagepipeline.producers;

import V6.j;
import i7.C3593b;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.imagepipeline.producers.u  reason: case insensitive filesystem */
public final class C3314u {

    /* renamed from: a  reason: collision with root package name */
    public static final C3314u f40075a = new C3314u();

    /* renamed from: com.facebook.imagepipeline.producers.u$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private C3314u() {
    }

    public static final j a(C3593b bVar, j jVar, j jVar2, Map map) {
        String f10;
        C6496s.h(bVar, "imageRequest");
        if (bVar.c() == C3593b.C0681b.SMALL) {
            return jVar;
        }
        if (bVar.c() == C3593b.C0681b.DEFAULT) {
            return jVar2;
        }
        if (bVar.c() != C3593b.C0681b.DYNAMIC || map == null || (f10 = bVar.f()) == null) {
            return null;
        }
        return (j) map.get(f10);
    }
}

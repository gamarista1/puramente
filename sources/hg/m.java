package Hg;

import Of.C5490h;
import Wf.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import ng.f;
import yf.C6798l;
import yg.C6805d;

public final class m extends g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(h hVar, String... strArr) {
        super(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        C6496s.h(hVar, "kind");
        C6496s.h(strArr, "formatParams");
    }

    public Set a() {
        throw new IllegalStateException();
    }

    public Set d() {
        throw new IllegalStateException();
    }

    public C5490h e(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        throw new IllegalStateException(j());
    }

    public Set g() {
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public Set c(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    /* renamed from: i */
    public Set b(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}

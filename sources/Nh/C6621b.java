package nh;

import Ff.d;
import gh.C5978b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import yf.C6798l;

/* renamed from: nh.b  reason: case insensitive filesystem */
public final class C6621b {

    /* renamed from: a  reason: collision with root package name */
    private final d f72418a;

    /* renamed from: b  reason: collision with root package name */
    private final C5978b f72419b;

    /* renamed from: c  reason: collision with root package name */
    private final List f72420c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private C6798l f72421d;

    /* renamed from: e  reason: collision with root package name */
    private C6798l f72422e;

    public C6621b(d dVar, C5978b bVar) {
        C6496s.h(dVar, "baseClass");
        this.f72418a = dVar;
        this.f72419b = bVar;
    }

    public final void a(f fVar) {
        C6496s.h(fVar, "builder");
        C5978b bVar = this.f72419b;
        if (bVar != null) {
            d dVar = this.f72418a;
            f.j(fVar, dVar, dVar, bVar, false, 8, (Object) null);
        }
        for (Pair pair : this.f72420c) {
            d dVar2 = (d) pair.a();
            C5978b bVar2 = (C5978b) pair.b();
            d dVar3 = this.f72418a;
            C6496s.f(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder.buildTo$lambda$1>");
            C6496s.f(bVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            f.j(fVar, dVar3, dVar2, bVar2, false, 8, (Object) null);
        }
        C6798l lVar = this.f72421d;
        if (lVar != null) {
            fVar.h(this.f72418a, lVar, false);
        }
        C6798l lVar2 = this.f72422e;
        if (lVar2 != null) {
            fVar.g(this.f72418a, lVar2, false);
        }
    }

    public final void b(d dVar, C5978b bVar) {
        C6496s.h(dVar, "subclass");
        C6496s.h(bVar, "serializer");
        this.f72420c.add(C6502A.a(dVar, bVar));
    }
}

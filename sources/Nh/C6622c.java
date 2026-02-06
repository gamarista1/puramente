package nh;

import Ff.d;
import gh.C5977a;
import gh.C5978b;
import gh.C5987k;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import nh.C6620a;
import yf.C6798l;

/* renamed from: nh.c  reason: case insensitive filesystem */
public final class C6622c extends C6624e {

    /* renamed from: a  reason: collision with root package name */
    private final Map f72423a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f72424b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f72425c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f72426d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f72427e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6622c(Map map, Map map2, Map map3, Map map4, Map map5) {
        super((DefaultConstructorMarker) null);
        C6496s.h(map, "class2ContextualFactory");
        C6496s.h(map2, "polyBase2Serializers");
        C6496s.h(map3, "polyBase2DefaultSerializerProvider");
        C6496s.h(map4, "polyBase2NamedSerializers");
        C6496s.h(map5, "polyBase2DefaultDeserializerProvider");
        this.f72423a = map;
        this.f72424b = map2;
        this.f72425c = map3;
        this.f72426d = map4;
        this.f72427e = map5;
    }

    public void a(h hVar) {
        C6496s.h(hVar, "collector");
        for (Map.Entry entry : this.f72423a.entrySet()) {
            d dVar = (d) entry.getKey();
            C6620a aVar = (C6620a) entry.getValue();
            if (aVar instanceof C6620a.C1043a) {
                C6496s.f(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C5978b b10 = ((C6620a.C1043a) aVar).b();
                C6496s.f(b10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                hVar.a(dVar, b10);
            } else if (aVar instanceof C6620a.b) {
                hVar.b(dVar, ((C6620a.b) aVar).b());
            }
        }
        for (Map.Entry entry2 : this.f72424b.entrySet()) {
            d dVar2 = (d) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                d dVar3 = (d) entry3.getKey();
                C5978b bVar = (C5978b) entry3.getValue();
                C6496s.f(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C6496s.f(dVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                C6496s.f(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                hVar.c(dVar2, dVar3, bVar);
            }
        }
        for (Map.Entry entry4 : this.f72425c.entrySet()) {
            d dVar4 = (d) entry4.getKey();
            C6798l lVar = (C6798l) entry4.getValue();
            C6496s.f(dVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C6496s.f(lVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            hVar.d(dVar4, (C6798l) V.f(lVar, 1));
        }
        for (Map.Entry entry5 : this.f72427e.entrySet()) {
            d dVar5 = (d) entry5.getKey();
            C6798l lVar2 = (C6798l) entry5.getValue();
            C6496s.f(dVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            C6496s.f(lVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            hVar.e(dVar5, (C6798l) V.f(lVar2, 1));
        }
    }

    public C5978b b(d dVar, List list) {
        C5978b bVar;
        C6496s.h(dVar, "kClass");
        C6496s.h(list, "typeArgumentsSerializers");
        C6620a aVar = (C6620a) this.f72423a.get(dVar);
        if (aVar != null) {
            bVar = aVar.a(list);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public C5977a d(d dVar, String str) {
        C5978b bVar;
        C6798l lVar;
        C6496s.h(dVar, "baseClass");
        Map map = (Map) this.f72426d.get(dVar);
        if (map != null) {
            bVar = (C5978b) map.get(str);
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f72427e.get(dVar);
        if (V.m(obj, 1)) {
            lVar = (C6798l) obj;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return (C5977a) lVar.invoke(str);
        }
        return null;
    }

    public C5987k e(d dVar, Object obj) {
        C5978b bVar;
        C6798l lVar;
        C6496s.h(dVar, "baseClass");
        C6496s.h(obj, "value");
        if (!dVar.u(obj)) {
            return null;
        }
        Map map = (Map) this.f72424b.get(dVar);
        if (map != null) {
            bVar = (C5978b) map.get(O.b(obj.getClass()));
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj2 = this.f72425c.get(dVar);
        if (V.m(obj2, 1)) {
            lVar = (C6798l) obj2;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return (C5987k) lVar.invoke(obj);
        }
        return null;
    }
}

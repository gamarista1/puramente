package qe;

import Ff.e;
import Ff.p;
import Ff.r;
import Od.a;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.b;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6514M;
import mf.C6565s;

public final class Q extends C5175w {

    /* renamed from: b  reason: collision with root package name */
    private final p f61401b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f61402c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q(Z z10, p pVar) {
        super(pVar.e());
        e eVar;
        C6496s.h(z10, "converterProvider");
        C6496s.h(pVar, "mapType");
        this.f61401b = pVar;
        p c10 = ((r) C6565s.o0(pVar.c())).c();
        p pVar2 = null;
        if (c10 != null) {
            eVar = c10.b();
        } else {
            eVar = null;
        }
        if (C6496s.c(eVar, O.b(String.class))) {
            r rVar = (r) C6565s.r0(pVar.c(), 1);
            pVar2 = rVar != null ? rVar.c() : pVar2;
            if (pVar2 != null) {
                this.f61402c = z10.a(pVar2);
                return;
            }
            throw new IllegalArgumentException("The map type should contain the key type.");
        }
        throw new IllegalArgumentException(("The map key type should be String, but received " + C6565s.o0(pVar.c()) + ".").toString());
    }

    private final Map i(ReadableMap readableMap, C4464a aVar) {
        CodedException codedException;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry next = entryIterator.next();
            String str = (String) next.getKey();
            DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
            try {
                linkedHashMap.put(str, this.f61402c.a(dynamicFromObject, aVar));
                C6514M m10 = C6514M.f71813a;
                dynamicFromObject.recycle();
            } catch (Throwable th2) {
                dynamicFromObject.recycle();
                throw th2;
            }
        }
        return linkedHashMap;
    }

    public ExpectedType b() {
        return ExpectedType.f60423c.c(this.f61402c.b());
    }

    public boolean c() {
        return this.f61402c.c();
    }

    /* renamed from: g */
    public Map e(Object obj, C4464a aVar) {
        CodedException codedException;
        C6496s.h(obj, "value");
        if (this.f61402c.c()) {
            return (Map) obj;
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(mf.O.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                linkedHashMap.put(key, this.f61402c.a(value, aVar));
            } catch (Throwable th2) {
                if (th2 instanceof CodedException) {
                    codedException = (CodedException) th2;
                } else if (th2 instanceof a) {
                    a aVar2 = th2;
                    String a10 = aVar2.a();
                    C6496s.g(a10, "getCode(...)");
                    codedException = new CodedException(a10, aVar2.getMessage(), aVar2.getCause());
                } else {
                    codedException = new UnexpectedException((Throwable) th2);
                }
                p pVar = this.f61401b;
                p c10 = ((r) pVar.c().get(1)).c();
                C6496s.e(c10);
                C6496s.e(value);
                throw new b(pVar, c10, O.b(value.getClass()), codedException);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: h */
    public Map f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        return i(dynamic.asMap(), aVar);
    }
}

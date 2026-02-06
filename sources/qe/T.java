package qe;

import Ff.p;
import Ff.r;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.List;
import je.C5052a;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class T extends C5175w {

    /* renamed from: b  reason: collision with root package name */
    private final p f61404b;

    /* renamed from: c  reason: collision with root package name */
    private final List f61405c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(Z z10, p pVar) {
        super(pVar.e());
        p pVar2;
        C6496s.h(z10, "converterProvider");
        C6496s.h(pVar, "pairType");
        this.f61404b = pVar;
        r rVar = (r) C6565s.r0(pVar.c(), 0);
        p pVar3 = null;
        if (rVar != null) {
            pVar2 = rVar.c();
        } else {
            pVar2 = null;
        }
        if (pVar2 != null) {
            Y a10 = z10.a(pVar2);
            r rVar2 = (r) C6565s.r0(pVar.c(), 1);
            pVar3 = rVar2 != null ? rVar2.c() : pVar3;
            if (pVar3 != null) {
                this.f61405c = C6565s.q(a10, z10.a(pVar3));
                return;
            }
            throw new IllegalArgumentException("The pair type should contain the type of the second parameter.");
        }
        throw new IllegalArgumentException("The pair type should contain the type of the first parameter.");
    }

    private final Object g(C4464a aVar, ReadableArray readableArray, int i10) {
        CodedException codedException;
        Dynamic dynamic = readableArray.getDynamic(i10);
        try {
            Object a10 = ((Y) this.f61405c.get(i10)).a(dynamic, aVar);
            dynamic.recycle();
            return a10;
        } catch (Throwable th2) {
            dynamic.recycle();
            throw th2;
        }
    }

    private final Pair j(ReadableArray readableArray, C4464a aVar) {
        return new Pair(g(aVar, readableArray, 0), g(aVar, readableArray, 1));
    }

    public ExpectedType b() {
        return new ExpectedType(new SingleType(C5052a.READABLE_ARRAY, (ExpectedType[]) null, 2, (DefaultConstructorMarker) null));
    }

    public boolean c() {
        return false;
    }

    /* renamed from: h */
    public Pair e(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        if (obj instanceof ReadableArray) {
            return j((ReadableArray) obj, aVar);
        }
        return (Pair) obj;
    }

    /* renamed from: i */
    public Pair f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        return j(dynamic.asArray(), aVar);
    }
}

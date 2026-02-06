package qe;

import Ff.p;
import Ff.r;
import Od.a;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.b;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import mf.C6565s;

public final class X extends C5175w {

    /* renamed from: b  reason: collision with root package name */
    private final p f61411b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f61412c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public X(Z z10, p pVar) {
        super(pVar.e());
        C6496s.h(z10, "converterProvider");
        C6496s.h(pVar, "setType");
        this.f61411b = pVar;
        p c10 = ((r) C6565s.o0(pVar.c())).c();
        if (c10 != null) {
            this.f61412c = z10.a(c10);
            return;
        }
        throw new IllegalArgumentException("The set type should contain the type of elements.");
    }

    private final Set i(ReadableArray readableArray, C4464a aVar) {
        CodedException codedException;
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 0;
        while (i10 < size) {
            Dynamic dynamic = readableArray.getDynamic(i10);
            try {
                Object a10 = this.f61412c.a(dynamic, aVar);
                dynamic.recycle();
                arrayList.add(a10);
                i10++;
            } catch (Throwable th2) {
                dynamic.recycle();
                throw th2;
            }
        }
        return C6565s.j1(arrayList);
    }

    public ExpectedType b() {
        return ExpectedType.f60423c.b(this.f61412c.b());
    }

    public boolean c() {
        return false;
    }

    /* renamed from: g */
    public Set e(Object obj, C4464a aVar) {
        CodedException codedException;
        C6496s.h(obj, "value");
        if (this.f61412c.c()) {
            return C6565s.j1((List) obj);
        }
        Iterable iterable = (List) obj;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Object next : iterable) {
            try {
                arrayList.add(this.f61412c.a(next, aVar));
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
                p pVar = this.f61411b;
                p c10 = ((r) C6565s.o0(pVar.c())).c();
                C6496s.e(c10);
                C6496s.e(next);
                throw new b(pVar, c10, O.b(next.getClass()), codedException);
            }
        }
        return C6565s.j1(arrayList);
    }

    /* renamed from: h */
    public Set f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        return i(dynamic.asArray(), aVar);
    }
}

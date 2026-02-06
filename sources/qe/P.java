package qe;

import Ff.p;
import Ff.r;
import Od.a;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.b;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import mf.C6565s;

public final class P extends C5175w {

    /* renamed from: b  reason: collision with root package name */
    private final p f61399b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f61400c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P(Z z10, p pVar) {
        super(pVar.e());
        C6496s.h(z10, "converterProvider");
        C6496s.h(pVar, "listType");
        this.f61399b = pVar;
        p c10 = ((r) C6565s.o0(pVar.c())).c();
        if (c10 != null) {
            this.f61400c = z10.a(c10);
            return;
        }
        throw new IllegalArgumentException("The list type should contain the type of elements.");
    }

    private final List i(ReadableArray readableArray, C4464a aVar) {
        CodedException codedException;
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 0;
        while (i10 < size) {
            Dynamic dynamic = readableArray.getDynamic(i10);
            try {
                Object a10 = this.f61400c.a(dynamic, aVar);
                dynamic.recycle();
                arrayList.add(a10);
                i10++;
            } catch (Throwable th2) {
                dynamic.recycle();
                throw th2;
            }
        }
        return arrayList;
    }

    public ExpectedType b() {
        return ExpectedType.f60423c.b(this.f61400c.b());
    }

    public boolean c() {
        return this.f61400c.c();
    }

    /* renamed from: g */
    public List e(Object obj, C4464a aVar) {
        CodedException codedException;
        C6496s.h(obj, "value");
        if (this.f61400c.c()) {
            return (List) obj;
        }
        Iterable iterable = (List) obj;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Object next : iterable) {
            try {
                arrayList.add(this.f61400c.a(next, aVar));
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
                p pVar = this.f61399b;
                p c10 = ((r) C6565s.o0(pVar.c())).c();
                C6496s.e(c10);
                C6496s.e(next);
                throw new b(pVar, c10, O.b(next.getClass()), codedException);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public List f(Dynamic dynamic, C4464a aVar) {
        CodedException codedException;
        C6496s.h(dynamic, "value");
        if (dynamic.getType() == ReadableType.Array) {
            return i(dynamic.asArray(), aVar);
        }
        try {
            return C6565s.e(this.f61400c.a(dynamic, aVar));
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
            p pVar = this.f61399b;
            p c10 = ((r) C6565s.o0(pVar.c())).c();
            C6496s.e(c10);
            throw new b(pVar, c10, O.b(dynamic.getClass()), codedException);
        }
    }
}

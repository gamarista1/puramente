package qe;

import Ff.d;
import Ff.e;
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
import java.lang.reflect.Array;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import mf.C6565s;
import xf.C6781a;

/* renamed from: qe.e  reason: case insensitive filesystem */
public final class C5158e extends C5175w {

    /* renamed from: b  reason: collision with root package name */
    private final p f61440b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f61441c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5158e(Z z10, p pVar) {
        super(pVar.e());
        C6496s.h(z10, "converterProvider");
        C6496s.h(pVar, "arrayType");
        this.f61440b = pVar;
        p c10 = ((r) C6565s.o0(pVar.c())).c();
        if (c10 != null) {
            this.f61441c = z10.a(c10);
            return;
        }
        throw new IllegalArgumentException("The array type should contain the type of the elements.");
    }

    private final Object[] i(int i10) {
        p c10 = ((r) C6565s.o0(this.f61440b.c())).c();
        C6496s.e(c10);
        e b10 = c10.b();
        C6496s.f(b10, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object newInstance = Array.newInstance(C6781a.b((d) b10), i10);
        C6496s.f(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return (Object[]) newInstance;
    }

    public ExpectedType b() {
        return ExpectedType.f60423c.d(this.f61441c.b());
    }

    public boolean c() {
        return this.f61441c.c();
    }

    /* renamed from: g */
    public Object[] e(Object obj, C4464a aVar) {
        CodedException codedException;
        C6496s.h(obj, "value");
        if (this.f61441c.c()) {
            return (Object[]) obj;
        }
        Object[] objArr = (Object[]) obj;
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj2 = objArr[i10];
            try {
                arrayList.add(this.f61441c.a(obj2, aVar));
                i10++;
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
                p pVar = this.f61440b;
                p c10 = ((r) C6565s.o0(pVar.c())).c();
                C6496s.e(c10);
                C6496s.e(obj2);
                throw new b(pVar, c10, O.b(obj2.getClass()), codedException);
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    /* renamed from: h */
    public Object[] f(Dynamic dynamic, C4464a aVar) {
        CodedException codedException;
        C6496s.h(dynamic, "value");
        ReadableArray asArray = dynamic.asArray();
        Object[] i10 = i(asArray.size());
        int size = asArray.size();
        int i11 = 0;
        while (i11 < size) {
            Dynamic dynamic2 = asArray.getDynamic(i11);
            try {
                Object a10 = this.f61441c.a(dynamic2, aVar);
                dynamic2.recycle();
                i10[i11] = a10;
                i11++;
            } catch (Throwable th2) {
                dynamic2.recycle();
                throw th2;
            }
        }
        return i10;
    }
}

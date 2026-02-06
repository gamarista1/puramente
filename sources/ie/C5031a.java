package ie;

import Ff.d;
import Ff.e;
import Ff.p;
import Od.a;
import ae.C4464a;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6514M;
import mf.C6559l;
import qe.C5155b;

/* renamed from: ie.a  reason: case insensitive filesystem */
public abstract class C5031a {

    /* renamed from: a  reason: collision with root package name */
    private final String f60796a;

    /* renamed from: b  reason: collision with root package name */
    private final C5155b[] f60797b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f60798c;

    /* renamed from: d  reason: collision with root package name */
    private p f60799d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f60800e = true;

    /* renamed from: f  reason: collision with root package name */
    private final int f60801f;

    public C5031a(String str, C5155b[] bVarArr) {
        C6496s.h(str, "name");
        C6496s.h(bVarArr, "desiredArgsTypes");
        this.f60796a = str;
        this.f60797b = bVarArr;
        Iterator it = C6559l.X0(bVarArr).iterator();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (!((C5155b) it.next()).f().e()) {
                break;
            } else {
                i11++;
            }
        }
        this.f60801f = i11 >= 0 ? this.f60797b.length - i11 : i10;
    }

    public abstract void a(C4464a aVar, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str);

    /* access modifiers changed from: protected */
    public final Object[] b(Object[] objArr, C4464a aVar) {
        Class<?> cls;
        CodedException codedException;
        CodedException unexpectedException;
        C6496s.h(objArr, "args");
        if (this.f60801f <= objArr.length) {
            int length = objArr.length;
            C5155b[] bVarArr = this.f60797b;
            if (length <= bVarArr.length) {
                int length2 = bVarArr.length;
                Object[] objArr2 = new Object[length2];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    cls = null;
                    if (i11 >= length2) {
                        break;
                    }
                    objArr2[i11] = null;
                    i11++;
                }
                Iterator a10 = C6481c.a(objArr);
                int length3 = objArr.length;
                while (i10 < length3) {
                    Object next = a10.next();
                    C5155b bVar = this.f60797b[i10];
                    try {
                        objArr2[i10] = bVar.b(next, aVar);
                        C6514M m10 = C6514M.f71813a;
                        i10++;
                    } catch (Throwable th2) {
                        if (th2 instanceof CodedException) {
                            codedException = (CodedException) th2;
                        } else {
                            if (th2 instanceof a) {
                                a aVar2 = th2;
                                String a11 = aVar2.a();
                                C6496s.g(a11, "getCode(...)");
                                unexpectedException = new CodedException(a11, aVar2.getMessage(), aVar2.getCause());
                            } else {
                                unexpectedException = new UnexpectedException((Throwable) th2);
                            }
                            codedException = unexpectedException;
                        }
                        p f10 = bVar.f();
                        if (next != null) {
                            cls = next.getClass();
                        }
                        throw new expo.modules.kotlin.exception.a(f10, i10, String.valueOf(cls), codedException);
                    }
                }
                return objArr2;
            }
        }
        throw new InvalidArgsNumberException(objArr.length, this.f60797b.length, this.f60801f);
    }

    public final C5031a c(boolean z10) {
        this.f60800e = z10;
        return this;
    }

    public final List d() {
        C5155b[] bVarArr = this.f60797b;
        ArrayList arrayList = new ArrayList(bVarArr.length);
        for (C5155b e10 : bVarArr) {
            arrayList.add(e10.e());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final C5155b[] e() {
        return this.f60797b;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return this.f60796a;
    }

    public final p g() {
        return this.f60799d;
    }

    public final boolean h() {
        e eVar;
        d dVar;
        e eVar2;
        p f10;
        if (!this.f60798c) {
            return false;
        }
        C5155b bVar = (C5155b) C6559l.c0(this.f60797b);
        d dVar2 = null;
        if (bVar == null || (f10 = bVar.f()) == null) {
            eVar = null;
        } else {
            eVar = f10.b();
        }
        if (eVar instanceof d) {
            dVar = (d) eVar;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return false;
        }
        if (C6496s.c(dVar, O.b(JavaScriptObject.class))) {
            return true;
        }
        p pVar = this.f60799d;
        if (pVar != null) {
            eVar2 = pVar.b();
        } else {
            eVar2 = null;
        }
        if (eVar2 instanceof d) {
            dVar2 = (d) eVar2;
        }
        if (dVar2 == null) {
            return false;
        }
        return C6496s.c(dVar, dVar2);
    }

    public final boolean i() {
        return this.f60800e;
    }

    public final void j(boolean z10) {
        this.f60798c = z10;
    }

    public final void k(p pVar) {
        this.f60799d = pVar;
    }
}

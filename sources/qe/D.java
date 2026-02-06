package qe;

import Ff.d;
import Ff.g;
import Ff.k;
import Gf.e;
import Gf.f;
import ae.C4464a;
import ae.C4466c;
import ae.t;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.m;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Enumerable;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mf.C6565s;
import xf.C6781a;

public final class D extends C5175w {

    /* renamed from: b  reason: collision with root package name */
    private final d f61388b;

    /* renamed from: c  reason: collision with root package name */
    private final Enum[] f61389c;

    /* renamed from: d  reason: collision with root package name */
    private final g f61390d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public D(d dVar, boolean z10) {
        super(z10);
        boolean z11;
        C6496s.h(dVar, "enumClass");
        this.f61388b = dVar;
        Object[] enumConstants = C6781a.b(dVar).getEnumConstants();
        if (enumConstants != null) {
            Enum[] enumArr = (Enum[]) enumConstants;
            if (enumArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                this.f61389c = enumArr;
                g f10 = e.f(dVar);
                if (f10 != null) {
                    this.f61390d = f10;
                    Class<Enumerable> cls = Enumerable.class;
                    if (!cls.isAssignableFrom(C6781a.b(dVar))) {
                        Rd.d a10 = C4466c.a();
                        d b10 = O.b(cls);
                        Rd.d.b(a10, "Enum '" + dVar + "' should inherit from " + b10 + ".", (Throwable) null, 2, (Object) null);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot convert js value to enum without the primary constructor");
            }
            throw new IllegalArgumentException("Passed enum type is empty");
        }
        throw new IllegalArgumentException("Passed type is not an enum type");
    }

    private final Enum g(Object obj, Enum[] enumArr, String str) {
        Object obj2;
        Enum enumR;
        int i10;
        Field declaredField = C6781a.b(this.f61388b).getDeclaredField(str);
        if (declaredField != null) {
            declaredField.setAccessible(true);
            Class<?> type = declaredField.getType();
            Class<String> cls = String.class;
            if (obj instanceof Dynamic) {
                if (C6496s.c(type, cls)) {
                    obj2 = ((Dynamic) obj).asString();
                } else {
                    obj2 = Integer.valueOf(((Dynamic) obj).asInt());
                }
            } else if (C6496s.c(type, cls)) {
                C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
                obj2 = (String) obj;
            } else {
                if (obj instanceof Double) {
                    i10 = (int) ((Number) obj).doubleValue();
                } else {
                    C6496s.f(obj, "null cannot be cast to non-null type kotlin.Int");
                    i10 = ((Integer) obj).intValue();
                }
                obj2 = Integer.valueOf(i10);
            }
            int length = enumArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumR = null;
                    break;
                }
                enumR = enumArr[i11];
                if (C6496s.c(declaredField.get(enumR), obj2)) {
                    break;
                }
                i11++;
            }
            if (enumR != null) {
                return enumR;
            }
            String w10 = this.f61388b.w();
            throw new IllegalArgumentException(("Couldn't convert '" + obj + "' to " + w10 + " where " + str + " is the enum parameter").toString());
        }
        throw new IllegalArgumentException(("Cannot find a property for " + str + " parameter").toString());
    }

    private final Enum h(String str, Enum[] enumArr) {
        Enum enumR;
        int length = enumArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                enumR = null;
                break;
            }
            enumR = enumArr[i10];
            if (C6496s.c(enumR.name(), str)) {
                break;
            }
            i10++;
        }
        if (enumR != null) {
            return enumR;
        }
        throw new expo.modules.kotlin.exception.d(this.f61388b, enumArr, str);
    }

    public ExpectedType b() {
        return ExpectedType.f60423c.a();
    }

    public boolean c() {
        return false;
    }

    /* renamed from: i */
    public Enum e(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        if (this.f61390d.getParameters().isEmpty()) {
            return h((String) obj, this.f61389c);
        }
        if (this.f61390d.getParameters().size() == 1) {
            Enum[] enumArr = this.f61389c;
            String name = ((k) C6565s.o0(this.f61390d.getParameters())).getName();
            C6496s.e(name);
            return g(obj, enumArr, name);
        }
        throw new m(f.c(O.b(obj.getClass()), (List) null, false, (List) null, 7, (Object) null), f.c(this.f61388b, (List) null, false, (List) null, 7, (Object) null), (Throwable) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: j */
    public Enum f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        if (this.f61390d.getParameters().isEmpty()) {
            return h(dynamic.asString(), this.f61389c);
        }
        if (this.f61390d.getParameters().size() == 1) {
            Enum[] enumArr = this.f61389c;
            String name = ((k) C6565s.o0(this.f61390d.getParameters())).getName();
            C6496s.e(name);
            return g(dynamic, enumArr, name);
        }
        throw new m(t.a(dynamic.getType()), f.c(this.f61388b, (List) null, false, (List) null, 7, (Object) null), (Throwable) null, 4, (DefaultConstructorMarker) null);
    }
}

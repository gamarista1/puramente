package expo.modules.kotlin.types;

import ae.d;
import com.facebook.react.bridge.Dynamic;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6503B;
import lf.C6535s;
import qe.C5166m;
import qe.C5173u;
import qe.H;
import qe.h0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u0019\u001a\u00028\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/kotlin/types/Either;", "", "FirstType", "SecondType", "bareValue", "", "Lqe/u;", "deferredValue", "", "LFf/p;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "d", "(I)Z", "a", "(I)Ljava/lang/Object;", "LFf/d;", "type", "e", "(LFf/d;)Z", "f", "b", "(LFf/d;)Ljava/lang/Object;", "c", "Ljava/lang/Object;", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class Either<FirstType, SecondType> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f60457a;

    /* renamed from: b  reason: collision with root package name */
    private final List f60458b;

    /* renamed from: c  reason: collision with root package name */
    private final List f60459c;

    public Either(Object obj, List list, List list2) {
        C6496s.h(obj, "bareValue");
        C6496s.h(list, "deferredValue");
        C6496s.h(list2, "types");
        this.f60457a = obj;
        this.f60458b = list;
        this.f60459c = list2;
    }

    public final Object a(int i10) {
        C5173u uVar = (C5173u) this.f60458b.get(i10);
        if (uVar instanceof C5166m) {
            return ((C5166m) uVar).a();
        }
        if (C6496s.c(uVar, H.f61391a)) {
            Object obj = this.f60457a;
            Object obj2 = this.f60459c.get(i10);
            throw new C6503B("Cannot cast '" + obj + "' to '" + obj2 + "'");
        } else if (uVar instanceof h0) {
            try {
                Object a10 = ((h0) uVar).a();
                this.f60458b.set(i10, new C5166m(a10));
                return a10;
            } catch (Throwable th2) {
                this.f60458b.set(i10, H.f61391a);
                if (this.f60457a instanceof Dynamic) {
                    Object obj3 = this.f60457a;
                    Object a11 = d.a((Dynamic) obj3);
                    Object obj4 = this.f60459c.get(i10);
                    String message = th2.getMessage();
                    throw new C6503B("Cannot cast '[" + obj3 + "] " + a11 + "' to '" + obj4 + "' - " + message);
                }
                Object obj5 = this.f60457a;
                Object obj6 = this.f60459c.get(i10);
                String message2 = th2.getMessage();
                throw new C6503B("Cannot cast '" + obj5 + "' to '" + obj6 + "' - " + message2);
            }
        } else {
            throw new C6535s();
        }
    }

    public final Object b(Ff.d dVar) {
        C6496s.h(dVar, "type");
        Object a10 = a(0);
        C6496s.f(a10, "null cannot be cast to non-null type FirstType of expo.modules.kotlin.types.Either");
        return a10;
    }

    public final Object c(Ff.d dVar) {
        C6496s.h(dVar, "type");
        Object a10 = a(1);
        C6496s.f(a10, "null cannot be cast to non-null type SecondType of expo.modules.kotlin.types.Either");
        return a10;
    }

    public final boolean d(int i10) {
        C5173u uVar = (C5173u) this.f60458b.get(i10);
        if (uVar instanceof C5166m) {
            return true;
        }
        if (!C6496s.c(uVar, H.f61391a)) {
            if (uVar instanceof h0) {
                try {
                    this.f60458b.set(i10, new C5166m(((h0) uVar).a()));
                    return true;
                } catch (Throwable unused) {
                    this.f60458b.set(i10, H.f61391a);
                }
            } else {
                throw new C6535s();
            }
        }
        return false;
    }

    public final boolean e(Ff.d dVar) {
        C6496s.h(dVar, "type");
        return d(0);
    }

    public final boolean f(Ff.d dVar) {
        C6496s.h(dVar, "type");
        return d(1);
    }
}

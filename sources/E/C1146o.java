package E;

import E.C1135d;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

/* renamed from: E.o  reason: case insensitive filesystem */
public abstract class C1146o {

    /* renamed from: E.o$a */
    public interface a {

        /* renamed from: E.o$a$a  reason: collision with other inner class name */
        static final class C0024a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0024a f1667a = new C0024a();

            C0024a() {
                super(1);
            }

            public final Void a(int i10) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        C6798l getKey();

        C6798l getType() {
            return C0024a.f1667a;
        }
    }

    public final Object f(int i10) {
        C1135d.a aVar = g().get(i10);
        return ((a) aVar.c()).getType().invoke(Integer.valueOf(i10 - aVar.b()));
    }

    public abstract C1135d g();

    public final int h() {
        return g().getSize();
    }

    public final Object i(int i10) {
        Object invoke;
        C1135d.a aVar = g().get(i10);
        int b10 = i10 - aVar.b();
        C6798l key = ((a) aVar.c()).getKey();
        if (key == null || (invoke = key.invoke(Integer.valueOf(b10))) == null) {
            return I.a(i10);
        }
        return invoke;
    }
}

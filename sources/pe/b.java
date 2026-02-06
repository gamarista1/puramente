package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import lf.C6508G;
import pe.e;

public final class b implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61330a;

    public b(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61330a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61330a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61330a;
    }

    public long g(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return C6508G.b(k(i10 * 8));
        }
        throw new IndexOutOfBoundsException();
    }

    public /* bridge */ /* synthetic */ Object get(int i10) {
        return C6508G.a(g(i10));
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public long k(int i10) {
        return this.f61330a.read8Byte(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61330a.toDirectBuffer();
    }
}

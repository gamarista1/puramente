package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import lf.C6506E;
import pe.e;

public final class m implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61339a;

    public m(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61339a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61339a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61339a;
    }

    public int g(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return C6506E.b(k(i10 * 4));
        }
        throw new IndexOutOfBoundsException();
    }

    public /* bridge */ /* synthetic */ Object get(int i10) {
        return C6506E.a(g(i10));
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public int k(int i10) {
        return this.f61339a.read4Byte(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61339a.toDirectBuffer();
    }
}

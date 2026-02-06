package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import lf.C6504C;
import pe.e;

public final class n implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61340a;

    public n(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61340a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61340a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61340a;
    }

    public byte g(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return C6504C.b(k(i10));
        }
        throw new IndexOutOfBoundsException();
    }

    public /* bridge */ /* synthetic */ Object get(int i10) {
        return C6504C.a(g(i10));
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public byte k(int i10) {
        return this.f61340a.readByte(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61340a.toDirectBuffer();
    }
}

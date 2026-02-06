package pe;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import lf.C6511J;
import pe.e;

public final class l implements j, e, i {

    /* renamed from: a  reason: collision with root package name */
    private final JavaScriptTypedArray f61338a;

    public l(JavaScriptTypedArray javaScriptTypedArray) {
        C6496s.h(javaScriptTypedArray, "rawArray");
        this.f61338a = javaScriptTypedArray;
    }

    public int a() {
        return this.f61338a.a();
    }

    public JavaScriptTypedArray b() {
        return this.f61338a;
    }

    public short g(int i10) {
        if (i10 >= 0 && i10 < a()) {
            return C6511J.b(k(i10 * 2));
        }
        throw new IndexOutOfBoundsException();
    }

    public /* bridge */ /* synthetic */ Object get(int i10) {
        return C6511J.a(g(i10));
    }

    public Iterator iterator() {
        return e.a.a(this);
    }

    public short k(int i10) {
        return this.f61338a.read2Byte(i10);
    }

    public ByteBuffer toDirectBuffer() {
        return this.f61338a.toDirectBuffer();
    }
}

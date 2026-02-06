package f7;

import T5.p;
import W5.i;
import W5.l;
import com.facebook.imagepipeline.memory.f;
import com.facebook.imagepipeline.memory.g;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class y implements i {

    /* renamed from: a  reason: collision with root package name */
    private final f f43471a;

    /* renamed from: b  reason: collision with root package name */
    private final l f43472b;

    public y(f fVar, l lVar) {
        C6496s.h(fVar, "pool");
        C6496s.h(lVar, "pooledByteStreams");
        this.f43471a = fVar;
        this.f43472b = lVar;
    }

    public final x f(InputStream inputStream, g gVar) {
        C6496s.h(inputStream, "inputStream");
        C6496s.h(gVar, "outputStream");
        this.f43472b.a(inputStream, gVar);
        return gVar.a();
    }

    /* renamed from: g */
    public x a(InputStream inputStream) {
        C6496s.h(inputStream, "inputStream");
        g gVar = new g(this.f43471a, 0, 2, (DefaultConstructorMarker) null);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    /* renamed from: h */
    public x b(InputStream inputStream, int i10) {
        C6496s.h(inputStream, "inputStream");
        g gVar = new g(this.f43471a, i10);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    /* renamed from: i */
    public x d(byte[] bArr) {
        C6496s.h(bArr, "bytes");
        g gVar = new g(this.f43471a, bArr.length);
        try {
            gVar.write(bArr, 0, bArr.length);
            x n10 = gVar.a();
            gVar.close();
            return n10;
        } catch (IOException e10) {
            throw p.a(e10);
        } catch (Throwable th2) {
            gVar.close();
            throw th2;
        }
    }

    /* renamed from: j */
    public g c() {
        return new g(this.f43471a, 0, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public g e(int i10) {
        return new g(this.f43471a, i10);
    }
}

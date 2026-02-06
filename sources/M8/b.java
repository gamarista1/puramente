package M8;

import D8.d;
import G8.c;
import K8.g;
import K8.h;
import P8.l;
import P8.m;
import T4.i;
import T4.k;
import V4.v;
import com.github.penfeizhou.animation.decode.b;
import java.nio.ByteBuffer;

public class b implements k {

    class a extends N8.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f32687a;

        a(ByteBuffer byteBuffer) {
            this.f32687a = byteBuffer;
        }

        public ByteBuffer b() {
            this.f32687a.position(0);
            return this.f32687a;
        }
    }

    /* renamed from: M8.b$b  reason: collision with other inner class name */
    private static class C0535b implements v {

        /* renamed from: a  reason: collision with root package name */
        private final com.github.penfeizhou.animation.decode.b f32689a;

        /* renamed from: b  reason: collision with root package name */
        private final int f32690b;

        C0535b(com.github.penfeizhou.animation.decode.b bVar, int i10) {
            this.f32689a = bVar;
            this.f32690b = i10;
        }

        public Class a() {
            return com.github.penfeizhou.animation.decode.b.class;
        }

        /* renamed from: b */
        public com.github.penfeizhou.animation.decode.b get() {
            return this.f32689a;
        }

        public int getSize() {
            return this.f32690b;
        }

        public void recycle() {
            this.f32689a.R();
        }
    }

    /* renamed from: c */
    public v b(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
        com.github.penfeizhou.animation.decode.b bVar;
        a aVar = new a(byteBuffer);
        if (m.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            bVar = new l(aVar, (b.j) null);
        } else if (d.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            bVar = new D8.b(aVar, (b.j) null);
        } else if (h.b(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            bVar = new g(aVar, (b.j) null);
        } else if (!c.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            return null;
        } else {
            bVar = new G8.a(aVar, (b.j) null);
        }
        return new C0535b(bVar, byteBuffer.limit());
    }

    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        if ((((Boolean) iVar.c(a.f32683b)).booleanValue() || !m.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) && ((((Boolean) iVar.c(a.f32684c)).booleanValue() || !d.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) && ((((Boolean) iVar.c(a.f32682a)).booleanValue() || !h.b(new com.github.penfeizhou.animation.io.a(byteBuffer))) && (((Boolean) iVar.c(a.f32686e)).booleanValue() || !c.a(new com.github.penfeizhou.animation.io.a(byteBuffer)))))) {
            return false;
        }
        return true;
    }
}

package M8;

import K8.g;
import P8.l;
import T4.i;
import V4.v;
import android.graphics.drawable.Drawable;
import e5.C3496g;
import h5.C3579e;

class d implements C3579e {

    class a extends C3496g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C8.a f32692b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Drawable drawable, C8.a aVar) {
            super(drawable);
            this.f32692b = aVar;
        }

        public Class a() {
            return Drawable.class;
        }

        public int getSize() {
            return this.f32692b.d();
        }

        public void initialize() {
            super.initialize();
        }

        public void recycle() {
            this.f32692b.stop();
        }
    }

    class b extends C3496g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O8.a f32694b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Drawable drawable, O8.a aVar) {
            super(drawable);
            this.f32694b = aVar;
        }

        public Class a() {
            return Drawable.class;
        }

        public int getSize() {
            return this.f32694b.d();
        }

        public void initialize() {
            super.initialize();
        }

        public void recycle() {
            this.f32694b.stop();
        }
    }

    class c extends C3496g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J8.a f32696b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Drawable drawable, J8.a aVar) {
            super(drawable);
            this.f32696b = aVar;
        }

        public Class a() {
            return Drawable.class;
        }

        public int getSize() {
            return this.f32696b.d();
        }

        public void initialize() {
            super.initialize();
        }

        public void recycle() {
            this.f32696b.stop();
        }
    }

    /* renamed from: M8.d$d  reason: collision with other inner class name */
    class C0536d extends C3496g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F8.a f32698b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0536d(Drawable drawable, F8.a aVar) {
            super(drawable);
            this.f32698b = aVar;
        }

        public Class a() {
            return Drawable.class;
        }

        public int getSize() {
            return this.f32698b.d();
        }

        public void initialize() {
            super.initialize();
        }

        public void recycle() {
            this.f32698b.stop();
        }
    }

    d() {
    }

    public v a(v vVar, i iVar) {
        com.github.penfeizhou.animation.decode.b bVar = (com.github.penfeizhou.animation.decode.b) vVar.get();
        boolean booleanValue = ((Boolean) iVar.c(a.f32685d)).booleanValue();
        if (bVar instanceof D8.b) {
            C8.a aVar = new C8.a((D8.b) bVar);
            aVar.h(false);
            aVar.i(booleanValue);
            return new a(aVar, aVar);
        } else if (bVar instanceof l) {
            O8.a aVar2 = new O8.a((l) bVar);
            aVar2.h(false);
            aVar2.i(booleanValue);
            return new b(aVar2, aVar2);
        } else if (bVar instanceof g) {
            J8.a aVar3 = new J8.a((g) bVar);
            aVar3.h(false);
            aVar3.i(booleanValue);
            return new c(aVar3, aVar3);
        } else if (!(bVar instanceof G8.a)) {
            return null;
        } else {
            F8.a aVar4 = new F8.a((G8.a) bVar);
            aVar4.h(false);
            aVar4.i(booleanValue);
            return new C0536d(aVar4, aVar4);
        }
    }
}

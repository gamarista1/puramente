package f7;

import T5.k;
import W5.a;
import W5.i;
import W5.l;
import X6.y;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imagepipeline.memory.e;
import com.facebook.imagepipeline.memory.f;
import java.lang.reflect.InvocationTargetException;

public class D {

    /* renamed from: a  reason: collision with root package name */
    private final C3512B f43414a;

    /* renamed from: b  reason: collision with root package name */
    private f f43415b;

    /* renamed from: c  reason: collision with root package name */
    private i f43416c;

    /* renamed from: d  reason: collision with root package name */
    private f f43417d;

    /* renamed from: e  reason: collision with root package name */
    private d f43418e;

    /* renamed from: f  reason: collision with root package name */
    private f f43419f;

    /* renamed from: g  reason: collision with root package name */
    private i f43420g;

    /* renamed from: h  reason: collision with root package name */
    private l f43421h;

    /* renamed from: i  reason: collision with root package name */
    private a f43422i;

    public D(C3512B b10) {
        this.f43414a = (C3512B) k.g(b10);
    }

    private f a() {
        if (this.f43415b == null) {
            try {
                this.f43415b = AshmemMemoryChunkPool.class.getConstructor(new Class[]{W5.d.class, E.class, F.class}).newInstance(new Object[]{this.f43414a.i(), this.f43414a.g(), this.f43414a.h()});
            } catch (ClassNotFoundException unused) {
                this.f43415b = null;
            } catch (IllegalAccessException unused2) {
                this.f43415b = null;
            } catch (InstantiationException unused3) {
                this.f43415b = null;
            } catch (NoSuchMethodException unused4) {
                this.f43415b = null;
            } catch (InvocationTargetException unused5) {
                this.f43415b = null;
            }
        }
        return this.f43415b;
    }

    private f f(int i10) {
        if (i10 == 0) {
            return g();
        }
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f7.i b() {
        /*
            r5 = this;
            f7.i r0 = r5.f43416c
            if (r0 != 0) goto L_0x00c5
            f7.B r0 = r5.f43414a
            java.lang.String r0 = r0.e()
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1868884870: goto L_0x003d;
                case -1106578487: goto L_0x0033;
                case -404562712: goto L_0x0029;
                case -402149703: goto L_0x001f;
                case 95945896: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0047
        L_0x0015:
            java.lang.String r1 = "dummy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = 0
            goto L_0x0048
        L_0x001f:
            java.lang.String r1 = "dummy_with_tracking"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = r4
            goto L_0x0048
        L_0x0029:
            java.lang.String r1 = "experimental"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = r3
            goto L_0x0048
        L_0x0033:
            java.lang.String r1 = "legacy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = 4
            goto L_0x0048
        L_0x003d:
            java.lang.String r1 = "legacy_default_params"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = r2
            goto L_0x0048
        L_0x0047:
            r0 = -1
        L_0x0048:
            if (r0 == 0) goto L_0x00be
            if (r0 == r4) goto L_0x00b6
            if (r0 == r3) goto L_0x008e
            if (r0 == r2) goto L_0x0070
            com.facebook.imagepipeline.memory.c r0 = new com.facebook.imagepipeline.memory.c
            f7.B r1 = r5.f43414a
            W5.d r1 = r1.i()
            f7.B r2 = r5.f43414a
            f7.E r2 = r2.c()
            f7.B r3 = r5.f43414a
            f7.F r3 = r3.d()
            f7.B r4 = r5.f43414a
            boolean r4 = r4.l()
            r0.<init>(r1, r2, r3, r4)
            r5.f43416c = r0
            goto L_0x00c5
        L_0x0070:
            com.facebook.imagepipeline.memory.c r0 = new com.facebook.imagepipeline.memory.c
            f7.B r1 = r5.f43414a
            W5.d r1 = r1.i()
            f7.E r2 = f7.n.a()
            f7.B r3 = r5.f43414a
            f7.F r3 = r3.d()
            f7.B r4 = r5.f43414a
            boolean r4 = r4.l()
            r0.<init>(r1, r2, r3, r4)
            r5.f43416c = r0
            goto L_0x00c5
        L_0x008e:
            f7.t r0 = new f7.t
            f7.B r1 = r5.f43414a
            int r1 = r1.b()
            f7.B r2 = r5.f43414a
            int r2 = r2.a()
            f7.z r3 = f7.z.h()
            f7.B r4 = r5.f43414a
            boolean r4 = r4.m()
            if (r4 == 0) goto L_0x00af
            f7.B r4 = r5.f43414a
            W5.d r4 = r4.i()
            goto L_0x00b0
        L_0x00af:
            r4 = 0
        L_0x00b0:
            r0.<init>(r1, r2, r3, r4)
            r5.f43416c = r0
            goto L_0x00c5
        L_0x00b6:
            f7.s r0 = new f7.s
            r0.<init>()
            r5.f43416c = r0
            goto L_0x00c5
        L_0x00be:
            f7.r r0 = new f7.r
            r0.<init>()
            r5.f43416c = r0
        L_0x00c5:
            f7.i r0 = r5.f43416c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.D.b():f7.i");
    }

    public f c() {
        if (this.f43417d == null) {
            try {
                this.f43417d = BufferMemoryChunkPool.class.getConstructor(new Class[]{W5.d.class, E.class, F.class}).newInstance(new Object[]{this.f43414a.i(), this.f43414a.g(), this.f43414a.h()});
            } catch (ClassNotFoundException unused) {
                this.f43417d = null;
            } catch (IllegalAccessException unused2) {
                this.f43417d = null;
            } catch (InstantiationException unused3) {
                this.f43417d = null;
            } catch (NoSuchMethodException unused4) {
                this.f43417d = null;
            } catch (InvocationTargetException unused5) {
                this.f43417d = null;
            }
        }
        return this.f43417d;
    }

    public d d() {
        if (this.f43418e == null) {
            this.f43418e = new d(this.f43414a.i(), this.f43414a.f());
        }
        return this.f43418e;
    }

    public int e() {
        return this.f43414a.f().f43429g;
    }

    public f g() {
        if (this.f43419f == null) {
            try {
                this.f43419f = NativeMemoryChunkPool.class.getConstructor(new Class[]{W5.d.class, E.class, F.class}).newInstance(new Object[]{this.f43414a.i(), this.f43414a.g(), this.f43414a.h()});
            } catch (ClassNotFoundException e10) {
                U5.a.n("PoolFactory", "", e10);
                this.f43419f = null;
            } catch (IllegalAccessException e11) {
                U5.a.n("PoolFactory", "", e11);
                this.f43419f = null;
            } catch (InstantiationException e12) {
                U5.a.n("PoolFactory", "", e12);
                this.f43419f = null;
            } catch (NoSuchMethodException e13) {
                U5.a.n("PoolFactory", "", e13);
                this.f43419f = null;
            } catch (InvocationTargetException e14) {
                U5.a.n("PoolFactory", "", e14);
                this.f43419f = null;
            }
        }
        return this.f43419f;
    }

    public i h() {
        return i(y.a() ^ true ? 1 : 0);
    }

    public i i(int i10) {
        if (this.f43420g == null) {
            f f10 = f(i10);
            k.h(f10, "failed to get pool for chunk type: " + i10);
            this.f43420g = new y(f10, j());
        }
        return this.f43420g;
    }

    public l j() {
        if (this.f43421h == null) {
            this.f43421h = new l(k());
        }
        return this.f43421h;
    }

    public a k() {
        if (this.f43422i == null) {
            this.f43422i = new e(this.f43414a.i(), this.f43414a.j(), this.f43414a.k());
        }
        return this.f43422i;
    }
}

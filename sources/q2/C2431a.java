package q2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.media3.exoplayer.r0;
import f2.C1960A;
import f2.C1961B;
import f2.s;
import i2.C2076a;
import i2.L;
import java.io.IOException;
import java.nio.ByteBuffer;
import k2.C2148c;
import l2.f;
import l2.h;
import q2.c;

/* renamed from: q2.a  reason: case insensitive filesystem */
public final class C2431a extends h implements c {

    /* renamed from: o  reason: collision with root package name */
    private final b f25345o;

    /* renamed from: q2.a$a  reason: collision with other inner class name */
    class C0427a extends e {
        C0427a() {
        }

        public void t() {
            C2431a.this.t(this);
        }
    }

    /* renamed from: q2.a$b */
    public interface b {
        Bitmap a(byte[] bArr, int i10);
    }

    /* renamed from: q2.a$c */
    public static final class c implements c.a {

        /* renamed from: b  reason: collision with root package name */
        private final b f25347b = new b();

        public int a(s sVar) {
            String str = sVar.f20083n;
            if (str == null || !C1960A.m(str)) {
                return r0.o(0);
            }
            if (L.A0(sVar.f20083n)) {
                return r0.o(4);
            }
            return r0.o(1);
        }

        /* renamed from: d */
        public C2431a b() {
            return new C2431a(this.f25347b, (C0427a) null);
        }
    }

    /* synthetic */ C2431a(b bVar, C0427a aVar) {
        this(bVar);
    }

    /* access modifiers changed from: private */
    public static Bitmap B(byte[] bArr, int i10) {
        try {
            return C2148c.a(bArr, i10, (BitmapFactory.Options) null);
        } catch (C1961B e10) {
            throw new d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new d((Throwable) e11);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public d k(Throwable th2) {
        return new d("Unexpected decode error", th2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public d l(f fVar, e eVar, boolean z10) {
        boolean z11;
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C2076a.e(fVar.f23520d);
            C2076a.g(byteBuffer.hasArray());
            if (byteBuffer.arrayOffset() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.a(z11);
            eVar.f25349e = this.f25345o.a(byteBuffer.array(), byteBuffer.remaining());
            eVar.f23528b = fVar.f23522f;
            return null;
        } catch (d e10) {
            return e10;
        }
    }

    public /* bridge */ /* synthetic */ e a() {
        return (e) super.a();
    }

    /* access modifiers changed from: protected */
    public f i() {
        return new f(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public e j() {
        return new C0427a();
    }

    private C2431a(b bVar) {
        super(new f[1], new e[1]);
        this.f25345o = bVar;
    }
}

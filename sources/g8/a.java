package G8;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.e;
import org.aomedia.avif.android.AvifDecoder;

public class a extends b {

    /* renamed from: w  reason: collision with root package name */
    private AvifDecoder f31626w = null;

    public a(N8.b bVar, b.j jVar) {
        super(bVar, jVar);
    }

    public int B() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ e C() {
        U();
        return null;
    }

    /* access modifiers changed from: protected */
    public void K() {
        AvifDecoder avifDecoder = this.f31626w;
        if (avifDecoder != null) {
            avifDecoder.release();
            this.f31626w = null;
        }
    }

    /* access modifiers changed from: protected */
    public void M(com.github.penfeizhou.animation.decode.a aVar) {
        Bitmap H10 = H(this.f31626w.getWidth(), this.f31626w.getHeight());
        AvifDecoder avifDecoder = this.f31626w;
        if (avifDecoder != null) {
            int i10 = this.f42718e;
            int i11 = ((b) aVar).f31627a;
            if (i10 != i11) {
                avifDecoder.nthFrame(i11, H10);
            } else if (i10 == 0) {
                avifDecoder.nthFrame(0, H10);
            } else {
                avifDecoder.nextFrame(H10);
            }
            this.f42728o.rewind();
            try {
                H10.copyPixelsToBuffer(this.f42728o);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            J(H10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public H8.a A(Reader reader) {
        return new H8.a(reader);
    }

    /* access modifiers changed from: protected */
    public H8.b U() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public Rect I(H8.a aVar) {
        this.f31626w = AvifDecoder.create(aVar.a());
        return new Rect(0, 0, this.f31626w.getWidth(), this.f31626w.getHeight());
    }

    public com.github.penfeizhou.animation.decode.a u(int i10) {
        b bVar = new b((H8.a) null);
        bVar.f31627a = i10;
        bVar.frameDuration = (int) (this.f31626w.getFrameDurations()[i10] * 1000.0d);
        return bVar;
    }

    public Bitmap v(int i10) {
        if (this.f31626w == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        this.f31626w.nthFrame(i10, createBitmap);
        return createBitmap;
    }

    public int w() {
        AvifDecoder avifDecoder = this.f31626w;
        if (avifDecoder == null) {
            return 0;
        }
        return avifDecoder.getFrameCount();
    }

    /* access modifiers changed from: protected */
    public int x() {
        AvifDecoder avifDecoder = this.f31626w;
        if (avifDecoder == null) {
            return 0;
        }
        if (avifDecoder.getFrameCount() == 1) {
            return 1;
        }
        return this.f31626w.getRepetitionCount();
    }
}

package K8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.gif.decode.GifFrame;
import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;

public class g extends com.github.penfeizhou.animation.decode.b {

    /* renamed from: A  reason: collision with root package name */
    private int f32443A;

    /* renamed from: w  reason: collision with root package name */
    private L8.a f32444w = new L8.a();

    /* renamed from: x  reason: collision with root package name */
    private final Paint f32445x;

    /* renamed from: y  reason: collision with root package name */
    private int f32446y;

    /* renamed from: z  reason: collision with root package name */
    private final b f32447z;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        ByteBuffer f32448a;

        private b() {
        }
    }

    public g(N8.b bVar, b.j jVar) {
        super(bVar, jVar);
        Paint paint = new Paint();
        this.f32445x = paint;
        this.f32446y = 0;
        this.f32447z = new b();
        this.f32443A = 1;
        paint.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public void K() {
        this.f32447z.f32448a = null;
        this.f32444w = null;
    }

    /* access modifiers changed from: protected */
    public void M(com.github.penfeizhou.animation.decode.a aVar) {
        int i10;
        GifFrame gifFrame = (GifFrame) aVar;
        Bitmap H10 = H(this.f42729p.width() / this.f42724k, this.f42729p.height() / this.f42724k);
        Canvas canvas = (Canvas) this.f42727n.get(H10);
        if (canvas == null) {
            canvas = new Canvas(H10);
            this.f42727n.put(H10, canvas);
        }
        Canvas canvas2 = canvas;
        this.f42728o.rewind();
        H10.copyPixelsFromBuffer(this.f42728o);
        if (!gifFrame.transparencyFlag()) {
            i10 = this.f32446y;
        } else {
            i10 = 0;
        }
        int i11 = i10;
        int i12 = this.f42718e;
        if (i12 == 0) {
            H10.eraseColor(i11);
        } else {
            GifFrame gifFrame2 = (GifFrame) this.f42717d.get(i12 - 1);
            canvas2.save();
            int i13 = gifFrame2.frameX;
            int i14 = this.f42724k;
            int i15 = gifFrame2.frameY;
            canvas2.clipRect(i13 / i14, i15 / i14, (i13 + gifFrame2.frameWidth) / i14, (i15 + gifFrame2.frameHeight) / i14);
            int i16 = gifFrame2.disposalMethod;
            if (i16 == 2) {
                canvas2.drawColor(this.f32446y, PorterDuff.Mode.CLEAR);
            } else if (i16 == 3) {
                this.f32447z.f32448a.rewind();
                canvas2.drawColor(this.f32446y, PorterDuff.Mode.CLEAR);
                Bitmap H11 = H(this.f42729p.width() / this.f42724k, this.f42729p.height() / this.f42724k);
                H11.copyPixelsFromBuffer(this.f32447z.f32448a);
                canvas2.drawBitmap(H11, 0.0f, 0.0f, this.f32445x);
                J(H11);
            }
            canvas2.restore();
            if (gifFrame.disposalMethod == 3 && gifFrame2.disposalMethod != 3) {
                this.f42728o.rewind();
                this.f32447z.f32448a.rewind();
                this.f32447z.f32448a.put(this.f42728o);
            }
        }
        int i17 = aVar.frameWidth;
        int i18 = this.f42724k;
        Bitmap H12 = H(i17 / i18, aVar.frameHeight / i18);
        gifFrame.draw(canvas2, this.f32445x, this.f42724k, H12, C());
        canvas2.drawColor(i11, PorterDuff.Mode.DST_OVER);
        J(H12);
        this.f42728o.rewind();
        H10.copyPixelsToBuffer(this.f42728o);
        J(H10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public GifReader A(Reader reader) {
        return new GifReader(reader);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public L8.a C() {
        if (this.f32444w == null) {
            this.f32444w = new L8.a();
        }
        return this.f32444w;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [K8.b] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect I(com.github.penfeizhou.animation.gif.io.GifReader r14) {
        /*
            r13 = this;
            java.util.List r0 = K8.h.c(r14)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = r1
            r5 = r4
            r6 = r2
            r7 = r6
        L_0x000f:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x006f
            java.lang.Object r8 = r0.next()
            K8.b r8 = (K8.b) r8
            boolean r9 = r8 instanceof K8.k
            if (r9 == 0) goto L_0x0030
            K8.k r8 = (K8.k) r8
            int r4 = r8.f32461a
            int r5 = r8.f32462b
            boolean r9 = r8.b()
            if (r9 == 0) goto L_0x000f
            byte r3 = r8.f32464d
            r3 = r3 & 255(0xff, float:3.57E-43)
            goto L_0x000f
        L_0x0030:
            boolean r9 = r8 instanceof K8.c
            if (r9 == 0) goto L_0x0038
            r6 = r8
            K8.c r6 = (K8.c) r6
            goto L_0x000f
        L_0x0038:
            boolean r9 = r8 instanceof K8.i
            if (r9 == 0) goto L_0x0040
            r7 = r8
            K8.i r7 = (K8.i) r7
            goto L_0x000f
        L_0x0040:
            boolean r9 = r8 instanceof K8.j
            if (r9 == 0) goto L_0x0051
            com.github.penfeizhou.animation.gif.decode.GifFrame r9 = new com.github.penfeizhou.animation.gif.decode.GifFrame
            K8.j r8 = (K8.j) r8
            r9.<init>(r14, r6, r7, r8)
            java.util.List r8 = r13.f42717d
            r8.add(r9)
            goto L_0x000f
        L_0x0051:
            boolean r9 = r8 instanceof K8.a
            if (r9 == 0) goto L_0x000f
            K8.a r8 = (K8.a) r8
            java.lang.String r9 = r8.f32437b
            java.lang.String r10 = "NETSCAPE2.0"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x000f
            int r8 = r8.f32436a
            if (r8 != 0) goto L_0x0068
            r13.f32443A = r1
            goto L_0x000f
        L_0x0068:
            if (r8 <= 0) goto L_0x000f
            int r8 = r8 + 1
            r13.f32443A = r8
            goto L_0x000f
        L_0x006f:
            long r7 = (long) r4
            long r9 = (long) r5
            long r7 = r7 * r9
            int r14 = r13.f42724k
            long r9 = (long) r14
            long r11 = (long) r14
            long r9 = r9 * r11
            long r7 = r7 / r9
            r9 = 1
            long r7 = r7 + r9
            r9 = 4
            long r7 = r7 * r9
            int r14 = (int) r7
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ OutOfMemoryError -> 0x00b4 }
            r13.f42728o = r0     // Catch:{ OutOfMemoryError -> 0x00b4 }
            K8.g$b r0 = r13.f32447z     // Catch:{ OutOfMemoryError -> 0x00b4 }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ OutOfMemoryError -> 0x00b4 }
            r0.f32448a = r14     // Catch:{ OutOfMemoryError -> 0x00b4 }
            if (r6 == 0) goto L_0x00ae
            if (r3 < 0) goto L_0x00ae
            int[] r14 = r6.b()
            int r14 = r14.length
            if (r3 >= r14) goto L_0x00ae
            int[] r14 = r6.b()
            r14 = r14[r3]
            r0 = r14 & 255(0xff, float:3.57E-43)
            int r2 = r14 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r14 = r14 >> 16
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = android.graphics.Color.rgb(r0, r2, r14)
            r13.f32446y = r14
        L_0x00ae:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>(r1, r1, r4, r5)
            return r14
        L_0x00b4:
            r14 = move-exception
            double r0 = (double) r7
            r3 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r0 = r0 / r3
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "OutOfMemoryError in GifDecoder: Buffer needed: %.2fMB (%,d bytes)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "GifDecoder"
            android.util.Log.e(r1, r0)
            r13.f42728o = r2
            K8.g$b r0 = r13.f32447z
            r0.f32448a = r2
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: K8.g.I(com.github.penfeizhou.animation.gif.io.GifReader):android.graphics.Rect");
    }

    /* access modifiers changed from: protected */
    public int t(int i10, int i11) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public int x() {
        return this.f32443A;
    }
}

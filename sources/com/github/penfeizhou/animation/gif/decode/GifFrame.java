package com.github.penfeizhou.animation.gif.decode;

import K8.c;
import K8.i;
import K8.j;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.a;
import com.github.penfeizhou.animation.gif.io.GifReader;

public class GifFrame extends a {
    private static final int DEFAULT_DELAY = 10;
    private static final ThreadLocal<byte[]> sDataBlock = new ThreadLocal<>();
    public final c colorTable;
    public final int disposalMethod;
    private final int imageDataOffset;
    private final boolean interlace;
    private final int lzwMinCodeSize;
    public final int transparentColorIndex;

    static {
        System.loadLibrary("animation-decoder-gif");
    }

    public GifFrame(GifReader gifReader, c cVar, i iVar, j jVar) {
        super(gifReader);
        if (iVar != null) {
            this.disposalMethod = iVar.c();
            int i10 = iVar.f32451c;
            this.frameDuration = (i10 <= 0 ? 10 : i10) * 10;
            if (iVar.d()) {
                this.transparentColorIndex = iVar.f32452d;
            } else {
                this.transparentColorIndex = -1;
            }
        } else {
            this.disposalMethod = 0;
            this.transparentColorIndex = -1;
        }
        this.frameX = jVar.f32453a;
        this.frameY = jVar.f32454b;
        this.frameWidth = jVar.f32455c;
        this.frameHeight = jVar.f32456d;
        this.interlace = jVar.b();
        if (jVar.c()) {
            this.colorTable = jVar.f32458f;
        } else {
            this.colorTable = cVar;
        }
        this.lzwMinCodeSize = jVar.f32459g;
        this.imageDataOffset = jVar.f32460h;
    }

    private native void uncompressLZW(GifReader gifReader, int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13, boolean z10, byte[] bArr);

    public void encode(int[] iArr, int i10) {
        ((GifReader) this.reader).reset();
        ((GifReader) this.reader).skip((long) this.imageDataOffset);
        ThreadLocal<byte[]> threadLocal = sDataBlock;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[255];
            threadLocal.set(bArr);
        }
        int[] iArr2 = iArr;
        uncompressLZW((GifReader) this.reader, this.colorTable.b(), this.transparentColorIndex, iArr2, this.frameWidth / i10, this.frameHeight / i10, this.lzwMinCodeSize, this.interlace, bArr);
    }

    public boolean transparencyFlag() {
        if (this.transparentColorIndex >= 0) {
            return true;
        }
        return false;
    }

    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, L8.a aVar) {
        try {
            aVar.c((this.frameWidth * this.frameHeight) / (i10 * i10));
            encode(aVar.b(), i10);
            bitmap.copyPixelsFromBuffer(aVar.a().rewind());
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmap.getWidth();
            this.srcRect.bottom = bitmap.getHeight();
            Rect rect2 = this.dstRect;
            int i11 = this.frameX;
            float f10 = (float) i10;
            rect2.left = (int) (((float) i11) / f10);
            rect2.top = (int) (((float) this.frameY) / f10);
            rect2.right = (int) ((((float) i11) / f10) + ((float) bitmap.getWidth()));
            this.dstRect.bottom = (int) ((((float) this.frameY) / f10) + ((float) bitmap.getHeight()));
            canvas.drawBitmap(bitmap, this.srcRect, this.dstRect, paint);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return bitmap;
    }
}

package b5;

import T4.b;
import T4.h;
import T4.i;
import T4.j;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import c5.o;
import c5.s;
import c5.x;

/* renamed from: b5.d  reason: case insensitive filesystem */
public final class C3153d implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    private final x f36240a = x.b();

    /* renamed from: b  reason: collision with root package name */
    private final int f36241b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36242c;

    /* renamed from: d  reason: collision with root package name */
    private final b f36243d;

    /* renamed from: e  reason: collision with root package name */
    private final o f36244e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f36245f;

    /* renamed from: g  reason: collision with root package name */
    private final j f36246g;

    /* renamed from: b5.d$a */
    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C3153d(int i10, int i11, i iVar) {
        boolean z10;
        this.f36241b = i10;
        this.f36242c = i11;
        this.f36243d = (b) iVar.c(s.f36483f);
        this.f36244e = (o) iVar.c(o.f36478h);
        h hVar = s.f36487j;
        if (iVar.c(hVar) == null || !((Boolean) iVar.c(hVar)).booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f36245f = z10;
        this.f36246g = (j) iVar.c(s.f36484g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        if (this.f36240a.f(this.f36241b, this.f36242c, this.f36245f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f36243d == b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size a10 = imageInfo.getSize();
        int i10 = this.f36241b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = a10.getWidth();
        }
        int i11 = this.f36242c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = a10.getHeight();
        }
        float b10 = this.f36244e.b(a10.getWidth(), a10.getHeight(), i10, i11);
        int round = Math.round(((float) a10.getWidth()) * b10);
        int round2 = Math.round(((float) a10.getHeight()) * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + a10.getWidth() + "x" + a10.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
        }
        imageDecoder.setTargetSize(round, round2);
        j jVar = this.f36246g;
        if (jVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (jVar != j.DISPLAY_P3 || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) {
                    named = ColorSpace.Named.SRGB;
                } else {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i12 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}

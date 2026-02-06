package k7;

import O6.b;
import O6.c;
import W6.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import c7.C3189i;
import java.io.OutputStream;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class g implements c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f45163d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f45164a;

    /* renamed from: b  reason: collision with root package name */
    private final int f45165b;

    /* renamed from: c  reason: collision with root package name */
    private final String f45166c = "SimpleImageTranscoder";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Bitmap.CompressFormat b(c cVar) {
            if (cVar == null) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (cVar == b.f33373b) {
                return Bitmap.CompressFormat.JPEG;
            }
            if (cVar == b.f33374c) {
                return Bitmap.CompressFormat.PNG;
            }
            if (b.a(cVar)) {
                return Bitmap.CompressFormat.WEBP;
            }
            return Bitmap.CompressFormat.JPEG;
        }

        private a() {
        }
    }

    public g(boolean z10, int i10) {
        this.f45164a = z10;
        this.f45165b = i10;
    }

    private final int e(C3189i iVar, h hVar, W6.g gVar) {
        if (!this.f45164a) {
            return 1;
        }
        return C3674a.b(hVar, gVar, iVar, this.f45165b);
    }

    public String a() {
        return this.f45166c;
    }

    public boolean b(C3189i iVar, h hVar, W6.g gVar) {
        C6496s.h(iVar, "encodedImage");
        if (hVar == null) {
            hVar = h.f34907c.a();
        }
        if (!this.f45164a || C3674a.b(hVar, gVar, iVar, this.f45165b) <= 1) {
            return false;
        }
        return true;
    }

    public C3675b c(C3189i iVar, OutputStream outputStream, h hVar, W6.g gVar, c cVar, Integer num, ColorSpace colorSpace) {
        Integer num2;
        g gVar2;
        h hVar2;
        Bitmap bitmap;
        C3675b bVar;
        C3189i iVar2 = iVar;
        OutputStream outputStream2 = outputStream;
        ColorSpace colorSpace2 = colorSpace;
        C6496s.h(iVar2, "encodedImage");
        C6496s.h(outputStream2, "outputStream");
        if (num == null) {
            num2 = 85;
        } else {
            num2 = num;
        }
        if (hVar == null) {
            hVar2 = h.f34907c.a();
            gVar2 = this;
        } else {
            gVar2 = this;
            hVar2 = hVar;
        }
        int e10 = gVar2.e(iVar2, hVar2, gVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = e10;
        if (colorSpace2 != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace2;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(iVar.E(), (Rect) null, options);
            if (decodeStream == null) {
                U5.a.m("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new C3675b(2);
            }
            Matrix g10 = e.g(iVar2, hVar2);
            if (g10 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), g10, false);
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    bitmap = decodeStream;
                    try {
                        U5.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                        bVar = new C3675b(2);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return bVar;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                bitmap.compress(f45163d.b(cVar), num2.intValue(), outputStream2);
                int i10 = 1;
                if (e10 > 1) {
                    i10 = 0;
                }
                bVar = new C3675b(i10);
            } catch (OutOfMemoryError e12) {
                e = e12;
                U5.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                bVar = new C3675b(2);
                bitmap.recycle();
                decodeStream.recycle();
                return bVar;
            }
            bitmap.recycle();
            decodeStream.recycle();
            return bVar;
        } catch (OutOfMemoryError e13) {
            U5.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e13);
            return new C3675b(2);
        }
    }

    public boolean d(c cVar) {
        C6496s.h(cVar, "imageFormat");
        if (cVar == b.f33383l || cVar == b.f33373b) {
            return true;
        }
        return false;
    }
}

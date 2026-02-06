package com.facebook.imagepipeline.nativecode;

import T5.b;
import T5.d;
import T5.k;
import W6.g;
import W6.h;
import android.graphics.ColorSpace;
import c7.C3189i;
import java.io.InputStream;
import java.io.OutputStream;
import k7.C3674a;
import k7.C3675b;
import k7.c;
import k7.e;

@d
public class NativeJpegTranscoder implements c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f39766a;

    /* renamed from: b  reason: collision with root package name */
    private int f39767b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39768c;

    public NativeJpegTranscoder(boolean z10, int i10, boolean z11, boolean z12) {
        this.f39766a = z10;
        this.f39767b = i10;
        this.f39768c = z11;
        if (z12) {
            d.a();
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        d.a();
        boolean z14 = false;
        if (i11 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        if (i11 <= 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        k.b(Boolean.valueOf(z11));
        if (i12 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        k.b(Boolean.valueOf(z12));
        if (i12 <= 100) {
            z13 = true;
        } else {
            z13 = false;
        }
        k.b(Boolean.valueOf(z13));
        k.b(Boolean.valueOf(e.j(i10)));
        if (!(i11 == 8 && i10 == 0)) {
            z14 = true;
        }
        k.c(z14, "no transformation requested");
        nativeTranscodeJpeg((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        d.a();
        boolean z14 = false;
        if (i11 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        if (i11 <= 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        k.b(Boolean.valueOf(z11));
        if (i12 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        k.b(Boolean.valueOf(z12));
        if (i12 <= 100) {
            z13 = true;
        } else {
            z13 = false;
        }
        k.b(Boolean.valueOf(z13));
        k.b(Boolean.valueOf(e.i(i10)));
        if (!(i11 == 8 && i10 == 1)) {
            z14 = true;
        }
        k.c(z14, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    @d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    @d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    public String a() {
        return "NativeJpegTranscoder";
    }

    public boolean b(C3189i iVar, h hVar, g gVar) {
        if (hVar == null) {
            hVar = h.c();
        }
        if (e.f(hVar, gVar, iVar, this.f39766a) < 8) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public C3675b c(C3189i iVar, OutputStream outputStream, h hVar, g gVar, O6.c cVar, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (hVar == null) {
            hVar = h.c();
        }
        int b10 = C3674a.b(hVar, gVar, iVar, this.f39767b);
        InputStream inputStream = null;
        try {
            int f10 = e.f(hVar, gVar, iVar, this.f39766a);
            int a10 = e.a(b10);
            if (this.f39768c) {
                f10 = a10;
            }
            inputStream = iVar.E();
            if (e.f45157b.contains(Integer.valueOf(iVar.y0()))) {
                f((InputStream) k.h(inputStream, "Cannot transcode from null input stream!"), outputStream, e.d(hVar, iVar), f10, num.intValue());
            } else {
                e((InputStream) k.h(inputStream, "Cannot transcode from null input stream!"), outputStream, e.e(hVar, iVar), f10, num.intValue());
            }
            b.b(inputStream);
            int i10 = 1;
            if (b10 != 1) {
                i10 = 0;
            }
            return new C3675b(i10);
        } catch (Throwable th2) {
            b.b(inputStream);
            throw th2;
        }
    }

    public boolean d(O6.c cVar) {
        if (cVar == O6.b.f33373b) {
            return true;
        }
        return false;
    }
}

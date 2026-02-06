package io.intercom.android.sdk.ui.coil;

import X3.g;
import a4.C3117j;
import a4.S;
import d4.m;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import j4.C3627n;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/ui/coil/PdfDecoder;", "La4/j;", "La4/S;", "source", "Lj4/n;", "options", "<init>", "(La4/S;Lj4/n;)V", "La4/h;", "decode", "(Lqf/d;)Ljava/lang/Object;", "La4/S;", "Lj4/n;", "Factory", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PdfDecoder implements C3117j {
    public static final int $stable = 8;
    private final C3627n options;
    private final S source;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/ui/coil/PdfDecoder$Factory;", "La4/j$a;", "<init>", "()V", "", "mimeType", "", "isApplicable", "(Ljava/lang/String;)Z", "Ld4/m;", "result", "Lj4/n;", "options", "LX3/g;", "imageLoader", "La4/j;", "create", "(Ld4/m;Lj4/n;LX3/g;)La4/j;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements C3117j.a {
        public static final int $stable = 0;

        private final boolean isApplicable(String str) {
            if (str != null) {
                return ContentTypeExtensionKt.isPdf(str);
            }
            return false;
        }

        public C3117j create(m mVar, C3627n nVar, g gVar) {
            C6496s.h(mVar, "result");
            C6496s.h(nVar, "options");
            C6496s.h(gVar, "imageLoader");
            if (!isApplicable(mVar.b())) {
                return null;
            }
            return new PdfDecoder(mVar.c(), nVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    public PdfDecoder(S s10, C3627n nVar) {
        C6496s.h(s10, "source");
        C6496s.h(nVar, "options");
        this.source = s10;
        this.options = nVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.drawable.BitmapDrawable decode$lambda$2(io.intercom.android.sdk.ui.coil.PdfDecoder r11, kotlin.jvm.internal.J r12) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r0 = "$isSampled"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            r0 = 0
            a4.S r1 = r11.source     // Catch:{ all -> 0x00d1 }
            Gh.M r1 = r1.a()     // Catch:{ all -> 0x00d1 }
            java.io.File r1 = r1.s()     // Catch:{ all -> 0x00d1 }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.open(r1, r2)     // Catch:{ all -> 0x00d1 }
            android.graphics.pdf.PdfRenderer r2 = new android.graphics.pdf.PdfRenderer     // Catch:{ all -> 0x0091 }
            r2.<init>(r1)     // Catch:{ all -> 0x0091 }
            r3 = 0
            android.graphics.pdf.PdfRenderer$Page r2 = r2.openPage(r3)     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "openPage(...)"
            kotlin.jvm.internal.C6496s.g(r2, r4)     // Catch:{ all -> 0x0091 }
            int r4 = r2.getWidth()     // Catch:{ all -> 0x0091 }
            int r5 = r2.getHeight()     // Catch:{ all -> 0x0091 }
            j4.n r6 = r11.options     // Catch:{ all -> 0x0091 }
            k4.i r6 = r6.o()     // Catch:{ all -> 0x0091 }
            j4.n r7 = r11.options     // Catch:{ all -> 0x0091 }
            k4.h r7 = r7.n()     // Catch:{ all -> 0x0091 }
            boolean r8 = k4.C3660b.b(r6)     // Catch:{ all -> 0x0091 }
            if (r8 == 0) goto L_0x0046
            r6 = r4
            goto L_0x004e
        L_0x0046:
            k4.c r6 = r6.d()     // Catch:{ all -> 0x0091 }
            int r6 = io.intercom.android.sdk.ui.coil.PdfDecoderKt.toPx(r6, r7)     // Catch:{ all -> 0x0091 }
        L_0x004e:
            j4.n r7 = r11.options     // Catch:{ all -> 0x0091 }
            k4.i r7 = r7.o()     // Catch:{ all -> 0x0091 }
            j4.n r8 = r11.options     // Catch:{ all -> 0x0091 }
            k4.h r8 = r8.n()     // Catch:{ all -> 0x0091 }
            boolean r9 = k4.C3660b.b(r7)     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0062
            r7 = r5
            goto L_0x006a
        L_0x0062:
            k4.c r7 = r7.c()     // Catch:{ all -> 0x0091 }
            int r7 = io.intercom.android.sdk.ui.coil.PdfDecoderKt.toPx(r7, r8)     // Catch:{ all -> 0x0091 }
        L_0x006a:
            r8 = 1
            if (r4 <= 0) goto L_0x00a0
            if (r5 <= 0) goto L_0x00a0
            if (r4 != r6) goto L_0x0073
            if (r5 == r7) goto L_0x00a0
        L_0x0073:
            j4.n r9 = r11.options     // Catch:{ all -> 0x0091 }
            k4.h r9 = r9.n()     // Catch:{ all -> 0x0091 }
            double r6 = a4.C3116i.c(r4, r5, r6, r7, r9)     // Catch:{ all -> 0x0091 }
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0084
            r3 = r8
        L_0x0084:
            r12.f71755a = r3     // Catch:{ all -> 0x0091 }
            if (r3 != 0) goto L_0x0094
            j4.n r12 = r11.options     // Catch:{ all -> 0x0091 }
            boolean r12 = r12.c()     // Catch:{ all -> 0x0091 }
            if (r12 != 0) goto L_0x00a0
            goto L_0x0094
        L_0x0091:
            r11 = move-exception
            r0 = r1
            goto L_0x00d2
        L_0x0094:
            double r3 = (double) r4     // Catch:{ all -> 0x0091 }
            double r3 = r3 * r6
            int r4 = Af.a.c(r3)     // Catch:{ all -> 0x0091 }
            double r9 = (double) r5     // Catch:{ all -> 0x0091 }
            double r6 = r6 * r9
            int r5 = Af.a.c(r6)     // Catch:{ all -> 0x0091 }
        L_0x00a0:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0091 }
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r4, r5, r12)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "createBitmap(...)"
            kotlin.jvm.internal.C6496s.g(r12, r3)     // Catch:{ all -> 0x0091 }
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch:{ all -> 0x0091 }
            r3.<init>(r12)     // Catch:{ all -> 0x0091 }
            r4 = -1
            r3.drawColor(r4)     // Catch:{ all -> 0x0091 }
            r2.render(r12, r0, r0, r8)     // Catch:{ all -> 0x0091 }
            j4.n r11 = r11.options     // Catch:{ all -> 0x0091 }
            android.content.Context r11 = r11.g()     // Catch:{ all -> 0x0091 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "getResources(...)"
            kotlin.jvm.internal.C6496s.g(r11, r0)     // Catch:{ all -> 0x0091 }
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0091 }
            r0.<init>(r11, r12)     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x00d0
            r1.close()
        L_0x00d0:
            return r0
        L_0x00d1:
            r11 = move-exception
        L_0x00d2:
            if (r0 == 0) goto L_0x00d7
            r0.close()
        L_0x00d7:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.coil.PdfDecoder.decode$lambda$2(io.intercom.android.sdk.ui.coil.PdfDecoder, kotlin.jvm.internal.J):android.graphics.drawable.BitmapDrawable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object decode(qf.C6658d<? super a4.C3115h> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.intercom.android.sdk.ui.coil.PdfDecoder$decode$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.intercom.android.sdk.ui.coil.PdfDecoder$decode$1 r0 = (io.intercom.android.sdk.ui.coil.PdfDecoder$decode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.ui.coil.PdfDecoder$decode$1 r0 = new io.intercom.android.sdk.ui.coil.PdfDecoder$decode$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.J r0 = (kotlin.jvm.internal.J) r0
            lf.w.b(r7)
            goto L_0x0051
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            lf.w.b(r7)
            kotlin.jvm.internal.J r7 = new kotlin.jvm.internal.J
            r7.<init>()
            io.intercom.android.sdk.ui.coil.a r2 = new io.intercom.android.sdk.ui.coil.a
            r2.<init>(r6, r7)
            r0.L$0 = r7
            r0.label = r3
            r4 = 0
            java.lang.Object r0 = Ug.C5594t0.c(r4, r2, r0, r3, r4)
            if (r0 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0051:
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            a4.h r1 = new a4.h
            boolean r0 = r0.f71755a
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.coil.PdfDecoder.decode(qf.d):java.lang.Object");
    }
}

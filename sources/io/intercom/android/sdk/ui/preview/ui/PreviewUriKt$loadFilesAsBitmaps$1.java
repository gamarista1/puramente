package io.intercom.android.sdk.ui.preview.ui;

import Y.G0;
import android.content.Context;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/G0;", "", "Landroid/graphics/Bitmap;", "Llf/M;", "<anonymous>", "(LY/G0;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1", f = "PreviewUri.kt", l = {251}, m = "invokeSuspend")
final class PreviewUriKt$loadFilesAsBitmaps$1 extends l implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ IntercomPreviewFile $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreviewUriKt$loadFilesAsBitmaps$1(IntercomPreviewFile intercomPreviewFile, Context context, C6658d<? super PreviewUriKt$loadFilesAsBitmaps$1> dVar) {
        super(2, dVar);
        this.$file = intercomPreviewFile;
        this.$context = context;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        PreviewUriKt$loadFilesAsBitmaps$1 previewUriKt$loadFilesAsBitmaps$1 = new PreviewUriKt$loadFilesAsBitmaps$1(this.$file, this.$context, dVar);
        previewUriKt$loadFilesAsBitmaps$1.L$0 = obj;
        return previewUriKt$loadFilesAsBitmaps$1;
    }

    public final Object invoke(G0 g02, C6658d<? super C6514M> dVar) {
        return ((PreviewUriKt$loadFilesAsBitmaps$1) create(g02, dVar)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: Y.G0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078 A[SYNTHETIC, Splitter:B:21:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r12.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r0 = r12.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r12.L$0
            Y.G0 r1 = (Y.G0) r1
            lf.w.b(r13)     // Catch:{ all -> 0x0018 }
            goto L_0x005e
        L_0x0018:
            r13 = move-exception
            goto L_0x00c4
        L_0x001b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0023:
            lf.w.b(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            Y.G0 r1 = (Y.G0) r1
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile r4 = r12.$file     // Catch:{ all -> 0x0018 }
            boolean r4 = r4 instanceof io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile.NetworkFile     // Catch:{ all -> 0x0018 }
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = "download_"
            java.lang.String r5 = ".tmp"
            android.content.Context r6 = r12.$context     // Catch:{ all -> 0x0018 }
            java.io.File r6 = r6.getCacheDir()     // Catch:{ all -> 0x0018 }
            java.io.File r4 = java.io.File.createTempFile(r4, r5, r6)     // Catch:{ all -> 0x0018 }
            Ug.G r5 = Ug.Z.b()     // Catch:{ all -> 0x0018 }
            io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1$1 r6 = new io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1$1     // Catch:{ all -> 0x0018 }
            io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile r7 = r12.$file     // Catch:{ all -> 0x0018 }
            r6.<init>(r7, r4, r3)     // Catch:{ all -> 0x0018 }
            r12.L$0 = r1     // Catch:{ all -> 0x0018 }
            r12.L$1 = r13     // Catch:{ all -> 0x0018 }
            r12.label = r2     // Catch:{ all -> 0x0018 }
            java.lang.Object r4 = Ug.C5572i.g(r5, r6, r12)     // Catch:{ all -> 0x0018 }
            if (r4 != r0) goto L_0x005c
            return r0
        L_0x005c:
            r0 = r13
            r13 = r4
        L_0x005e:
            android.os.ParcelFileDescriptor r13 = (android.os.ParcelFileDescriptor) r13     // Catch:{ all -> 0x0018 }
            goto L_0x0076
        L_0x0061:
            android.content.Context r0 = r12.$context     // Catch:{ all -> 0x0018 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0018 }
            io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile r4 = r12.$file     // Catch:{ all -> 0x0018 }
            android.net.Uri r4 = r4.getUri()     // Catch:{ all -> 0x0018 }
            java.lang.String r5 = "r"
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r4, r5)     // Catch:{ all -> 0x0018 }
            r11 = r0
            r0 = r13
            r13 = r11
        L_0x0076:
            if (r13 == 0) goto L_0x00b9
            android.graphics.pdf.PdfRenderer r4 = new android.graphics.pdf.PdfRenderer     // Catch:{ all -> 0x00b5 }
            r4.<init>(r13)     // Catch:{ all -> 0x00b5 }
            int r5 = r4.getPageCount()     // Catch:{ all -> 0x00b5 }
            r6 = 0
        L_0x0082:
            if (r6 >= r5) goto L_0x00b9
            android.graphics.pdf.PdfRenderer$Page r7 = r4.openPage(r6)     // Catch:{ all -> 0x00b5 }
            java.lang.String r8 = "openPage(...)"
            kotlin.jvm.internal.C6496s.g(r7, r8)     // Catch:{ all -> 0x00b5 }
            int r8 = r7.getWidth()     // Catch:{ all -> 0x00b5 }
            int r9 = r7.getHeight()     // Catch:{ all -> 0x00b5 }
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00b5 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r9, r10)     // Catch:{ all -> 0x00b5 }
            java.lang.String r9 = "createBitmap(...)"
            kotlin.jvm.internal.C6496s.g(r8, r9)     // Catch:{ all -> 0x00b5 }
            android.graphics.Canvas r9 = new android.graphics.Canvas     // Catch:{ all -> 0x00b5 }
            r9.<init>(r8)     // Catch:{ all -> 0x00b5 }
            r10 = -1
            r9.drawColor(r10)     // Catch:{ all -> 0x00b5 }
            r7.render(r8, r3, r3, r2)     // Catch:{ all -> 0x00b5 }
            r0.add(r8)     // Catch:{ all -> 0x00b5 }
            r7.close()     // Catch:{ all -> 0x00b5 }
            int r6 = r6 + 1
            goto L_0x0082
        L_0x00b5:
            r0 = move-exception
            r3 = r13
            r13 = r0
            goto L_0x00c4
        L_0x00b9:
            r1.setValue(r0)     // Catch:{ all -> 0x00b5 }
            if (r13 == 0) goto L_0x00c1
            r13.close()
        L_0x00c1:
            lf.M r13 = lf.C6514M.f71813a
            return r13
        L_0x00c4:
            if (r3 == 0) goto L_0x00c9
            r3.close()
        L_0x00c9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

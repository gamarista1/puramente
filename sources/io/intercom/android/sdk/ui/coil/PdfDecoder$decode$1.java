package io.intercom.android.sdk.ui.coil;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.ui.coil.PdfDecoder", f = "PdfDecoder.kt", l = {32}, m = "decode")
final class PdfDecoder$decode$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PdfDecoder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PdfDecoder$decode$1(PdfDecoder pdfDecoder, C6658d<? super PdfDecoder$decode$1> dVar) {
        super(dVar);
        this.this$0 = pdfDecoder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.decode(this);
    }
}

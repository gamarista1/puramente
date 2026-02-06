package com.revenuecat.purchases.common;

import java.io.BufferedReader;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import wf.t;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/BufferedReader;", "bufferedReader", "Llf/M;", "invoke", "(Ljava/io/BufferedReader;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class FileHelper$readFilePerLines$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FileHelper$readFilePerLines$1(C6798l lVar) {
        super(1);
        this.$block = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BufferedReader) obj);
        return C6514M.f71813a;
    }

    public final void invoke(BufferedReader bufferedReader) {
        C6496s.h(bufferedReader, "bufferedReader");
        this.$block.invoke(t.c(bufferedReader));
    }
}

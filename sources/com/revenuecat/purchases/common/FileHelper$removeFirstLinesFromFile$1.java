package com.revenuecat.purchases.common;

import Rg.h;
import Rg.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LRg/h;", "", "sequence", "Llf/M;", "invoke", "(LRg/h;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class FileHelper$removeFirstLinesFromFile$1 extends C6498u implements C6798l {
    final /* synthetic */ int $numberOfLinesToRemove;
    final /* synthetic */ StringBuilder $textToAppend;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FileHelper$removeFirstLinesFromFile$1(int i10, StringBuilder sb2) {
        super(1);
        this.$numberOfLinesToRemove = i10;
        this.$textToAppend = sb2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((h) obj);
        return C6514M.f71813a;
    }

    public final void invoke(h hVar) {
        C6496s.h(hVar, "sequence");
        h<String> n10 = k.n(hVar, this.$numberOfLinesToRemove);
        StringBuilder sb2 = this.$textToAppend;
        for (String append : n10) {
            sb2.append(append);
            sb2.append("\n");
        }
    }
}

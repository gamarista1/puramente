package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

abstract class l {
    static int a(RecyclerView.B b10, i iVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.J() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1;
        }
        return Math.min(iVar.n(), iVar.d(view2) - iVar.g(view));
    }

    static int b(RecyclerView.B b10, i iVar, View view, View view2, RecyclerView.p pVar, boolean z10, boolean z11) {
        int i10;
        if (pVar.J() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.h0(view), pVar.h0(view2));
        int max = Math.max(pVar.h0(view), pVar.h0(view2));
        if (z11) {
            i10 = Math.max(0, (b10.b() - max) - 1);
        } else {
            i10 = Math.max(0, min);
        }
        if (!z10) {
            return i10;
        }
        return Math.round((((float) i10) * (((float) Math.abs(iVar.d(view2) - iVar.g(view))) / ((float) (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1)))) + ((float) (iVar.m() - iVar.g(view))));
    }

    static int c(RecyclerView.B b10, i iVar, View view, View view2, RecyclerView.p pVar, boolean z10) {
        if (pVar.J() == 0 || b10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b10.b();
        }
        return (int) ((((float) (iVar.d(view2) - iVar.g(view))) / ((float) (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1))) * ((float) b10.b()));
    }
}

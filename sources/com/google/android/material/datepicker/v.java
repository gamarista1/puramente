package com.google.android.material.datepicker;

import Ua.g;
import Ua.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import java.util.Calendar;
import java.util.Locale;

class v extends RecyclerView.h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final i f55936d;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55937a;

        a(int i10) {
            this.f55937a = i10;
        }

        public void onClick(View view) {
            v.this.f55936d.W(v.this.f55936d.N().e(m.b(this.f55937a, v.this.f55936d.P().f55907b)));
            v.this.f55936d.X(i.k.DAY);
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: u  reason: collision with root package name */
        final TextView f55939u;

        b(TextView textView) {
            super(textView);
            this.f55939u = textView;
        }
    }

    v(i iVar) {
        this.f55936d = iVar;
    }

    private View.OnClickListener A(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: package-private */
    public int B(int i10) {
        return i10 - this.f55936d.N().j().f55908c;
    }

    /* access modifiers changed from: package-private */
    public int C(int i10) {
        return this.f55936d.N().j().f55908c + i10;
    }

    /* renamed from: D */
    public void o(b bVar, int i10) {
        b bVar2;
        int C10 = C(i10);
        String string = bVar.f55939u.getContext().getString(h.f52909y);
        bVar.f55939u.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(C10)}));
        bVar.f55939u.setContentDescription(String.format(string, new Object[]{Integer.valueOf(C10)}));
        c O10 = this.f55936d.O();
        Calendar j10 = u.j();
        if (j10.get(1) == C10) {
            bVar2 = O10.f55805f;
        } else {
            bVar2 = O10.f55803d;
        }
        for (Long longValue : this.f55936d.Q().g0()) {
            j10.setTimeInMillis(longValue.longValue());
            if (j10.get(1) == C10) {
                bVar2 = O10.f55804e;
            }
        }
        bVar2.d(bVar.f55939u);
        bVar.f55939u.setOnClickListener(A(C10));
    }

    /* renamed from: E */
    public b q(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(g.f52873q, viewGroup, false));
    }

    public int e() {
        return this.f55936d.N().k();
    }
}

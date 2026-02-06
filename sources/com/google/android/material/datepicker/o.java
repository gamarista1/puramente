package com.google.android.material.datepicker;

import Ua.e;
import Ua.g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.C1680b0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;

class o extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final a f55919d;

    /* renamed from: e  reason: collision with root package name */
    private final e f55920e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final i.l f55921f;

    /* renamed from: g  reason: collision with root package name */
    private final int f55922g;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f55923a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f55923a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f55923a.getAdapter().n(i10)) {
                o.this.f55921f.a(this.f55923a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: u  reason: collision with root package name */
        final TextView f55925u;

        /* renamed from: v  reason: collision with root package name */
        final MaterialCalendarGridView f55926v;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(e.f52807C);
            this.f55925u = textView;
            C1680b0.p0(textView, true);
            this.f55926v = (MaterialCalendarGridView) linearLayout.findViewById(e.f52853y);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    o(Context context, e eVar, a aVar, i.l lVar) {
        int i10;
        m j10 = aVar.j();
        m g10 = aVar.g();
        m i11 = aVar.i();
        if (j10.compareTo(i11) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (i11.compareTo(g10) <= 0) {
            int R10 = n.f55913f * i.R(context);
            if (j.l0(context)) {
                i10 = i.R(context);
            } else {
                i10 = 0;
            }
            this.f55922g = R10 + i10;
            this.f55919d = aVar;
            this.f55920e = eVar;
            this.f55921f = lVar;
            x(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    public m A(int i10) {
        return this.f55919d.j().p(i10);
    }

    /* access modifiers changed from: package-private */
    public CharSequence B(int i10) {
        return A(i10).l();
    }

    /* access modifiers changed from: package-private */
    public int C(m mVar) {
        return this.f55919d.j().s(mVar);
    }

    /* renamed from: D */
    public void o(b bVar, int i10) {
        m p10 = this.f55919d.j().p(i10);
        bVar.f55925u.setText(p10.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f55926v.findViewById(e.f52853y);
        if (materialCalendarGridView.getAdapter() == null || !p10.equals(materialCalendarGridView.getAdapter().f55914a)) {
            n nVar = new n(p10, this.f55920e, this.f55919d);
            materialCalendarGridView.setNumColumns(p10.f55909d);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: E */
    public b q(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(g.f52871o, viewGroup, false);
        if (!j.l0(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f55922g));
        return new b(linearLayout, true);
    }

    public int e() {
        return this.f55919d.h();
    }

    public long f(int i10) {
        return this.f55919d.j().p(i10).o();
    }
}

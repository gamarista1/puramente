package com.google.android.exoplayer2.ui;

import N9.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.common.collect.C4770v;
import ga.w;
import ha.d;
import ha.e;
import ha.g;
import ja.C3645a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k9.C3717q0;
import k9.s1;

public class TrackSelectionView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f43019a;

    /* renamed from: b  reason: collision with root package name */
    private final LayoutInflater f43020b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckedTextView f43021c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckedTextView f43022d;

    /* renamed from: e  reason: collision with root package name */
    private final b f43023e;

    /* renamed from: f  reason: collision with root package name */
    private final List f43024f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f43025g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f43026h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f43027i;

    /* renamed from: j  reason: collision with root package name */
    private g f43028j;

    /* renamed from: k  reason: collision with root package name */
    private CheckedTextView[][] f43029k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f43030l;

    /* renamed from: m  reason: collision with root package name */
    private Comparator f43031m;

    private class b implements View.OnClickListener {
        private b() {
        }

        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final s1.a f43033a;

        /* renamed from: b  reason: collision with root package name */
        public final int f43034b;

        public c(s1.a aVar, int i10) {
            this.f43033a = aVar;
            this.f43034b = i10;
        }

        public C3717q0 a() {
            return this.f43033a.c(this.f43034b);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map b(Map map, List list, boolean z10) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            w wVar = (w) map.get(((s1.a) list.get(i10)).b());
            if (wVar != null && (z10 || hashMap.isEmpty())) {
                hashMap.put(wVar.f43916a, wVar);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f43021c) {
            e();
        } else if (view == this.f43022d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.f43030l = false;
        this.f43025g.clear();
    }

    private void e() {
        this.f43030l = true;
        this.f43025g.clear();
    }

    private void f(View view) {
        boolean z10 = false;
        this.f43030l = false;
        c cVar = (c) C3645a.e(view.getTag());
        T b10 = cVar.f43033a.b();
        int i10 = cVar.f43034b;
        w wVar = (w) this.f43025g.get(b10);
        if (wVar == null) {
            if (!this.f43027i && this.f43025g.size() > 0) {
                this.f43025g.clear();
            }
            this.f43025g.put(b10, new w(b10, C4770v.H(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(wVar.f43917b);
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean g10 = g(cVar.f43033a);
        if (g10 || h()) {
            z10 = true;
        }
        if (isChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f43025g.remove(b10);
            } else {
                this.f43025g.put(b10, new w(b10, arrayList));
            }
        } else if (isChecked) {
        } else {
            if (g10) {
                arrayList.add(Integer.valueOf(i10));
                this.f43025g.put(b10, new w(b10, arrayList));
                return;
            }
            this.f43025g.put(b10, new w(b10, C4770v.H(Integer.valueOf(i10))));
        }
    }

    private boolean g(s1.a aVar) {
        if (!this.f43026h || !aVar.e()) {
            return false;
        }
        return true;
    }

    private boolean h() {
        if (!this.f43027i || this.f43024f.size() <= 1) {
            return false;
        }
        return true;
    }

    private void i() {
        boolean z10;
        this.f43021c.setChecked(this.f43030l);
        CheckedTextView checkedTextView = this.f43022d;
        if (this.f43030l || this.f43025g.size() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        checkedTextView.setChecked(z10);
        for (int i10 = 0; i10 < this.f43029k.length; i10++) {
            w wVar = (w) this.f43025g.get(((s1.a) this.f43024f.get(i10)).b());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f43029k[i10];
                if (i11 >= checkedTextViewArr.length) {
                    break;
                }
                if (wVar != null) {
                    this.f43029k[i10][i11].setChecked(wVar.f43917b.contains(Integer.valueOf(((c) C3645a.e(checkedTextViewArr[i11].getTag())).f43034b)));
                } else {
                    checkedTextViewArr[i11].setChecked(false);
                }
                i11++;
            }
        }
    }

    private void j() {
        int i10;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f43024f.isEmpty()) {
            this.f43021c.setEnabled(false);
            this.f43022d.setEnabled(false);
            return;
        }
        this.f43021c.setEnabled(true);
        this.f43022d.setEnabled(true);
        this.f43029k = new CheckedTextView[this.f43024f.size()][];
        boolean h10 = h();
        for (int i11 = 0; i11 < this.f43024f.size(); i11++) {
            s1.a aVar = (s1.a) this.f43024f.get(i11);
            boolean g10 = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f43029k;
            int i12 = aVar.f45829a;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            c[] cVarArr = new c[i12];
            for (int i13 = 0; i13 < aVar.f45829a; i13++) {
                cVarArr[i13] = new c(aVar, i13);
            }
            Comparator comparator = this.f43031m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                if (i14 == 0) {
                    addView(this.f43020b.inflate(d.f44143a, this, false));
                }
                if (g10 || h10) {
                    i10 = 17367056;
                } else {
                    i10 = 17367055;
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f43020b.inflate(i10, this, false);
                checkedTextView.setBackgroundResource(this.f43019a);
                checkedTextView.setText(this.f43028j.a(cVarArr[i14].a()));
                checkedTextView.setTag(cVarArr[i14]);
                if (aVar.h(i14)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f43023e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f43029k[i11][i14] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f43030l;
    }

    public Map<T, w> getOverrides() {
        return this.f43025g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f43026h != z10) {
            this.f43026h = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f43027i != z10) {
            this.f43027i = z10;
            if (!z10 && this.f43025g.size() > 1) {
                Map b10 = b(this.f43025g, this.f43024f, false);
                this.f43025g.clear();
                this.f43025g.putAll(b10);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        int i10;
        CheckedTextView checkedTextView = this.f43021c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkedTextView.setVisibility(i10);
    }

    public void setTrackNameProvider(g gVar) {
        this.f43028j = (g) C3645a.e(gVar);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f43019a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f43020b = from;
        b bVar = new b();
        this.f43023e = bVar;
        this.f43028j = new ha.b(getResources());
        this.f43024f = new ArrayList();
        this.f43025g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.f43021c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(e.f44153j);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(d.f44143a, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.f43022d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(e.f44152i);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}

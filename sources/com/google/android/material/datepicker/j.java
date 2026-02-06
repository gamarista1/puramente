package com.google.android.material.datepicker;

import Ua.g;
import Ua.h;
import Ua.i;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import androidx.core.view.I;
import androidx.fragment.app.C1767o;
import androidx.fragment.app.T;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.n;
import fb.C4981b;
import ib.C5020g;
import j.C2115a;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class j<S> extends C1767o {

    /* renamed from: f0  reason: collision with root package name */
    static final Object f55858f0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: g0  reason: collision with root package name */
    static final Object f55859g0 = "CANCEL_BUTTON_TAG";

    /* renamed from: h0  reason: collision with root package name */
    static final Object f55860h0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A  reason: collision with root package name */
    private CharSequence f55861A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f55862B;

    /* renamed from: C  reason: collision with root package name */
    private int f55863C;

    /* renamed from: D  reason: collision with root package name */
    private int f55864D;

    /* renamed from: E  reason: collision with root package name */
    private CharSequence f55865E;

    /* renamed from: F  reason: collision with root package name */
    private int f55866F;

    /* renamed from: G  reason: collision with root package name */
    private CharSequence f55867G;

    /* renamed from: H  reason: collision with root package name */
    private TextView f55868H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public CheckableImageButton f55869I;

    /* renamed from: X  reason: collision with root package name */
    private C5020g f55870X;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public Button f55871Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f55872Z;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final LinkedHashSet f55873q = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final LinkedHashSet f55874r = new LinkedHashSet();

    /* renamed from: s  reason: collision with root package name */
    private final LinkedHashSet f55875s = new LinkedHashSet();

    /* renamed from: t  reason: collision with root package name */
    private final LinkedHashSet f55876t = new LinkedHashSet();

    /* renamed from: u  reason: collision with root package name */
    private int f55877u;

    /* renamed from: v  reason: collision with root package name */
    private e f55878v;

    /* renamed from: w  reason: collision with root package name */
    private q f55879w;

    /* renamed from: x  reason: collision with root package name */
    private a f55880x;

    /* renamed from: y  reason: collision with root package name */
    private i f55881y;

    /* renamed from: z  reason: collision with root package name */
    private int f55882z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Iterator it = j.this.f55873q.iterator();
            while (it.hasNext()) {
                ((k) it.next()).a(j.this.i0());
            }
            j.this.F();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            Iterator it = j.this.f55874r.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            j.this.F();
        }
    }

    class c implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55885a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f55886b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f55887c;

        c(int i10, View view, int i11) {
            this.f55885a = i10;
            this.f55886b = view;
            this.f55887c = i11;
        }

        public D0 i(View view, D0 d02) {
            int i10 = d02.f(D0.n.h()).f25151b;
            if (this.f55885a >= 0) {
                this.f55886b.getLayoutParams().height = this.f55885a + i10;
                View view2 = this.f55886b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f55886b;
            view3.setPadding(view3.getPaddingLeft(), this.f55887c + i10, this.f55886b.getPaddingRight(), this.f55886b.getPaddingBottom());
            return d02;
        }
    }

    class d extends p {
        d() {
        }

        public void a() {
            j.this.f55871Y.setEnabled(false);
        }

        public void b(Object obj) {
            j.this.r0();
            j.this.f55871Y.setEnabled(j.this.f0().c0());
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        public void onClick(View view) {
            j.this.f55871Y.setEnabled(j.this.f0().c0());
            j.this.f55869I.toggle();
            j jVar = j.this;
            jVar.s0(jVar.f55869I);
            j.this.p0();
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        final e f55891a;

        /* renamed from: b  reason: collision with root package name */
        int f55892b = 0;

        /* renamed from: c  reason: collision with root package name */
        a f55893c;

        /* renamed from: d  reason: collision with root package name */
        int f55894d = 0;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f55895e = null;

        /* renamed from: f  reason: collision with root package name */
        int f55896f = 0;

        /* renamed from: g  reason: collision with root package name */
        CharSequence f55897g = null;

        /* renamed from: h  reason: collision with root package name */
        int f55898h = 0;

        /* renamed from: i  reason: collision with root package name */
        CharSequence f55899i = null;

        /* renamed from: j  reason: collision with root package name */
        Object f55900j = null;

        /* renamed from: k  reason: collision with root package name */
        int f55901k = 0;

        private f(e eVar) {
            this.f55891a = eVar;
        }

        private m b() {
            if (!this.f55891a.g0().isEmpty()) {
                m c10 = m.c(((Long) this.f55891a.g0().iterator().next()).longValue());
                if (d(c10, this.f55893c)) {
                    return c10;
                }
            }
            m e10 = m.e();
            if (d(e10, this.f55893c)) {
                return e10;
            }
            return this.f55893c.j();
        }

        public static f c() {
            return new f(new r());
        }

        private static boolean d(m mVar, a aVar) {
            if (mVar.compareTo(aVar.j()) < 0 || mVar.compareTo(aVar.g()) > 0) {
                return false;
            }
            return true;
        }

        public j a() {
            if (this.f55893c == null) {
                this.f55893c = new a.b().a();
            }
            if (this.f55894d == 0) {
                this.f55894d = this.f55891a.A();
            }
            Object obj = this.f55900j;
            if (obj != null) {
                this.f55891a.R(obj);
            }
            if (this.f55893c.i() == null) {
                this.f55893c.n(b());
            }
            return j.n0(this);
        }

        public f e(Object obj) {
            this.f55900j = obj;
            return this;
        }

        public f f(int i10) {
            this.f55892b = i10;
            return this;
        }

        public f g(CharSequence charSequence) {
            this.f55895e = charSequence;
            this.f55894d = 0;
            return this;
        }
    }

    private static Drawable d0(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C2115a.b(context, Ua.d.f52799b));
        stateListDrawable.addState(new int[0], C2115a.b(context, Ua.d.f52800c));
        return stateListDrawable;
    }

    private void e0(Window window) {
        if (!this.f55872Z) {
            View findViewById = requireView().findViewById(Ua.e.f52834f);
            com.google.android.material.internal.d.a(window, true, n.c(findViewById), (Integer) null);
            C1680b0.C0(findViewById, new c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
            this.f55872Z = true;
        }
    }

    /* access modifiers changed from: private */
    public e f0() {
        if (this.f55878v == null) {
            this.f55878v = (e) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f55878v;
    }

    private static int h0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(Ua.c.f52796y);
        int i10 = m.e().f55909d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(Ua.c.f52755A) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(Ua.c.f52758D));
    }

    private int j0(Context context) {
        int i10 = this.f55877u;
        if (i10 != 0) {
            return i10;
        }
        return f0().C(context);
    }

    private void k0(Context context) {
        boolean z10;
        this.f55869I.setTag(f55860h0);
        this.f55869I.setImageDrawable(d0(context));
        CheckableImageButton checkableImageButton = this.f55869I;
        if (this.f55863C != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkableImageButton.setChecked(z10);
        C1680b0.o0(this.f55869I, (C1677a) null);
        s0(this.f55869I);
        this.f55869I.setOnClickListener(new e());
    }

    static boolean l0(Context context) {
        return o0(context, 16843277);
    }

    static boolean m0(Context context) {
        return o0(context, Ua.a.f52713A);
    }

    static j n0(f fVar) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", fVar.f55892b);
        bundle.putParcelable("DATE_SELECTOR_KEY", fVar.f55891a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", fVar.f55893c);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", fVar.f55894d);
        bundle.putCharSequence("TITLE_TEXT_KEY", fVar.f55895e);
        bundle.putInt("INPUT_MODE_KEY", fVar.f55901k);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", fVar.f55896f);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", fVar.f55897g);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", fVar.f55898h);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", fVar.f55899i);
        jVar.setArguments(bundle);
        return jVar;
    }

    static boolean o0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C4981b.c(context, Ua.a.f52742t, i.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    /* access modifiers changed from: private */
    public void p0() {
        q qVar;
        int j02 = j0(requireContext());
        this.f55881y = i.U(f0(), j02, this.f55880x);
        if (this.f55869I.isChecked()) {
            qVar = l.E(f0(), j02, this.f55880x);
        } else {
            qVar = this.f55881y;
        }
        this.f55879w = qVar;
        r0();
        T p10 = getChildFragmentManager().p();
        p10.p(Ua.e.f52810F, this.f55879w);
        p10.j();
        this.f55879w.C(new d());
    }

    public static long q0() {
        return u.j().getTimeInMillis();
    }

    /* access modifiers changed from: private */
    public void r0() {
        String g02 = g0();
        this.f55868H.setContentDescription(String.format(getString(h.f52901q), new Object[]{g02}));
        this.f55868H.setText(g02);
    }

    /* access modifiers changed from: private */
    public void s0(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f55869I.isChecked()) {
            str = checkableImageButton.getContext().getString(h.f52880D);
        } else {
            str = checkableImageButton.getContext().getString(h.f52882F);
        }
        this.f55869I.setContentDescription(str);
    }

    public final Dialog K(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), j0(requireContext()));
        Context context = dialog.getContext();
        this.f55862B = l0(context);
        int c10 = C4981b.c(context, Ua.a.f52734l, j.class.getCanonicalName());
        C5020g gVar = new C5020g(context, (AttributeSet) null, Ua.a.f52742t, i.f52925o);
        this.f55870X = gVar;
        gVar.M(context);
        this.f55870X.W(ColorStateList.valueOf(c10));
        this.f55870X.V(C1680b0.v(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public boolean c0(k kVar) {
        return this.f55873q.add(kVar);
    }

    public String g0() {
        return f0().N(getContext());
    }

    public final Object i0() {
        return f0().i0();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f55875s.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f55877u = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f55878v = (e) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f55880x = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f55882z = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f55861A = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f55863C = bundle.getInt("INPUT_MODE_KEY");
        this.f55864D = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f55865E = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f55866F = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f55867G = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        if (this.f55862B) {
            i10 = g.f52875s;
        } else {
            i10 = g.f52874r;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        if (this.f55862B) {
            inflate.findViewById(Ua.e.f52810F).setLayoutParams(new LinearLayout.LayoutParams(h0(context), -2));
        } else {
            inflate.findViewById(Ua.e.f52811G).setLayoutParams(new LinearLayout.LayoutParams(h0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(Ua.e.f52814J);
        this.f55868H = textView;
        C1680b0.q0(textView, 1);
        this.f55869I = (CheckableImageButton) inflate.findViewById(Ua.e.f52815K);
        TextView textView2 = (TextView) inflate.findViewById(Ua.e.f52817M);
        CharSequence charSequence = this.f55861A;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f55882z);
        }
        k0(context);
        this.f55871Y = (Button) inflate.findViewById(Ua.e.f52831c);
        if (f0().c0()) {
            this.f55871Y.setEnabled(true);
        } else {
            this.f55871Y.setEnabled(false);
        }
        this.f55871Y.setTag(f55858f0);
        CharSequence charSequence2 = this.f55865E;
        if (charSequence2 != null) {
            this.f55871Y.setText(charSequence2);
        } else {
            int i11 = this.f55864D;
            if (i11 != 0) {
                this.f55871Y.setText(i11);
            }
        }
        this.f55871Y.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(Ua.e.f52829a);
        button.setTag(f55859g0);
        CharSequence charSequence3 = this.f55867G;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i12 = this.f55866F;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f55876t.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f55877u);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f55878v);
        a.b bVar = new a.b(this.f55880x);
        if (this.f55881y.P() != null) {
            bVar.b(this.f55881y.P().f55911f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f55882z);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f55861A);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f55864D);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f55865E);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f55866F);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f55867G);
    }

    public void onStart() {
        super.onStart();
        Window window = O().getWindow();
        if (this.f55862B) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f55870X);
            e0(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(Ua.c.f52757C);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f55870X, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new Za.a(O(), rect));
        }
        p0();
    }

    public void onStop() {
        this.f55879w.D();
        super.onStop();
    }
}

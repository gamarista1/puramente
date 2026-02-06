package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;
import i.C2037a;
import j.C2115a;

/* renamed from: androidx.appcompat.widget.z  reason: case insensitive filesystem */
public class C1586z extends Spinner {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f12021i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    private final C1566e f12022a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12023b;

    /* renamed from: c  reason: collision with root package name */
    private Q f12024c;

    /* renamed from: d  reason: collision with root package name */
    private SpinnerAdapter f12025d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12026e;

    /* renamed from: f  reason: collision with root package name */
    private h f12027f;

    /* renamed from: g  reason: collision with root package name */
    int f12028g;

    /* renamed from: h  reason: collision with root package name */
    final Rect f12029h;

    /* renamed from: androidx.appcompat.widget.z$a */
    class a extends Q {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f12030j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f12030j = fVar;
        }

        public n.e b() {
            return this.f12030j;
        }

        public boolean c() {
            if (C1586z.this.getInternalPopup().c()) {
                return true;
            }
            C1586z.this.b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$b */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!C1586z.this.getInternalPopup().c()) {
                C1586z.this.b();
            }
            ViewTreeObserver viewTreeObserver = C1586z.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z$c */
    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!x1.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z$d */
    class d implements h, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.app.c f12033a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f12034b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f12035c;

        d() {
        }

        public int a() {
            return 0;
        }

        public boolean c() {
            androidx.appcompat.app.c cVar = this.f12033a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f12033a;
            if (cVar != null) {
                cVar.dismiss();
                this.f12033a = null;
            }
        }

        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public CharSequence f() {
            return this.f12035c;
        }

        public Drawable g() {
            return null;
        }

        public void h(CharSequence charSequence) {
            this.f12035c = charSequence;
        }

        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void k(int i10, int i11) {
            if (this.f12034b != null) {
                c.a aVar = new c.a(C1586z.this.getPopupContext());
                CharSequence charSequence = this.f12035c;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                androidx.appcompat.app.c create = aVar.setSingleChoiceItems(this.f12034b, C1586z.this.getSelectedItemPosition(), (DialogInterface.OnClickListener) this).create();
                this.f12033a = create;
                ListView k10 = create.k();
                k10.setTextDirection(i10);
                k10.setTextAlignment(i11);
                this.f12033a.show();
            }
        }

        public int l() {
            return 0;
        }

        public void m(ListAdapter listAdapter) {
            this.f12034b = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            C1586z.this.setSelection(i10);
            if (C1586z.this.getOnItemClickListener() != null) {
                C1586z.this.performItemClick((View) null, i10, this.f12034b.getItemId(i10));
            }
            dismiss();
        }

        public void p(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: androidx.appcompat.widget.z$e */
    private static class e implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f12037a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f12038b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f12037a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f12038b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f12038b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f12037a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f12037a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f12037a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f12037a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f12037a;
            if (spinnerAdapter == null || !spinnerAdapter.hasStableIds()) {
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f12038b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f12037a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f12037a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z$f */
    class f extends T implements h {

        /* renamed from: I  reason: collision with root package name */
        private CharSequence f12039I;

        /* renamed from: X  reason: collision with root package name */
        ListAdapter f12040X;

        /* renamed from: Y  reason: collision with root package name */
        private final Rect f12041Y = new Rect();

        /* renamed from: Z  reason: collision with root package name */
        private int f12042Z;

        /* renamed from: androidx.appcompat.widget.z$f$a */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1586z f12044a;

            a(C1586z zVar) {
                this.f12044a = zVar;
            }

            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                C1586z.this.setSelection(i10);
                if (C1586z.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    C1586z.this.performItemClick(view, i10, fVar.f12040X.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.z$f$b */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.U(C1586z.this)) {
                    f.this.dismiss();
                    return;
                }
                f.this.S();
                f.super.b();
            }
        }

        /* renamed from: androidx.appcompat.widget.z$f$c */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f12047a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f12047a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C1586z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f12047a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            D(C1586z.this);
            J(true);
            O(0);
            L(new a(C1586z.this));
        }

        /* access modifiers changed from: package-private */
        public void S() {
            int i10;
            int i11;
            Drawable g10 = g();
            if (g10 != null) {
                g10.getPadding(C1586z.this.f12029h);
                if (r0.b(C1586z.this)) {
                    i10 = C1586z.this.f12029h.right;
                } else {
                    i10 = -C1586z.this.f12029h.left;
                }
            } else {
                Rect rect = C1586z.this.f12029h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = C1586z.this.getPaddingLeft();
            int paddingRight = C1586z.this.getPaddingRight();
            int width = C1586z.this.getWidth();
            C1586z zVar = C1586z.this;
            int i12 = zVar.f12028g;
            if (i12 == -2) {
                int a10 = zVar.a((SpinnerAdapter) this.f12040X, g());
                int i13 = C1586z.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C1586z.this.f12029h;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (a10 > i14) {
                    a10 = i14;
                }
                F(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i12 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i12);
            }
            if (r0.b(C1586z.this)) {
                i11 = i10 + (((width - paddingRight) - z()) - T());
            } else {
                i11 = i10 + paddingLeft + T();
            }
            e(i11);
        }

        public int T() {
            return this.f12042Z;
        }

        /* access modifiers changed from: package-private */
        public boolean U(View view) {
            if (!view.isAttachedToWindow() || !view.getGlobalVisibleRect(this.f12041Y)) {
                return false;
            }
            return true;
        }

        public CharSequence f() {
            return this.f12039I;
        }

        public void h(CharSequence charSequence) {
            this.f12039I = charSequence;
        }

        public void j(int i10) {
            this.f12042Z = i10;
        }

        public void k(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean c10 = c();
            S();
            I(2);
            super.b();
            ListView o10 = o();
            o10.setChoiceMode(1);
            o10.setTextDirection(i10);
            o10.setTextAlignment(i11);
            P(C1586z.this.getSelectedItemPosition());
            if (!c10 && (viewTreeObserver = C1586z.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                K(new c(bVar));
            }
        }

        public void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.f12040X = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$g */
    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        boolean f12049a;

        /* renamed from: androidx.appcompat.widget.z$g$a */
        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            /* renamed from: b */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f12049a ? (byte) 1 : 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f12049a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$h */
    interface h {
        int a();

        boolean c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i10);

        void j(int i10);

        void k(int i10, int i11);

        int l();

        void m(ListAdapter listAdapter);

        void p(Drawable drawable);
    }

    public C1586z(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f12029h);
        Rect rect = this.f12029h;
        return i11 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f12027f.k(getTextDirection(), getTextAlignment());
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1566e eVar = this.f12022a;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        h hVar = this.f12027f;
        if (hVar != null) {
            return hVar.a();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        h hVar = this.f12027f;
        if (hVar != null) {
            return hVar.l();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f12027f != null) {
            return this.f12028g;
        }
        return super.getDropDownWidth();
    }

    /* access modifiers changed from: package-private */
    public final h getInternalPopup() {
        return this.f12027f;
    }

    public Drawable getPopupBackground() {
        h hVar = this.f12027f;
        if (hVar != null) {
            return hVar.g();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f12023b;
    }

    public CharSequence getPrompt() {
        h hVar = this.f12027f;
        if (hVar != null) {
            return hVar.f();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1566e eVar = this.f12022a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1566e eVar = this.f12022a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f12027f;
        if (hVar != null && hVar.c()) {
            this.f12027f.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f12027f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (gVar.f12049a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z10;
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f12027f;
        if (hVar == null || !hVar.c()) {
            z10 = false;
        } else {
            z10 = true;
        }
        gVar.f12049a = z10;
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Q q10 = this.f12024c;
        if (q10 == null || !q10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        h hVar = this.f12027f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.c()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1566e eVar = this.f12022a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1566e eVar = this.f12022a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f12027f;
        if (hVar != null) {
            hVar.j(i10);
            this.f12027f.e(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f12027f;
        if (hVar != null) {
            hVar.i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f12027f != null) {
            this.f12028g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f12027f;
        if (hVar != null) {
            hVar.p(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C2115a.b(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f12027f;
        if (hVar != null) {
            hVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1566e eVar = this.f12022a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1566e eVar = this.f12022a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public C1586z(Context context, int i10) {
        this(context, (AttributeSet) null, C2037a.f21253H, i10);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f12026e) {
            this.f12025d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f12027f != null) {
            Context context = this.f12023b;
            if (context == null) {
                context = getContext();
            }
            this.f12027f.m(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public C1586z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21253H);
    }

    public C1586z(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public C1586z(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r11 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1586z(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f12029h = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.c0.a(r6, r0)
            int[] r0 = i.j.f21672x2
            r1 = 0
            androidx.appcompat.widget.g0 r0 = androidx.appcompat.widget.g0.v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f12022a = r2
            if (r11 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f12023b = r2
            goto L_0x003b
        L_0x0029:
            int r11 = i.j.f21445C2
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L_0x0039
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f12023b = r2
            goto L_0x003b
        L_0x0039:
            r6.f12023b = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006d
            int[] r11 = f12021i     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x0055
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0055
        L_0x0050:
            r7 = move-exception
            r2 = r11
            goto L_0x0067
        L_0x0053:
            r3 = move-exception
            goto L_0x005d
        L_0x0055:
            r11.recycle()
            goto L_0x006d
        L_0x0059:
            r7 = move-exception
            goto L_0x0067
        L_0x005b:
            r3 = move-exception
            r11 = r2
        L_0x005d:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0050 }
            if (r11 == 0) goto L_0x006d
            goto L_0x0055
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            r2.recycle()
        L_0x006c:
            throw r7
        L_0x006d:
            r11 = 1
            if (r10 == 0) goto L_0x00aa
            if (r10 == r11) goto L_0x0073
            goto L_0x00ba
        L_0x0073:
            androidx.appcompat.widget.z$f r10 = new androidx.appcompat.widget.z$f
            android.content.Context r3 = r6.f12023b
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f12023b
            int[] r4 = i.j.f21672x2
            androidx.appcompat.widget.g0 r1 = androidx.appcompat.widget.g0.v(r3, r8, r4, r9, r1)
            int r3 = i.j.f21440B2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f12028g = r3
            int r3 = i.j.f21682z2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.p(r3)
            int r3 = i.j.f21435A2
            java.lang.String r3 = r0.o(r3)
            r10.h(r3)
            r1.x()
            r6.f12027f = r10
            androidx.appcompat.widget.z$a r1 = new androidx.appcompat.widget.z$a
            r1.<init>(r6, r10)
            r6.f12024c = r1
            goto L_0x00ba
        L_0x00aa:
            androidx.appcompat.widget.z$d r10 = new androidx.appcompat.widget.z$d
            r10.<init>()
            r6.f12027f = r10
            int r1 = i.j.f21435A2
            java.lang.String r1 = r0.o(r1)
            r10.h(r1)
        L_0x00ba:
            int r10 = i.j.f21677y2
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto L_0x00d2
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = i.C2043g.f21413t
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d2:
            r0.x()
            r6.f12026e = r11
            android.widget.SpinnerAdapter r7 = r6.f12025d
            if (r7 == 0) goto L_0x00e0
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f12025d = r2
        L_0x00e0:
            androidx.appcompat.widget.e r7 = r6.f12022a
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1586z.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}

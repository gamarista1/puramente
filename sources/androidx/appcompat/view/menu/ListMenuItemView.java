package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.g0;
import i.C2037a;
import i.C2042f;
import i.C2043g;
import i.j;

public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    private g f11229a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f11230b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f11231c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f11232d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f11233e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f11234f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f11235g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f11236h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f11237i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f11238j;

    /* renamed from: k  reason: collision with root package name */
    private int f11239k;

    /* renamed from: l  reason: collision with root package name */
    private Context f11240l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11241m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f11242n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11243o;

    /* renamed from: p  reason: collision with root package name */
    private LayoutInflater f11244p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11245q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21246A);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f11237i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C2043g.f21401h, this, false);
        this.f11233e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(C2043g.f21402i, this, false);
        this.f11230b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C2043g.f21404k, this, false);
        this.f11231c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f11244p == null) {
            this.f11244p = LayoutInflater.from(getContext());
        }
        return this.f11244p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f11235g;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f11236h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11236h.getLayoutParams();
            rect.top += this.f11236h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void c(g gVar, int i10) {
        int i11;
        this.f11229a = gVar;
        if (gVar.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public boolean e() {
        return false;
    }

    public g getItemData() {
        return this.f11229a;
    }

    public void h(boolean z10, char c10) {
        int i10;
        if (!z10 || !this.f11229a.A()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f11234f.setText(this.f11229a.h());
        }
        if (this.f11234f.getVisibility() != i10) {
            this.f11234f.setVisibility(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f11238j);
        TextView textView = (TextView) findViewById(C2042f.f21364N);
        this.f11232d = textView;
        int i10 = this.f11239k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f11240l, i10);
        }
        this.f11234f = (TextView) findViewById(C2042f.f21357G);
        ImageView imageView = (ImageView) findViewById(C2042f.f21360J);
        this.f11235g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f11242n);
        }
        this.f11236h = (ImageView) findViewById(C2042f.f21386s);
        this.f11237i = (LinearLayout) findViewById(C2042f.f21380m);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f11230b != null && this.f11241m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f11230b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        View view;
        CompoundButton compoundButton;
        if (z10 || this.f11231c != null || this.f11233e != null) {
            if (this.f11229a.m()) {
                if (this.f11231c == null) {
                    g();
                }
                compoundButton = this.f11231c;
                view = this.f11233e;
            } else {
                if (this.f11233e == null) {
                    d();
                }
                compoundButton = this.f11233e;
                view = this.f11231c;
            }
            if (z10) {
                compoundButton.setChecked(this.f11229a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f11233e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f11231c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f11229a.m()) {
            if (this.f11231c == null) {
                g();
            }
            compoundButton = this.f11231c;
        } else {
            if (this.f11233e == null) {
                d();
            }
            compoundButton = this.f11233e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f11245q = z10;
        this.f11241m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i10;
        ImageView imageView = this.f11236h;
        if (imageView != null) {
            if (this.f11243o || !z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10;
        if (this.f11229a.z() || this.f11245q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f11241m) {
            ImageView imageView = this.f11230b;
            if (imageView != null || drawable != null || this.f11241m) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f11241m) {
                    ImageView imageView2 = this.f11230b;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f11230b.getVisibility() != 0) {
                        this.f11230b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f11230b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f11232d.setText(charSequence);
            if (this.f11232d.getVisibility() != 0) {
                this.f11232d.setVisibility(0);
            }
        } else if (this.f11232d.getVisibility() != 8) {
            this.f11232d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        g0 v10 = g0.v(getContext(), attributeSet, j.f21528T1, i10, 0);
        this.f11238j = v10.g(j.f21536V1);
        this.f11239k = v10.n(j.f21532U1, -1);
        this.f11241m = v10.a(j.f21540W1, false);
        this.f11240l = context;
        this.f11242n = v10.g(j.f21544X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C2037a.f21281x, 0);
        this.f11243o = obtainStyledAttributes.hasValue(0);
        v10.x();
        obtainStyledAttributes.recycle();
    }
}

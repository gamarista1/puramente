package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.C1573l;
import androidx.core.view.C1680b0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.text.g;
import com.facebook.react.views.text.p;
import com.facebook.react.views.text.q;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import f8.C3519a;
import j8.f;
import j8.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import n7.C3863a;
import s8.C3992a;
import s8.C3993b;
import s8.C3994c;
import s8.C3995d;
import s8.C3996e;
import s8.C3997f;
import s8.h;
import s8.j;
import s8.k;
import s8.m;
import s8.n;

/* renamed from: com.facebook.react.views.textinput.j  reason: case insensitive filesystem */
public class C3443j extends C1573l {

    /* renamed from: k0  reason: collision with root package name */
    public static final boolean f42275k0 = false;
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public static final KeyListener f42276l0 = QwertyKeyListener.getInstanceForFullKeyboard();

    /* renamed from: A  reason: collision with root package name */
    private boolean f42277A = false;

    /* renamed from: B  reason: collision with root package name */
    private String f42278B = null;

    /* renamed from: C  reason: collision with root package name */
    private int f42279C = -1;

    /* renamed from: D  reason: collision with root package name */
    private int f42280D = -1;

    /* renamed from: E  reason: collision with root package name */
    private boolean f42281E = false;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public boolean f42282F = false;

    /* renamed from: G  reason: collision with root package name */
    private boolean f42283G = false;

    /* renamed from: H  reason: collision with root package name */
    private boolean f42284H = false;

    /* renamed from: I  reason: collision with root package name */
    private String f42285I = null;

    /* renamed from: f0  reason: collision with root package name */
    private o f42286f0 = o.VISIBLE;

    /* renamed from: g  reason: collision with root package name */
    private final InputMethodManager f42287g;

    /* renamed from: g0  reason: collision with root package name */
    private C3413g0 f42288g0 = null;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String f42289h = C3443j.class.getSimpleName();

    /* renamed from: h0  reason: collision with root package name */
    protected boolean f42290h0 = false;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f42291i;

    /* renamed from: i0  reason: collision with root package name */
    protected boolean f42292i0 = false;

    /* renamed from: j  reason: collision with root package name */
    private final int f42293j;

    /* renamed from: j0  reason: collision with root package name */
    private EventDispatcher f42294j0;

    /* renamed from: k  reason: collision with root package name */
    private final int f42295k;

    /* renamed from: l  reason: collision with root package name */
    protected int f42296l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f42297m;

    /* renamed from: n  reason: collision with root package name */
    private d f42298n;

    /* renamed from: o  reason: collision with root package name */
    private int f42299o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f42300p;

    /* renamed from: q  reason: collision with root package name */
    private String f42301q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f42302r;

    /* renamed from: s  reason: collision with root package name */
    private String f42303s;

    /* renamed from: t  reason: collision with root package name */
    private K f42304t;

    /* renamed from: u  reason: collision with root package name */
    private C3434a f42305u;

    /* renamed from: v  reason: collision with root package name */
    private J f42306v;

    /* renamed from: w  reason: collision with root package name */
    private c f42307w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f42308x = false;

    /* renamed from: y  reason: collision with root package name */
    private boolean f42309y = false;

    /* renamed from: z  reason: collision with root package name */
    private p f42310z;

    /* renamed from: com.facebook.react.views.textinput.j$a */
    class a extends I {
        a(View view, boolean z10, int i10) {
            super(view, z10, i10);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            int length = C3443j.this.getText().length();
            if (length > 0) {
                C3443j.this.setSelection(length);
            }
            return C3443j.this.S();
        }
    }

    /* renamed from: com.facebook.react.views.textinput.j$b */
    class b implements ActionMode.Callback {
        b() {
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (C3443j.this.f42282F) {
                return false;
            }
            menu.removeItem(16908337);
            return true;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }
    }

    /* renamed from: com.facebook.react.views.textinput.j$c */
    private static class c implements KeyListener {

        /* renamed from: a  reason: collision with root package name */
        private int f42313a = 0;

        public void a(int i10) {
            this.f42313a = i10;
        }

        public void clearMetaKeyState(View view, Editable editable, int i10) {
            C3443j.f42276l0.clearMetaKeyState(view, editable, i10);
        }

        public int getInputType() {
            return this.f42313a;
        }

        public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
            return C3443j.f42276l0.onKeyDown(view, editable, i10, keyEvent);
        }

        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return C3443j.f42276l0.onKeyOther(view, editable, keyEvent);
        }

        public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
            return C3443j.f42276l0.onKeyUp(view, editable, i10, keyEvent);
        }
    }

    /* renamed from: com.facebook.react.views.textinput.j$d */
    private class d implements TextWatcher {
        public void afterTextChanged(Editable editable) {
            C3443j jVar = C3443j.this;
            if (!jVar.f42291i && jVar.f42297m != null) {
                Iterator it = C3443j.this.f42297m.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).afterTextChanged(editable);
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C3443j jVar = C3443j.this;
            if (!jVar.f42291i && jVar.f42297m != null) {
                Iterator it = C3443j.this.f42297m.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).beforeTextChanged(charSequence, i10, i11, i12);
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (C3443j.f42275k0) {
                String l10 = C3443j.this.f42289h;
                U5.a.m(l10, "onTextChanged[" + C3443j.this.getId() + "]: " + charSequence + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i10 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i11 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i12);
            }
            C3443j jVar = C3443j.this;
            if (!jVar.f42291i && jVar.f42297m != null) {
                Iterator it = C3443j.this.f42297m.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i10, i11, i12);
                }
            }
            C3443j.this.b0();
            C3443j.this.Q();
        }

        private d() {
        }
    }

    static {
        E7.a aVar = E7.a.f30668a;
    }

    public C3443j(Context context) {
        super(context);
        setFocusableInTouchMode(false);
        this.f42287g = (InputMethodManager) C3863a.c(context.getSystemService("input_method"));
        this.f42293j = getGravity() & 8388615;
        this.f42295k = getGravity() & 112;
        this.f42296l = 0;
        this.f42291i = false;
        this.f42302r = false;
        this.f42297m = null;
        this.f42298n = null;
        this.f42299o = getInputType();
        if (this.f42307w == null) {
            this.f42307w = new c();
        }
        this.f42306v = null;
        this.f42310z = new p();
        t();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27) {
            setLayerType(1, (Paint) null);
        }
        C1680b0.o0(this, new a(this, isFocusable(), getImportantForAccessibility()));
        b bVar = new b();
        setCustomSelectionActionModeCallback(bVar);
        setCustomInsertionActionModeCallback(bVar);
    }

    private boolean B() {
        if ((getInputType() & 144) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean C(C3996e eVar) {
        if (eVar.getSize() == this.f42310z.c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean D(C3997f fVar) {
        return Integer.valueOf(fVar.getBackgroundColor()).equals(C3400a.i(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean E(h hVar) {
        if (hVar.getForegroundColor() == getCurrentTextColor()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean F(k kVar) {
        if ((getPaintFlags() & 16) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean G(n nVar) {
        if ((getPaintFlags() & 8) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean H(C3992a aVar) {
        if (aVar.b() == this.f42310z.d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean I(C3994c cVar) {
        if (cVar.c() != this.f42280D || !Objects.equals(cVar.a(), this.f42278B) || cVar.d() != this.f42279C || !Objects.equals(cVar.b(), getFontFeatureSettings())) {
            return false;
        }
        return true;
    }

    private void J(SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (Object obj : spans) {
            int spanFlags = getText().getSpanFlags(obj);
            if ((spanFlags & 33) == 33) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (obj instanceof j) {
                getText().removeSpan(obj);
            }
            if (z10) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (T(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private void K(int i10, int i11) {
        if (i10 != -1 && i11 != -1) {
            setSelection(v(i10), v(i11));
        }
    }

    /* access modifiers changed from: private */
    public void Q() {
        C3434a aVar = this.f42305u;
        if (aVar != null) {
            aVar.a();
        }
        V();
    }

    /* access modifiers changed from: private */
    public boolean S() {
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(130, (Rect) null);
        if (getShowSoftInputOnFocus()) {
            Y();
        }
        return requestFocus;
    }

    private static boolean T(Editable editable, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        if (i10 > spannableStringBuilder.length() || i11 > spannableStringBuilder.length()) {
            return false;
        }
        while (i10 < i11) {
            if (editable.charAt(i10) != spannableStringBuilder.charAt(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private void V() {
        ReactContext d10 = n0.d(this);
        if (this.f42288g0 == null && !d10.isBridgeless()) {
            r rVar = new r(this);
            UIManagerModule uIManagerModule = (UIManagerModule) d10.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), rVar);
            }
        }
    }

    private void Z(SpannableStringBuilder spannableStringBuilder, Class cls, x1.h hVar) {
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
            if (hVar.test(obj)) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
    }

    private void a0(SpannableStringBuilder spannableStringBuilder) {
        Z(spannableStringBuilder, C3996e.class, new C3436c(this));
        Z(spannableStringBuilder, C3997f.class, new C3437d(this));
        Z(spannableStringBuilder, h.class, new C3438e(this));
        Z(spannableStringBuilder, k.class, new C3439f(this));
        Z(spannableStringBuilder, n.class, new C3440g(this));
        Z(spannableStringBuilder, C3992a.class, new C3441h(this));
        Z(spannableStringBuilder, C3994c.class, new C3442i(this));
    }

    /* access modifiers changed from: private */
    public void b0() {
        boolean z10;
        if (this.f42288g0 != null && getId() != -1) {
            Editable text = getText();
            if (text == null || text.length() <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z10) {
                try {
                    spannableStringBuilder.append(text.subSequence(0, text.length()));
                } catch (IndexOutOfBoundsException e10) {
                    ReactSoftExceptionLogger.logSoftException(this.f42289h, e10);
                }
            }
            if (!z10) {
                if (getHint() != null && getHint().length() > 0) {
                    spannableStringBuilder.append(getHint());
                } else if (C3519a.c(this) != 2) {
                    spannableStringBuilder.append("I");
                }
            }
            s(spannableStringBuilder);
            spannableStringBuilder.setSpan(new m(new TextPaint(getPaint())), 0, spannableStringBuilder.length(), 18);
            q.o(getId(), spannableStringBuilder);
        }
    }

    private void c0() {
        int i10 = 5;
        String str = this.f42303s;
        if (str != null) {
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3089282:
                    if (str.equals("done")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 7;
                    break;
                case 1:
                    i10 = 3;
                    break;
                case 2:
                    i10 = 2;
                    break;
                case 4:
                    break;
                case 5:
                    i10 = 1;
                    break;
                case 6:
                    i10 = 4;
                    break;
            }
        }
        i10 = 6;
        if (this.f42302r) {
            setImeOptions(i10 | 33554432);
        } else {
            setImeOptions(i10);
        }
    }

    private d getTextWatcherDelegator() {
        if (this.f42298n == null) {
            this.f42298n = new d();
        }
        return this.f42298n;
    }

    private void s(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new C3996e(this.f42310z.c()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new h(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        Integer i10 = C3400a.i(this);
        if (!(i10 == null || i10.intValue() == 0)) {
            spannableStringBuilder.setSpan(new C3997f(i10.intValue()), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new k(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new n(), 0, spannableStringBuilder.length(), 16711698);
        }
        float d10 = this.f42310z.d();
        if (!Float.isNaN(d10)) {
            spannableStringBuilder.setSpan(new C3992a(d10), 0, spannableStringBuilder.length(), 16711698);
        }
        if (!(this.f42280D == -1 && this.f42279C == -1 && this.f42278B == null && getFontFeatureSettings() == null)) {
            spannableStringBuilder.setSpan(new C3994c(this.f42280D, this.f42279C, getFontFeatureSettings(), this.f42278B, getContext().getAssets()), 0, spannableStringBuilder.length(), 16711698);
        }
        float e10 = this.f42310z.e();
        if (Float.isNaN(e10)) {
            return;
        }
        if (M7.b.d()) {
            spannableStringBuilder.setSpan(new C3993b(e10), 0, spannableStringBuilder.length(), 16711698);
        } else {
            spannableStringBuilder.setSpan(new C3995d(e10), 0, spannableStringBuilder.length(), 16711698);
        }
    }

    private int v(int i10) {
        int i11;
        if (getText() == null) {
            i11 = 0;
        } else {
            i11 = getText().length();
        }
        return Math.max(0, Math.min(i10, i11));
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        if ((getInputType() & 131072) != 0) {
            return true;
        }
        return false;
    }

    public void L(int i10, int i11, int i12) {
        if (u(i10)) {
            K(i11, i12);
        }
    }

    public void M(g gVar) {
        if ((!B() || !TextUtils.equals(getText(), gVar.i())) && u(gVar.c())) {
            if (f42275k0) {
                String str = this.f42289h;
                U5.a.m(str, "maybeSetText[" + getId() + "]: current text: " + getText() + " update: " + gVar.i());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.i());
            J(spannableStringBuilder);
            a0(spannableStringBuilder);
            this.f42300p = gVar.b();
            this.f42290h0 = true;
            if (gVar.i().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.f42290h0 = false;
            if (getBreakStrategy() != gVar.k()) {
                setBreakStrategy(gVar.k());
            }
            b0();
        }
    }

    public void N(g gVar) {
        this.f42291i = true;
        M(gVar);
        this.f42291i = false;
    }

    public void O(g gVar) {
        this.f42292i0 = true;
        M(gVar);
        this.f42292i0 = false;
    }

    public void P() {
        if (this.f42277A) {
            this.f42277A = false;
            setTypeface(com.facebook.react.views.text.m.a(getTypeface(), this.f42280D, this.f42279C, this.f42278B, getContext().getAssets()));
            if (this.f42280D == -1 && this.f42279C == -1 && this.f42278B == null && getFontFeatureSettings() == null) {
                setPaintFlags(getPaintFlags() & -129);
            } else {
                setPaintFlags(getPaintFlags() | 128);
            }
        }
    }

    public void R() {
        S();
    }

    public void U(float f10, int i10) {
        C3430x xVar;
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(G.f(f10), C3431y.POINT);
        }
        C3400a.r(this, j8.d.values()[i10], xVar);
    }

    public boolean W() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior != null) {
            return submitBehavior.equals("blurAndSubmit");
        }
        if (!A()) {
            return true;
        }
        return false;
    }

    public boolean X() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (A()) {
                return false;
            }
        } else if (!submitBehavior.equals("submit") && !submitBehavior.equals("blurAndSubmit")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean Y() {
        return this.f42287g.showSoftInput(this, 0);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f42297m == null) {
            this.f42297m = new ArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f42297m.add(textWatcher);
    }

    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        y();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (f42275k0) {
            String str = this.f42289h;
            U5.a.m(str, "finalize[" + getId() + "] delete cached spannable");
        }
        q.f(getId());
    }

    public boolean getDisableFullscreenUI() {
        return this.f42302r;
    }

    /* access modifiers changed from: package-private */
    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public String getReturnKeyType() {
        return this.f42303s;
    }

    /* access modifiers changed from: package-private */
    public int getStagedInputType() {
        return this.f42299o;
    }

    public C3413g0 getStateWrapper() {
        return this.f42288g0;
    }

    public String getSubmitBehavior() {
        return this.f42301q;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f42300p) {
            Editable text = getText();
            for (s8.q a10 : (s8.q[]) text.getSpans(0, text.length(), s8.q.class)) {
                if (a10.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public boolean isLayoutRequested() {
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setTextIsSelectable(true);
        K(selectionStart, selectionEnd);
        if (this.f42300p) {
            Editable text = getText();
            for (s8.q c10 : (s8.q[]) text.getSpans(0, text.length(), s8.q.class)) {
                c10.c();
            }
        }
        if (this.f42281E && !this.f42283G) {
            S();
        }
        this.f42283G = true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext d10 = n0.d(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.f42309y) {
            onCreateInputConnection = new l(onCreateInputConnection, d10, this, this.f42294j0);
        }
        if (A() && (W() || X())) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f42300p) {
            Editable text = getText();
            for (s8.q d10 : (s8.q[]) text.getSpans(0, text.length(), s8.q.class)) {
                d10.d();
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.f42286f0 != o.VISIBLE) {
            C3400a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f42300p) {
            Editable text = getText();
            for (s8.q e10 : (s8.q[]) text.getSpans(0, text.length(), s8.q.class)) {
                e10.e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        K k10;
        super.onFocusChanged(z10, i10, rect);
        if (z10 && (k10 = this.f42304t) != null) {
            k10.a(getSelectionStart(), getSelectionEnd());
        }
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 66 || A()) {
            return super.onKeyUp(i10, keyEvent);
        }
        y();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Q();
        if (this.f42284H && isFocused()) {
            selectAll();
            this.f42284H = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        J j10 = this.f42306v;
        if (j10 != null) {
            j10.a(i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i10, int i11) {
        if (f42275k0) {
            String str = this.f42289h;
            U5.a.m(str, "onSelectionChanged[" + getId() + "]: " + i10 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i11);
        }
        super.onSelectionChanged(i10, i11);
        if (this.f42304t != null && hasFocus()) {
            this.f42304t.a(i10, i11);
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f42300p) {
            Editable text = getText();
            for (s8.q f10 : (s8.q[]) text.getSpans(0, text.length(), s8.q.class)) {
                f10.f();
            }
        }
    }

    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            i10 = 16908337;
        }
        return super.onTextContextMenuItem(i10);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f42308x = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f42308x) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f42308x = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList = this.f42297m;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.f42297m.isEmpty()) {
                this.f42297m = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public boolean requestFocus(int i10, Rect rect) {
        return isFocused();
    }

    public void setAllowFontScaling(boolean z10) {
        if (this.f42310z.b() != z10) {
            this.f42310z.m(z10);
            t();
        }
    }

    public void setAutoFocus(boolean z10) {
        this.f42281E = z10;
    }

    public void setBackgroundColor(int i10) {
        C3400a.o(this, Integer.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        U(f10, j8.d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = f.b(str);
        }
        C3400a.s(this, fVar);
    }

    public void setContentSizeWatcher(C3434a aVar) {
        this.f42305u = aVar;
    }

    public void setContextMenuHidden(boolean z10) {
        this.f42282F = z10;
    }

    public void setDisableFullscreenUI(boolean z10) {
        this.f42302r = z10;
        c0();
    }

    /* access modifiers changed from: package-private */
    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.f42294j0 = eventDispatcher;
    }

    public void setFontFamily(String str) {
        this.f42278B = str;
        this.f42277A = true;
    }

    public void setFontFeatureSettings(String str) {
        if (!Objects.equals(str, getFontFeatureSettings())) {
            super.setFontFeatureSettings(str);
            this.f42277A = true;
        }
    }

    public void setFontSize(float f10) {
        this.f42310z.n(f10);
        t();
    }

    public void setFontStyle(String str) {
        int b10 = com.facebook.react.views.text.m.b(str);
        if (b10 != this.f42280D) {
            this.f42280D = b10;
            this.f42277A = true;
        }
    }

    public void setFontWeight(String str) {
        int d10 = com.facebook.react.views.text.m.d(str);
        if (d10 != this.f42279C) {
            this.f42279C = d10;
            this.f42277A = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void setGravityHorizontal(int i10) {
        if (i10 == 0) {
            i10 = this.f42293j;
        }
        setGravity(i10 | (getGravity() & -8388616));
    }

    /* access modifiers changed from: package-private */
    public void setGravityVertical(int i10) {
        if (i10 == 0) {
            i10 = this.f42295k;
        }
        setGravity(i10 | (getGravity() & -113));
    }

    public void setInputType(int i10) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i10);
        this.f42299o = i10;
        super.setTypeface(typeface);
        if (A()) {
            setSingleLine(false);
        }
        if (this.f42307w == null) {
            this.f42307w = new c();
        }
        this.f42307w.a(i10);
        setKeyListener(this.f42307w);
    }

    public void setLetterSpacingPt(float f10) {
        this.f42310z.p(f10);
        t();
    }

    public void setLineHeight(int i10) {
        this.f42310z.q((float) i10);
    }

    public void setMaxFontSizeMultiplier(float f10) {
        if (f10 != this.f42310z.k()) {
            this.f42310z.r(f10);
            t();
        }
    }

    public void setOnKeyPress(boolean z10) {
        this.f42309y = z10;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f42286f0 = o.VISIBLE;
        } else {
            o b10 = o.b(str);
            if (b10 == null) {
                b10 = o.VISIBLE;
            }
            this.f42286f0 = b10;
        }
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (!Objects.equals(str, this.f42285I)) {
            this.f42285I = str;
            setHint(str);
        }
    }

    public void setReturnKeyType(String str) {
        this.f42303s = str;
        c0();
    }

    public void setScrollWatcher(J j10) {
        this.f42306v = j10;
    }

    public void setSelectTextOnFocus(boolean z10) {
        super.setSelectAllOnFocus(z10);
        this.f42284H = z10;
    }

    public void setSelection(int i10, int i11) {
        if (f42275k0) {
            String str = this.f42289h;
            U5.a.m(str, "setSelection[" + getId() + "]: " + i10 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i11);
        }
        super.setSelection(i10, i11);
    }

    public void setSelectionWatcher(K k10) {
        this.f42304t = k10;
    }

    /* access modifiers changed from: package-private */
    public void setStagedInputType(int i10) {
        this.f42299o = i10;
    }

    public void setStateWrapper(C3413g0 g0Var) {
        this.f42288g0 = g0Var;
    }

    public void setSubmitBehavior(String str) {
        this.f42301q = str;
    }

    /* access modifiers changed from: protected */
    public void t() {
        setTextSize(0, (float) this.f42310z.c());
        float d10 = this.f42310z.d();
        if (!Float.isNaN(d10)) {
            setLetterSpacing(d10);
        }
    }

    public boolean u(int i10) {
        if (i10 >= this.f42296l) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.f42300p) {
            Editable text = getText();
            for (s8.q a10 : (s8.q[]) text.getSpans(0, text.length(), s8.q.class)) {
                if (a10.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void w() {
        clearFocus();
    }

    /* access modifiers changed from: package-private */
    public void x() {
        if (getInputType() != this.f42299o) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f42299o);
            K(selectionStart, selectionEnd);
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        this.f42287g.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int z() {
        int i10 = this.f42296l + 1;
        this.f42296l = i10;
        return i10;
    }
}

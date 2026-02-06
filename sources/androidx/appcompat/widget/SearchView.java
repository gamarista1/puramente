package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.C1680b0;
import i.C2037a;
import i.C2040d;
import i.C2042f;
import i.C2043g;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public abstract class SearchView extends S implements androidx.appcompat.view.c {

    /* renamed from: I0  reason: collision with root package name */
    static final o f11604I0;

    /* renamed from: A  reason: collision with root package name */
    private Rect f11605A;

    /* renamed from: A0  reason: collision with root package name */
    private Runnable f11606A0;

    /* renamed from: B  reason: collision with root package name */
    private int[] f11607B;

    /* renamed from: B0  reason: collision with root package name */
    private final WeakHashMap f11608B0;

    /* renamed from: C  reason: collision with root package name */
    private int[] f11609C;

    /* renamed from: C0  reason: collision with root package name */
    private final View.OnClickListener f11610C0;

    /* renamed from: D  reason: collision with root package name */
    private final ImageView f11611D;

    /* renamed from: D0  reason: collision with root package name */
    View.OnKeyListener f11612D0;

    /* renamed from: E  reason: collision with root package name */
    private final Drawable f11613E;

    /* renamed from: E0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f11614E0;

    /* renamed from: F  reason: collision with root package name */
    private final int f11615F;

    /* renamed from: F0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f11616F0;

    /* renamed from: G  reason: collision with root package name */
    private final int f11617G;

    /* renamed from: G0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f11618G0;

    /* renamed from: H  reason: collision with root package name */
    private final Intent f11619H;

    /* renamed from: H0  reason: collision with root package name */
    private TextWatcher f11620H0;

    /* renamed from: I  reason: collision with root package name */
    private final Intent f11621I;

    /* renamed from: f0  reason: collision with root package name */
    private final CharSequence f11622f0;

    /* renamed from: g0  reason: collision with root package name */
    private m f11623g0;

    /* renamed from: h0  reason: collision with root package name */
    private l f11624h0;

    /* renamed from: i0  reason: collision with root package name */
    View.OnFocusChangeListener f11625i0;

    /* renamed from: j0  reason: collision with root package name */
    private View.OnClickListener f11626j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f11627k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f11628l0;

    /* renamed from: m0  reason: collision with root package name */
    D1.a f11629m0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f11630n0;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f11631o0;

    /* renamed from: p  reason: collision with root package name */
    final SearchAutoComplete f11632p;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f11633p0;

    /* renamed from: q  reason: collision with root package name */
    private final View f11634q;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f11635q0;

    /* renamed from: r  reason: collision with root package name */
    private final View f11636r;

    /* renamed from: r0  reason: collision with root package name */
    private int f11637r0;

    /* renamed from: s  reason: collision with root package name */
    private final View f11638s;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f11639s0;

    /* renamed from: t  reason: collision with root package name */
    final ImageView f11640t;

    /* renamed from: t0  reason: collision with root package name */
    private CharSequence f11641t0;

    /* renamed from: u  reason: collision with root package name */
    final ImageView f11642u;

    /* renamed from: u0  reason: collision with root package name */
    private CharSequence f11643u0;

    /* renamed from: v  reason: collision with root package name */
    final ImageView f11644v;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f11645v0;

    /* renamed from: w  reason: collision with root package name */
    final ImageView f11646w;

    /* renamed from: w0  reason: collision with root package name */
    private int f11647w0;

    /* renamed from: x  reason: collision with root package name */
    private final View f11648x;

    /* renamed from: x0  reason: collision with root package name */
    SearchableInfo f11649x0;

    /* renamed from: y  reason: collision with root package name */
    private q f11650y;

    /* renamed from: y0  reason: collision with root package name */
    private Bundle f11651y0;

    /* renamed from: z  reason: collision with root package name */
    private Rect f11652z;

    /* renamed from: z0  reason: collision with root package name */
    private final Runnable f11653z0;

    public static class SearchAutoComplete extends C1565d {

        /* renamed from: e  reason: collision with root package name */
        private int f11654e;

        /* renamed from: f  reason: collision with root package name */
        private SearchView f11655f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f11656g;

        /* renamed from: h  reason: collision with root package name */
        final Runnable f11657h;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C2037a.f21270m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 >= 600) {
                return 192;
            }
            if (i10 < 640 || i11 < 480) {
                return 160;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f11604I0.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f11656g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f11656g = false;
            }
        }

        public boolean enoughToFilter() {
            if (this.f11654e <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f11656g) {
                removeCallbacks(this.f11657h);
                post(this.f11657h);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f11655f.Z();
        }

        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f11655f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f11655f.hasFocus() && getVisibility() == 0) {
                this.f11656g = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f11656g = false;
                removeCallbacks(this.f11657h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f11656g = false;
                removeCallbacks(this.f11657h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f11656g = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f11655f = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f11654e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f11657h = new a();
            this.f11654e = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            D1.a aVar = SearchView.this.f11629m0;
            if (aVar instanceof a0) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f11625i0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f11640t) {
                searchView.V();
            } else if (view == searchView.f11644v) {
                searchView.R();
            } else if (view == searchView.f11642u) {
                searchView.W();
            } else if (view == searchView.f11646w) {
                searchView.a0();
            } else if (view == searchView.f11632p) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f11649x0 == null) {
                return false;
            }
            if (searchView.f11632p.isPopupShowing() && SearchView.this.f11632p.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.f11632p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, (String) null, searchView2.f11632p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
    }

    private static class o {

        /* renamed from: a  reason: collision with root package name */
        private Method f11669a = null;

        /* renamed from: b  reason: collision with root package name */
        private Method f11670b = null;

        /* renamed from: c  reason: collision with root package name */
        private Method f11671c = null;

        o() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            d();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", (Class[]) null);
                this.f11669a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", (Class[]) null);
                this.f11670b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f11671c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f11670b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f11669a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, (Object[]) null);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f11671c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends F1.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f11672c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            /* renamed from: c */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f11672c + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f11672c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11672c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f11673a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f11674b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f11675c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f11676d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f11677e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11678f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f11677e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f11673a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f11674b.set(rect);
            this.f11676d.set(rect);
            Rect rect3 = this.f11676d;
            int i10 = this.f11677e;
            rect3.inset(-i10, -i10);
            this.f11675c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 == r5) goto L_0x0023
                if (r2 == r3) goto L_0x0023
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003e
            L_0x001b:
                boolean r2 = r8.f11678f
                r8.f11678f = r4
            L_0x001f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0040
            L_0x0023:
                boolean r2 = r8.f11678f
                if (r2 == 0) goto L_0x001f
                android.graphics.Rect r6 = r8.f11676d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x001f
                r5 = r2
                r2 = r4
                goto L_0x0040
            L_0x0032:
                android.graphics.Rect r2 = r8.f11674b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003e
                r8.f11678f = r5
                r2 = r5
                goto L_0x0040
            L_0x003e:
                r2 = r5
                r5 = r4
            L_0x0040:
                if (r5 == 0) goto L_0x0073
                if (r2 == 0) goto L_0x0060
                android.graphics.Rect r2 = r8.f11675c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0060
                android.view.View r0 = r8.f11673a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f11673a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006d
            L_0x0060:
                android.graphics.Rect r2 = r8.f11675c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006d:
                android.view.View r0 = r8.f11673a
                boolean r4 = r0.dispatchTouchEvent(r9)
            L_0x0073:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        f11604I0 = oVar;
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f11643u0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f11651y0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f11649x0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        Uri uri;
        String o10;
        try {
            String o11 = a0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f11649x0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = a0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f11649x0.getSuggestIntentData();
            }
            if (!(o12 == null || (o10 = a0.o(cursor, "suggest_intent_data_id")) == null)) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            if (o12 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o12);
            }
            return C(str2, uri, a0.o(cursor, "suggest_intent_extra_data"), a0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f11651y0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        } else {
            i10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private void G() {
        this.f11632p.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.f11607B);
        getLocationInWindow(this.f11609C);
        int[] iArr = this.f11607B;
        int i10 = iArr[1];
        int[] iArr2 = this.f11609C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.f11627k0 || this.f11613E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f11632p.getTextSize()) * 1.25d);
        this.f11613E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f11613E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        Intent intent;
        SearchableInfo searchableInfo = this.f11649x0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f11649x0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f11619H;
        } else if (this.f11649x0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f11621I;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    static boolean M(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private boolean N() {
        if ((this.f11630n0 || this.f11639s0) && !L()) {
            return true;
        }
        return false;
    }

    private void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e10) {
                Log.e("SearchView", "Failed launch activity: " + intent, e10);
            }
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor d10 = this.f11629m0.d();
        if (d10 == null || !d10.moveToPosition(i10)) {
            return false;
        }
        O(D(d10, i11, str));
        return true;
    }

    private void b0() {
        post(this.f11653z0);
    }

    private void c0(int i10) {
        Editable text = this.f11632p.getText();
        Cursor d10 = this.f11629m0.d();
        if (d10 != null) {
            if (d10.moveToPosition(i10)) {
                CharSequence b10 = this.f11629m0.b(d10);
                if (b10 != null) {
                    setQuery(b10);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void e0() {
        boolean z10;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.f11632p.getText());
        int i10 = 0;
        if (!isEmpty || (this.f11627k0 && !this.f11645v0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.f11644v;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.f11644v.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f11632p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C2040d.f21297e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C2040d.f21298f);
    }

    private void h0() {
        this.f11632p.setThreshold(this.f11649x0.getSuggestThreshold());
        this.f11632p.setImeOptions(this.f11649x0.getImeOptions());
        int inputType = this.f11649x0.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f11649x0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f11632p.setInputType(inputType);
        D1.a aVar = this.f11629m0;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f11649x0.getSuggestAuthority() != null) {
            a0 a0Var = new a0(getContext(), this, this.f11649x0, this.f11608B0);
            this.f11629m0 = a0Var;
            this.f11632p.setAdapter(a0Var);
            a0 a0Var2 = (a0) this.f11629m0;
            if (this.f11633p0) {
                i10 = 2;
            }
            a0Var2.x(i10);
        }
    }

    private void i0() {
        int i10;
        if (!N() || !(this.f11642u.getVisibility() == 0 || this.f11646w.getVisibility() == 0)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f11638s.setVisibility(i10);
    }

    private void j0(boolean z10) {
        int i10;
        if (!this.f11630n0 || !N() || !hasFocus() || (!z10 && this.f11639s0)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f11642u.setVisibility(i10);
    }

    private void k0(boolean z10) {
        int i10;
        int i11;
        this.f11628l0 = z10;
        int i12 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f11632p.getText());
        this.f11640t.setVisibility(i10);
        j0(!isEmpty);
        View view = this.f11634q;
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        if (this.f11611D.getDrawable() != null && !this.f11627k0) {
            i12 = 0;
        }
        this.f11611D.setVisibility(i12);
        e0();
        l0(isEmpty);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f11639s0 && !L() && z10) {
            this.f11642u.setVisibility(8);
            i10 = 0;
        }
        this.f11646w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        int i10;
        this.f11632p.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f11632p;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        } else {
            i10 = charSequence.length();
        }
        searchAutoComplete.setSelection(i10);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int i10;
        int i11;
        if (this.f11648x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f11636r.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = r0.b(this);
            if (this.f11627k0) {
                i10 = resources.getDimensionPixelSize(C2040d.f21295c) + resources.getDimensionPixelSize(C2040d.f21296d);
            } else {
                i10 = 0;
            }
            this.f11632p.getDropDownBackground().getPadding(rect);
            if (b10) {
                i11 = -rect.left;
            } else {
                i11 = paddingLeft - (rect.left + i10);
            }
            this.f11632p.setDropDownHorizontalOffset(i11);
            this.f11632p.setDropDownWidth((((this.f11648x.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f11632p);
            return;
        }
        o oVar = f11604I0;
        oVar.b(this.f11632p);
        oVar.a(this.f11632p);
    }

    public boolean L() {
        return this.f11628l0;
    }

    /* access modifiers changed from: package-private */
    public void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i10, str));
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (!TextUtils.isEmpty(this.f11632p.getText())) {
            this.f11632p.setText("");
            this.f11632p.requestFocus();
            this.f11632p.setImeVisibility(true);
        } else if (this.f11627k0) {
            l lVar = this.f11624h0;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean S(int i10, int i11, String str) {
        Q(i10, 0, (String) null);
        this.f11632p.setImeVisibility(false);
        G();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(int i10) {
        c0(i10);
        return true;
    }

    /* access modifiers changed from: protected */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        k0(false);
        this.f11632p.requestFocus();
        this.f11632p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f11626j0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        Editable text = this.f11632p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.f11623g0;
            if (mVar == null || !mVar.b(text.toString())) {
                if (this.f11649x0 != null) {
                    P(0, (String) null, text.toString());
                }
                this.f11632p.setImeVisibility(false);
                G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X(View view, int i10, KeyEvent keyEvent) {
        int i11;
        if (this.f11649x0 != null && this.f11629m0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.f11632p.getListSelection(), 0, (String) null);
            }
            if (i10 == 21 || i10 == 22) {
                if (i10 == 21) {
                    i11 = 0;
                } else {
                    i11 = this.f11632p.length();
                }
                this.f11632p.setSelection(i11);
                this.f11632p.setListSelection(0);
                this.f11632p.clearListSelection();
                this.f11632p.b();
                return true;
            } else if (i10 == 19) {
                this.f11632p.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Y(CharSequence charSequence) {
        Editable text = this.f11632p.getText();
        this.f11643u0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        j0(!isEmpty);
        l0(isEmpty);
        e0();
        i0();
        if (this.f11623g0 != null && !TextUtils.equals(charSequence, this.f11641t0)) {
            this.f11623g0.a(charSequence.toString());
        }
        this.f11641t0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        k0(L());
        b0();
        if (this.f11632p.hasFocus()) {
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        SearchableInfo searchableInfo = this.f11649x0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(F(this.f11619H, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(E(this.f11621I, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void b() {
        if (!this.f11645v0) {
            this.f11645v0 = true;
            int imeOptions = this.f11632p.getImeOptions();
            this.f11647w0 = imeOptions;
            this.f11632p.setImeOptions(imeOptions | 33554432);
            this.f11632p.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f11635q0 = true;
        super.clearFocus();
        this.f11632p.clearFocus();
        this.f11632p.setImeVisibility(false);
        this.f11635q0 = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.f11632p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f11632p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f11643u0 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f11632p.setImeOptions(this.f11647w0);
        this.f11645v0 = false;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        int[] iArr;
        if (this.f11632p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f11636r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f11638s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f11632p.getImeOptions();
    }

    public int getInputType() {
        return this.f11632p.getInputType();
    }

    public int getMaxWidth() {
        return this.f11637r0;
    }

    public CharSequence getQuery() {
        return this.f11632p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f11631o0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f11649x0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f11622f0;
        }
        return getContext().getText(this.f11649x0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f11617G;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f11615F;
    }

    public D1.a getSuggestionsAdapter() {
        return this.f11629m0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f11653z0);
        post(this.f11606A0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.f11632p, this.f11652z);
            Rect rect = this.f11605A;
            Rect rect2 = this.f11652z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f11650y;
            if (qVar == null) {
                q qVar2 = new q(this.f11605A, this.f11652z, this.f11632p);
                this.f11650y = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.a(this.f11605A, this.f11652z);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        if (L()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f11637r0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f11637r0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f11637r0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f11672c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f11672c = L();
        return pVar;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    public boolean requestFocus(int i10, Rect rect) {
        if (this.f11635q0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f11632p.requestFocus(i10, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f11651y0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f11627k0 != z10) {
            this.f11627k0 = z10;
            k0(z10);
            g0();
        }
    }

    public void setImeOptions(int i10) {
        this.f11632p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f11632p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f11637r0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f11624h0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f11625i0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f11623g0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f11626j0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f11631o0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.f11633p0 = z10;
        D1.a aVar = this.f11629m0;
        if (aVar instanceof a0) {
            a0 a0Var = (a0) aVar;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            a0Var.x(i10);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f11649x0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K10 = K();
        this.f11639s0 = K10;
        if (K10) {
            this.f11632p.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f11630n0 = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(D1.a aVar) {
        this.f11629m0 = aVar;
        this.f11632p.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2037a.f21251F);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11652z = new Rect();
        this.f11605A = new Rect();
        this.f11607B = new int[2];
        this.f11609C = new int[2];
        this.f11653z0 = new b();
        this.f11606A0 = new c();
        this.f11608B0 = new WeakHashMap();
        f fVar = new f();
        this.f11610C0 = fVar;
        this.f11612D0 = new g();
        h hVar = new h();
        this.f11614E0 = hVar;
        i iVar = new i();
        this.f11616F0 = iVar;
        j jVar = new j();
        this.f11618G0 = jVar;
        this.f11620H0 = new a();
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        g0 v10 = g0.v(context, attributeSet2, i.j.f21582f2, i11, 0);
        C1680b0.m0(this, context, i.j.f21582f2, attributeSet2, v10.r(), i11, 0);
        LayoutInflater.from(context).inflate(v10.n(i.j.f21632p2, C2043g.f21411r), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C2042f.f21355E);
        this.f11632p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f11634q = findViewById(C2042f.f21351A);
        View findViewById = findViewById(C2042f.f21354D);
        this.f11636r = findViewById;
        View findViewById2 = findViewById(C2042f.f21361K);
        this.f11638s = findViewById2;
        ImageView imageView = (ImageView) findViewById(C2042f.f21392y);
        this.f11640t = imageView;
        ImageView imageView2 = (ImageView) findViewById(C2042f.f21352B);
        this.f11642u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C2042f.f21393z);
        this.f11644v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C2042f.f21356F);
        this.f11646w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C2042f.f21353C);
        this.f11611D = imageView5;
        C1680b0.s0(findViewById, v10.g(i.j.f21637q2));
        C1680b0.s0(findViewById2, v10.g(i.j.f21657u2));
        imageView.setImageDrawable(v10.g(i.j.f21652t2));
        imageView2.setImageDrawable(v10.g(i.j.f21622n2));
        imageView3.setImageDrawable(v10.g(i.j.f21607k2));
        imageView4.setImageDrawable(v10.g(i.j.f21667w2));
        imageView5.setImageDrawable(v10.g(i.j.f21652t2));
        this.f11613E = v10.g(i.j.f21647s2);
        l0.a(imageView, getResources().getString(i.h.f21427n));
        this.f11615F = v10.n(i.j.f21662v2, C2043g.f21410q);
        this.f11617G = v10.n(i.j.f21612l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f11620H0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f11612D0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(i.j.f21627o2, true));
        int f10 = v10.f(i.j.f21592h2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.f11622f0 = v10.p(i.j.f21617m2);
        this.f11631o0 = v10.p(i.j.f21642r2);
        int k10 = v10.k(i.j.f21602j2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(i.j.f21597i2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(i.j.f21587g2, true));
        v10.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f11619H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f11621I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f11648x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f11627k0);
        g0();
    }
}

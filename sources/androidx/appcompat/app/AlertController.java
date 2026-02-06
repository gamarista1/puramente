package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.S;
import androidx.core.view.C1680b0;
import androidx.core.widget.NestedScrollView;
import i.C2037a;
import i.C2042f;
import i.j;
import java.lang.ref.WeakReference;

class AlertController {

    /* renamed from: A  reason: collision with root package name */
    NestedScrollView f10834A;

    /* renamed from: B  reason: collision with root package name */
    private int f10835B = 0;

    /* renamed from: C  reason: collision with root package name */
    private Drawable f10836C;

    /* renamed from: D  reason: collision with root package name */
    private ImageView f10837D;

    /* renamed from: E  reason: collision with root package name */
    private TextView f10838E;

    /* renamed from: F  reason: collision with root package name */
    private TextView f10839F;

    /* renamed from: G  reason: collision with root package name */
    private View f10840G;

    /* renamed from: H  reason: collision with root package name */
    ListAdapter f10841H;

    /* renamed from: I  reason: collision with root package name */
    int f10842I = -1;

    /* renamed from: J  reason: collision with root package name */
    private int f10843J;

    /* renamed from: K  reason: collision with root package name */
    private int f10844K;

    /* renamed from: L  reason: collision with root package name */
    int f10845L;

    /* renamed from: M  reason: collision with root package name */
    int f10846M;

    /* renamed from: N  reason: collision with root package name */
    int f10847N;

    /* renamed from: O  reason: collision with root package name */
    int f10848O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f10849P;

    /* renamed from: Q  reason: collision with root package name */
    private int f10850Q = 0;

    /* renamed from: R  reason: collision with root package name */
    Handler f10851R;

    /* renamed from: S  reason: collision with root package name */
    private final View.OnClickListener f10852S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f10853a;

    /* renamed from: b  reason: collision with root package name */
    final s f10854b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f10855c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10856d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f10857e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f10858f;

    /* renamed from: g  reason: collision with root package name */
    ListView f10859g;

    /* renamed from: h  reason: collision with root package name */
    private View f10860h;

    /* renamed from: i  reason: collision with root package name */
    private int f10861i;

    /* renamed from: j  reason: collision with root package name */
    private int f10862j;

    /* renamed from: k  reason: collision with root package name */
    private int f10863k;

    /* renamed from: l  reason: collision with root package name */
    private int f10864l;

    /* renamed from: m  reason: collision with root package name */
    private int f10865m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10866n = false;

    /* renamed from: o  reason: collision with root package name */
    Button f10867o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f10868p;

    /* renamed from: q  reason: collision with root package name */
    Message f10869q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f10870r;

    /* renamed from: s  reason: collision with root package name */
    Button f10871s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f10872t;

    /* renamed from: u  reason: collision with root package name */
    Message f10873u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f10874v;

    /* renamed from: w  reason: collision with root package name */
    Button f10875w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f10876x;

    /* renamed from: y  reason: collision with root package name */
    Message f10877y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f10878z;

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        private final int f10879a;

        /* renamed from: b  reason: collision with root package name */
        private final int f10880b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f21567c2);
            this.f10880b = obtainStyledAttributes.getDimensionPixelOffset(j.f21572d2, -1);
            this.f10879a = obtainStyledAttributes.getDimensionPixelOffset(j.f21577e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            int i10;
            int i11;
            if (!z11 || !z10) {
                int paddingLeft = getPaddingLeft();
                if (z10) {
                    i10 = getPaddingTop();
                } else {
                    i10 = this.f10879a;
                }
                int paddingRight = getPaddingRight();
                if (z11) {
                    i11 = getPaddingBottom();
                } else {
                    i11 = this.f10880b;
                }
                setPadding(paddingLeft, i10, paddingRight, i11);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f10867o && (message4 = alertController.f10869q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f10871s && (message3 = alertController.f10873u) != null) {
                message = Message.obtain(message3);
            } else if (view != alertController.f10875w || (message2 = alertController.f10877y) == null) {
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f10851R.obtainMessage(1, alertController2.f10854b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A  reason: collision with root package name */
        public int f10882A;

        /* renamed from: B  reason: collision with root package name */
        public int f10883B;

        /* renamed from: C  reason: collision with root package name */
        public int f10884C;

        /* renamed from: D  reason: collision with root package name */
        public int f10885D;

        /* renamed from: E  reason: collision with root package name */
        public boolean f10886E = false;

        /* renamed from: F  reason: collision with root package name */
        public boolean[] f10887F;

        /* renamed from: G  reason: collision with root package name */
        public boolean f10888G;

        /* renamed from: H  reason: collision with root package name */
        public boolean f10889H;

        /* renamed from: I  reason: collision with root package name */
        public int f10890I = -1;

        /* renamed from: J  reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f10891J;

        /* renamed from: K  reason: collision with root package name */
        public Cursor f10892K;

        /* renamed from: L  reason: collision with root package name */
        public String f10893L;

        /* renamed from: M  reason: collision with root package name */
        public String f10894M;

        /* renamed from: N  reason: collision with root package name */
        public boolean f10895N;

        /* renamed from: O  reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f10896O;

        /* renamed from: P  reason: collision with root package name */
        public boolean f10897P = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f10898a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f10899b;

        /* renamed from: c  reason: collision with root package name */
        public int f10900c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f10901d;

        /* renamed from: e  reason: collision with root package name */
        public int f10902e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f10903f;

        /* renamed from: g  reason: collision with root package name */
        public View f10904g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f10905h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f10906i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f10907j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f10908k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f10909l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f10910m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f10911n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f10912o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f10913p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f10914q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f10915r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f10916s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f10917t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f10918u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f10919v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f10920w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f10921x;

        /* renamed from: y  reason: collision with root package name */
        public int f10922y;

        /* renamed from: z  reason: collision with root package name */
        public View f10923z;

        class a extends ArrayAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f10924a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f10924a = recycleListView;
            }

            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f10887F;
                if (zArr != null && zArr[i10]) {
                    this.f10924a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b  reason: collision with other inner class name */
        class C0209b extends CursorAdapter {

            /* renamed from: a  reason: collision with root package name */
            private final int f10926a;

            /* renamed from: b  reason: collision with root package name */
            private final int f10927b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecycleListView f10928c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AlertController f10929d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0209b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f10928c = recycleListView;
                this.f10929d = alertController;
                Cursor cursor2 = getCursor();
                this.f10926a = cursor2.getColumnIndexOrThrow(b.this.f10893L);
                this.f10927b = cursor2.getColumnIndexOrThrow(b.this.f10894M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f10926a));
                RecycleListView recycleListView = this.f10928c;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f10927b) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f10899b.inflate(this.f10929d.f10846M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AlertController f10931a;

            c(AlertController alertController) {
                this.f10931a = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f10921x.onClick(this.f10931a.f10854b, i10);
                if (!b.this.f10889H) {
                    this.f10931a.f10854b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f10933a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f10934b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f10933a = recycleListView;
                this.f10934b = alertController;
            }

            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f10887F;
                if (zArr != null) {
                    zArr[i10] = this.f10933a.isItemChecked(i10);
                }
                b.this.f10891J.onClick(this.f10934b.f10854b, i10, this.f10933a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f10898a = context;
            this.f10915r = true;
            this.f10899b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r8v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v22, types: [androidx.appcompat.app.AlertController$b$b] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$b$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r10) {
            /*
                r9 = this;
                android.view.LayoutInflater r0 = r9.f10899b
                int r1 = r10.f10845L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r9.f10888G
                if (r1 == 0) goto L_0x0034
                android.database.Cursor r1 = r9.f10892K
                if (r1 != 0) goto L_0x0025
                androidx.appcompat.app.AlertController$b$a r8 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r9.f10898a
                int r4 = r10.f10846M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r9.f10919v
                r1 = r8
                r2 = r9
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0025:
                androidx.appcompat.app.AlertController$b$b r8 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r9.f10898a
                android.database.Cursor r4 = r9.f10892K
                r5 = 0
                r1 = r8
                r2 = r9
                r6 = r0
                r7 = r10
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x0034:
                boolean r1 = r9.f10889H
                if (r1 == 0) goto L_0x003c
                int r1 = r10.f10847N
            L_0x003a:
                r4 = r1
                goto L_0x003f
            L_0x003c:
                int r1 = r10.f10848O
                goto L_0x003a
            L_0x003f:
                android.database.Cursor r1 = r9.f10892K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005b
                android.widget.SimpleCursorAdapter r8 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r9.f10898a
                android.database.Cursor r5 = r9.f10892K
                java.lang.String r1 = r9.f10893L
                java.lang.String[] r6 = new java.lang.String[]{r1}
                int[] r7 = new int[]{r2}
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0069
            L_0x005b:
                android.widget.ListAdapter r8 = r9.f10920w
                if (r8 == 0) goto L_0x0060
                goto L_0x0069
            L_0x0060:
                androidx.appcompat.app.AlertController$d r8 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r9.f10898a
                java.lang.CharSequence[] r3 = r9.f10919v
                r8.<init>(r1, r4, r2, r3)
            L_0x0069:
                r10.f10841H = r8
                int r1 = r9.f10890I
                r10.f10842I = r1
                android.content.DialogInterface$OnClickListener r1 = r9.f10921x
                if (r1 == 0) goto L_0x007c
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r10)
                r0.setOnItemClickListener(r1)
                goto L_0x0088
            L_0x007c:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r9.f10891J
                if (r1 == 0) goto L_0x0088
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r10)
                r0.setOnItemClickListener(r1)
            L_0x0088:
                android.widget.AdapterView$OnItemSelectedListener r1 = r9.f10896O
                if (r1 == 0) goto L_0x008f
                r0.setOnItemSelectedListener(r1)
            L_0x008f:
                boolean r1 = r9.f10889H
                if (r1 == 0) goto L_0x0098
                r1 = 1
                r0.setChoiceMode(r1)
                goto L_0x00a0
            L_0x0098:
                boolean r1 = r9.f10888G
                if (r1 == 0) goto L_0x00a0
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a0:
                r10.f10859g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.b.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f10904g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f10903f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f10901d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f10900c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f10902e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f10905h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f10906i;
            if (!(charSequence3 == null && this.f10907j == null)) {
                alertController.k(-1, charSequence3, this.f10908k, (Message) null, this.f10907j);
            }
            CharSequence charSequence4 = this.f10909l;
            if (!(charSequence4 == null && this.f10910m == null)) {
                alertController.k(-2, charSequence4, this.f10911n, (Message) null, this.f10910m);
            }
            CharSequence charSequence5 = this.f10912o;
            if (!(charSequence5 == null && this.f10913p == null)) {
                alertController.k(-3, charSequence5, this.f10914q, (Message) null, this.f10913p);
            }
            if (!(this.f10919v == null && this.f10892K == null && this.f10920w == null)) {
                b(alertController);
            }
            View view2 = this.f10923z;
            if (view2 == null) {
                int i12 = this.f10922y;
                if (i12 != 0) {
                    alertController.r(i12);
                }
            } else if (this.f10886E) {
                alertController.t(view2, this.f10882A, this.f10883B, this.f10884C, this.f10885D);
            } else {
                alertController.s(view2);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference f10936a;

        public c(DialogInterface dialogInterface) {
            this.f10936a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f10936a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, s sVar, Window window) {
        this.f10853a = context;
        this.f10854b = sVar;
        this.f10855c = window;
        this.f10851R = new c(sVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.f21457F, C2037a.f21268k, 0);
        this.f10843J = obtainStyledAttributes.getResourceId(j.f21462G, 0);
        this.f10844K = obtainStyledAttributes.getResourceId(j.f21472I, 0);
        this.f10845L = obtainStyledAttributes.getResourceId(j.f21482K, 0);
        this.f10846M = obtainStyledAttributes.getResourceId(j.f21487L, 0);
        this.f10847N = obtainStyledAttributes.getResourceId(j.f21497N, 0);
        this.f10848O = obtainStyledAttributes.getResourceId(j.f21477J, 0);
        this.f10849P = obtainStyledAttributes.getBoolean(j.f21492M, true);
        this.f10856d = obtainStyledAttributes.getDimensionPixelSize(j.f21467H, 0);
        obtainStyledAttributes.recycle();
        sVar.i(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.f10844K;
        if (i10 == 0) {
            return this.f10843J;
        }
        if (this.f10850Q == 1) {
            return i10;
        }
        return this.f10843J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f10855c.findViewById(C2042f.f21390w);
        View findViewById2 = this.f10855c.findViewById(C2042f.f21389v);
        C1680b0.F0(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        boolean z10;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f10867o = button;
        button.setOnClickListener(this.f10852S);
        if (!TextUtils.isEmpty(this.f10868p) || this.f10870r != null) {
            this.f10867o.setText(this.f10868p);
            Drawable drawable = this.f10870r;
            if (drawable != null) {
                int i10 = this.f10856d;
                drawable.setBounds(0, 0, i10, i10);
                this.f10867o.setCompoundDrawables(this.f10870r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f10867o.setVisibility(0);
            z10 = true;
        } else {
            this.f10867o.setVisibility(8);
            z10 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f10871s = button2;
        button2.setOnClickListener(this.f10852S);
        if (!TextUtils.isEmpty(this.f10872t) || this.f10874v != null) {
            this.f10871s.setText(this.f10872t);
            Drawable drawable2 = this.f10874v;
            if (drawable2 != null) {
                int i11 = this.f10856d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f10871s.setCompoundDrawables(this.f10874v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f10871s.setVisibility(0);
            z10 |= true;
        } else {
            this.f10871s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f10875w = button3;
        button3.setOnClickListener(this.f10852S);
        if (!TextUtils.isEmpty(this.f10876x) || this.f10878z != null) {
            this.f10875w.setText(this.f10876x);
            Drawable drawable3 = this.f10878z;
            if (drawable3 != null) {
                int i12 = this.f10856d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f10875w.setCompoundDrawables(this.f10878z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f10875w.setVisibility(0);
            z10 |= true;
        } else {
            this.f10875w.setVisibility(8);
        }
        if (z(this.f10853a)) {
            if (z10) {
                b(this.f10867o);
            } else if (z10) {
                b(this.f10871s);
            } else if (z10) {
                b(this.f10875w);
            }
        }
        if (!z10) {
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f10855c.findViewById(C2042f.f21391x);
        this.f10834A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f10834A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f10839F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f10858f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f10834A.removeView(this.f10839F);
            if (this.f10859g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f10834A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f10834A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f10859g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f10860h;
        boolean z10 = false;
        if (view == null) {
            if (this.f10861i != 0) {
                view = LayoutInflater.from(this.f10853a).inflate(this.f10861i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !a(view)) {
            this.f10855c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f10855c.findViewById(C2042f.f21382o);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f10866n) {
                frameLayout.setPadding(this.f10862j, this.f10863k, this.f10864l, this.f10865m);
            }
            if (this.f10859g != null) {
                ((S.a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        if (this.f10840G != null) {
            viewGroup.addView(this.f10840G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f10855c.findViewById(C2042f.f21366P).setVisibility(8);
            return;
        }
        this.f10837D = (ImageView) this.f10855c.findViewById(16908294);
        if (TextUtils.isEmpty(this.f10857e) || !this.f10849P) {
            this.f10855c.findViewById(C2042f.f21366P).setVisibility(8);
            this.f10837D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f10855c.findViewById(C2042f.f21378k);
        this.f10838E = textView;
        textView.setText(this.f10857e);
        int i10 = this.f10835B;
        if (i10 != 0) {
            this.f10837D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f10836C;
        if (drawable != null) {
            this.f10837D.setImageDrawable(drawable);
            return;
        }
        this.f10838E.setPadding(this.f10837D.getPaddingLeft(), this.f10837D.getPaddingTop(), this.f10837D.getPaddingRight(), this.f10837D.getPaddingBottom());
        this.f10837D.setVisibility(8);
    }

    private void y() {
        boolean z10;
        boolean z11;
        boolean z12;
        ListAdapter listAdapter;
        View findViewById;
        View view;
        View findViewById2;
        View findViewById3 = this.f10855c.findViewById(C2042f.f21388u);
        View findViewById4 = findViewById3.findViewById(C2042f.f21367Q);
        View findViewById5 = findViewById3.findViewById(C2042f.f21381n);
        View findViewById6 = findViewById3.findViewById(C2042f.f21379l);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C2042f.f21383p);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(C2042f.f21367Q);
        View findViewById8 = viewGroup.findViewById(C2042f.f21381n);
        View findViewById9 = viewGroup.findViewById(C2042f.f21379l);
        ViewGroup i10 = i(findViewById7, findViewById4);
        ViewGroup i11 = i(findViewById8, findViewById5);
        ViewGroup i12 = i(findViewById9, findViewById6);
        v(i11);
        u(i12);
        x(i10);
        char c10 = 0;
        if (viewGroup.getVisibility() != 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == null || i10.getVisibility() == 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i12 == null || i12.getVisibility() == 8) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!(z12 || i11 == null || (findViewById2 = i11.findViewById(C2042f.f21362L)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.f10834A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f10858f == null && this.f10859g == null) {
                view = null;
            } else {
                view = i10.findViewById(C2042f.f21365O);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i11 == null || (findViewById = i11.findViewById(C2042f.f21363M)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f10859g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view2 = this.f10859g;
            if (view2 == null) {
                view2 = this.f10834A;
            }
            if (view2 != null) {
                if (z12) {
                    c10 = 2;
                }
                p(i11, view2, z11 | c10 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f10859g;
        if (listView2 != null && (listAdapter = this.f10841H) != null) {
            listView2.setAdapter(listAdapter);
            int i13 = this.f10842I;
            if (i13 > -1) {
                listView2.setItemChecked(i13, true);
                listView2.setSelection(i13);
            }
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2037a.f21267j, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f10875w;
        }
        if (i10 == -2) {
            return this.f10871s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f10867o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f10853a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f10859g;
    }

    public void f() {
        this.f10854b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f10834A;
        if (nestedScrollView == null || !nestedScrollView.t(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f10834A;
        if (nestedScrollView == null || !nestedScrollView.t(keyEvent)) {
            return false;
        }
        return true;
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f10851R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f10876x = charSequence;
            this.f10877y = message;
            this.f10878z = drawable;
        } else if (i10 == -2) {
            this.f10872t = charSequence;
            this.f10873u = message;
            this.f10874v = drawable;
        } else if (i10 == -1) {
            this.f10868p = charSequence;
            this.f10869q = message;
            this.f10870r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.f10840G = view;
    }

    public void m(int i10) {
        this.f10836C = null;
        this.f10835B = i10;
        ImageView imageView = this.f10837D;
        if (imageView == null) {
            return;
        }
        if (i10 != 0) {
            imageView.setVisibility(0);
            this.f10837D.setImageResource(this.f10835B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable drawable) {
        this.f10836C = drawable;
        this.f10835B = 0;
        ImageView imageView = this.f10837D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f10837D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(CharSequence charSequence) {
        this.f10858f = charSequence;
        TextView textView = this.f10839F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f10857e = charSequence;
        TextView textView = this.f10838E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f10860h = null;
        this.f10861i = i10;
        this.f10866n = false;
    }

    public void s(View view) {
        this.f10860h = view;
        this.f10861i = 0;
        this.f10866n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f10860h = view;
        this.f10861i = 0;
        this.f10866n = true;
        this.f10862j = i10;
        this.f10863k = i11;
        this.f10864l = i12;
        this.f10865m = i13;
    }
}

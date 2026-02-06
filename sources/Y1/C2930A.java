package y1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import m1.C2187c;
import y1.D;

/* renamed from: y1.A  reason: case insensitive filesystem */
public class C2930A {

    /* renamed from: d  reason: collision with root package name */
    private static int f28572d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f28573a;

    /* renamed from: b  reason: collision with root package name */
    public int f28574b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f28575c = -1;

    /* renamed from: y1.A$a */
    public static class a {

        /* renamed from: A  reason: collision with root package name */
        public static final a f28576A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: B  reason: collision with root package name */
        public static final a f28577B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (D) null, D.e.class);

        /* renamed from: C  reason: collision with root package name */
        public static final a f28578C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: D  reason: collision with root package name */
        public static final a f28579D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: E  reason: collision with root package name */
        public static final a f28580E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: F  reason: collision with root package name */
        public static final a f28581F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: G  reason: collision with root package name */
        public static final a f28582G;

        /* renamed from: H  reason: collision with root package name */
        public static final a f28583H;

        /* renamed from: I  reason: collision with root package name */
        public static final a f28584I;

        /* renamed from: J  reason: collision with root package name */
        public static final a f28585J;

        /* renamed from: K  reason: collision with root package name */
        public static final a f28586K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: L  reason: collision with root package name */
        public static final a f28587L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (D) null, D.f.class);

        /* renamed from: M  reason: collision with root package name */
        public static final a f28588M;

        /* renamed from: N  reason: collision with root package name */
        public static final a f28589N;

        /* renamed from: O  reason: collision with root package name */
        public static final a f28590O;

        /* renamed from: P  reason: collision with root package name */
        public static final a f28591P;

        /* renamed from: Q  reason: collision with root package name */
        public static final a f28592Q;

        /* renamed from: R  reason: collision with root package name */
        public static final a f28593R;

        /* renamed from: S  reason: collision with root package name */
        public static final a f28594S;

        /* renamed from: T  reason: collision with root package name */
        public static final a f28595T;

        /* renamed from: U  reason: collision with root package name */
        public static final a f28596U;

        /* renamed from: V  reason: collision with root package name */
        public static final a f28597V;

        /* renamed from: e  reason: collision with root package name */
        public static final a f28598e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f28599f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f28600g = new a(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f28601h = new a(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f28602i = new a(16, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f28603j = new a(32, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f28604k = new a(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f28605l = new a(128, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f28606m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f28607n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f28608o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f28609p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f28610q = new a(4096, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f28611r = new a(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f28612s = new a(16384, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f28613t = new a(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f28614u = new a(65536, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f28615v = new a(131072, (CharSequence) null, D.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f28616w = new a(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f28617x = new a(524288, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f28618y = new a(1048576, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f28619z = new a(2097152, (CharSequence) null, D.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f28620a;

        /* renamed from: b  reason: collision with root package name */
        private final int f28621b;

        /* renamed from: c  reason: collision with root package name */
        private final Class f28622c;

        /* renamed from: d  reason: collision with root package name */
        protected final D f28623d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14 = null;
            Class<D.b> cls = D.b.class;
            f28606m = new a(256, (CharSequence) null, (Class) cls);
            f28607n = new a(512, (CharSequence) null, (Class) cls);
            Class<D.c> cls2 = D.c.class;
            f28608o = new a(1024, (CharSequence) null, (Class) cls2);
            f28609p = new a(2048, (CharSequence) null, (Class) cls2);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction = null;
            }
            f28582G = new a(accessibilityAction, 16908358, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 29) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction2 = null;
            }
            f28583H = new a(accessibilityAction2, 16908359, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 29) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction3 = null;
            }
            f28584I = new a(accessibilityAction3, 16908360, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 29) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction4 = null;
            }
            f28585J = new a(accessibilityAction4, 16908361, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 26) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction5 = null;
            }
            f28588M = new a(accessibilityAction5, 16908354, (CharSequence) null, (D) null, D.d.class);
            if (i10 >= 28) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction6 = null;
            }
            f28589N = new a(accessibilityAction6, 16908356, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 28) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction7 = null;
            }
            f28590O = new a(accessibilityAction7, 16908357, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 30) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction8 = null;
            }
            f28591P = new a(accessibilityAction8, 16908362, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 30) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            } else {
                accessibilityAction9 = null;
            }
            f28592Q = new a(accessibilityAction9, 16908372, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 32) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction10 = null;
            }
            f28593R = new a(accessibilityAction10, 16908373, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction11 = null;
            }
            f28594S = new a(accessibilityAction11, 16908374, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction12 = null;
            }
            f28595T = new a(accessibilityAction12, 16908375, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 33) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            } else {
                accessibilityAction13 = null;
            }
            f28596U = new a(accessibilityAction13, 16908376, (CharSequence) null, (D) null, (Class) null);
            if (i10 >= 34) {
                accessibilityAction14 = d.a();
            }
            f28597V = new a(accessibilityAction14, 16908382, (CharSequence) null, (D) null, (Class) null);
        }

        public a(int i10, CharSequence charSequence) {
            this((Object) null, i10, charSequence, (D) null, (Class) null);
        }

        public a a(CharSequence charSequence, D d10) {
            return new a((Object) null, this.f28621b, charSequence, d10, this.f28622c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f28620a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f28620a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            String str;
            if (this.f28623d == null) {
                return false;
            }
            Class cls = this.f28622c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.c.a(cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f28622c;
                    if (cls2 == null) {
                        str = "null";
                    } else {
                        str = cls2.getName();
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + str, e10);
                }
            }
            return this.f28623d.a(view, (D.a) null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f28620a;
            if (obj2 == null) {
                if (aVar.f28620a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f28620a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f28620a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String j10 = C2930A.j(this.f28621b);
            if (j10.equals("ACTION_UNKNOWN") && c() != null) {
                j10 = c().toString();
            }
            sb2.append(j10);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, D d10) {
            this((Object) null, i10, charSequence, d10, (Class) null);
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (D) null, (Class) null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this((Object) null, i10, charSequence, (D) null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, D d10, Class cls) {
            this.f28621b = i10;
            this.f28623d = d10;
            if (obj == null) {
                this.f28620a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f28620a = obj;
            }
            this.f28622c = cls;
        }
    }

    /* renamed from: y1.A$b */
    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* renamed from: y1.A$c */
    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* renamed from: y1.A$d */
    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* renamed from: y1.A$e */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        final Object f28624a;

        e(Object obj) {
            this.f28624a = obj;
        }

        public static e a(int i10, int i11, boolean z10) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static e b(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* renamed from: y1.A$f */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final Object f28625a;

        f(Object obj) {
            this.f28625a = obj;
        }

        public static f a(int i10, int i11, int i12, int i13, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static f b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    /* renamed from: y1.A$g */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        final Object f28626a;

        g(Object obj) {
            this.f28626a = obj;
        }

        public static g d(int i10, float f10, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f28626a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f28626a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f28626a).getMin();
        }
    }

    private C2930A(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f28573a = accessibilityNodeInfo;
    }

    private SparseArray A(View view) {
        SparseArray D10 = D(view);
        if (D10 != null) {
            return D10;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(C2187c.f23607I, sparseArray);
        return sparseArray;
    }

    private SparseArray D(View view) {
        return (SparseArray) view.getTag(C2187c.f23607I);
    }

    private boolean J() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int K(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f28572d;
        f28572d = i11 + 1;
        return i11;
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    public static C2930A f0() {
        return l1(AccessibilityNodeInfo.obtain());
    }

    private void g() {
        this.f28573a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f28573a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f28573a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f28573a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public static C2930A g0(View view) {
        return l1(AccessibilityNodeInfo.obtain(view));
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = this.f28573a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f28573a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static C2930A h0(C2930A a10) {
        return l1(AccessibilityNodeInfo.obtain(a10.f28573a));
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case com.amazon.c.a.a.c.f37660h /*32*/:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean l(int i10) {
        Bundle w10 = w();
        if (w10 != null && (w10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10) {
            return true;
        }
        return false;
    }

    private void l0(View view) {
        SparseArray D10 = D(view);
        if (D10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < D10.size(); i10++) {
                if (((WeakReference) D10.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                D10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    public static C2930A l1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C2930A(accessibilityNodeInfo);
    }

    private void o0(int i10, boolean z10) {
        Bundle w10 = w();
        if (w10 != null) {
            int i11 = w10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            w10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void A0(boolean z10) {
        this.f28573a.setEnabled(z10);
    }

    public CharSequence B() {
        return this.f28573a.getPackageName();
    }

    public void B0(CharSequence charSequence) {
        this.f28573a.setError(charSequence);
    }

    public g C() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f28573a.getRangeInfo();
        if (rangeInfo != null) {
            return new g(rangeInfo);
        }
        return null;
    }

    public void C0(boolean z10) {
        this.f28573a.setFocusable(z10);
    }

    public void D0(boolean z10) {
        this.f28573a.setFocused(z10);
    }

    public CharSequence E() {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a(this.f28573a);
        }
        return this.f28573a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void E0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28573a.setHeading(z10);
        } else {
            o0(2, z10);
        }
    }

    public CharSequence F() {
        if (!J()) {
            return this.f28573a.getText();
        }
        List h10 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List h11 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List h12 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List h13 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f28573a.getText(), 0, this.f28573a.getText().length()));
        for (int i10 = 0; i10 < h10.size(); i10++) {
            spannableString.setSpan(new C2931a(((Integer) h13.get(i10)).intValue(), this, w().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) h10.get(i10)).intValue(), ((Integer) h11.get(i10)).intValue(), ((Integer) h12.get(i10)).intValue());
        }
        return spannableString;
    }

    public void F0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28573a.setHintText(charSequence);
        } else {
            this.f28573a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence G() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f28573a.getTooltipText();
        }
        return this.f28573a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void G0(boolean z10) {
        this.f28573a.setImportantForAccessibility(z10);
    }

    public String H() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a(this.f28573a);
        }
        return this.f28573a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void H0(View view) {
        this.f28573a.setLabelFor(view);
    }

    public String I() {
        return this.f28573a.getViewIdResourceName();
    }

    public void I0(View view) {
        this.f28573a.setLabeledBy(view);
    }

    public void J0(int i10) {
        this.f28573a.setLiveRegion(i10);
    }

    public void K0(boolean z10) {
        this.f28573a.setLongClickable(z10);
    }

    public boolean L() {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.d(this.f28573a);
        }
        return l(64);
    }

    public void L0(int i10) {
        this.f28573a.setMaxTextLength(i10);
    }

    public boolean M() {
        return this.f28573a.isAccessibilityFocused();
    }

    public void M0(int i10) {
        this.f28573a.setMovementGranularities(i10);
    }

    public boolean N() {
        return this.f28573a.isCheckable();
    }

    public void N0(CharSequence charSequence) {
        this.f28573a.setPackageName(charSequence);
    }

    public boolean O() {
        return this.f28573a.isChecked();
    }

    public void O0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28573a.setPaneTitle(charSequence);
        } else {
            this.f28573a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean P() {
        return this.f28573a.isClickable();
    }

    public void P0(View view) {
        this.f28574b = -1;
        this.f28573a.setParent(view);
    }

    public boolean Q() {
        return this.f28573a.isContextClickable();
    }

    public void Q0(View view, int i10) {
        this.f28574b = i10;
        this.f28573a.setParent(view, i10);
    }

    public boolean R() {
        return this.f28573a.isEnabled();
    }

    public void R0(boolean z10) {
        this.f28573a.setPassword(z10);
    }

    public boolean S() {
        return this.f28573a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void S0(g gVar) {
        this.f28573a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f28626a);
    }

    public boolean T() {
        return this.f28573a.isFocusable();
    }

    public void T0(CharSequence charSequence) {
        this.f28573a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean U() {
        return this.f28573a.isFocused();
    }

    public void U0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28573a.setScreenReaderFocusable(z10);
        } else {
            o0(1, z10);
        }
    }

    public boolean V() {
        return l(67108864);
    }

    public void V0(boolean z10) {
        this.f28573a.setScrollable(z10);
    }

    public boolean W() {
        return this.f28573a.isImportantForAccessibility();
    }

    public void W0(boolean z10) {
        this.f28573a.setSelected(z10);
    }

    public boolean X() {
        return this.f28573a.isLongClickable();
    }

    public void X0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28573a.setShowingHintText(z10);
        } else {
            o0(4, z10);
        }
    }

    public boolean Y() {
        return this.f28573a.isPassword();
    }

    public void Y0(View view) {
        this.f28575c = -1;
        this.f28573a.setSource(view);
    }

    public boolean Z() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f28573a.isScreenReaderFocusable();
        }
        return l(1);
    }

    public void Z0(View view, int i10) {
        this.f28575c = i10;
        this.f28573a.setSource(view, i10);
    }

    public void a(int i10) {
        this.f28573a.addAction(i10);
    }

    public boolean a0() {
        return this.f28573a.isScrollable();
    }

    public void a1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f28573a, charSequence);
        } else {
            this.f28573a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void b(a aVar) {
        this.f28573a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f28620a);
    }

    public boolean b0() {
        return this.f28573a.isSelected();
    }

    public void b1(CharSequence charSequence) {
        this.f28573a.setText(charSequence);
    }

    public void c(View view) {
        this.f28573a.addChild(view);
    }

    public boolean c0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f28573a.isShowingHintText();
        }
        return l(4);
    }

    public void c1(int i10, int i11) {
        this.f28573a.setTextSelection(i10, i11);
    }

    public void d(View view, int i10) {
        this.f28573a.addChild(view, i10);
    }

    public boolean d0() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.b(this.f28573a);
        }
        return l(8388608);
    }

    public void d1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28573a.setTooltipText(charSequence);
        } else {
            this.f28573a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public boolean e0() {
        return this.f28573a.isVisibleToUser();
    }

    public void e1(View view) {
        this.f28573a.setTraversalAfter(view);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2930A)) {
            return false;
        }
        C2930A a10 = (C2930A) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f28573a;
        if (accessibilityNodeInfo == null) {
            if (a10.f28573a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(a10.f28573a)) {
            return false;
        }
        if (this.f28575c == a10.f28575c && this.f28574b == a10.f28574b) {
            return true;
        }
        return false;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            l0(view);
            ClickableSpan[] r10 = r(charSequence);
            if (r10 != null && r10.length > 0) {
                w().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C2187c.f23619a);
                SparseArray A10 = A(view);
                for (int i10 = 0; i10 < r10.length; i10++) {
                    int K10 = K(r10[i10], A10);
                    A10.put(K10, new WeakReference(r10[i10]));
                    e(r10[i10], (Spanned) charSequence, K10);
                }
            }
        }
    }

    public void f1(View view, int i10) {
        this.f28573a.setTraversalAfter(view, i10);
    }

    public void g1(View view) {
        this.f28573a.setTraversalBefore(view);
    }

    public void h1(View view, int i10) {
        this.f28573a.setTraversalBefore(view, i10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f28573a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f28573a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean i0(int i10, Bundle bundle) {
        return this.f28573a.performAction(i10, bundle);
    }

    public void i1(String str) {
        this.f28573a.setViewIdResourceName(str);
    }

    public void j1(boolean z10) {
        this.f28573a.setVisibleToUser(z10);
    }

    public int k() {
        return this.f28573a.getActions();
    }

    public boolean k0(a aVar) {
        return this.f28573a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f28620a);
    }

    public AccessibilityNodeInfo k1() {
        return this.f28573a;
    }

    public void m(Rect rect) {
        this.f28573a.getBoundsInParent(rect);
    }

    public void m0(boolean z10) {
        this.f28573a.setAccessibilityFocused(z10);
    }

    public void n(Rect rect) {
        this.f28573a.getBoundsInScreen(rect);
    }

    public void n0(List list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28573a.setAvailableExtraData(list);
        }
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f28573a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f28573a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public int p() {
        return this.f28573a.getChildCount();
    }

    public void p0(Rect rect) {
        this.f28573a.setBoundsInParent(rect);
    }

    public CharSequence q() {
        return this.f28573a.getClassName();
    }

    public void q0(Rect rect) {
        this.f28573a.setBoundsInScreen(rect);
    }

    public void r0(boolean z10) {
        this.f28573a.setCheckable(z10);
    }

    public e s() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f28573a.getCollectionInfo();
        if (collectionInfo != null) {
            return new e(collectionInfo);
        }
        return null;
    }

    public void s0(boolean z10) {
        this.f28573a.setChecked(z10);
    }

    public CharSequence t() {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.c(this.f28573a);
        }
        return this.f28573a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void t0(CharSequence charSequence) {
        this.f28573a.setClassName(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(B());
        sb2.append("; className: ");
        sb2.append(q());
        sb2.append("; text: ");
        sb2.append(F());
        sb2.append("; error: ");
        sb2.append(v());
        sb2.append("; maxTextLength: ");
        sb2.append(y());
        sb2.append("; stateDescription: ");
        sb2.append(E());
        sb2.append("; contentDescription: ");
        sb2.append(u());
        sb2.append("; tooltipText: ");
        sb2.append(G());
        sb2.append("; viewIdResName: ");
        sb2.append(I());
        sb2.append("; uniqueId: ");
        sb2.append(H());
        sb2.append("; checkable: ");
        sb2.append(N());
        sb2.append("; checked: ");
        sb2.append(O());
        sb2.append("; fieldRequired: ");
        sb2.append(S());
        sb2.append("; focusable: ");
        sb2.append(T());
        sb2.append("; focused: ");
        sb2.append(U());
        sb2.append("; selected: ");
        sb2.append(b0());
        sb2.append("; clickable: ");
        sb2.append(P());
        sb2.append("; longClickable: ");
        sb2.append(X());
        sb2.append("; contextClickable: ");
        sb2.append(Q());
        sb2.append("; enabled: ");
        sb2.append(R());
        sb2.append("; password: ");
        sb2.append(Y());
        sb2.append("; scrollable: " + a0());
        sb2.append("; containerTitle: ");
        sb2.append(t());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(V());
        sb2.append("; importantForAccessibility: ");
        sb2.append(W());
        sb2.append("; visible: ");
        sb2.append(e0());
        sb2.append("; isTextSelectable: ");
        sb2.append(d0());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(L());
        sb2.append("; [");
        List i10 = i();
        for (int i11 = 0; i11 < i10.size(); i11++) {
            a aVar = (a) i10.get(i11);
            String j10 = j(aVar.b());
            if (j10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                j10 = aVar.c().toString();
            }
            sb2.append(j10);
            if (i11 != i10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        return this.f28573a.getContentDescription();
    }

    public void u0(boolean z10) {
        this.f28573a.setClickable(z10);
    }

    public CharSequence v() {
        return this.f28573a.getError();
    }

    public void v0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f28573a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f28624a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public Bundle w() {
        return this.f28573a.getExtras();
    }

    public void w0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f28573a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f28625a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public CharSequence x() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f28573a.getHintText();
        }
        return this.f28573a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    public void x0(CharSequence charSequence) {
        this.f28573a.setContentDescription(charSequence);
    }

    public int y() {
        return this.f28573a.getMaxTextLength();
    }

    public void y0(boolean z10) {
        this.f28573a.setContentInvalid(z10);
    }

    public int z() {
        return this.f28573a.getMovementGranularities();
    }

    public void z0(boolean z10) {
        this.f28573a.setEditable(z10);
    }

    public void j0() {
    }
}

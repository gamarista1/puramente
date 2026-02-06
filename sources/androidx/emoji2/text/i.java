package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

final class i {

    /* renamed from: a  reason: collision with root package name */
    private final f.j f16625a;

    /* renamed from: b  reason: collision with root package name */
    private final n f16626b;

    /* renamed from: c  reason: collision with root package name */
    private f.e f16627c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f16628d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f16629e;

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 >= 0) {
                        char charAt = charSequence.charAt(i10);
                        if (z10) {
                            if (!Character.isHighSurrogate(charAt)) {
                                return -1;
                            }
                            i11--;
                        } else if (!Character.isSurrogate(charAt)) {
                            i11--;
                        } else if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        } else {
                            z10 = true;
                        }
                    } else if (z10) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z10) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i11--;
                            i10 = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i11--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z10 = true;
                        }
                    } else if (z10) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public r f16630a;

        /* renamed from: b  reason: collision with root package name */
        private final f.j f16631b;

        b(r rVar, f.j jVar) {
            this.f16630a = rVar;
            this.f16631b = jVar;
        }

        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            Spannable spannable;
            if (pVar.k()) {
                return true;
            }
            if (this.f16630a == null) {
                if (charSequence instanceof Spannable) {
                    spannable = (Spannable) charSequence;
                } else {
                    spannable = new SpannableString(charSequence);
                }
                this.f16630a = new r(spannable);
            }
            this.f16630a.setSpan(this.f16631b.a(pVar), i10, i11, 33);
            return true;
        }

        /* renamed from: c */
        public r a() {
            return this.f16630a;
        }
    }

    private interface c {
        Object a();

        boolean b(CharSequence charSequence, int i10, int i11, p pVar);
    }

    private static class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final int f16632a;

        /* renamed from: b  reason: collision with root package name */
        public int f16633b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f16634c = -1;

        d(int i10) {
            this.f16632a = i10;
        }

        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            int i12 = this.f16632a;
            if (i10 <= i12 && i12 < i11) {
                this.f16633b = i10;
                this.f16634c = i11;
                return false;
            } else if (i11 <= i12) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: c */
        public d a() {
            return this;
        }
    }

    private static class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final String f16635a;

        e(String str) {
            this.f16635a = str;
        }

        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f16635a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }

        /* renamed from: c */
        public e a() {
            return this;
        }
    }

    static final class f {

        /* renamed from: a  reason: collision with root package name */
        private int f16636a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final n.a f16637b;

        /* renamed from: c  reason: collision with root package name */
        private n.a f16638c;

        /* renamed from: d  reason: collision with root package name */
        private n.a f16639d;

        /* renamed from: e  reason: collision with root package name */
        private int f16640e;

        /* renamed from: f  reason: collision with root package name */
        private int f16641f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f16642g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f16643h;

        f(n.a aVar, boolean z10, int[] iArr) {
            this.f16637b = aVar;
            this.f16638c = aVar;
            this.f16642g = z10;
            this.f16643h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f16636a = 1;
            this.f16638c = this.f16637b;
            this.f16641f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f16638c.b().j() || d(this.f16640e)) {
                return true;
            }
            if (this.f16642g) {
                if (this.f16643h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f16643h, this.f16638c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int a(int i10) {
            n.a a10 = this.f16638c.a(i10);
            int i11 = 2;
            if (this.f16636a != 2) {
                if (a10 == null) {
                    i11 = g();
                } else {
                    this.f16636a = 2;
                    this.f16638c = a10;
                    this.f16641f = 1;
                }
            } else if (a10 != null) {
                this.f16638c = a10;
                this.f16641f++;
            } else if (f(i10)) {
                i11 = g();
            } else if (!d(i10)) {
                if (this.f16638c.b() != null) {
                    i11 = 3;
                    if (this.f16641f != 1) {
                        this.f16639d = this.f16638c;
                        g();
                    } else if (h()) {
                        this.f16639d = this.f16638c;
                        g();
                    } else {
                        i11 = g();
                    }
                } else {
                    i11 = g();
                }
            }
            this.f16640e = i10;
            return i11;
        }

        /* access modifiers changed from: package-private */
        public p b() {
            return this.f16638c.b();
        }

        /* access modifiers changed from: package-private */
        public p c() {
            return this.f16639d.b();
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            if (this.f16636a != 2 || this.f16638c.b() == null || (this.f16641f <= 1 && !h())) {
                return false;
            }
            return true;
        }
    }

    i(n nVar, f.j jVar, f.e eVar, boolean z10, int[] iArr, Set set) {
        this.f16625a = jVar;
        this.f16626b = nVar;
        this.f16627c = eVar;
        this.f16628d = z10;
        this.f16629e = iArr;
        i(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        j[] jVarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            int length = jVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                j jVar = jVarArr[i10];
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((!z10 || spanStart != selectionStart) && ((z10 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i10++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean d(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                i13 = a.a(editable, selectionStart, Math.max(i10, 0));
                i12 = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (i13 == -1 || i12 == -1) {
                    return false;
                }
            } else {
                i13 = Math.max(selectionStart - i10, 0);
                i12 = Math.min(selectionEnd + i11, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(i13, i12, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    i13 = Math.min(spanStart, i13);
                    i12 = Math.max(spanEnd, i12);
                }
                int max = Math.max(i13, 0);
                int min = Math.min(i12, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean e(Editable editable, int i10, KeyEvent keyEvent) {
        boolean z10;
        if (i10 == 67) {
            z10 = a(editable, keyEvent, false);
        } else if (i10 != 112) {
            z10 = false;
        } else {
            z10 = a(editable, keyEvent, true);
        }
        if (!z10) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean f(CharSequence charSequence, int i10, int i11, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f16627c.a(charSequence, i10, i11, pVar.h()));
        }
        if (pVar.d() == 2) {
            return true;
        }
        return false;
    }

    private static boolean g(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void i(Set set) {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                k(str, 0, str.length(), 1, true, new e(str));
            }
        }
    }

    private Object k(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c cVar) {
        int i13;
        f fVar = new f(this.f16626b.f(), this.f16628d, this.f16629e);
        int i14 = 0;
        boolean z11 = true;
        int codePointAt = Character.codePointAt(charSequence, i10);
        loop0:
        while (true) {
            i13 = i10;
            while (i10 < i11 && i14 < i12 && z11) {
                int a10 = fVar.a(codePointAt);
                if (a10 == 1) {
                    i13 += Character.charCount(Character.codePointAt(charSequence, i13));
                    if (i13 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i13);
                    }
                    i10 = i13;
                } else if (a10 == 2) {
                    i10 += Character.charCount(codePointAt);
                    if (i10 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (a10 == 3) {
                    if (z10 || !f(charSequence, i13, i10, fVar.c())) {
                        z11 = cVar.b(charSequence, i13, i10, fVar.c());
                        i14++;
                    }
                }
            }
        }
        if (fVar.e() && i14 < i12 && z11 && (z10 || !f(charSequence, i13, i10, fVar.b()))) {
            cVar.b(charSequence, i13, i10, fVar.b());
        }
        return cVar.a();
    }

    /* access modifiers changed from: package-private */
    public int b(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            j[] jVarArr = (j[]) spanned.getSpans(i10, i10 + 1, j.class);
            if (jVarArr.length > 0) {
                return spanned.getSpanEnd(jVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), a.e.API_PRIORITY_OTHER, true, new d(i10))).f16634c;
    }

    /* access modifiers changed from: package-private */
    public int c(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            j[] jVarArr = (j[]) spanned.getSpans(i10, i10 + 1, j.class);
            if (jVarArr.length > 0) {
                return spanned.getSpanStart(jVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), a.e.API_PRIORITY_OTHER, true, new d(i10))).f16633b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence j(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.o
            if (r0 == 0) goto L_0x000a
            r1 = r11
            androidx.emoji2.text.o r1 = (androidx.emoji2.text.o) r1
            r1.a()
        L_0x000a:
            java.lang.Class<androidx.emoji2.text.j> r1 = androidx.emoji2.text.j.class
            if (r0 != 0) goto L_0x002f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0013
            goto L_0x002f
        L_0x0013:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x002d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x002a }
            int r3 = r12 + -1
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch:{ all -> 0x002a }
            if (r2 > r13) goto L_0x002d
            androidx.emoji2.text.r r2 = new androidx.emoji2.text.r     // Catch:{ all -> 0x002a }
            r2.<init>((java.lang.CharSequence) r11)     // Catch:{ all -> 0x002a }
            goto L_0x0037
        L_0x002a:
            r12 = move-exception
            goto L_0x00b2
        L_0x002d:
            r2 = 0
            goto L_0x0037
        L_0x002f:
            androidx.emoji2.text.r r2 = new androidx.emoji2.text.r     // Catch:{ all -> 0x002a }
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch:{ all -> 0x002a }
            r2.<init>((android.text.Spannable) r3)     // Catch:{ all -> 0x002a }
        L_0x0037:
            r3 = 0
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.j[] r4 = (androidx.emoji2.text.j[]) r4     // Catch:{ all -> 0x002a }
            if (r4 == 0) goto L_0x0063
            int r5 = r4.length     // Catch:{ all -> 0x002a }
            if (r5 <= 0) goto L_0x0063
            int r5 = r4.length     // Catch:{ all -> 0x002a }
            r6 = r3
        L_0x0047:
            if (r6 >= r5) goto L_0x0063
            r7 = r4[r6]     // Catch:{ all -> 0x002a }
            int r8 = r2.getSpanStart(r7)     // Catch:{ all -> 0x002a }
            int r9 = r2.getSpanEnd(r7)     // Catch:{ all -> 0x002a }
            if (r8 == r13) goto L_0x0058
            r2.removeSpan(r7)     // Catch:{ all -> 0x002a }
        L_0x0058:
            int r12 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x002a }
            int r13 = java.lang.Math.max(r9, r13)     // Catch:{ all -> 0x002a }
            int r6 = r6 + 1
            goto L_0x0047
        L_0x0063:
            r4 = r13
            if (r12 == r4) goto L_0x00a9
            int r13 = r11.length()     // Catch:{ all -> 0x002a }
            if (r12 < r13) goto L_0x006d
            goto L_0x00a9
        L_0x006d:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L_0x0080
            if (r2 == 0) goto L_0x0080
            int r13 = r2.length()     // Catch:{ all -> 0x002a }
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.j[] r13 = (androidx.emoji2.text.j[]) r13     // Catch:{ all -> 0x002a }
            int r13 = r13.length     // Catch:{ all -> 0x002a }
            int r14 = r14 - r13
        L_0x0080:
            r5 = r14
            androidx.emoji2.text.i$b r7 = new androidx.emoji2.text.i$b     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.f$j r13 = r10.f16625a     // Catch:{ all -> 0x002a }
            r7.<init>(r2, r13)     // Catch:{ all -> 0x002a }
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r12 = r1.k(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x002a }
            androidx.emoji2.text.r r12 = (androidx.emoji2.text.r) r12     // Catch:{ all -> 0x002a }
            if (r12 == 0) goto L_0x00a0
            android.text.Spannable r12 = r12.b()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x009f
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.o) r11
            r11.d()
        L_0x009f:
            return r12
        L_0x00a0:
            if (r0 == 0) goto L_0x00a8
            r12 = r11
            androidx.emoji2.text.o r12 = (androidx.emoji2.text.o) r12
            r12.d()
        L_0x00a8:
            return r11
        L_0x00a9:
            if (r0 == 0) goto L_0x00b1
            r12 = r11
            androidx.emoji2.text.o r12 = (androidx.emoji2.text.o) r12
            r12.d()
        L_0x00b1:
            return r11
        L_0x00b2:
            if (r0 == 0) goto L_0x00b9
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.o) r11
            r11.d()
        L_0x00b9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.i.j(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}

package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import w1.m;
import x1.g;

public abstract class i {

    static class a {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static int b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void c(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        static void d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void f(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    static class b {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class c {
        static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    static class d {
        public static void a(TextView textView, int i10, float f10) {
            textView.setLineHeight(i10, f10);
        }
    }

    private static class e implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final ActionMode.Callback f16228a;

        /* renamed from: b  reason: collision with root package name */
        private final TextView f16229b;

        /* renamed from: c  reason: collision with root package name */
        private Class f16230c;

        /* renamed from: d  reason: collision with root package name */
        private Method f16231d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f16232e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f16233f = false;

        e(ActionMode.Callback callback, TextView textView) {
            this.f16228a = callback;
            this.f16229b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(a(), 0)) {
                if (f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                return false;
            }
            return true;
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        private void g(Menu menu) {
            Method method;
            Context context = this.f16229b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f16233f) {
                this.f16233f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f16230c = cls;
                    this.f16231d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f16232e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f16230c = null;
                    this.f16231d = null;
                    this.f16232e = false;
                }
            }
            try {
                if (!this.f16232e || !this.f16230c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f16231d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List c10 = c(context, packageManager);
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    ResolveInfo resolveInfo = (ResolveInfo) c10.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f16229b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* access modifiers changed from: package-private */
        public ActionMode.Callback d() {
            return this.f16228a;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f16228a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f16228a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f16228a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f16228a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static Drawable[] a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int d(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        if (textDirectionHeuristic == textDirectionHeuristic3) {
            return 7;
        }
        return 1;
    }

    private static TextDirectionHeuristic e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() != 1) {
                z10 = false;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z10) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(c.a(b.a(textView.getTextLocale()))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    public static m.a f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new m.a(c.b(textView));
        }
        m.a.C0460a aVar = new m.a.C0460a(new TextPaint(textView.getPaint()));
        aVar.b(a.a(textView));
        aVar.c(a.b(textView));
        aVar.d(e(textView));
        return aVar.a();
    }

    public static void g(TextView textView, ColorStateList colorStateList) {
        g.f(textView);
        a.d(textView, colorStateList);
    }

    public static void h(TextView textView, PorterDuff.Mode mode) {
        g.f(textView);
        a.e(textView, mode);
    }

    public static void i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void j(TextView textView, int i10) {
        int i11;
        g.c(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            c.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void k(TextView textView, int i10) {
        int i11;
        g.c(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void l(TextView textView, int i10) {
        g.c(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing((float) (i10 - fontMetricsInt), 1.0f);
        }
    }

    public static void m(TextView textView, int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.a(textView, i10, f10);
        } else {
            l(textView, Math.round(TypedValue.applyDimension(i10, f10, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void n(TextView textView, m mVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        f(textView);
        throw null;
    }

    public static void o(TextView textView, int i10) {
        textView.setTextAppearance(i10);
    }

    public static void p(TextView textView, m.a aVar) {
        textView.setTextDirection(d(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.c(textView, aVar.b());
        a.f(textView, aVar.c());
    }

    public static ActionMode.Callback q(ActionMode.Callback callback) {
        if (!(callback instanceof e) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((e) callback).d();
    }

    public static ActionMode.Callback r(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || i10 > 27 || (callback instanceof e) || callback == null) {
            return callback;
        }
        return new e(callback, textView);
    }
}

package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import i.C2037a;

public class c extends s implements DialogInterface {

    /* renamed from: f  reason: collision with root package name */
    final AlertController f10977f = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: P  reason: collision with root package name */
        private final AlertController.b f10978P;
        private final int mTheme;

        public a(Context context) {
            this(context, c.l(context, 0));
        }

        public c create() {
            c cVar = new c(this.f10978P.f10898a, this.mTheme);
            this.f10978P.a(cVar.f10977f);
            cVar.setCancelable(this.f10978P.f10915r);
            if (this.f10978P.f10915r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f10978P.f10916s);
            cVar.setOnDismissListener(this.f10978P.f10917t);
            DialogInterface.OnKeyListener onKeyListener = this.f10978P.f10918u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context getContext() {
            return this.f10978P.f10898a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10920w = listAdapter;
            bVar.f10921x = onClickListener;
            return this;
        }

        public a setCancelable(boolean z10) {
            this.f10978P.f10915r = z10;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.f10978P;
            bVar.f10892K = cursor;
            bVar.f10893L = str;
            bVar.f10921x = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.f10978P.f10904g = view;
            return this;
        }

        public a setIcon(int i10) {
            this.f10978P.f10900c = i10;
            return this;
        }

        public a setIconAttribute(int i10) {
            TypedValue typedValue = new TypedValue();
            this.f10978P.f10898a.getTheme().resolveAttribute(i10, typedValue, true);
            this.f10978P.f10900c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z10) {
            this.f10978P.f10895N = z10;
            return this;
        }

        public a setItems(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10919v = bVar.f10898a.getResources().getTextArray(i10);
            this.f10978P.f10921x = onClickListener;
            return this;
        }

        public a setMessage(int i10) {
            AlertController.b bVar = this.f10978P;
            bVar.f10905h = bVar.f10898a.getText(i10);
            return this;
        }

        public a setMultiChoiceItems(int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10919v = bVar.f10898a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.f10978P;
            bVar2.f10891J = onMultiChoiceClickListener;
            bVar2.f10887F = zArr;
            bVar2.f10888G = true;
            return this;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10909l = bVar.f10898a.getText(i10);
            this.f10978P.f10911n = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.f10978P.f10910m = drawable;
            return this;
        }

        public a setNeutralButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10912o = bVar.f10898a.getText(i10);
            this.f10978P.f10914q = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.f10978P.f10913p = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f10978P.f10916s = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f10978P.f10917t = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f10978P.f10896O = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f10978P.f10918u = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10906i = bVar.f10898a.getText(i10);
            this.f10978P.f10908k = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.f10978P.f10907j = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z10) {
            this.f10978P.f10897P = z10;
            return this;
        }

        public a setSingleChoiceItems(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10919v = bVar.f10898a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.f10978P;
            bVar2.f10921x = onClickListener;
            bVar2.f10890I = i11;
            bVar2.f10889H = true;
            return this;
        }

        public a setTitle(int i10) {
            AlertController.b bVar = this.f10978P;
            bVar.f10903f = bVar.f10898a.getText(i10);
            return this;
        }

        public a setView(int i10) {
            AlertController.b bVar = this.f10978P;
            bVar.f10923z = null;
            bVar.f10922y = i10;
            bVar.f10886E = false;
            return this;
        }

        public c show() {
            c create = create();
            create.show();
            return create;
        }

        public a(Context context, int i10) {
            this.f10978P = new AlertController.b(new ContextThemeWrapper(context, c.l(context, i10)));
            this.mTheme = i10;
        }

        public a setIcon(Drawable drawable) {
            this.f10978P.f10901d = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.f10978P.f10905h = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f10978P.f10903f = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10919v = charSequenceArr;
            bVar.f10921x = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10909l = charSequence;
            bVar.f10911n = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10912o = charSequence;
            bVar.f10914q = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10906i = charSequence;
            bVar.f10908k = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f10978P;
            bVar.f10923z = view;
            bVar.f10922y = 0;
            bVar.f10886E = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10919v = charSequenceArr;
            bVar.f10891J = onMultiChoiceClickListener;
            bVar.f10887F = zArr;
            bVar.f10888G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10892K = cursor;
            bVar.f10921x = onClickListener;
            bVar.f10890I = i10;
            bVar.f10893L = str;
            bVar.f10889H = true;
            return this;
        }

        @Deprecated
        public a setView(View view, int i10, int i11, int i12, int i13) {
            AlertController.b bVar = this.f10978P;
            bVar.f10923z = view;
            bVar.f10922y = 0;
            bVar.f10886E = true;
            bVar.f10882A = i10;
            bVar.f10883B = i11;
            bVar.f10884C = i12;
            bVar.f10885D = i13;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10892K = cursor;
            bVar.f10891J = onMultiChoiceClickListener;
            bVar.f10894M = str;
            bVar.f10893L = str2;
            bVar.f10888G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10919v = charSequenceArr;
            bVar.f10921x = onClickListener;
            bVar.f10890I = i10;
            bVar.f10889H = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f10978P;
            bVar.f10920w = listAdapter;
            bVar.f10921x = onClickListener;
            bVar.f10890I = i10;
            bVar.f10889H = true;
            return this;
        }
    }

    protected c(Context context, int i10) {
        super(context, l(context, i10));
    }

    static int l(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2037a.f21269l, typedValue, true);
        return typedValue.resourceId;
    }

    public Button j(int i10) {
        return this.f10977f.c(i10);
    }

    public ListView k() {
        return this.f10977f.e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10977f.f();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f10977f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f10977f.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f10977f.q(charSequence);
    }
}

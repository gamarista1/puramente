package com.facebook.react.modules.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.core.view.C1677a;
import androidx.core.view.C1680b0;
import androidx.fragment.app.C1767o;
import com.facebook.react.C3367m;
import com.facebook.react.C3369o;
import com.facebook.react.modules.dialog.DialogModule;
import i.j;
import io.intercom.android.sdk.metrics.MetricTracker;
import n7.C3863a;
import y1.C2930A;

public class b extends C1767o implements DialogInterface.OnClickListener {

    /* renamed from: q  reason: collision with root package name */
    private final DialogModule.b f41054q;

    class a extends C1677a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f41055a;

        a(TextView textView) {
            this.f41055a = textView;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C2930A a10) {
            super.onInitializeAccessibilityNodeInfo(this.f41055a, a10);
            a10.E0(true);
        }
    }

    public b() {
        this.f41054q = null;
    }

    private static Dialog U(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        c.a aVar = new c.a(context);
        if (bundle.containsKey(com.amazon.a.a.o.b.f37461S)) {
            aVar.setCustomTitle(X(context, (String) C3863a.c(bundle.getString(com.amazon.a.a.o.b.f37461S))));
        }
        if (bundle.containsKey("button_positive")) {
            aVar.setPositiveButton((CharSequence) bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            aVar.setNegativeButton((CharSequence) bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            aVar.setNeutralButton((CharSequence) bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey(MetricTracker.Object.MESSAGE)) {
            aVar.setMessage((CharSequence) bundle.getString(MetricTracker.Object.MESSAGE));
        }
        if (bundle.containsKey("items")) {
            aVar.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return aVar.create();
    }

    private static Dialog V(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (bundle.containsKey(com.amazon.a.a.o.b.f37461S)) {
            builder.setCustomTitle(X(context, (String) C3863a.c(bundle.getString(com.amazon.a.a.o.b.f37461S))));
        }
        if (bundle.containsKey("button_positive")) {
            builder.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            builder.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            builder.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey(MetricTracker.Object.MESSAGE)) {
            builder.setMessage(bundle.getString(MetricTracker.Object.MESSAGE));
        }
        if (bundle.containsKey("items")) {
            builder.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return builder.create();
    }

    public static Dialog W(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        if (Y(context)) {
            return U(context, bundle, onClickListener);
        }
        return V(context, bundle, onClickListener);
    }

    private static View X(Context context, String str) {
        View inflate = LayoutInflater.from(context).inflate(C3369o.f41131a, (ViewGroup) null);
        TextView textView = (TextView) C3863a.c((TextView) inflate.findViewById(C3367m.f40935k));
        textView.setText(str);
        textView.setFocusable(true);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setAccessibilityHeading(true);
        } else {
            C1680b0.o0(textView, new a(textView));
        }
        return inflate;
    }

    private static boolean Y(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j.f21675y0);
        boolean hasValue = obtainStyledAttributes.hasValue(j.f21448D0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    public Dialog K(Bundle bundle) {
        return W(requireActivity(), requireArguments(), this);
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        DialogModule.b bVar = this.f41054q;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i10);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.b bVar = this.f41054q;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }

    public b(DialogModule.b bVar, Bundle bundle) {
        this.f41054q = bVar;
        setArguments(bundle);
    }
}

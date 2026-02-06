package io.branch.referral.validators;

import Fe.F;
import Fe.G;
import Je.n;
import Je.o;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class IntegrationValidatorDialogRowItem extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    TextView f44570a;

    /* renamed from: b  reason: collision with root package name */
    TextView f44571b;

    /* renamed from: c  reason: collision with root package name */
    Button f44572c;

    /* renamed from: d  reason: collision with root package name */
    String f44573d;

    /* renamed from: e  reason: collision with root package name */
    String f44574e;

    public IntegrationValidatorDialogRowItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(getContext()).inflate(G.f30888c, (ViewGroup) null);
        addView(inflate);
        this.f44570a = (TextView) inflate.findViewById(F.f30858E);
        this.f44571b = (TextView) inflate.findViewById(F.f30879t);
        Button button = (Button) inflate.findViewById(F.f30861b);
        this.f44572c = button;
        button.setOnClickListener(new n(this, context));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(DialogInterface dialogInterface, int i10) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(Context context, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(this.f44573d + "\n");
        TextView textView = new TextView(context);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setGravity(1);
        textView.setText(Html.fromHtml("<a href=" + this.f44574e + "</a>"));
        builder.setView(textView);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new o());
        builder.create().show();
    }

    public void c(String str) {
        this.f44573d = str;
    }

    public void d(String str) {
        this.f44574e = str;
    }

    public void e(boolean z10) {
        String str;
        if (z10) {
            str = "✅";
        } else {
            str = "❌";
        }
        this.f44571b.setText(str);
        g(z10);
    }

    public void f(String str) {
        this.f44570a.setText(str);
    }

    public void g(boolean z10) {
        if (z10) {
            this.f44572c.setVisibility(4);
        } else {
            this.f44572c.setVisibility(0);
        }
    }
}

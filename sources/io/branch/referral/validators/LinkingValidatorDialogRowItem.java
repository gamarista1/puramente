package io.branch.referral.validators;

import Fe.C3016e;
import Fe.C3020i;
import Fe.F;
import Fe.G;
import Ie.g;
import Je.s;
import Je.t;
import Je.u;
import Je.v;
import Je.w;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;

public class LinkingValidatorDialogRowItem extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    TextView f44575a;

    /* renamed from: b  reason: collision with root package name */
    Button f44576b;

    /* renamed from: c  reason: collision with root package name */
    String f44577c;

    /* renamed from: d  reason: collision with root package name */
    Button f44578d;

    /* renamed from: e  reason: collision with root package name */
    HashMap f44579e;

    /* renamed from: f  reason: collision with root package name */
    String f44580f;

    /* renamed from: g  reason: collision with root package name */
    String f44581g;

    /* renamed from: h  reason: collision with root package name */
    String f44582h;

    /* renamed from: i  reason: collision with root package name */
    Context f44583i;

    /* renamed from: j  reason: collision with root package name */
    Button f44584j;

    /* renamed from: k  reason: collision with root package name */
    String f44585k;

    public LinkingValidatorDialogRowItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44583i = context;
    }

    private void f() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f44583i);
        AlertDialog.Builder message = builder.setMessage(this.f44585k);
        message.setTitle(this.f44575a.getText() + " not working?");
        builder.create().show();
    }

    private void g() {
        Ce.a q10 = new Ce.a().q(this.f44582h);
        g gVar = new g();
        gVar.a(this.f44580f, this.f44581g);
        for (int i10 = 0; i10 < this.f44579e.size(); i10 += 2) {
            gVar.a((String) this.f44579e.get(Integer.valueOf(i10)), (String) this.f44579e.get(Integer.valueOf(i10 + 1)));
        }
        String k10 = q10.k(this.f44583i, gVar);
        Intent intent = new Intent(getContext(), l(this.f44583i).getClass());
        intent.putExtra("branch", k10);
        intent.putExtra("branch_force_new_session", true);
        l(this.f44583i).startActivity(intent);
    }

    private void h() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f44583i);
        builder.setMessage(this.f44577c).setTitle(this.f44575a.getText());
        builder.create().show();
    }

    private void i() {
        g gVar = new g();
        for (String str : this.f44579e.keySet()) {
            gVar.a(str, (String) this.f44579e.get(str));
        }
        C3016e.X().W0(l(this.f44583i), new Ce.a().q(this.f44582h), gVar, new a(), this.f44575a.getText().toString(), this.f44577c);
    }

    private void j() {
        l(this.f44583i).moveTaskToBack(true);
        g();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        h();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        i();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(View view) {
        j();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(View view) {
        g();
    }

    public void k(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, int i10, String... strArr) {
        View inflate = LayoutInflater.from(getContext()).inflate(G.f30889d, (ViewGroup) null);
        addView(inflate);
        this.f44575a = (TextView) inflate.findViewById(F.f30876q);
        this.f44576b = (Button) inflate.findViewById(F.f30875p);
        this.f44578d = (Button) inflate.findViewById(F.f30873n);
        this.f44584j = (Button) inflate.findViewById(F.f30874o);
        this.f44575a.setText(str);
        this.f44577c = str2;
        this.f44585k = str3;
        this.f44580f = str4;
        this.f44581g = str5;
        this.f44582h = str6;
        this.f44579e = new HashMap();
        for (int i11 = 0; i11 < strArr.length; i11 += 2) {
            this.f44579e.put(strArr[i11], strArr[i11 + 1]);
        }
        this.f44579e.put(str4, str5);
        this.f44576b.setOnClickListener(new s(this));
        this.f44584j.setOnClickListener(new t(this));
        if (z10) {
            this.f44578d.setText("Share");
            this.f44578d.setOnClickListener(new u(this));
            return;
        }
        this.f44578d.setText("Test");
        if (i10 == 4) {
            this.f44578d.setOnClickListener(new v(this));
        } else if (i10 == 5) {
            this.f44578d.setOnClickListener(new w(this));
        }
    }

    public Activity l(Context context) {
        if (context == null || !(context instanceof ContextWrapper)) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return l(((ContextWrapper) context).getBaseContext());
    }

    class a implements C3016e.f {
        a() {
        }

        public void a(String str, C3020i iVar) {
        }
    }
}

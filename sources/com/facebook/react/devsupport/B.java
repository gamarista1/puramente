package com.facebook.react.devsupport;

import I7.d;
import android.content.DialogInterface;

public final /* synthetic */ class B implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ E f40649a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d[] f40650b;

    public /* synthetic */ B(E e10, d[] dVarArr) {
        this.f40649a = e10;
        this.f40650b = dVarArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f40649a.C0(this.f40650b, dialogInterface, i10);
    }
}

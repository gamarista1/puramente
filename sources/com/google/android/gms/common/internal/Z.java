package com.google.android.gms.common.internal;

import Ha.C4295b;
import Ha.C4296c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;

public final class Z extends C4296c {

    /* renamed from: c  reason: collision with root package name */
    private static final Z f54141c = new Z();

    private Z() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) {
        Z z10 = f54141c;
        try {
            X x10 = new X(1, i10, i11, (Scope[]) null);
            return (View) C4295b.b(((M) z10.b(context)).a(C4295b.c(context), x10));
        } catch (Exception e10) {
            throw new C4296c.a("Could not get button with size " + i10 + " and color " + i11, e10);
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof M) {
            return (M) queryLocalInterface;
        }
        return new M(iBinder);
    }
}

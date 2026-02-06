package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.C1613a;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R7\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00168F@FX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR/\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00068F@FX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lio/intercom/android/sdk/m5/components/IntercomPrimaryButton;", "Landroidx/compose/ui/platform/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llf/M;", "Content", "(LY/m;I)V", "", "<set-?>", "text$delegate", "LY/r0;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "Lkotlin/Function0;", "onClick$delegate", "getOnClick", "()Lyf/a;", "setOnClick", "(Lyf/a;)V", "onClick", "trailingIconId$delegate", "getTrailingIconId", "()Ljava/lang/Integer;", "setTrailingIconId", "(Ljava/lang/Integer;)V", "trailingIconId", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomPrimaryButton extends C1613a {
    public static final int $stable = 0;
    private final C1510r0 onClick$delegate;
    private final C1510r0 text$delegate;
    private final C1510r0 trailingIconId$delegate;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C6496s.h(context, "context");
    }

    /* access modifiers changed from: private */
    public static final C6514M Content$lambda$1(IntercomPrimaryButton intercomPrimaryButton, int i10, C1500m mVar, int i11) {
        C6496s.h(intercomPrimaryButton, "$tmp0_rcvr");
        intercomPrimaryButton.Content(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M onClick_delegate$lambda$0() {
        return C6514M.f71813a;
    }

    public void Content(C1500m mVar, int i10) {
        int i11;
        int i12;
        C1500m h10 = mVar.h(346924157);
        if ((i10 & 14) == 0) {
            if (h10.S(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) != 2 || !h10.i()) {
            IntercomPrimaryButtonKt.IntercomPrimaryButton(getText(), (i) null, getTrailingIconId(), getOnClick(), h10, 0, 2);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new F0(this, i10));
        }
    }

    public final C6787a getOnClick() {
        return (C6787a) this.onClick$delegate.getValue();
    }

    public final String getText() {
        return (String) this.text$delegate.getValue();
    }

    public final Integer getTrailingIconId() {
        return (Integer) this.trailingIconId$delegate.getValue();
    }

    public final void setOnClick(C6787a aVar) {
        C6496s.h(aVar, "<set-?>");
        this.onClick$delegate.setValue(aVar);
    }

    public final void setText(String str) {
        C6496s.h(str, "<set-?>");
        this.text$delegate.setValue(str);
    }

    public final void setTrailingIconId(Integer num) {
        this.trailingIconId$delegate.setValue(num);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C6496s.h(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C6496s.h(context, "context");
        this.text$delegate = u1.d("", (o1) null, 2, (Object) null);
        this.onClick$delegate = u1.d(new E0(), (o1) null, 2, (Object) null);
        this.trailingIconId$delegate = u1.d((Object) null, (o1) null, 2, (Object) null);
    }
}

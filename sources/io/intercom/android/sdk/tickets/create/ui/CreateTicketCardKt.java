package io.intercom.android.sdk.tickets.create.ui;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import g0.c;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.g2;
import x.C2868g;
import yf.C6787a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\r\u0010\f\"\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "blockRenderData", "", "enabled", "Lkotlin/Function0;", "Llf/M;", "onClick", "CreateTicketCard", "(Lk0/i;Lio/intercom/android/sdk/survey/block/BlockRenderData;ZLyf/a;LY/m;II)V", "EnabledCreateTicketCardPreview", "(LY/m;I)V", "DisabledCreateTicketCardPreview", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "kotlin.jvm.PlatformType", "sampleBlock", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CreateTicketCardKt {
    /* access modifiers changed from: private */
    public static final Block sampleBlock = new Block.Builder().withType(BlockType.CREATETICKETCARD.getSerializedName()).withText("Admin has requested you to create a ticket").withTitle("Create ticket").withTicketTypeTitle("Bug").withTicketType(new TicketType(1234, "Bug", "🎟", C6565s.n(), false)).build();

    public static final void CreateTicketCard(i iVar, BlockRenderData blockRenderData, boolean z10, C6787a aVar, C1500m mVar, int i10, int i11) {
        i iVar2;
        C6787a aVar2;
        BlockRenderData blockRenderData2 = blockRenderData;
        C6496s.h(blockRenderData2, "blockRenderData");
        C1500m h10 = mVar.h(-214450953);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 8) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        IntercomCardKt.IntercomCard(q.h(iVar2, 0.0f, 1, (Object) null), IntercomCardStyle.INSTANCE.m590conversationCardStylePEIptTM((g2) null, 0, 0, 0.0f, (C2868g) null, h10, IntercomCardStyle.$stable << 15, 31), c.e(1721044843, true, new CreateTicketCardKt$CreateTicketCard$1(z10, aVar2, blockRenderData2), h10, 54), h10, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new t(iVar2, blockRenderData, z10, aVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CreateTicketCard$lambda$0(i iVar, BlockRenderData blockRenderData, boolean z10, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(blockRenderData, "$blockRenderData");
        CreateTicketCard(iVar, blockRenderData, z10, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void DisabledCreateTicketCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1443652823);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m543getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DisabledCreateTicketCardPreview$lambda$2(int i10, C1500m mVar, int i11) {
        DisabledCreateTicketCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void EnabledCreateTicketCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1535832576);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CreateTicketCardKt.INSTANCE.m542getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new v(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EnabledCreateTicketCardPreview$lambda$1(int i10, C1500m mVar, int i11) {
        EnabledCreateTicketCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}

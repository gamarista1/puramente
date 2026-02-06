package io.intercom.android.sdk.survey.block;

import android.content.Context;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.Blocks;
import io.intercom.android.sdk.blocks.lib.models.Block;
import yf.C6798l;

/* renamed from: io.intercom.android.sdk.survey.block.g  reason: case insensitive filesystem */
public final /* synthetic */ class C6271g implements C6798l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Blocks f70134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Block f70135b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewHolderGenerator f70136c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f70137d;

    public /* synthetic */ C6271g(Blocks blocks, Block block, ViewHolderGenerator viewHolderGenerator, long j10) {
        this.f70134a = blocks;
        this.f70135b = block;
        this.f70136c = viewHolderGenerator;
        this.f70137d = j10;
    }

    public final Object invoke(Object obj) {
        return BlockViewKt.RenderLegacyBlocks_sW7UJKQ$lambda$6(this.f70134a, this.f70135b, this.f70136c, this.f70137d, (Context) obj);
    }
}

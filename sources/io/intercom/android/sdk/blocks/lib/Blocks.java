package io.intercom.android.sdk.blocks.lib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.models.carousel.Appearance;
import java.util.List;

public class Blocks {
    private final Appearance appearance;
    private final LayoutInflater inflater;
    private final Twig twig;

    public Blocks(Context context, Twig twig2) {
        this.inflater = LayoutInflater.from(context);
        this.twig = twig2;
        this.appearance = Appearance.NULL;
    }

    public LinearLayout createBlocks(List<Block> list, BlocksViewHolder blocksViewHolder) {
        boolean z10;
        LinearLayout linearLayout = (LinearLayout) this.inflater.inflate(blocksViewHolder.getLayout(), (ViewGroup) null);
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                Block block = list.get(i10);
                boolean z11 = true;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 != list.size() - 1) {
                    z11 = false;
                }
                try {
                    linearLayout.addView(block.getType().getView(blocksViewHolder, block, linearLayout, new BlockMetadata.Builder().withAppearance(this.appearance.toBuilder()).isFirstObject(Boolean.valueOf(z10)).isLastObject(Boolean.valueOf(z11)).build()));
                } catch (BlockTypeNotImplementedException e10) {
                    this.twig.e(e10, "Error creating view for block with type %s ", block.getType());
                }
            }
        }
        return linearLayout;
    }

    public Blocks(Context context, Twig twig2, Appearance appearance2) {
        this.inflater = LayoutInflater.from(context);
        this.twig = twig2;
        this.appearance = appearance2;
    }
}

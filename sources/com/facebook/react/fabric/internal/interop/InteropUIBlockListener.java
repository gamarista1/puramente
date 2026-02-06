package com.facebook.react.fabric.internal.interop;

import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/fabric/internal/interop/InteropUIBlockListener;", "Lcom/facebook/react/bridge/UIManagerListener;", "<init>", "()V", "Lcom/facebook/react/fabric/interop/UIBlock;", "block", "Llf/M;", "prependUIBlock", "(Lcom/facebook/react/fabric/interop/UIBlock;)V", "addUIBlock", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "willMountItems", "(Lcom/facebook/react/bridge/UIManager;)V", "didMountItems", "didDispatchMountItems", "willDispatchViewUpdates", "didScheduleMountItems", "", "beforeUIBlocks", "Ljava/util/List;", "getBeforeUIBlocks$ReactAndroid_release", "()Ljava/util/List;", "afterUIBlocks", "getAfterUIBlocks$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InteropUIBlockListener implements UIManagerListener {
    private final List<UIBlock> afterUIBlocks = new ArrayList();
    private final List<UIBlock> beforeUIBlocks = new ArrayList();

    public final synchronized void addUIBlock(UIBlock uIBlock) {
        C6496s.h(uIBlock, "block");
        this.afterUIBlocks.add(uIBlock);
    }

    public void didDispatchMountItems(UIManager uIManager) {
        C6496s.h(uIManager, "uiManager");
        didMountItems(uIManager);
    }

    public void didMountItems(UIManager uIManager) {
        C6496s.h(uIManager, "uiManager");
        if (!this.afterUIBlocks.isEmpty()) {
            for (UIBlock uIBlock : this.afterUIBlocks) {
                if (uIManager instanceof UIBlockViewResolver) {
                    uIBlock.execute((UIBlockViewResolver) uIManager);
                }
            }
            this.afterUIBlocks.clear();
        }
    }

    public void didScheduleMountItems(UIManager uIManager) {
        C6496s.h(uIManager, "uiManager");
    }

    public final List<UIBlock> getAfterUIBlocks$ReactAndroid_release() {
        return this.afterUIBlocks;
    }

    public final List<UIBlock> getBeforeUIBlocks$ReactAndroid_release() {
        return this.beforeUIBlocks;
    }

    public final synchronized void prependUIBlock(UIBlock uIBlock) {
        C6496s.h(uIBlock, "block");
        this.beforeUIBlocks.add(uIBlock);
    }

    public void willDispatchViewUpdates(UIManager uIManager) {
        C6496s.h(uIManager, "uiManager");
        willMountItems(uIManager);
    }

    public void willMountItems(UIManager uIManager) {
        C6496s.h(uIManager, "uiManager");
        if (!this.beforeUIBlocks.isEmpty()) {
            for (UIBlock uIBlock : this.beforeUIBlocks) {
                if (uIManager instanceof UIBlockViewResolver) {
                    uIBlock.execute((UIBlockViewResolver) uIManager);
                }
            }
            this.beforeUIBlocks.clear();
        }
    }
}

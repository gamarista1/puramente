package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

final class AutoValue_Link extends Link {
    private final List<Block> blocks;
    private final Card card;
    private final long createdAt;

    /* renamed from: id  reason: collision with root package name */
    private final String f70028id;
    private final ReactionReply reactionReply;
    private final long updatedAt;

    AutoValue_Link(String str, Card card2, List<Block> list, ReactionReply reactionReply2, long j10, long j11) {
        if (str != null) {
            this.f70028id = str;
            if (card2 != null) {
                this.card = card2;
                if (list != null) {
                    this.blocks = list;
                    if (reactionReply2 != null) {
                        this.reactionReply = reactionReply2;
                        this.createdAt = j10;
                        this.updatedAt = j11;
                        return;
                    }
                    throw new NullPointerException("Null reactionReply");
                }
                throw new NullPointerException("Null blocks");
            }
            throw new NullPointerException("Null card");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        if (!this.f70028id.equals(link.getId()) || !this.card.equals(link.getCard()) || !this.blocks.equals(link.getBlocks()) || !this.reactionReply.equals(link.getReactionReply()) || this.createdAt != link.getCreatedAt() || this.updatedAt != link.getUpdatedAt()) {
            return false;
        }
        return true;
    }

    public List<Block> getBlocks() {
        return this.blocks;
    }

    public Card getCard() {
        return this.card;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.f70028id;
    }

    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        long j10 = this.createdAt;
        long j11 = this.updatedAt;
        return ((((((((((this.f70028id.hashCode() ^ 1000003) * 1000003) ^ this.card.hashCode()) * 1000003) ^ this.blocks.hashCode()) * 1000003) ^ this.reactionReply.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Link{id=" + this.f70028id + ", card=" + this.card + ", blocks=" + this.blocks + ", reactionReply=" + this.reactionReply + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
    }
}

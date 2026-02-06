package com.amazon.device.simplesignin.model;

public class Link {
    private String amazonUserId;
    private String identityProviderName;
    private String linkId;
    private long linkedTimestamp;
    private String partnerUserId;
    private Token ssiToken;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof Link;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        if (!link.canEqual(this) || getLinkedTimestamp() != link.getLinkedTimestamp()) {
            return false;
        }
        String linkId2 = getLinkId();
        String linkId3 = link.getLinkId();
        if (linkId2 != null ? !linkId2.equals(linkId3) : linkId3 != null) {
            return false;
        }
        String amazonUserId2 = getAmazonUserId();
        String amazonUserId3 = link.getAmazonUserId();
        if (amazonUserId2 != null ? !amazonUserId2.equals(amazonUserId3) : amazonUserId3 != null) {
            return false;
        }
        String partnerUserId2 = getPartnerUserId();
        String partnerUserId3 = link.getPartnerUserId();
        if (partnerUserId2 != null ? !partnerUserId2.equals(partnerUserId3) : partnerUserId3 != null) {
            return false;
        }
        String identityProviderName2 = getIdentityProviderName();
        String identityProviderName3 = link.getIdentityProviderName();
        if (identityProviderName2 != null ? !identityProviderName2.equals(identityProviderName3) : identityProviderName3 != null) {
            return false;
        }
        Token ssiToken2 = getSsiToken();
        Token ssiToken3 = link.getSsiToken();
        if (ssiToken2 != null ? ssiToken2.equals(ssiToken3) : ssiToken3 == null) {
            return true;
        }
        return false;
    }

    public String getAmazonUserId() {
        return this.amazonUserId;
    }

    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public String getLinkId() {
        return this.linkId;
    }

    public long getLinkedTimestamp() {
        return this.linkedTimestamp;
    }

    public String getPartnerUserId() {
        return this.partnerUserId;
    }

    public Token getSsiToken() {
        return this.ssiToken;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        long linkedTimestamp2 = getLinkedTimestamp();
        String linkId2 = getLinkId();
        int i14 = (((int) (linkedTimestamp2 ^ (linkedTimestamp2 >>> 32))) + 59) * 59;
        int i15 = 43;
        if (linkId2 == null) {
            i10 = 43;
        } else {
            i10 = linkId2.hashCode();
        }
        int i16 = i14 + i10;
        String amazonUserId2 = getAmazonUserId();
        int i17 = i16 * 59;
        if (amazonUserId2 == null) {
            i11 = 43;
        } else {
            i11 = amazonUserId2.hashCode();
        }
        int i18 = i17 + i11;
        String partnerUserId2 = getPartnerUserId();
        int i19 = i18 * 59;
        if (partnerUserId2 == null) {
            i12 = 43;
        } else {
            i12 = partnerUserId2.hashCode();
        }
        int i20 = i19 + i12;
        String identityProviderName2 = getIdentityProviderName();
        int i21 = i20 * 59;
        if (identityProviderName2 == null) {
            i13 = 43;
        } else {
            i13 = identityProviderName2.hashCode();
        }
        int i22 = i21 + i13;
        Token ssiToken2 = getSsiToken();
        int i23 = i22 * 59;
        if (ssiToken2 != null) {
            i15 = ssiToken2.hashCode();
        }
        return i23 + i15;
    }

    public void setAmazonUserId(String str) {
        this.amazonUserId = str;
    }

    public void setIdentityProviderName(String str) {
        this.identityProviderName = str;
    }

    public void setLinkId(String str) {
        this.linkId = str;
    }

    public void setLinkedTimestamp(long j10) {
        this.linkedTimestamp = j10;
    }

    public void setPartnerUserId(String str) {
        this.partnerUserId = str;
    }

    public void setSsiToken(Token token) {
        this.ssiToken = token;
    }
}

package com.amazon.device.simplesignin.model.response;

import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;
import java.util.List;

public class GetUserAndLinksResponse {
    private String amazonUserId;
    private List<Link> links;
    private RequestId requestId;
    private RequestStatus requestStatus;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetUserAndLinksResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserAndLinksResponse)) {
            return false;
        }
        GetUserAndLinksResponse getUserAndLinksResponse = (GetUserAndLinksResponse) obj;
        if (!getUserAndLinksResponse.canEqual(this)) {
            return false;
        }
        RequestId requestId2 = getRequestId();
        RequestId requestId3 = getUserAndLinksResponse.getRequestId();
        if (requestId2 != null ? !requestId2.equals(requestId3) : requestId3 != null) {
            return false;
        }
        RequestStatus requestStatus2 = getRequestStatus();
        RequestStatus requestStatus3 = getUserAndLinksResponse.getRequestStatus();
        if (requestStatus2 != null ? !requestStatus2.equals(requestStatus3) : requestStatus3 != null) {
            return false;
        }
        String amazonUserId2 = getAmazonUserId();
        String amazonUserId3 = getUserAndLinksResponse.getAmazonUserId();
        if (amazonUserId2 != null ? !amazonUserId2.equals(amazonUserId3) : amazonUserId3 != null) {
            return false;
        }
        List<Link> links2 = getLinks();
        List<Link> links3 = getUserAndLinksResponse.getLinks();
        if (links2 != null ? links2.equals(links3) : links3 == null) {
            return true;
        }
        return false;
    }

    public String getAmazonUserId() {
        return this.amazonUserId;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        RequestId requestId2 = getRequestId();
        int i13 = 43;
        if (requestId2 == null) {
            i10 = 43;
        } else {
            i10 = requestId2.hashCode();
        }
        RequestStatus requestStatus2 = getRequestStatus();
        int i14 = (i10 + 59) * 59;
        if (requestStatus2 == null) {
            i11 = 43;
        } else {
            i11 = requestStatus2.hashCode();
        }
        int i15 = i14 + i11;
        String amazonUserId2 = getAmazonUserId();
        int i16 = i15 * 59;
        if (amazonUserId2 == null) {
            i12 = 43;
        } else {
            i12 = amazonUserId2.hashCode();
        }
        int i17 = i16 + i12;
        List<Link> links2 = getLinks();
        int i18 = i17 * 59;
        if (links2 != null) {
            i13 = links2.hashCode();
        }
        return i18 + i13;
    }

    public void setAmazonUserId(String str) {
        this.amazonUserId = str;
    }

    public void setLinks(List<Link> list) {
        this.links = list;
    }

    public void setRequestId(RequestId requestId2) {
        this.requestId = requestId2;
    }

    public void setRequestStatus(RequestStatus requestStatus2) {
        this.requestStatus = requestStatus2;
    }
}

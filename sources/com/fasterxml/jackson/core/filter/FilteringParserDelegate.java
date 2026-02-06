package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FilteringParserDelegate extends JsonParserDelegate {
    protected boolean _allowMultipleMatches;
    protected JsonToken _currToken;
    protected TokenFilterContext _exposedContext;
    protected TokenFilterContext _headContext;
    @Deprecated
    protected boolean _includeImmediateParent;
    protected boolean _includePath;
    protected TokenFilter _itemFilter;
    protected JsonToken _lastClearedToken;
    protected int _matchCount;
    protected TokenFilter rootFilter;

    public FilteringParserDelegate(JsonParser jsonParser, TokenFilter tokenFilter, boolean z10, boolean z11) {
        super(jsonParser);
        this.rootFilter = tokenFilter;
        this._itemFilter = tokenFilter;
        this._headContext = TokenFilterContext.createRootContext(tokenFilter);
        this._includePath = z10;
        this._allowMultipleMatches = z11;
    }

    private JsonToken _nextBuffered(TokenFilterContext tokenFilterContext) {
        this._exposedContext = tokenFilterContext;
        JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
        if (nextTokenToRead != null) {
            return nextTokenToRead;
        }
        while (tokenFilterContext != this._headContext) {
            tokenFilterContext = this._exposedContext.findChildOf(tokenFilterContext);
            this._exposedContext = tokenFilterContext;
            if (tokenFilterContext != null) {
                JsonToken nextTokenToRead2 = tokenFilterContext.nextTokenToRead();
                if (nextTokenToRead2 != null) {
                    return nextTokenToRead2;
                }
            } else {
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
        }
        throw _constructError("Internal error: failed to locate expected buffered tokens");
    }

    /* access modifiers changed from: protected */
    public JsonStreamContext _filterContext() {
        TokenFilterContext tokenFilterContext = this._exposedContext;
        if (tokenFilterContext != null) {
            return tokenFilterContext;
        }
        return this._headContext;
    }

    /* access modifiers changed from: protected */
    public final JsonToken _nextToken2() {
        JsonToken nextToken;
        JsonToken _nextTokenWithBuffering;
        JsonToken _nextTokenWithBuffering2;
        JsonToken _nextTokenWithBuffering3;
        TokenFilter checkValue;
        while (true) {
            nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                this._currToken = nextToken;
                return nextToken;
            }
            int id2 = nextToken.id();
            if (id2 != 1) {
                if (id2 != 2) {
                    if (id2 == 3) {
                        TokenFilter tokenFilter = this._itemFilter;
                        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
                        if (tokenFilter == tokenFilter2) {
                            this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (tokenFilter == null) {
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter checkValue2 = this._headContext.checkValue(tokenFilter);
                            if (checkValue2 == null) {
                                this.delegate.skipChildren();
                            } else {
                                if (checkValue2 != tokenFilter2) {
                                    checkValue2 = checkValue2.filterStartArray();
                                }
                                this._itemFilter = checkValue2;
                                if (checkValue2 == tokenFilter2) {
                                    this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                }
                                TokenFilterContext createChildArrayContext = this._headContext.createChildArrayContext(checkValue2, false);
                                this._headContext = createChildArrayContext;
                                if (this._includePath && (_nextTokenWithBuffering2 = _nextTokenWithBuffering(createChildArrayContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering2;
                                    return _nextTokenWithBuffering2;
                                }
                            }
                        }
                    } else if (id2 != 4) {
                        if (id2 != 5) {
                            TokenFilter tokenFilter3 = this._itemFilter;
                            TokenFilter tokenFilter4 = TokenFilter.INCLUDE_ALL;
                            if (tokenFilter3 == tokenFilter4) {
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (tokenFilter3 != null && ((checkValue = this._headContext.checkValue(tokenFilter3)) == tokenFilter4 || (checkValue != null && checkValue.includeValue(this.delegate)))) {
                                this._currToken = nextToken;
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            TokenFilter tokenFilter5 = TokenFilter.INCLUDE_ALL;
                            if (fieldName == tokenFilter5) {
                                this._itemFilter = fieldName;
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                TokenFilter includeProperty = fieldName.includeProperty(currentName);
                                if (includeProperty == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = includeProperty;
                                    if (includeProperty == tokenFilter5) {
                                        if (this._includePath) {
                                            this._currToken = nextToken;
                                            return nextToken;
                                        }
                                    } else if (this._includePath && (_nextTokenWithBuffering3 = _nextTokenWithBuffering(this._headContext)) != null) {
                                        this._currToken = _nextTokenWithBuffering3;
                                        return _nextTokenWithBuffering3;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean isStartHandled = this._headContext.isStartHandled();
                TokenFilter filter = this._headContext.getFilter();
                if (!(filter == null || filter == TokenFilter.INCLUDE_ALL)) {
                    filter.filterFinishArray();
                }
                TokenFilterContext parent = this._headContext.getParent();
                this._headContext = parent;
                this._itemFilter = parent.getFilter();
                if (isStartHandled) {
                    this._currToken = nextToken;
                    return nextToken;
                }
            } else {
                TokenFilter tokenFilter6 = this._itemFilter;
                TokenFilter tokenFilter7 = TokenFilter.INCLUDE_ALL;
                if (tokenFilter6 == tokenFilter7) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter6, true);
                    this._currToken = nextToken;
                    return nextToken;
                } else if (tokenFilter6 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter6);
                    if (checkValue3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (checkValue3 != tokenFilter7) {
                            checkValue3 = checkValue3.filterStartObject();
                        }
                        this._itemFilter = checkValue3;
                        if (checkValue3 == tokenFilter7) {
                            this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                            this._currToken = nextToken;
                            return nextToken;
                        }
                        TokenFilterContext createChildObjectContext = this._headContext.createChildObjectContext(checkValue3, false);
                        this._headContext = createChildObjectContext;
                        if (this._includePath && (_nextTokenWithBuffering = _nextTokenWithBuffering(createChildObjectContext)) != null) {
                            this._currToken = _nextTokenWithBuffering;
                            return _nextTokenWithBuffering;
                        }
                    }
                }
            }
        }
        this._currToken = nextToken;
        return nextToken;
    }

    /* access modifiers changed from: protected */
    public final JsonToken _nextTokenWithBuffering(TokenFilterContext tokenFilterContext) {
        boolean z10;
        TokenFilter checkValue;
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                return nextToken;
            }
            int id2 = nextToken.id();
            boolean z11 = false;
            if (id2 != 1) {
                if (id2 != 2) {
                    if (id2 == 3) {
                        TokenFilter checkValue2 = this._headContext.checkValue(this._itemFilter);
                        if (checkValue2 == null) {
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter tokenFilter = TokenFilter.INCLUDE_ALL;
                            if (checkValue2 != tokenFilter) {
                                checkValue2 = checkValue2.filterStartArray();
                            }
                            this._itemFilter = checkValue2;
                            if (checkValue2 == tokenFilter) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                return _nextBuffered(tokenFilterContext);
                            }
                            this._headContext = this._headContext.createChildArrayContext(checkValue2, false);
                        }
                    } else if (id2 != 4) {
                        if (id2 != 5) {
                            TokenFilter tokenFilter2 = this._itemFilter;
                            TokenFilter tokenFilter3 = TokenFilter.INCLUDE_ALL;
                            if (tokenFilter2 == tokenFilter3) {
                                return _nextBuffered(tokenFilterContext);
                            }
                            if (tokenFilter2 != null && ((checkValue = this._headContext.checkValue(tokenFilter2)) == tokenFilter3 || (checkValue != null && checkValue.includeValue(this.delegate)))) {
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            TokenFilter tokenFilter4 = TokenFilter.INCLUDE_ALL;
                            if (fieldName == tokenFilter4) {
                                this._itemFilter = fieldName;
                                return _nextBuffered(tokenFilterContext);
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                TokenFilter includeProperty = fieldName.includeProperty(currentName);
                                if (includeProperty == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = includeProperty;
                                    if (includeProperty == tokenFilter4) {
                                        return _nextBuffered(tokenFilterContext);
                                    }
                                }
                            }
                        }
                    }
                }
                TokenFilter filter = this._headContext.getFilter();
                if (!(filter == null || filter == TokenFilter.INCLUDE_ALL)) {
                    filter.filterFinishArray();
                }
                TokenFilterContext tokenFilterContext2 = this._headContext;
                if (tokenFilterContext2 == tokenFilterContext) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && tokenFilterContext2.isStartHandled()) {
                    z11 = true;
                }
                TokenFilterContext parent = this._headContext.getParent();
                this._headContext = parent;
                this._itemFilter = parent.getFilter();
                if (z11) {
                    return nextToken;
                }
                if (z10 || this._headContext == tokenFilterContext) {
                    return null;
                }
            } else {
                TokenFilter tokenFilter5 = this._itemFilter;
                TokenFilter tokenFilter6 = TokenFilter.INCLUDE_ALL;
                if (tokenFilter5 == tokenFilter6) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter5, true);
                    return nextToken;
                } else if (tokenFilter5 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter5);
                    if (checkValue3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (checkValue3 != tokenFilter6) {
                            checkValue3 = checkValue3.filterStartObject();
                        }
                        this._itemFilter = checkValue3;
                        if (checkValue3 == tokenFilter6) {
                            this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                            return _nextBuffered(tokenFilterContext);
                        }
                        this._headContext = this._headContext.createChildObjectContext(checkValue3, false);
                    }
                }
            }
        }
        return _nextBuffered(tokenFilterContext);
    }

    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    public JsonToken currentToken() {
        return this._currToken;
    }

    public final int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public BigInteger getBigIntegerValue() {
        return this.delegate.getBigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        return this.delegate.getBinaryValue(base64Variant);
    }

    public boolean getBooleanValue() {
        return this.delegate.getBooleanValue();
    }

    public byte getByteValue() {
        return this.delegate.getByteValue();
    }

    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    public String getCurrentName() {
        JsonStreamContext _filterContext = _filterContext();
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return _filterContext.getCurrentName();
        }
        JsonStreamContext parent = _filterContext.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public final int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public BigDecimal getDecimalValue() {
        return this.delegate.getDecimalValue();
    }

    public double getDoubleValue() {
        return this.delegate.getDoubleValue();
    }

    public Object getEmbeddedObject() {
        return this.delegate.getEmbeddedObject();
    }

    public TokenFilter getFilter() {
        return this.rootFilter;
    }

    public float getFloatValue() {
        return this.delegate.getFloatValue();
    }

    public int getIntValue() {
        return this.delegate.getIntValue();
    }

    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    public long getLongValue() {
        return this.delegate.getLongValue();
    }

    public int getMatchCount() {
        return this._matchCount;
    }

    public JsonParser.NumberType getNumberType() {
        return this.delegate.getNumberType();
    }

    public Number getNumberValue() {
        return this.delegate.getNumberValue();
    }

    public JsonStreamContext getParsingContext() {
        return _filterContext();
    }

    public short getShortValue() {
        return this.delegate.getShortValue();
    }

    public String getText() {
        return this.delegate.getText();
    }

    public char[] getTextCharacters() {
        return this.delegate.getTextCharacters();
    }

    public int getTextLength() {
        return this.delegate.getTextLength();
    }

    public int getTextOffset() {
        return this.delegate.getTextOffset();
    }

    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    public boolean getValueAsBoolean() {
        return this.delegate.getValueAsBoolean();
    }

    public double getValueAsDouble() {
        return this.delegate.getValueAsDouble();
    }

    public int getValueAsInt() {
        return this.delegate.getValueAsInt();
    }

    public long getValueAsLong() {
        return this.delegate.getValueAsLong();
    }

    public String getValueAsString() {
        return this.delegate.getValueAsString();
    }

    public boolean hasCurrentToken() {
        if (this._currToken != null) {
            return true;
        }
        return false;
    }

    public boolean hasTextCharacters() {
        return this.delegate.hasTextCharacters();
    }

    public final boolean hasToken(JsonToken jsonToken) {
        if (this._currToken == jsonToken) {
            return true;
        }
        return false;
    }

    public boolean hasTokenId(int i10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            if (i10 == 0) {
                return true;
            }
            return false;
        } else if (jsonToken.id() == i10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isExpectedStartArrayToken() {
        if (this._currToken == JsonToken.START_ARRAY) {
            return true;
        }
        return false;
    }

    public boolean isExpectedStartObjectToken() {
        if (this._currToken == JsonToken.START_OBJECT) {
            return true;
        }
        return false;
    }

    public JsonToken nextToken() {
        JsonToken _nextTokenWithBuffering;
        JsonToken _nextTokenWithBuffering2;
        JsonToken _nextTokenWithBuffering3;
        TokenFilter checkValue;
        JsonToken jsonToken;
        if (!this._allowMultipleMatches && (jsonToken = this._currToken) != null && this._exposedContext == null) {
            if (jsonToken.isStructEnd() && this._headContext.isStartHandled()) {
                this._currToken = null;
                return null;
            } else if (this._currToken.isScalarValue() && !this._headContext.isStartHandled() && !this._includePath && this._itemFilter == TokenFilter.INCLUDE_ALL) {
                this._currToken = null;
                return null;
            }
        }
        TokenFilterContext tokenFilterContext = this._exposedContext;
        if (tokenFilterContext != null) {
            do {
                JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
                if (nextTokenToRead != null) {
                    this._currToken = nextTokenToRead;
                    return nextTokenToRead;
                }
                TokenFilterContext tokenFilterContext2 = this._headContext;
                if (tokenFilterContext == tokenFilterContext2) {
                    this._exposedContext = null;
                    if (tokenFilterContext.inArray()) {
                        JsonToken currentToken = this.delegate.getCurrentToken();
                        this._currToken = currentToken;
                        return currentToken;
                    }
                } else {
                    tokenFilterContext = tokenFilterContext2.findChildOf(tokenFilterContext);
                    this._exposedContext = tokenFilterContext;
                }
            } while (tokenFilterContext != null);
            throw _constructError("Unexpected problem: chain of filtered context broken");
        }
        JsonToken nextToken = this.delegate.nextToken();
        if (nextToken == null) {
            this._currToken = nextToken;
            return nextToken;
        }
        int id2 = nextToken.id();
        if (id2 != 1) {
            if (id2 != 2) {
                if (id2 == 3) {
                    TokenFilter tokenFilter = this._itemFilter;
                    TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
                    if (tokenFilter == tokenFilter2) {
                        this._headContext = this._headContext.createChildArrayContext(tokenFilter, true);
                        this._currToken = nextToken;
                        return nextToken;
                    } else if (tokenFilter == null) {
                        this.delegate.skipChildren();
                    } else {
                        TokenFilter checkValue2 = this._headContext.checkValue(tokenFilter);
                        if (checkValue2 == null) {
                            this.delegate.skipChildren();
                        } else {
                            if (checkValue2 != tokenFilter2) {
                                checkValue2 = checkValue2.filterStartArray();
                            }
                            this._itemFilter = checkValue2;
                            if (checkValue2 == tokenFilter2) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                this._currToken = nextToken;
                                return nextToken;
                            }
                            TokenFilterContext createChildArrayContext = this._headContext.createChildArrayContext(checkValue2, false);
                            this._headContext = createChildArrayContext;
                            if (this._includePath && (_nextTokenWithBuffering2 = _nextTokenWithBuffering(createChildArrayContext)) != null) {
                                this._currToken = _nextTokenWithBuffering2;
                                return _nextTokenWithBuffering2;
                            }
                        }
                    }
                } else if (id2 != 4) {
                    if (id2 != 5) {
                        TokenFilter tokenFilter3 = this._itemFilter;
                        TokenFilter tokenFilter4 = TokenFilter.INCLUDE_ALL;
                        if (tokenFilter3 == tokenFilter4) {
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (tokenFilter3 != null && ((checkValue = this._headContext.checkValue(tokenFilter3)) == tokenFilter4 || (checkValue != null && checkValue.includeValue(this.delegate)))) {
                            this._currToken = nextToken;
                            return nextToken;
                        }
                    } else {
                        String currentName = this.delegate.getCurrentName();
                        TokenFilter fieldName = this._headContext.setFieldName(currentName);
                        TokenFilter tokenFilter5 = TokenFilter.INCLUDE_ALL;
                        if (fieldName == tokenFilter5) {
                            this._itemFilter = fieldName;
                            if (!this._includePath && this._includeImmediateParent && !this._headContext.isStartHandled()) {
                                nextToken = this._headContext.nextTokenToRead();
                                this._exposedContext = this._headContext;
                            }
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (fieldName == null) {
                            this.delegate.nextToken();
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter includeProperty = fieldName.includeProperty(currentName);
                            if (includeProperty == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                this._itemFilter = includeProperty;
                                if (includeProperty == tokenFilter5 && this._includePath) {
                                    this._currToken = nextToken;
                                    return nextToken;
                                } else if (this._includePath && (_nextTokenWithBuffering3 = _nextTokenWithBuffering(this._headContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering3;
                                    return _nextTokenWithBuffering3;
                                }
                            }
                        }
                    }
                }
            }
            boolean isStartHandled = this._headContext.isStartHandled();
            TokenFilter filter = this._headContext.getFilter();
            if (!(filter == null || filter == TokenFilter.INCLUDE_ALL)) {
                filter.filterFinishArray();
            }
            TokenFilterContext parent = this._headContext.getParent();
            this._headContext = parent;
            this._itemFilter = parent.getFilter();
            if (isStartHandled) {
                this._currToken = nextToken;
                return nextToken;
            }
        } else {
            TokenFilter tokenFilter6 = this._itemFilter;
            TokenFilter tokenFilter7 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter6 == tokenFilter7) {
                this._headContext = this._headContext.createChildObjectContext(tokenFilter6, true);
                this._currToken = nextToken;
                return nextToken;
            } else if (tokenFilter6 == null) {
                this.delegate.skipChildren();
            } else {
                TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter6);
                if (checkValue3 == null) {
                    this.delegate.skipChildren();
                } else {
                    if (checkValue3 != tokenFilter7) {
                        checkValue3 = checkValue3.filterStartObject();
                    }
                    this._itemFilter = checkValue3;
                    if (checkValue3 == tokenFilter7) {
                        this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                        this._currToken = nextToken;
                        return nextToken;
                    }
                    TokenFilterContext createChildObjectContext = this._headContext.createChildObjectContext(checkValue3, false);
                    this._headContext = createChildObjectContext;
                    if (this._includePath && (_nextTokenWithBuffering = _nextTokenWithBuffering(createChildObjectContext)) != null) {
                        this._currToken = _nextTokenWithBuffering;
                        return _nextTokenWithBuffering;
                    }
                }
            }
        }
        return _nextToken2();
    }

    public JsonToken nextValue() {
        JsonToken nextToken = nextToken();
        if (nextToken == JsonToken.FIELD_NAME) {
            return nextToken();
        }
        return nextToken;
    }

    public void overrideCurrentName(String str) {
        throw new UnsupportedOperationException("Can not currently override name during filtering read");
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    public JsonParser skipChildren() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i10 = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                return this;
            }
            if (nextToken.isStructStart()) {
                i10++;
            } else if (nextToken.isStructEnd() && i10 - 1 == 0) {
                return this;
            }
        }
    }

    public boolean getValueAsBoolean(boolean z10) {
        return this.delegate.getValueAsBoolean(z10);
    }

    public double getValueAsDouble(double d10) {
        return this.delegate.getValueAsDouble(d10);
    }

    public int getValueAsInt(int i10) {
        return this.delegate.getValueAsInt(i10);
    }

    public long getValueAsLong(long j10) {
        return this.delegate.getValueAsLong(j10);
    }

    public String getValueAsString(String str) {
        return this.delegate.getValueAsString(str);
    }
}

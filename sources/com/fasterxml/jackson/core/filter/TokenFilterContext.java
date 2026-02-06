package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;

public class TokenFilterContext extends JsonStreamContext {
    protected TokenFilterContext _child;
    protected String _currentName;
    protected TokenFilter _filter;
    protected boolean _needToHandleName = false;
    protected final TokenFilterContext _parent;
    protected boolean _startHandled;

    protected TokenFilterContext(int i10, TokenFilterContext tokenFilterContext, TokenFilter tokenFilter, boolean z10) {
        this._type = i10;
        this._parent = tokenFilterContext;
        this._filter = tokenFilter;
        this._index = -1;
        this._startHandled = z10;
    }

    private void _writePath(JsonGenerator jsonGenerator) {
        TokenFilter tokenFilter = this._filter;
        if (tokenFilter != null && tokenFilter != TokenFilter.INCLUDE_ALL) {
            TokenFilterContext tokenFilterContext = this._parent;
            if (tokenFilterContext != null) {
                tokenFilterContext._writePath(jsonGenerator);
            }
            if (!this._startHandled) {
                this._startHandled = true;
                int i10 = this._type;
                if (i10 == 2) {
                    jsonGenerator.writeStartObject();
                    if (this._needToHandleName) {
                        this._needToHandleName = false;
                        jsonGenerator.writeFieldName(this._currentName);
                    }
                } else if (i10 == 1) {
                    jsonGenerator.writeStartArray();
                }
            } else if (this._needToHandleName) {
                this._needToHandleName = false;
                jsonGenerator.writeFieldName(this._currentName);
            }
        }
    }

    public static TokenFilterContext createRootContext(TokenFilter tokenFilter) {
        return new TokenFilterContext(0, (TokenFilterContext) null, tokenFilter, true);
    }

    /* access modifiers changed from: protected */
    public void appendDesc(StringBuilder sb2) {
        TokenFilterContext tokenFilterContext = this._parent;
        if (tokenFilterContext != null) {
            tokenFilterContext.appendDesc(sb2);
        }
        int i10 = this._type;
        if (i10 == 2) {
            sb2.append('{');
            if (this._currentName != null) {
                sb2.append('\"');
                sb2.append(this._currentName);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        } else if (i10 == 1) {
            sb2.append('[');
            sb2.append(getCurrentIndex());
            sb2.append(']');
        } else {
            sb2.append("/");
        }
    }

    public TokenFilter checkValue(TokenFilter tokenFilter) {
        int i10 = this._type;
        if (i10 == 2) {
            return tokenFilter;
        }
        int i11 = this._index + 1;
        this._index = i11;
        if (i10 == 1) {
            return tokenFilter.includeElement(i11);
        }
        return tokenFilter.includeRootValue(i11);
    }

    public TokenFilterContext closeArray(JsonGenerator jsonGenerator) {
        if (this._startHandled) {
            jsonGenerator.writeEndArray();
        }
        TokenFilter tokenFilter = this._filter;
        if (!(tokenFilter == null || tokenFilter == TokenFilter.INCLUDE_ALL)) {
            tokenFilter.filterFinishArray();
        }
        return this._parent;
    }

    public TokenFilterContext closeObject(JsonGenerator jsonGenerator) {
        if (this._startHandled) {
            jsonGenerator.writeEndObject();
        }
        TokenFilter tokenFilter = this._filter;
        if (!(tokenFilter == null || tokenFilter == TokenFilter.INCLUDE_ALL)) {
            tokenFilter.filterFinishObject();
        }
        return this._parent;
    }

    public TokenFilterContext createChildArrayContext(TokenFilter tokenFilter, boolean z10) {
        TokenFilterContext tokenFilterContext = this._child;
        if (tokenFilterContext != null) {
            return tokenFilterContext.reset(1, tokenFilter, z10);
        }
        TokenFilterContext tokenFilterContext2 = new TokenFilterContext(1, this, tokenFilter, z10);
        this._child = tokenFilterContext2;
        return tokenFilterContext2;
    }

    public TokenFilterContext createChildObjectContext(TokenFilter tokenFilter, boolean z10) {
        TokenFilterContext tokenFilterContext = this._child;
        if (tokenFilterContext != null) {
            return tokenFilterContext.reset(2, tokenFilter, z10);
        }
        TokenFilterContext tokenFilterContext2 = new TokenFilterContext(2, this, tokenFilter, z10);
        this._child = tokenFilterContext2;
        return tokenFilterContext2;
    }

    public TokenFilterContext findChildOf(TokenFilterContext tokenFilterContext) {
        TokenFilterContext tokenFilterContext2 = this._parent;
        if (tokenFilterContext2 == tokenFilterContext) {
            return this;
        }
        while (tokenFilterContext2 != null) {
            TokenFilterContext tokenFilterContext3 = tokenFilterContext2._parent;
            if (tokenFilterContext3 == tokenFilterContext) {
                return tokenFilterContext2;
            }
            tokenFilterContext2 = tokenFilterContext3;
        }
        return null;
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public Object getCurrentValue() {
        return null;
    }

    public TokenFilter getFilter() {
        return this._filter;
    }

    public boolean isStartHandled() {
        return this._startHandled;
    }

    public JsonToken nextTokenToRead() {
        if (!this._startHandled) {
            this._startHandled = true;
            if (this._type == 2) {
                return JsonToken.START_OBJECT;
            }
            return JsonToken.START_ARRAY;
        } else if (!this._needToHandleName || this._type != 2) {
            return null;
        } else {
            this._needToHandleName = false;
            return JsonToken.FIELD_NAME;
        }
    }

    /* access modifiers changed from: protected */
    public TokenFilterContext reset(int i10, TokenFilter tokenFilter, boolean z10) {
        this._type = i10;
        this._filter = tokenFilter;
        this._index = -1;
        this._currentName = null;
        this._startHandled = z10;
        this._needToHandleName = false;
        return this;
    }

    public void setCurrentValue(Object obj) {
    }

    public TokenFilter setFieldName(String str) {
        this._currentName = str;
        this._needToHandleName = true;
        return this._filter;
    }

    public void skipParentChecks() {
        this._filter = null;
        for (TokenFilterContext tokenFilterContext = this._parent; tokenFilterContext != null; tokenFilterContext = tokenFilterContext._parent) {
            this._parent._filter = null;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        appendDesc(sb2);
        return sb2.toString();
    }

    public void writeImmediatePath(JsonGenerator jsonGenerator) {
        TokenFilter tokenFilter = this._filter;
        if (tokenFilter != null && tokenFilter != TokenFilter.INCLUDE_ALL) {
            if (!this._startHandled) {
                this._startHandled = true;
                int i10 = this._type;
                if (i10 == 2) {
                    jsonGenerator.writeStartObject();
                    if (this._needToHandleName) {
                        jsonGenerator.writeFieldName(this._currentName);
                    }
                } else if (i10 == 1) {
                    jsonGenerator.writeStartArray();
                }
            } else if (this._needToHandleName) {
                jsonGenerator.writeFieldName(this._currentName);
            }
        }
    }

    public void writePath(JsonGenerator jsonGenerator) {
        TokenFilter tokenFilter = this._filter;
        if (tokenFilter != null && tokenFilter != TokenFilter.INCLUDE_ALL) {
            TokenFilterContext tokenFilterContext = this._parent;
            if (tokenFilterContext != null) {
                tokenFilterContext._writePath(jsonGenerator);
            }
            if (!this._startHandled) {
                this._startHandled = true;
                int i10 = this._type;
                if (i10 == 2) {
                    jsonGenerator.writeStartObject();
                    jsonGenerator.writeFieldName(this._currentName);
                } else if (i10 == 1) {
                    jsonGenerator.writeStartArray();
                }
            } else if (this._needToHandleName) {
                jsonGenerator.writeFieldName(this._currentName);
            }
        }
    }

    public final TokenFilterContext getParent() {
        return this._parent;
    }
}
